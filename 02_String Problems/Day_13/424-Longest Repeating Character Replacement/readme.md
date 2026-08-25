## 🔠 424 - Longest Repeating Character Replacement

---

## 🧩 Problem Statement

Given a string `s` containing only uppercase English letters and an integer `k`, you are allowed to replace at most `k` characters in the string so that the resulting substring consists of the **same character repeated**.  
Return the **length of the longest possible valid substring** under this rule.

---

## 📥 Input

- **s**: A string of uppercase English letters (e.g., `"AABABBA"`)
- **k**: An integer (0 ≤ k ≤ s.length) — the maximum number of replacements allowed.

---

## 📤 Output

- An integer representing the **maximum length** of a valid substring after replacing at most `k` characters.

---

## 📘 Example

```
Input:  s = "AABABBA", k = 1  
Output: 4  
Explanation: Replace second 'B' with 'A' => "AAABBA" → "AAAA"
```

---

## 🧠 Functions and Data Structures Used

- **HashMap<Character, Integer>**: To count frequencies of characters (Approach 1).
- **int[] frequency array (size 26)**: To count letters 'A' to 'Z' efficiently (Approach 2).
- **Sliding Window** (Two pointers): Efficiently explores all valid substrings.
- **Math.max()**: For tracking max frequency and result.

---

## 🧭 Approach 1: Using HashMap

### Step-by-Step Logic:

1. Use a **sliding window** with `left` and `right` pointers.
2. Maintain a **HashMap** to store frequencies of characters in the current window.
3. Keep track of the **maximum frequency** character in the current window (`maxFre`).
4. If `(windowSize - maxFre) > k`, it means we need to replace more than allowed, so:
   - Shrink the window from the left: `left++`
   - Decrease frequency of the removed character.
5. Update `maxLen` with the maximum valid window size.

---

## 🚀 Approach 2: Using Frequency Array

### Step-by-Step Logic:

1. Use a **fixed-size array of size 26** to store frequencies of each uppercase character.
2. As `right` moves forward:
   - Update character frequency.
   - Update `maxFre` with the highest frequency seen.
3. If `(windowSize - maxFre) > k`, the window is invalid:
   - Reduce the count of the character at `left`.
   - Move `left++`.
4. Update `maxLen` with the maximum valid window size.

---

## 🧮 Dry Run

```
s = "AABABBA", k = 1
```

| Step | left | right | Window   | freq(A) | freq(B) | maxFre | WindowSize | Replaceable | Valid? | maxLen |
|------|------|--------|----------|----------|----------|--------|--------------|--------------|--------|---------|
| 1    | 0    | 0      | "A"      | 1        | 0        | 1      | 1            | 0            | ✅     | 1       |
| 2    | 0    | 1      | "AA"     | 2        | 0        | 2      | 2            | 0            | ✅     | 2       |
| 3    | 0    | 2      | "AAB"    | 2        | 1        | 2      | 3            | 1            | ✅     | 3       |
| 4    | 0    | 3      | "AABA"   | 3        | 1        | 3      | 4            | 1            | ✅     | 4       |
| 5    | 0    | 4      | "AABAB"  | 3        | 2        | 3      | 5            | 2            | ❌     | 4       |
| 6    | 1    | 4      | "ABAB"   | 2        | 2        | 2      | 4            | 2            | ❌     | 4       |
| 7    | 2    | 4      | "BAB"    | 1        | 2        | 2      | 3            | 1            | ✅     | 4       |

---

## 🔍 Why We Don’t Update `maxFre` in the Inner Loop

- Once `maxFre` is set during `right++`, it is **not recalculated** during `left++`.
- That’s **intentional**, and here’s why:
  - Recalculating `maxFre` every time is expensive (especially with a HashMap).
  - Even if the actual frequency drops, the **window will still shrink** correctly when `(right - left + 1 - maxFre) > k`.
  - **maxLen is always updated only when window is valid**, so old `maxFre` doesn’t harm the result — we care about **maximum** length, not smallest.

> 🧠 **We do not care if `maxFre` is outdated. We only care about maintaining a valid window and tracking the maximum length.**

---

## 🔁 Can We Replace `while` with `if`?

Yes, in this particular problem:

```java
while ((right - left + 1) - maxFre > k)
```

Can be safely replaced with:

```java
if ((right - left + 1) - maxFre > k)
```

### Why it works:

- In each loop, we move `right` by **one** and at most move `left` by **one**.
- There's **no need to shrink repeatedly** — only once per step.
- Hence, `if` is sufficient and also slightly faster.

---

## 📚 Learning Points

- The **Sliding Window** pattern shines in problems dealing with substrings or subarrays.
- Knowing **when not to update** a variable (like `maxFre`) is just as important as knowing when to update it.
- Using a **frequency array** can be faster and cleaner when the input is limited to a fixed alphabet.

---

## 📝 Summary Table

| Feature                  | Approach 1 (HashMap)       | Approach 2 (Frequency Array)   |
|--------------------------|----------------------------|--------------------------------|
| Data Structure           | HashMap<Character, Integer>| int[26]                        |
| Time Complexity          | O(N)                       | O(N)                           |
| Space Complexity         | O(26) ≈ O(1)               | O(1)                           |
| Alphabet Flexibility     | Any characters             | Only A-Z                       |
| Best For                 | Generic inputs             | A-Z inputs only                |

---



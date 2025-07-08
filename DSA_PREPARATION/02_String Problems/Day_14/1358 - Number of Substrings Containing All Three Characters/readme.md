# 📘 Leetcode 1358: Number of Substrings Containing All Three Characters

---

## 🧩 Problem Statement

Given a string `s` consisting only of the characters `'a'`, `'b'`, and `'c'`, return the number of substrings of `s` that contain **at least one occurrence of each character**.

---

## 🔢 Input

- A single string `s` where `1 <= s.length <= 5 * 10⁴`.
- `s` contains only `'a'`, `'b'`, and `'c'`.

## 🎯 Output

- An integer: total number of substrings that contain at least one `'a'`, `'b'`, and `'c'`.

---

## 📌 Constraints

- Characters are limited to `'a'`, `'b'`, and `'c'` only.
- The substrings **must** contain all three characters.

---

## 🧠 Intuition

Instead of checking **all possible substrings** (which is O(n²)), use:
- Latest seen **indices** for each character to track valid substrings.
- Or use a **sliding window** approach to find the shortest valid window and count how many substrings it contributes.

---

## 🔧 Functions & Concepts Used

- Frequency array / character index mapping
- Two pointers / sliding window
- `Math.min(...)` to find leftmost index
- Window shrinking based on condition satisfaction
- Substring count using length difference

---

## 🚀 Approach 1: Last Seen Indices (Greedy)

### 🧾 Steps

1. Create an array `lastSeen[3]` initialized to `-1` to store last index of `'a'`, `'b'`, and `'c'`.
2. Traverse from left to right (`right` pointer).
3. Update the current character’s latest index in `lastSeen`.
4. If all three characters are seen at least once:
    - Let `minIndex = min(lastSeen[0], lastSeen[1], lastSeen[2])`
    - All substrings starting from index `0` to `minIndex` and ending at `right` are valid.
    - Add `minIndex + 1` to total count.

### ✅ Time: O(n) | Space: O(1)

---

## 🚀 Approach 2: Sliding Window + Frequency Count

### 🧾 Steps

1. Initialize `left = 0`, `right = 0`, and frequency array `freq[3] = {0, 0, 0}`.
2. Expand `right` and update the frequency of the current character.
3. When all `freq[0..2] > 0` (window contains a, b, c):
    - Count all substrings from `left` to end (`n - right`) and add to result.
    - Shrink window by incrementing `left` and reducing the frequency of that character.
4. Continue this until the end of the string.

### ✅ Time: O(n) | Space: O(1)

---

## ⚖️ Comparison

| Feature                | Approach 1 (Last Index) | Approach 2 (Sliding Window) |
|------------------------|-------------------------|-----------------------------|
| Type                   | Greedy Index-based      | Sliding Window              |
| Adaptable to other chars | ❌ No, fixed to 3       | ✅ Easily extended           |
| Simplicity             | ✅ Simple, fast          | 🟡 Slightly more complex     |
| Flexibility            | ❌ Less flexible         | ✅ Highly flexible           |
| Space Usage            | O(1)                    | O(1)                        |
| Use Case               | Limited to 3 chars      | Works for more characters   |

---

## 🔂 Dry Run Example

### 🔡 Input:
- `s = "abcabc"`

### Approach 1:

- Right = 0 to 2 → first "abc" seen
- `min(lastSeen) = 0` → count += 1
- Right = 3 (`a` again) → `lastSeen[a] = 3`
- `min = 1` → count += 2
- Right = 4 (`b`) → `min = 2` → count += 3
- Right = 5 (`c`) → `min = 3` → count += 4

🧮 Total: `1 + 2 + 3 + 4 = 10`

### Approach 2:

- Right expands until window has `'a'`, `'b'`, `'c'` → at index 2
- Add `n - right = 6 - 2 = 4` → count += 4
- Shrink window from left
- Repeats as new valid windows are found at each step

🧮 Also results in `10`

---

## 📝 Summary

- Both approaches are efficient and avoid brute-force O(n²).
- Index-based is clean but fixed for three characters.
- Sliding window is powerful and reusable.

---

## 🎓Learning Points

- **Sliding Window Technique**: Essential for substring problems with constraints.
- **Character Frequency Tracking**: Useful for counting elements dynamically in a window.
- **Greedy Thinking with Indices**: Avoid brute-force by tracking useful meta-information.
- **Two Pointer Optimization**: Understanding how to manage `left` and `right` to reduce time.

---

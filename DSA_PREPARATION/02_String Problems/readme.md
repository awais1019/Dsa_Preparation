# 📘 Notes on Solving String Problems with Sliding Window / Two Pointer Approach

## ✅ When to Apply This Approach?

If a problem involves:
- `substring`, `subarray`, or `continuous elements`
- Finding/maximizing/minimizing lengths, counts, or windows
- Conditions like:
  - “At most K distinct characters”
  - “No repeating character”
  - “Replace at most K characters”

Then it is **most likely** a **Sliding Window** or **Two Pointer** problem.

---

## 🧠 What is the Sliding Window Approach?

Sliding window is an optimization technique used to reduce the time complexity of problems involving **contiguous sequences**.

### 🔁 Key Concepts:
- Use **two pointers**: `left` and `right`
- **Expand** the `right` pointer until a certain **stop condition** (e.g., invalid window)
- When the window becomes **invalid**, **shrink** it from the `left`
- Continue expanding and shrinking until you've processed the whole input



---

 ### Two Pointer vs Sliding Window

| Technique       | Use Case                             | Shrinking Window? |
|----------------|---------------------------------------|-------------------|
| Two Pointer     | Sorted arrays, pair sums, intersection | ❌ No             |
| Sliding Window  | Substrings, dynamic window constraints | ✅ Yes            |

🔑 Difference:
- Two pointer: used on **sorted** data, moves both ends strategically
- Sliding window: dynamically expands/shrinks based on a **valid window condition**


## 🧵 1. String Operations (Immutable)

Java `String` is immutable. Avoid excessive string creation in loops. Prefer `StringBuilder` if mutations are needed.

### 🔧 Common Methods

| Method                      | Purpose                                      |
|-----------------------------|----------------------------------------------|
| `s.length()`                | Get the length of the string                 |
| `s.charAt(i)`               | Get character at index `i`                   |
| `s.substring(start, end)`   | Substring from index `start` to `end - 1`    |
| `s.startsWith(prefix)`      | Check if string starts with prefix           |
| `s.endsWith(suffix)`        | Check if string ends with suffix             |
| `s.split(delimiter)`        | Split string into array                      |
| `String.join(delim, arr)`   | Join string array with delimiter             |
| `s.toLowerCase()`           | Convert to lowercase                         |
| `s.toUpperCase()`           | Convert to uppercase                         |

---

## 🪢 2. StringBuilder (Mutable Strings)

Use `StringBuilder` when you need to append, modify, or delete characters efficiently.

### 🧱 Common Operations

```java
StringBuilder sb = new StringBuilder();
sb.append('a');              // Add character
sb.setCharAt(index, 'x');    // Modify character
sb.deleteCharAt(index);      // Delete character
sb.reverse();                // Reverse string
sb.toString();               // Convert to String
```
---

## 🔠 3. Character Utilities

### 📌 Java Built-in Methods

```java
Character.isLetter(c);
Character.isDigit(c);
Character.isLetterOrDigit(c);
Character.isUpperCase(c);
Character.isLowerCase(c);
Character.toLowerCase(c);
Character.toUpperCase(c);
```

### 🔍 Manual Character Checks

```java
if (c >= 'A' && c <= 'Z') {
    // Uppercase
}
if (c >= 'a' && c <= 'z') {
    // Lowercase
}
```

---

## 🗺️ 4. HashMap – Counting Frequencies / Indices

### ✅ Use Cases
- Count character frequencies
- Track last occurrence or index
- Store complex structures (e.g., positions, counts, flags)

### 🛠️ Common Methods

```java
HashMap<Character, Integer> map = new HashMap<>();
map.put(c, map.getOrDefault(c, 0) + 1);
map.get(key);
map.containsKey(key);
map.remove(key);
```

### 🔁 Iteration Example

```java
for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    char key = entry.getKey();
    int value = entry.getValue();
}
```

---

## 🧰 5. Set – Uniqueness / Duplicate Detection

### ✅ Use Cases
- Ensure unique characters
- Check if a character already exists
- Detect duplicates efficiently

### 🛠️ Common Methods

```java
Set<Character> set = new HashSet<>();
set.add(c);
set.contains(c);
set.remove(c);
set.size();
```

---

## 🔡 6. Frequency Array – Fixed Character Set (a-z / A-Z)

### ✅ Use When
- Character range is known and fixed (e.g., lowercase 'a' to 'z' or uppercase 'A' to 'Z')
- You want high performance with constant-time access

### 🧮 Examples

```java
int[] freq = new int[26];          // For lowercase 'a' to 'z'
freq[s.charAt(i) - 'a']++;

int[] freqUpper = new int[26];     // For uppercase 'A' to 'Z'
freq[s.charAt(i) - 'A']++;
```

---


## 🔢 7. Other Useful Methods

| Method                            | Description                                                   |
|----------------------------------|---------------------------------------------------------------|
| `Math.max(a, b)`                 | Returns the larger of two values                             |
| `Math.min(a, b)`                 | Returns the smaller of two values                            |
| `Collections.max(map.values())` | Returns the maximum value from a collection (e.g., map values)|
| `Arrays.sort(array)`            | Sorts the array in ascending order                           |
| `Arrays.equals(arr1, arr2)`     | Checks if two arrays are equal in content and order          |
| `Arrays.asList(array)`          | Converts an array to a fixed-size list                       |
| `String.toCharArray()`          | Converts a string to a character array                       |
| `String.valueOf(char[])`        | Converts a character array to a string                       |
| `new String(char[])`            | Creates a new string from a character array                  |
| `Integer.parseInt(String)`      | Converts a numeric string to an integer                      |


---

## 📏 8. Common Formulas in Window Problems

| Concept                   | Formula                    |
|---------------------------|----------------------------|
| Current Window Size       | `right - left + 1`         |
| Remaining Characters      | `s.length() - right`       |


---

## 🔁 9. Sliding Window Template

### 🧩 General Pattern

```java
int left = 0;
for (int right = 0; right < s.length(); right++) {
    // Expand the window
    char c = s.charAt(right);

    // Update data structure (map, set, freq[])

    // Shrink window if invalid
    while (/* window is invalid */) {
        // Remove s.charAt(left) from window
        left++;
    }

    // Update answer based on current valid window
}
```

### ⚠️ Typical Conditions to Shrink

- `map.size() > k` — Too many unique characters
- `set.contains(s.charAt(right))` — Duplicate found
- `freq[c] > allowedLimit` — Frequency exceeded

> 💡 Use "At Most K" trick when shrinking logic becomes complex

---
## 🧠 10. At Most K & Exactly K – When Shrinking Fails

### ❓ Why Use "At Most K"?

Use this technique when:
- You need to **count valid substrings** (not just length)
- Shrinking logic becomes **complex or undefined**
- Problem allows **at most K violations/conditions**
Use it in problems like:
- Substrings with at most/exactly K distinct characters
- Subarrays with at most K odd numbers / primes / 1’s / vowels
- Replace at most K characters to get longest valid string
- Count subarrays where sum ≤ K

---



### 🔧 Key Formula

If the problem asks for **"Exactly K"** distinct elements (or any constraint):

```java
countExactly(K) = countAtMostK(K) - countAtMostK(K - 1);
```
#### ❓ Why Do We Subtract?
- **countAtMostK(K)** gives the number of subarrays/strings with at most K distinct characters.

- **countAtMostK(K - 1)** gives the number of subarrays/strings with at most (K - 1) distinct characters.

So subtracting them removes all smaller counts, leaving only:
➡ exactly K



## 🧠 11. Learning Notes & Strategies

### ✅ Best Practices

- Use `StringBuilder` for string manipulation
- Use `String` only for final or immutable results
- Use `Map` to count or store dynamic character data
- Use `Set` for uniqueness checks or duplicate detection
- Use `int[] freq` for performance with fixed character ranges (`a-z`, `A-Z`)
- Always define the **valid** and **invalid** window condition clearly
- Use index-based shrinking for **no duplicates** problems  
- Use count-based shrinking for **frequency-based** constraints  
- Shrink the window when it becomes invalid
- Use the **"At Most"** trick to simplify complex shrinking logic

- Dry-run manually using pen & paper to trace:
  - `left` and `right` pointers
  - State of map/set/frequency array


**👎 Avoid These Mistakes:**
- Using `substring()` unnecessarily → O(n²) performance
- Using `String +=` inside loops → creates new strings each time
- Forgetting to shrink the window when it becomes invalid
- Not checking for edge cases: empty string, 1-length string, etc.
---

## 📌 Summary

Sliding Window is a powerful technique to solve many string and array problems in **O(n)** time.

- How to **expand** and **shrink** the window efficiently
- How to **track character frequencies** using:
  - `int[] freq` for fixed ranges
  - `HashMap` for dynamic ranges
  - `Set` for uniqueness
- Understand and define the **valid vs invalid** window conditions
- Apply the **"At Most K"** technique to simplify logic
- Use **manual dry-runs** to understand flow and edge cases

#### ✅ Final Debug Checklist for Sliding Window Problems
- Did I update the result only after confirming the window is valid?
- Is my `map` / `set` / `freq` updated before shrinking?
-  Is window size calculated as `right - left + 1`?
- Are all edge cases handled (e.g., empty string, 1 char)?
- Is the shrinking condition clearly defined and correct?

```

# 📘 LeetCode – Implement strStr()

## 🧠 Problem Statement

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.



---

## 🔢 Input / Output

### Input:
- `haystack = "hello"`
- `needle = "ll"`

### Output:
- `2`

---

## 📚 Topics Covered

- Strings
- Sliding Window
- Substring Matching
- Two Pointers

---

## 🚀 Approach: Sliding Window with Substring Comparison

- Check if the `needle` is longer than the `haystack`. If so, return `-1` early.
- Use a sliding window of length equal to the `needle`.
- In each iteration:
  - Extract a substring of `haystack` from the current `left` to `right` index.
  - Compare it to `needle` using a string equality method (e.g., `.equals()`).
- If a match is found, return the starting index.
- If no match is found after iterating through the haystack, return `-1`.

---


## ✅ Summary

- Simple and efficient for average cases due to JVM substring optimizations.
- Suitable for most competitive and interview settings unless optimal O(N + M) is explicitly required.

---





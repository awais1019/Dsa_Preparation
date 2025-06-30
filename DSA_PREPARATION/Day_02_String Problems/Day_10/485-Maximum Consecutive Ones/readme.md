# 🔢 LeetCode 485 - Find Max Consecutive Ones 

## 📌 Problem Statement

You are given a binary array containing only `0`s and `1`s. The task is to find the length of the longest sequence of consecutive `1`s.

### Constraints
- The array size can be up to 100,000 elements.
- All elements are either `0` or `1`.

---

## 🧪 Example

- **Input:** An array such as `[1, 1, 0, 1, 1, 1]`
- **Output:** `3`
- **Explanation:** The longest sequence of `1`s occurs at the end with three consecutive `1`s.

---

## 🧠 Algorithm Overview

This solution uses a **pointer-based sliding window** strategy with an optimization to **skip over sequences of `0`s**. It is designed for performance on large arrays with sparse `1`s.

### Steps:
1. Scan the array to find the first occurrence of `1`.
2. Initialize two pointers:
   - `left`: start of a block of `1`s.
   - `right`: to explore the extent of the block.
3. While traversing:
   - If both `left` and `right` point to `1`, increase the current count and move `right` forward.
   - If a `0` is found, update the maximum sequence length.
   - Use a helper to jump `left` to the next available `1`, and set `right` accordingly.
4. Repeat until the end of the array is reached.
5. Return the maximum number of consecutive `1`s found.
---

## 🧑‍🔬 Functions Used (Conceptually)

- A function that scans for the next `1` in the array starting from a given index.
- A main loop that uses two pointers to count consecutive `1`s.
- A comparison tracker to store the longest sequence found.

---

## 🚀 Performance

| Metric            | Result                      |
|-------------------|-----------------------------|
| Time Complexity   | Linear, O(n)                |
| Space Complexity  | Constant, O(1)              |
| Runtime Score     | ✅ 94% (faster than most)   |
| Memory Efficiency | ✅ 97% (less memory used)   |


---

## ✅ Key Insights

- Manually controlling pointers gives better performance than using high-level constructs.
- Early skipping strategies prevent wasteful work when long runs of `0`s are present.

---


## 📌 Alternative Approach Summary

- A basic linear scan that counts `1`s and resets on `0`s is easier to implement but does not skip over unnecessary parts of the array.
- It is suitable for clean code but may not be optimal on performance-critical tasks.

---

## 🧾 Summary

This solution reflects a refined approach to a classic problem by combining:
- Smart index management,
- Minimal iteration,
- And modular design.

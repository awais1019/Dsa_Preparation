# 📄LeetCode-2149: Rearrange Array Elements by Sign

## 🔗 Problem Link

[LeetCode 2149 - Rearrange Array Elements by Sign](https://leetcode.com/problems/rearrange-array-elements-by-sign/)

---

## 🧩 Problem Statement

You are given a **0-indexed** integer array `nums` of **even length** consisting of an **equal number of positive and negative integers**.

Your task is to **rearrange the elements** of `nums` such that:

- Every **even-indexed position** holds a **positive integer**, and
- Every **odd-indexed position** holds a **negative integer**.

Return the resulting array. The rearranged array **must use all elements of nums**, and the **relative order of positive and negative numbers does not need to be preserved**.

---

## 📥 Input

- An integer array `nums` with even length `2n`.
- The array contains exactly `n` positive and `n` negative integers.

### Example:

`Input: nums = [3, 1, -2, -5, 2, -4]`

---

## 📤 Output

- An array of the same length where:
  - Positive numbers are at even indices (0, 2, 4, ...)
  - Negative numbers are at odd indices (1, 3, 5, ...)

### Example:

`Output: [3, -2, 1, -5, 2, -4]`

---

## 💡 Observation

Since we know the number of positive and negative integers is equal, and the rearrangement must alternate with positive numbers at even indices and negative numbers at odd indices, we can **track placement positions directly using even and odd indices**.

---

## 💡 Approach 1: Using Two Temporary Arrays (Split & Reconstruct)

### ✅ Steps:

1. **Divide the array** into two arrays:
   - One for all positive numbers.
   - One for all negative numbers.
2. **Traverse the input array**:
   - Store positive values into a `positive[]` array.
   - Store negative values into a `negative[]` array.
3. **Reconstruct the result** by inserting:
   - Positive numbers at even indices.
   - Negative numbers at odd indices.
4. Return the original input array after rearranging.

---

## 💡 Approach 2: On-the-fly Placement in Result Array

### ✅ Steps:

1. **Create a result array `ans[]`** of the same length as `nums`.
2. Initialize two index pointers:
   - `positive = 0` for even indices.
   - `negative = 1` for odd indices.
3. **Traverse the input array**:
   - Place positive numbers at index `positive` and increment `positive += 2`.
   - Place negative numbers at index `negative` and increment `negative += 2`.
4. Return the result array `ans`.

---

## 📊 Comparison Table

| Feature                 | Approach 1                          | Approach 2                    |
| ----------------------- | ----------------------------------- | ----------------------------- |
| Number of Passes        | 2                                   | 1                             |
| Modifies Original Array | ✅ Yes                              | ❌ No (creates a new one)     |
| Space Complexity        | O(n) (half-size + in-place rewrite) | O(n) (full-sized new array)   |
| Readability             | Moderate (2-step logic)             | High (direct placement logic) |
| Input Array Preserved   | ❌ No                               | ✅ Yes                        |
| Real-time Placement     | ❌ No                               | ✅ Yes                        |

---

## 📘 Learning Points

- How to divide problems into **collection and reconstruction phases** (Approach 1).
- How to perform **single-pass array construction with position tracking** (Approach 2).
- Importance of **index patterning** (even for positive, odd for negative).
- Use of **two-pointer step increment** strategy (`+= 2`) to manage alternate positioning.

---

## 🧾 Summary

Both approaches correctly rearrange the array with alternating signs.

- **Approach 1** separates the data first and reconstructs it in a second step, modifying the original array.
- **Approach 2** builds the result array directly in a single traversal and does not touch the input array.

While both are valid and acceptable, **Approach 2** is more efficient and concise in both logic and structure, making it a better choice for interviews and real-world use cases.

---


# 🔄 LeetCode 189: Rotate Array

---

## 📘 Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

🔗 [LeetCode Problem Link](https://leetcode.com/problems/rotate-array/)

---

## 🧪 Example

- **Input:**  
  `nums = [1, 2, 3, 4, 5, 6, 7]`, `k = 3`

- **Output:**  
  `[5, 6, 7, 1, 2, 3, 4]`

---

## 🧠 Key Concepts

- 🔁 **Array Rotation**
- ➗ **Modulo Arithmetic**
- 📍 **Index Mapping**
- 🔄 **Reversal Algorithm**
- ⏱ **Time & Space Optimization**

---

## 📌 Why Use `k % length`?

- Prevents unnecessary full rotations.
- If `k >= length`, rotating the array by `k` is the same as rotating by `k % length`.

> ℹ️ Example:  
> If `k = 18` and array length is `7`,  
> `k % 7 = 4` → Only rotate 4 times.

---

## 🧭 Approaches to Solve

### ✅ Approach 1: Extra Array (Index Mapping)

A beginner-friendly method using an auxiliary array.

#### 🔍 Steps:

1. Create a new array of the same size.
2. For each index `i`, place the element at `(i + k) % n`.
3. Copy the temp array back to `nums`.

#### 📌 Formula:
```text
newIndex = (i + k) % n
```

#### ⏱️ Time & Space:

- **Time:** O(n)  
- **Space:** O(n) (uses extra array)

#### 👍 Pros:

- Easy to implement
- Intuitive and readable

---

### ✅ Approach 2: In-place Reversal Algorithm (Optimal)

Best method for interviews — rotates in-place with O(1) space.

#### 🔍 Steps:

1. Reverse the whole array  
2. Reverse first `k` elements  
3. Reverse the remaining `n - k` elements

#### 🧩 Example Flow:

```
Original:        [1, 2, 3, 4, 5, 6, 7]
Step 1 (Reverse All):        [7, 6, 5, 4, 3, 2, 1]
Step 2 (Reverse First k):    [5, 6, 7, 4, 3, 2, 1]
Step 3 (Reverse Rest):       [5, 6, 7, 1, 2, 3, 4]
```

#### ⏱️ Time & Space:

- **Time:** O(n)  
- **Space:** O(1) ✅

#### 🔥 Why Recommended:

- No extra memory
- Fast and elegant
- Frequently asked in interviews

---

## 🔄 Left vs Right Rotation (Reversal Order)

### 👉 Right Rotation (This Problem)

1. Reverse **entire array**  
2. Reverse **first `k`**  
3. Reverse **remaining `n - k`**

### 👈 Left Rotation

1. Reverse **first `k`**  
2. Reverse **remaining `n - k`**  
3. Reverse **entire array**

---

## 📊 Comparison Table

| Feature             | Approach 1 (Extra Array) | Approach 2 (Reversal Algorithm) |
|--------------------|--------------------------|----------------------------------|
| Time Complexity     | O(n)                     | O(n)                             |
| Space Complexity    | O(n)                     | O(1) ✅                           |
| Implementation      | Easy ✅                  | Medium 🧠                        |
| Interview Friendly  | ✅                       | ✅✅ Highly Recommended           |

---

## 📘 Useful Formulas

- **Right Rotation Index Formula**  
  `(i + k) % n`

- **Left Rotation Index Formula**  
  `(i - k + n) % n`  
  (To avoid negative indices)

---

## 📌 Tips & Tricks

- Always **normalize `k`**:  
  Use `k = k % n` to avoid redundant work.

- Understand **reversal order** deeply — it's a common pattern in many rotation problems.

- **Practice** both left and right rotations to solidify your grasp.

---

## ✅ Final Summary

| Takeaway | Description |
|----------|-------------|
| 🛠 Two Approaches | Extra array (easy), Reversal method (optimal) |
| 🧠 Learn Reversal | Must-know trick for O(1) space rotation |
| 🔁 Handle Large `k` | Normalize with `k % n` |
| 📚 Know Left vs Right | Understand both patterns for flexibility |

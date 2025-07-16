
# 📐 Leetcode-48 Rotate Image

## 🔗 Problem Link
[Leetcode 48 - Rotate Image](https://leetcode.com/problems/rotate-image/)

---

## 📜 Problem Statement

You are given an `n x n` 2D matrix representing an image. Rotate the image by **90 degrees (clockwise)**.

- The rotation must be done **in-place**, meaning the input matrix should be modified directly.
- You **cannot use another matrix** to perform the rotation.

---

## 📥 Input

- A 2D matrix of integers `matrix[n][n]`

### Example:
```
Input:
[
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

Output:
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]
```

---

## ✅ Approaches to Solve the Problem

---

### 🧠 Approach 1: Brute Force Using Extra Matrix

This approach is simple and intuitive, suitable for beginners to visualize how rotation works.

#### 🔹 Idea:
- We create a **new matrix `ans[n][n]`** to hold the rotated values.
- For each element in the original matrix, we calculate where it should go in the new matrix after rotating 90° clockwise.

#### 🔹 Why `ans[j][n - 1 - i] = matrix[i][j]`?

Let’s break this down with a coordinate-based explanation.

Imagine you're rotating an element in a matrix:

| Original Coordinate | Value | New Coordinate After 90° Rotation |
|---------------------|-------|-----------------------------------|
| `(0, 0)`            | `1`   | `(0, 2)`                          |
| `(0, 1)`            | `2`   | `(1, 2)`                          |
| `(0, 2)`            | `3`   | `(2, 2)`                          |
| `(1, 0)`            | `4`   | `(0, 1)`                          |

To find the new position:
- The original `(i, j)` moves to `(j, n - 1 - i)`

**Why this happens:**
- Rotating 90° clockwise means rows become columns.
- The `j` index becomes the new row index.
- The original row index `i` must be flipped (from top to bottom) because in a 90° rotation, the top row moves to the rightmost column, so we use `n - 1 - i` to adjust the position.

#### 🔹 Steps:
1. Create a new matrix `ans[n][n]`.
2. For every element `matrix[i][j]`, assign it to `ans[j][n - 1 - i]`.
3. After filling `ans`, copy its values back into `matrix` to satisfy in-place requirement.

#### 🔹 Time and Space Complexity:
- **Time Complexity:** O(n²) — visiting every element once.
- **Space Complexity:** O(n²) — one extra matrix of same size.

---

### ⚙️ Approach 2: In-place (Transpose + Reverse Rows) ✅ Optimal

This is the **space-optimized** and industry-preferred method.

#### 🔹 Idea:
Instead of using extra space, perform two transformations on the matrix:
1. **Transpose** the matrix (swap rows with columns)
2. **Reverse each row** to achieve the 90° clockwise rotation.

---

### 🔸 Step-by-Step Breakdown:

#### 🧩 Step 1: Transpose the Matrix

- In a transpose operation, convert all `matrix[i][j]` into `matrix[j][i]`.
- This turns rows into columns.
- To avoid swapping elements twice, only iterate over the **upper triangle** (i.e., when `j > i`).

**After Transpose:**
```
[ [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9] ]
```

#### 🔁 Step 2: Reverse Each Row

- Now, reverse every individual row to complete the rotation.
- This shifts the newly created columns into their final rotated positions.

**After Reversing Each Row:**
```
[ [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3] ]
```

#### 🔹 Time and Space Complexity:
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1) — no extra space used

---

## 🧪 Dry Run of Approach 2 (In-place)

### 🔢 Input:
```
[ [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9] ]
```

### 🧩 After Transposing:
```
[ [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9] ]
```

### 🔁 After Reversing Each Row:
```
[ [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3] ]
```

✅ Final rotated matrix.

---

## 📊 Comparison Table

| Feature                    | Approach 1 (Brute Force)        | Approach 2 (In-place)        |
|----------------------------|----------------------------------|-------------------------------|
| Uses Extra Space           | ✅ Yes                          | ❌ No                         |
| Space Complexity           | O(n²)                           | O(1)                          |
| Time Complexity            | O(n²)                           | O(n²)                         |
| In-place Rotation          | ❌ No                           | ✅ Yes                        |
| Suitable for Interviews    | ❌ Rarely                       | ✅ Frequently                 |
| Implementation Complexity | Easy                            | Moderate (requires care)     |

---

## 🧠 Learning Points

- Learned how to rotate a 2D matrix **90 degrees clockwise**.
- Understood how to **take the transpose** of a matrix in-place.
- Learned how to **reverse a row** using two pointers technique.
- Observed how a **combination of mathematical operations** (transpose + reverse) achieves rotation.
- Understood the importance of **in-place manipulation** in optimizing space complexity.
- Practiced breaking down matrix problems into **smaller subproblems** (transform + adjust).

---

## 📝 Summary

- **Brute Force** is easier to understand but violates the in-place requirement.
- The **Transpose + Reverse** approach is optimal and space-efficient.
- This problem is a classic example of **matrix manipulation** and appears in technical interviews.
- Emphasis on writing **clean helper functions** (like `swap`, `reverseRow`, `transpose`) can make code reusable and readable.

---

# Leetcode 54 - Spiral Matrix Traversal

🔗 **Link:** [Leetcode - Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

---

## 🧾 Problem Statement

Given an `m x n` matrix, return all elements of the matrix in **spiral order**.

---

## 🧠 Input
- `matrix`: a 2D integer array of dimensions `m x n` (1 ≤ m, n ≤ 10)

## 📤 Output
- A list of integers representing the elements of the matrix traversed in spiral order.

---

## 🔍 Example

### Input:
```
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

### Output:
```
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

---

## 🚶 Approach (English Explanation)

We traverse the matrix **layer by layer** in a **spiral pattern**.  
At each step, we visit the outermost rows or columns and then move inward by updating the boundary pointers.

---

### 🔄 Spiral Order Steps

#### 1. ➡️ Traverse from **Left to Right** on the `top` row:
- Visit all elements from `left` to `right` in the `top` row.
- ✅ Since the **top row is now fully visited**, move `top++` to avoid visiting it again.

#### 2. ⬇️ Traverse from **Top to Bottom** on the `right` column:
- Visit all elements from `top` to `bottom` in the `right` column.
- ✅ Since the **right column is now fully visited**, move `right--` to shrink the matrix inward.

#### 3. ⬅️ Traverse from **Right to Left** on the `bottom` row:
- Before this step, check if `top <= bottom`.
- Visit all elements from `right` to `left` in the `bottom` row.
- ✅ Since the **bottom row is now visited**, move `bottom--` to avoid revisiting it.

#### 4. ⬆️ Traverse from **Bottom to Top** on the `left` column:
- Before this step, check if `left <= right`.
- Visit all elements from `bottom` to `top` in the `left` column.
- ✅ Since the **left column is now visited**, move `left++` to shrink the matrix further.

Repeat these steps until `top > bottom` or `left > right`.

---

## 📊 Dry Run (Step-by-Step Execution)

### Matrix:
```
[
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

Initial:
```
top = 0, bottom = 2
left = 0, right = 2
```

- **Left to Right** → `[1, 2, 3]`, then `top++ → 1`
- **Top to Bottom** → `[6, 9]`, then `right-- → 1`
- **Right to Left** → `[8, 7]`, then `bottom-- → 1`
- **Bottom to Top** → `[4]`, then `left++ → 1`
- **Left to Right** → `[5]`, then `top++ → 2`

Exit condition: `top > bottom` and `left > right`  
✔ Final Output: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

---

## ✅ Edge Conditions Handling

These checks are **crucial** before traversing `bottom` or `left`:

```
if (top <= bottom)
    // Traverse bottom row

if (left <= right)
    // Traverse left column
```

### Why?

- ✅ Prevents **double visiting** rows/columns when only one is left.
- ✅ Handles **edge cases** like 1×N or N×1 matrices.
- ✅ Prevents **ArrayIndexOutOfBoundsException**.
- ✅ Needed when the matrix has **odd dimensions**, like 3×3, where a single center element exists.

---

### 🧠 Easy Rule to Remember:

> ✔️ If after moving ➡️ right and ⬇️ down, the `top > bottom`, then stop:  
> there’s **no row** left for ⬅️ left.

> ✔️ If after moving ⬅️ left, the `left > right`, then stop:  
> there’s **no column** left for ⬆️ up.

---

## 🧠 Analogy

> Think of **peeling an onion** or **unwrapping a gift box** layer by layer.
>
> Each spiral iteration removes one outer layer and moves inward.

---

## 📦 Time and Space Complexity

| Complexity | Value |
|------------|-------|
| ⏱ Time     | `O(m × n)` — Every element is visited once |
| 💾 Space   | `O(1)` — Ignoring output list |

---

## 🧑‍🏫 Learning Points

- How to use **four boundaries**: `top`, `bottom`, `left`, `right`.
- Managing traversal direction by **updating limits**.
- Handling edge cases cleanly.
- Mastering a traversal pattern useful in:
  - Matrix rotation
  - Spiral filling
  - Image rendering logic
  - Game board simulation

---

## 📝 Summary

| Concept             | Explanation |
|---------------------|-------------|
| Traversal Order     | Top → Right → Bottom → Left |
| Boundaries Updated  | After visiting each row/col, move the boundary inward |
| Essential Checks    | `if (top <= bottom)`, `if (left <= right)` |
| Core Insight        | Peel the matrix like layers of an onion |
| Interview Tip       | This pattern comes up frequently — practice it until fluent |

---
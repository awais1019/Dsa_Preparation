# 🧩 LeetCode 88 - Merge Sorted Array

## 🔗 Problem Link
[LeetCode 88: Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

---

## 📜 Problem Statement

You are given two sorted arrays:

- `nums1` of size `m + n`, where the first `m` elements are valid and the rest are `0`s (placeholders).
- `nums2` of size `n`, fully filled with sorted integers.

Your task is to **merge** `nums2` into `nums1` so that `nums1` becomes a **single sorted array**, **in-place**.

---

## 📥 Input

- `nums1 = [1,2,3,0,0,0], m = 3`
- `nums2 = [2,5,6], n = 3`

## 📤 Output

- `nums1 = [1,2,2,3,5,6]`


---

## 🔍 Approach 1: Using Extra Array + Forward Merge (Two Pointers)

### 📌 Idea
We create a temporary array to hold the first `m` elements of `nums1`, then use two pointers to merge `temp[]` and `nums2[]` into `nums1[]` from the **beginning**.

### 🪜 Step-by-Step Breakdown

1. **Copy `nums1`'s first `m` elements** into a temporary array called `temp[]`.
   - This prevents them from being overwritten during the merge.

2. **Initialize three pointers**:
   - `i` → index for `temp[]`
   - `j` → index for `nums2[]`
   - `index` → index for final merged result in `nums1[]`

3. **Start comparing**:
   - Compare `temp[i]` and `nums2[j]`.
   - Copy the smaller one to `nums1[index]`.
   - Move the pointer (`i` or `j`) and increment `index`.

4. **Handle remaining elements**:
   - If `temp[]` has remaining values → copy them to `nums1`.
   - If `nums2[]` has remaining values → copy them to `nums1`.

### ✅ Key Points

- Simple and clean logic, easy to understand.
- Uses extra space of size `m` to store original `nums1`.
- Useful when in-place modification is not mandatory.

---

## 🔄 Approach 2: In-Place Merge from End (Optimal & Space-Efficient)

### 📌 Idea
We **start from the end** of both arrays and fill `nums1[]` from the **back**, where we have empty space. This way, we avoid overwriting useful values in `nums1`.

### 🪜 Step-by-Step Breakdown

1. **Initialize three pointers**:
   - `i = m - 1` → last valid index in `nums1`
   - `j = n - 1` → last index in `nums2`
   - `k = m + n - 1` → last index of `nums1` (total length)

2. **Start from the back and compare**:
   - Compare `nums1[i]` and `nums2[j]`.
   - Place the **larger** value at `nums1[k]`.
   - Move the respective pointer (`i` or `j`) backward.
   - Decrease `k` after each insertion.

3. **Remaining elements in `nums2`**:
   - If any elements remain in `nums2` after the loop (i.e., `j >= 0`), copy them directly into `nums1`.

4. **No need to copy remaining `nums1` elements**:
   - If elements remain in `nums1`, they’re already in place.

### ✅ Key Points

- **No extra space** used — true in-place solution.
- Starts from the back to avoid overwriting original data in `nums1`.
- Slightly trickier logic but highly efficient.

---

## 📊 Comparison Table

| Feature                  | Approach 1 (Extra Array)         | Approach 2 (In-Place Merge)        |
|--------------------------|----------------------------------|-------------------------------------|
| Direction                | Left to right                   | Right to left                      |
| Extra Space              | Yes (`O(m)` temp array)         | No (`O(1)`)                        |
| Time Complexity          | `O(m + n)`                      | `O(m + n)`                         |
| Space Complexity         | `O(m)`                          | `O(1)`                             |
| Memory Efficient         | ❌                              | ✅                                 |
| Logic Simplicity         | ✅ Easier to follow              | ❌ Slightly more advanced          |
| Suitable for Interviews  | Good starting point             | Best for optimized solution        |

---

## 📘 Learning Points

- Two-pointer technique for merging sorted arrays.
- Strategy to avoid overwriting during in-place operations.
- Importance of pointer movement direction (forward vs backward).
- Edge case handling when arrays are of different sizes.
- A classic building block for understanding **merge sort** and **in-place algorithms**.

---

## 🧠 Summary

| 📌 Recommendation |
|------------------|
| ✅ Use **Approach 2** when space is constrained or in-place merging is required. |
| ✅ Use **Approach 1** for easier logic, especially during learning or practice. |


---

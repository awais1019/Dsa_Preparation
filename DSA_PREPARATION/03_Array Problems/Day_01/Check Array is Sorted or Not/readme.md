# ✅ Check If an Array Is Sorted in Ascending Order

### 📘 Problem Statement  
Given an integer array, determine whether it is **sorted in non-decreasing (ascending) order**.  
Return `true` if the array is sorted, otherwise return `false`.

---

### 🧾 Input  
- `int[] nums` — An array of integers.

### ✅ Output  
- A boolean value:  
  - `true` if array is sorted in ascending order  
  - `false` if any element breaks the order

---

### 🧠 Approach (Step-by-Step)
1. Start from index `1` to `n-1`.
2. At each step, compare `nums[i]` with `nums[i - 1]`.
3. If `nums[i] < nums[i - 1]`, array is **not sorted** → return `false`.
4. If loop completes, array is **sorted** → return `true`.

---

### 🧪 Example

**Input:**  
`nums = [1, 2, 3, 4, 5]`  
**Output:**  
`true`

**Input:**  
`nums = [5, 4, 3, 2, 1]`  
**Output:**  
`false`

**Input:**  
`nums = [1, 1, 2, 2, 3]`  
**Output:**  
`true` (Duplicates are allowed)

---

### ⚠️ Edge Cases
- Empty array → `true` (by definition, no violations)
- Single element → `true`
- Array with all equal elements → `true`
- Array sorted in descending order → `false`

---

### 📌 Summary

| Property       | Value          |
|----------------|----------------|
| Time Complexity | `O(n)`         |
| Space Complexity | `O(1)`       |
| Useful For     | Validation, early exit checks, greedy algorithms |

---

### 🔗 Similar Problems
- Check if array is strictly increasing  
- Check if array is sorted in descending order  
- Count number of unsorted elements

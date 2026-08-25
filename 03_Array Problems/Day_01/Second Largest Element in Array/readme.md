# 🥈 Find the Second Largest Element in an Array

### 📘 Problem Statement  
Given an integer array, find the **second largest** unique element.  
If it doesn’t exist (e.g., all elements are the same), return `-1`.

---

### 🧾 Input  
- `int[] nums`: An array of integers (unsorted, may contain duplicates).

### ✅ Output  
- An integer representing the **second largest distinct value**.  
- Return `-1` if no such value exists.

---

### 🚀 Approaches

#### 🔹 1. Brute Force – `O(n log n)`
1. Sort the array in ascending order.
2. Start from the end and find the first element that is **not equal** to the largest one.
3. Return that as the second largest.

#### 🔹 2. Two-Pass Scan – `O(2n)`
1. First pass: Find the **maximum value**.
2. Second pass: Find the **largest value less than the max**.
3. Return that second largest value.

#### 🔹 3. Single-Pass Optimized – `O(n)`
1. Initialize `firstLargest` and `secondLargest`.
2. Traverse the array:
   - If `num > firstLargest` →  
     👉 **New topper found** → assign `secondLargest = firstLargest`  
     👉 assign `firstLargest = num`
   - Else if `num < firstLargest && num > secondLargest` →  
     👉 assign `secondLargest = num`
3. Return `secondLargest`.

📌 **Think like a topper:**
> If a **new topper (highest)** comes in, the **old topper becomes second-topper**.

---

### 🧠 You Can Also Use This Logic To:
- 🔽 **Find the second smallest** by reversing the logic:
  - Use `<` instead of `>`, and track `firstSmallest`, `secondSmallest`.

---

### ⚠️ Edge Cases to Handle
- Array contains all duplicates → `[5, 5, 5]` → return `-1`
- Array with only one element → `[7]` → return `-1`
- Array with two same elements → `[9, 9]` → return `-1`
- Negative numbers → `[-1, -3, -2]` → should still work

---

### 📚 Learning Points
- Track **top two values** using conditions instead of sorting.
- Avoid modifying the original array by using `.clone()` in tests.
- Single-pass logic is **cleaner, faster, and production-friendly**.
- Use the **topper analogy** to understand value shifting.

---

### 🧪 Example  
**Input:**  
`nums = [5, 2, 8, 6, 3, 8]`  
**Output:**  
`6` (since `8` is the largest, `6` is the next distinct maximum)

---

### 📌 Summary

| Method        | Time Complexity | Space | Notes                        |
|---------------|------------------|--------|------------------------------|
| Brute Force   | `O(n log n)`     | `O(1)` | Needs sorting                |
| Two-Pass      | `O(n)`           | `O(1)` | Simple and clean             |
| Single-Pass   | `O(n)`           | `O(1)` | Most efficient and recommended |

---

### 🧑‍💻 Best Practice
- Use **single-pass method** with topper analogy in interviews.
- Use `.clone()` when sorting to keep original array untouched.
- Abstract logic into a **helper method** for reuse.

---


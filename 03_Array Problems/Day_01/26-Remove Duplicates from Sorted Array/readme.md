# 🚫 LeetCode 26 - Remove Duplicates from Sorted Array

### 📘 Problem Statement  
Given a **sorted array** of integers, remove the **duplicate elements** in-place so that each element appears **only once**.  
Return the **new length** of the array after removing duplicates.

---

### 🧾 Input  
- `int[] nums` — a sorted array of integers.

### ✅ Output  
- An integer — the number of unique elements after removing duplicates.  
- The first part of the array should now contain only **unique** elements.

---

### 🧠 Approach (Step-by-Step)  
1. Use two pointers:  
   - `i` for the position of the last unique element.  
   - `j` to iterate through the array.
2. For every element at `j`, compare with `nums[i]`.  
3. If they are different, it means a new unique value is found:  
   - Move it to position `i + 1`.  
   - Increment `i`.
4. At the end, return `i + 1` as the count of unique elements.

---

### 🎯 Learning  
- Understand how to use **two-pointer technique** efficiently.  
- Learn how to perform **in-place modifications** on arrays.  
- Realize the advantage of **sorted input** in duplicate removal.

---

### 📌 Summary  
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)` (in-place)  
- Useful for problems involving **array manipulation**, especially **sorted** arrays.
### 🔗 Problem Link  
[LeetCode - Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
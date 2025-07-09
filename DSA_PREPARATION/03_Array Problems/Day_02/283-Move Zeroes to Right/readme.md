# 🚀 LeetCode 283: Move Zeroes
🔗 [View Problem on LeetCode](https://leetcode.com/problems/move-zeroes/)

## 📄 Problem Statement

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

- You **must do this in-place** without making a copy of the array.
- Minimize the total number of operations.

### ✅ Input:
`int[] nums = {0, 1, 0, 3, 12}`

### ✅ Output:
`[1, 3, 12, 0, 0]`

---

### 💬 Explanation:
- All non-zero elements (`1, 3, 12`) are moved to the front **in the same order**.
- All zeroes are pushed to the end **without changing the order of non-zero elements**.

---

## 💡 Approaches

### 🧠 Approach 1: Shift Non-Zero Elements and Track Zeroes

**Idea**:  
Iterate through the array, moving non-zero elements to the front and counting how many zeroes you've seen. After all non-zero elements are shifted, fill the remaining positions with zeroes.

**Steps**:
1. Maintain an index `i` to place non-zero elements.
2. For every non-zero element in the array, assign it to `nums[i]` and increment `i`.
3. After the loop, fill the rest of the array from `i` to end with `0`.

**Time Complexity**: O(n)  
**Space Complexity**: O(1)

---

### 🧠 Approach 2: Two-Pass Optimized Write-Then-Fill

**Idea**:  
Similar logic to Approach 1, but split clearly into two passes — one to shift non-zero elements forward, and one to fill the rest with zeroes. This improves readability and avoids keeping a separate zero count.

**Steps**:
1. First pass: Move all non-zero elements to the front using a `cnt` pointer.
2. Second pass: From `cnt` to end of array, set all elements to `0`.

**Benefits**:
- Clear logic separation.
- No explicit zero counting required.

**Time Complexity**: O(n)  
**Space Complexity**: O(1)

---

### 🧠 Approach 3: Two-Pointer In-Place Reordering

**Idea**:  
Use two pointers to directly manipulate the array in-place. One pointer (`left`) finds the next `0`, and the other (`right`) finds the next non-zero to swap.

**Steps**:
1. Initialize `left` at the first zero in the array.
2. Use `right` to scan ahead and find non-zero elements.
3. When a non-zero is found, move it to `left` and set `right` to `0`.
4. Increment `left` and continue until the end.

**Best For**:
- Scenarios where elements are sparsely zero.
- Efficient in-place manipulation without auxiliary state.

**Time Complexity**: O(n)  
**Space Complexity**: O(1)

---

## 📚 Learning Points

- Understand different ways of manipulating arrays in-place.
- Two-pointer techniques are extremely powerful in optimization problems.
- Clean separation of logic can help reduce bugs and improve readability.
- Counting or tracking state can sometimes be replaced by clever pointer movement.

---

## 📝 Summary

| Approach   | Concept                | Readability | In-place | Extra Space | Efficient |
|------------|------------------------|-------------|----------|-------------|-----------|
| Approach 1 | Non-zero shift + count | Medium      | ✅        | ❌ (count)   | ✅         |
| Approach 2 | Optimized non-zero push| High        | ✅        | ❌           | ✅         |
| Approach 3 | Two-pointer swap        | Medium      | ✅        | ❌           | ✅✅        |

---

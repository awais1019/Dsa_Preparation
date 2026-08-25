
# Leetcode 503: Next Greater Element II

🔗 [Problem Link](https://leetcode.com/problems/next-greater-element-ii/)

---

## 📝 Problem Statement

Given a **circular array** `nums`, return **the next greater number for every element** in the array.  
The **next greater number** of a number `x` is the **first greater number** to its **right in traversal**, considering the array circular.  
If it doesn't exist, return `-1`.

---

## 📥 Input

- `nums`: an array of integers (considered circular)

## 📤 Output

- An array of integers representing the next greater number for each element in `nums`.

---

## 📌 Example

### Input:
```
nums = [1, 2, 1]
```

### Output:
```
[2, -1, 2]
```

---

## ✅ Approaches

---

### 🔹 Approach 1: Brute Force Using Circular Traversal

**Steps:**

1. Loop through each element `nums[i]`.
2. To find the next greater element, check up to the next `n` elements circularly.
3. Specifically, loop from `j = i + 1` to `i + n`, and check if `nums[j % n] > nums[i]`.
4. If found, assign that as the next greater element.
5. If not found after full traversal, assign `-1`.

**Clarification:**

- For each index `i`, we simulate circular behavior by checking the next `n` elements in total.
- This includes elements from `i+1` to the end, and then wraps around from the beginning.
- We loop from `j = i + 1` to `j = i + n`, using `nums[j % n]` to access elements circularly.
- For example:
  - If `i = 1` and `n = 3`, we check indices `2`, `3`, `4` → which maps to elements at `2`, `0`, `1` (via modulo 3).
  - This ensures we check all remaining elements and wrap around to the front.

**Complexity:**

- Time: `O(n^2)`
- Space: `O(1)` (excluding result array)

---

### 🔹 Approach 2: Stack-based Optimized Solution

**Steps:**
1. Traverse the array twice (from `2n - 1` to `0`) to simulate circular behavior.
2. Use a stack to keep potential next greater elements.
3. For each index `i`:
   - While stack is not empty and top ≤ `nums[i % n]`, pop from stack.
   - If in the first pass (`i < n`), assign:
     - `-1` if stack is empty
     - Otherwise, `stack.peek()`
   - Push `nums[i % n]` into the stack.

**Complexity:**
- Time: `O(n)`
- Space: `O(n)` (stack)

---

## 🔁 Dry Run (Stack Approach)

Input: `[1, 2, 1]`  
n = 3

```
i = 5 → nums[2] = 1 → stack = [] → push 1  
i = 4 → nums[1] = 2 → pop 1 → stack = [] → push 2  
i = 3 → nums[0] = 1 → stack top 2 > 1 → ans[0] = 2 → push 1  
i = 2 → nums[2] = 1 → stack top 1 = 1 → pop → top 2 > 1 → ans[2] = 2 → push 1  
i = 1 → nums[1] = 2 → pop 1 → pop 2 → stack empty → ans[1] = -1 → push 2  
i = 0 → nums[0] = 1 → stack top 2 > 1 → ans[0] = 2
```

Result: `[2, -1, 2]`

---

## 🔍 Comparison

| Feature           | Brute Force     | Stack-based        |
|------------------|-----------------|--------------------|
| Time Complexity   | O(n²)           | O(n)               |
| Space Complexity  | O(1)            | O(n)               |
| Simplicity        | Easy to follow  | More efficient     |
| Circular Handling | Manual via `%`  | Naturally via 2n loop |

---

## 📘 Learning

- Circular arrays can be simulated using modular arithmetic.
- Stack-based approaches are optimal for "next greater" type problems.
- Always consider simulating rather than duplicating structures.

---

## 🧾 Summary

- Brute force is simple but inefficient for large inputs.
- The stack-based method is clean and efficient.
- Simulating circular behavior is better than duplicating arrays in memory.

---

## 💡 Note

While doubling the array is a possible mental model to simulate circular traversal, it's **not necessary**.  
Instead, using `(i % n)` in a loop of size `2n` achieves the same result in a more optimal and space-efficient way.

# 🔢 Problem Name: 496. Next Greater Element I  
**Link:** [LeetCode 496 - Next Greater Element I](https://leetcode.com/problems/next-greater-element-i)

---

## 🧾 Problem Statement

You are given two integer arrays `nums1` and `nums2` where `nums1` is a subset of `nums2`.  
Find the **next greater number** for every element in `nums1` within the `nums2` array.

The **next greater number** for an element `x` in `nums2` is the **first greater number to the right of `x`** in `nums2`.  
If no such number exists, return `-1` for that element.

---

## 🔤 Input

- `nums1.length <= nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 10^4`
- All elements in `nums1` and `nums2` are **unique**
- `nums1` is a subset of `nums2`

---

## 🧾 Output

Return an integer array `result` such that:
- `result[i]` is the next greater element for `nums1[i]` in `nums2`

---

## 📘 Example

### Input:
nums1 = [4, 1, 2]  
nums2 = [1, 3, 4, 2]

### Output:
[-1, 3, -1]

### Explanation:
- `4` → no greater element on right → -1  
- `1` → next greater is `3`  
- `2` → no greater → -1

---

## 🧠 Monotonic Stack Problem

A **monotonic stack** is a stack that maintains its elements in either **increasing** or **decreasing** order (from bottom to top).  
It is extremely useful for solving problems like:
- Next Greater Element
- Next Smaller Element
- Stock Span
- Daily Temperatures

In this problem, we use a **monotonic decreasing stack** — where the stack maintains elements in **decreasing order** from bottom to top.  
As we find a greater element, we pop all smaller elements and map them to the current one.

---

## 🧭 Approaches

### 🟠 Approach 1: Brute Force (Reverse Search)

**Time Complexity:** O(n1 * n2)  
**Space Complexity:** O(1)

#### 🔄 Steps:
1. For each element in `nums1`, start scanning `nums2` from the right.
2. When you reach the element, break.
3. If any element greater than `nums1[i]` is found during the backward scan, store it as NGE.
4. Otherwise, keep `-1`.

#### 🧪 Dry Run:
`nums1 = [4, 1, 2]`, `nums2 = [1, 3, 4, 2]`

- 4 → backward search → no greater → -1  
- 1 → 2 ❌, 4 ❌, 3 ✅ → 3  
- 2 → nothing greater on right → -1

---

### 🟢 Approach 2: Monotonic Stack (Optimized)

**Time Complexity:** O(n1 + n2)  
**Space Complexity:** O(n2)

#### 📚 Concept:
We **preprocess** `nums2` to compute **Next Greater Element** using a **monotonic decreasing stack**.

#### ⚙️ Steps:
1. Create an empty stack and map.
2. Traverse `nums2`:
   - While the stack is not empty and `num > stack.peek()`:
     - Pop the element and map it to `num` (its NGE).
   - Push `num` onto the stack.
3. Once preprocessing is done:
   - For every element in `nums1`, fetch its NGE from the map (or `-1` if not found).

#### 🧪 Dry Run:
`nums2 = [1, 3, 4, 2]`

| Step | Stack (Top Right) | Action                  | Map Updated        |
|------|--------------------|--------------------------|--------------------|
| 1    | [1]               | push 1                   |                    |
| 2    | [3]               | pop 1, map[1] = 3        | {1=3}              |
| 3    | [4]               | pop 3, map[3] = 4        | {1=3, 3=4}         |
| 4    | [4, 2]            | push 2 (2 < 4)           |                    |

Final map: `{1=3, 3=4}`

---

## 🔄 Comparison Table

| Feature                 | Brute Force           | Monotonic Stack       |
|-------------------------|------------------------|------------------------|
| Time Complexity         | O(n1 * n2)              | O(n1 + n2)             |
| Space Complexity        | O(1)                    | O(n2)                  |
| Stack Used              | ❌                      | ✅ Monotonic Decreasing|
| Speed                  | Slower                 | Much faster            |
| Code Complexity         | Simple                 | Slightly more advanced |

---

## 📘 Learning Points

- **Monotonic Decreasing Stack** is ideal for **Next Greater Element** problems.
- Brute force is intuitive but scales poorly.
- Preprocessing with a HashMap avoids repeated searching.
- Dry running the stack logic is important to ensure correctness.
- This technique generalizes to other problems like:
  - [503. Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)
  - [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
  - [901. Online Stock Span](https://leetcode.com/problems/online-stock-span/)

---

## ✅ Summary

- You solve each `nums1[i]` by checking its position in `nums2` and finding the next greater element.
- Brute-force approach uses a backward scan → works but inefficient.
- **Optimized approach uses a monotonic decreasing stack**, precomputes answers, and gives fast lookups using a HashMap.
- This is a core pattern used in many array problems and interview questions.
# Leetcode -75 Sort Colors

> Sort an array containing only 0s, 1s, and 2s **in-place** so that all 0s come first, then 1s, and then 2s — without using any built-in sort functions.

---

## 📎 Problem Link

[🔗 Leetcode - Sort Colors (#75)](https://leetcode.com/problems/sort-colors/)

---

## 🧪 Example

**Input:**

- `nums = [2, 0, 2, 1, 1, 0]`

**Output:**

- `[0, 0, 1, 1, 2, 2]`

---

## 📌 Constraints

- `1 <= nums.length <= 300`
- `nums[i]` is either `0`, `1`, or `2`

---

# 🚀 Approaches

---

## ✅ Approach 1: Counting Sort (Two Pass)

### 🔧 Idea

We simply count the number of:

- `0`s (store in `zeros`)
- `1`s (store in `ones`)

Since total size is known, number of `2`s will be `n - zeros - ones`.

---

### 🪜 Steps

1. Traverse the array once and count how many 0s and 1s are present.
2. In the second loop:
   - Fill the first `zeros` indices with 0
   - Next `ones` indices with 1
   - Remaining with 2

---

### ✅ Time and Space

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **In-place**: Yes

---

## ✅ Approach 2: Dutch National Flag Algorithm (One Pass, Optimal)

### 🧠 Idea

We use **three pointers**:

| Pointer | Role                        |
| ------- | --------------------------- |
| `low`   | Boundary of 0s (left zone)  |
| `mid`   | Current index to process    |
| `high`  | Boundary of 2s (right zone) |

---

### 🪜 Steps (with Explanation and Pointer Roles)

We use three pointers to partition the array into 0s (left), 1s (middle), and 2s (right):

1. **Initialize:**

   - `low = 0`: points to where the next 0 should be placed (start of 0s section)
   - `mid = 0`: current index we are checking
   - `high = n - 1`: points to where the next 2 should go (end of 2s section)

2. **Iterate while `mid <= high`**:

   - At each step, check the value of `nums[mid]` and decide what to do:

   #### 🔁 Case 1: `nums[mid] == 0`

   - 0 should be placed in the **left part** of the array.
   - So we **swap `nums[mid]` with `nums[low]`** — this places 0 at the correct position.
   - Then:
     - Increment `low` → because the 0 is now in its final position.
     - Increment `mid` → to process the next element.

   #### 🔁 Case 2: `nums[mid] == 1`

   - 1 is already in the **middle**, which is the correct zone.
   - No swap is needed.
   - Just increment `mid` to move to the next element.

   #### 🔁 Case 3: `nums[mid] == 2`

   - 2 should go in the **rightmost part** of the array.
   - So we **swap `nums[mid]` with `nums[high]`** to move the 2 toward the right.
   - Then:
     - Decrement `high` → since the 2 is now at its correct boundary.
     - **Do not increment `mid` yet**, because the new value at `mid` could be 0, 1, or 2 — and needs to be re-evaluated.

---

### 📌 Why This Works

By maintaining three regions:

- `nums[0...low-1]` → All 0s (left section)
- `nums[low...mid-1]` → All 1s (middle section)
- `nums[high+1...n-1]` → All 2s (right section)
- `nums[mid...high]` → Unsorted, currently being processed

We ensure:

- Every 0 is pushed to the front,
- Every 2 is pushed to the end,
- 1s naturally fall into place in the middle.

This gives us the final sorted order in-place: `[0, 0, ..., 1, 1, ..., 2, 2]`.

### 🧪 Dry Run

#### Input:

nums = [2, 0, 2, 1, 1, 0]

| Step | Array                 | low | mid | high | Action                       |
| ---- | --------------------- | --- | --- | ---- | ---------------------------- |
| 1    | [2, 0, 2, 1, 1, 0]    | 0   | 0   | 5    | Swap mid ↔ high → [0,...]    |
| 2    | [0, 0, 2, 1, 1, 2]    | 0   | 0   | 4    | Swap mid ↔ low, low++, mid++ |
| 3    | [0, 0, 2, 1, 1, 2]    | 1   | 1   | 4    | Swap mid ↔ low, low++, mid++ |
| 4    | [0, 0, 2, 1, 1, 2]    | 2   | 2   | 4    | mid == 2 → swap mid ↔ high   |
| 5    | [0, 0, 1, 1, 2, 2]    | 2   | 2   | 3    | mid == 1 → mid++             |
| 6    | [0, 0, 1, 1, 2, 2]    | 2   | 3   | 3    | mid == 1 → mid++             |
| 7    | (mid=4 > high=3) Done |     |     |      |                              |

---

### 🎯 Final Pointers' Position:

- `low` ends where 0s finish
- `mid` ends where 1s finish
- `high` ends just before 2s start

We got exactly what we wanted:
[0s][1s][2s]

---

# 📊 Comparison

| Feature           | Counting Sort | Dutch National Flag  |
| ----------------- | ------------- | -------------------- |
| Passes over array | 2             | 1                    |
| Time Complexity   | O(n)          | O(n)                 |
| Space Complexity  | O(1)          | O(1)                 |
| In-place          | ✅            | ✅                   |
| Swap operations   | ❌            | ✅ (Minimal)         |
| When to prefer    | Simple logic  | More optimal, tricky |

---

# 📚 Learning Points

- Use counting sort when the value range is small and fixed.
- Dutch National Flag is efficient for **one-pass partitioning** problems.
- Always re-check pointer movement logic when swapping:  
  e.g., don't move `mid` after swapping with `high` since the new value might be `0` or `1` or `2`.

---

# 🧾 Summary

> This problem is a classic example of **in-place array partitioning**.
>
> - In **Approach 1**, we used **counting sort** — count the number of 0s and 1s, then rewrite the array in two passes.
>
> - In **Approach 2**, we used a pointer-based logic known as the **Dutch National Flag Algorithm** (or **Dijkstra’s 3-way Partitioning Algorithm**). It partitions the array using three pointers (`low`, `mid`, `high`) in a single pass without extra space.

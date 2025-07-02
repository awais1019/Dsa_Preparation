# 🧮 Binary Subarrays With Sum

Given a binary array `nums` and an integer `goal`, return the number of **non-empty subarrays** with a sum exactly equal to `goal`.

---

## 🔢 Input and Output

### 🧾 Input
- `nums`: Integer array of binary values (only 0s and 1s), length `n` (1 ≤ n ≤ 10⁵)
- `goal`: Integer (0 ≤ goal ≤ n)

### 📤 Output
- Integer value: total number of subarrays with sum **equal** to `goal`

---

## 🧪 Examples

### Example 1
- `Input:`
  `nums = [1, 0, 1, 0, 1]`
  `goal = 2`

- `Output:`
  `4`

**Explanation:**  
The valid subarrays with sum = 2 are:

- [1, 0, 1]  
- [1, 0, 1, 0]  
- [0, 1, 0, 1]  
- [1, 0, 1, 0, 1]



- `Input:`
  `nums = [0, 0, 0, 0, 0]`
  `goal = 0`

- `Output:`
  `15`

**Explanation:** All continuous subarrays of 0s have a sum of 0.  
The number of such subarrays of different lengths is:

- 1-element subarrays: 5  
- 2-element subarrays: 4  
- 3-element subarrays: 3  
- 4-element subarrays: 2  
- 5-element subarrays: 1  

**Total = 5 + 4 + 3 + 2 + 1 = 15**

## 🧠 Approach 1: Brute Force

### 📌 Steps:
1. Loop through each starting index `i`
2. For each `i`, expand subarray to the right using index `j`
3. Keep a running `sum` from `i` to `j`
4. If `sum == goal`, increment the count
5. If `sum > goal`, break early (sum will only increase)

### 💡 Why It Works:
- Only 0s and 1s are used, so sum never decreases
- Early exit saves time when sum exceeds `goal`



## 🚀 Approach 2: Optimized – Sliding Window + atMost Trick

---

### 📌 Concept

Instead of checking all subarrays directly, we use a sliding window with a key identity:

> Subarrays with sum **exactly equal to `goal`** =  
> `atMost(goal)` − `atMost(goal - 1)`

Where `atMost(k)` is the number of subarrays with sum **less than or equal to** `k`.

This avoids checking each subarray explicitly and runs in linear time.

---

### ❓ Why Subtract?

The idea is to **remove the extra subarrays** counted by `atMost(goal)` that have a sum less than `goal`.

Let’s break it down:

- `atMost(goal)` counts:
  - Subarrays with sum = goal ✅
  - Subarrays with sum < goal ❌ (we don’t want these)

- `atMost(goal - 1)` counts:
  - Only subarrays with sum < goal ❌

So when we subtract:
atMost(goal) - atMost(goal - 1)

We remove the subarrays that are **less than `goal`**, leaving only those with **sum exactly equal to `goal`**.

---

### 💡 Example

Let’s say:  
`nums = [1, 0, 1, 0]`  
`goal = 2`

**Step 1: Count subarrays with sum ≤ 2**

- `[1]` → 1  
- `[1,0]` → 1  
- `[1,0,1]` → 2  
- `[1,0,1,0]` → 2  
- `[0]` → 0  
- `[0,1]` → 1  
- `[0,1,0]` → 1  
- `[1]` → 1  
- `[1,0]` → 1  
- Total = **10 subarrays**

**Step 2: Count subarrays with sum ≤ 1 (i.e. < goal)**

- `[1]` → 1  
- `[0]` → 0  
- `[0,1]` → 1  
- `[1]` → 1  
- Total = **6 subarrays**

**Step 3: Subtract**

- 10 (≤ 2) - 6 (≤ 1) = 4 subarrays with sum exactly 2


✅ These are:
- `[1,0,1]`
- `[1,0,1,0]`
- `[0,1,0]`
- `[1,0,1,0]`

---

### 🧠 How the `atMost(k)` Function Works

1. Initialize `sum = 0`, `left = 0`, `count = 0`
2. Loop over the array using `right` pointer
3. Add `nums[right]` to the sum
4. While `sum > k`, shrink the window by moving `left` forward
5. For each valid window (sum ≤ k), add `(right - left + 1)` to the count

This counts all subarrays ending at `right` with valid sum.

---

### ✅ When This Trick Works

- Works only if all elements are **non-negative**
- Because only then can we trust that the sum increases when extending the window
- Best used on **binary arrays** (only 0s and 1s)

---

## 📚 Learning Summary

| Topic                        | Insight                                                                 |
|-----------------------------|-------------------------------------------------------------------------|
| Sliding Window               | Efficient for tracking subarray sums                                   |
| Trick: atMost(k)             | Counts subarrays with sum ≤ k using two pointers                       |
| Why Subtract?                | To isolate subarrays with exact sum by removing unwanted extras         |
| Time Complexity              | O(n) vs Brute Force’s O(n²)                                            |
| When to Use                  | Arrays with only non-negative values (e.g., binary arrays)              |
| General Pattern              | Also useful in problems like "subarrays with at most K distinct values" |

---

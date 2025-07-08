# 📘 Leetcode 992 - Subarrays with K Different Integers

## ✅ Problem Statement

Given an array of integers `nums` and an integer `k`, return **the number of subarrays that contain exactly `k` different integers**.

---

## 🔢 Input

- `nums`: An integer array of length `n` (1 ≤ n ≤ 20,000), each `1 ≤ nums[i] ≤ n`
- `k`: An integer (1 ≤ k ≤ n)

---

## 🎯 Output

- Return the number of subarrays that contain exactly `k` distinct integers.

---

## 🧪 Example

- `Input:`  
  `nums = [1,2,1,2,3], k = 2`

- `Output:`  
  `7`

**Explanation:**

The subarrays with exactly 2 different integers are:
- [1,2]  
- [2,1]  
- [1,2]  
- [2,3]  
- [1,2,1]  
- [2,1,2]  
- [1,2,3]

---

## 💡 Approach: Sliding Window + AtMost Trick

We need to count the number of subarrays with **exactly** `k` distinct integers.

---

## 🔁 Step-by-Step Strategy

We use this identity:

- `Count of subarrays with exactly k distinct integers = atMost(k) - atMost(k - 1)`

This works because:

- `atMost(k)` counts all subarrays with **at most** `k` distinct integers.  
- `atMost(k - 1)` counts all subarrays with **at most** `k - 1` distinct integers.  
- So, their difference gives us the number of subarrays with **exactly** `k` distinct integers.

---

## ⚙️ How the `atMost(k)` Function Works

We use the **sliding window** technique to count the number of subarrays with at most `k` distinct integers.

### 🔢 Steps:

1. **Initialize variables**:
   - `left = 0`
   - `count = 0` → total number of valid subarrays
   - `map = frequency hashmap` to track element frequencies

2. **Iterate** through the array using `right` pointer from `0` to `n - 1`:
   - Add/update the frequency of `nums[right]` in the map

3. **Shrink the window** from the left while `map.size() > k`:
   - Decrement the frequency of `nums[left]`
   - If frequency becomes 0, remove the key
   - Move `left++`

4. **Count the subarrays ending at index `right`**:
   - Add `(right - left + 1)` to `count`
   - These are all valid subarrays ending at `right`

5. **Repeat** steps 2–4 for all elements in the array.

6. **Return `count`** at the end.

---

### ✅ Why `(right - left + 1)`?

At each step, the subarrays that end at index `right` and start anywhere from `left` to `right` (inclusive) are all valid.  
So their count is exactly `(right - left + 1)`.

---

## 🧠 Dry Run Example

Let:
- `nums = [1, 2, 1, 2, 3]`
- `k = 2`

- `atMost(2) = 12`  
- `atMost(1) = 5`

**Final result:**  
- `exactly(2) = 12 - 5 = 7`

---

## 📘 Similar Pattern Used In

### **1248-Count Number of Nice Subarrays**

- Problem: Count subarrays with exactly `k` **odd** numbers  
- Formula used:  
  `exactly(k) = atMost(k) - atMost(k - 1)`

---

## 📚 Learning Summary

- The trick `atMost(k) - atMost(k - 1)` is **powerful** and reusable.
- Works great when:
  - You're counting distinct/cumulative things (odds, distinct elements, 1s, etc.)
  - You can **shrink** the window from the left
- Try using this whenever you're asked to find **exactly k** of something in a subarray.

---

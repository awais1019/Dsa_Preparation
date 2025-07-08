# 📘 Leetcode 1248 - Count of Number of Nice Subarrays

## ✅ Problem Statement

Given an array of integers `nums` and an integer `k`, return **the number of "nice" subarrays**.

A subarray is called **nice** if it contains exactly `k` **odd numbers**.

---

## 🔢 Input

- `nums`: An integer array of length `n` (1 ≤ n ≤ 50,000), each `0 ≤ nums[i] ≤ 10^5`
- `k`: An integer (1 ≤ k ≤ n)

---

## 🎯 Output

- Return the number of subarrays that contain exactly `k` odd numbers.

---

## 🧪 Example

- `Input:`
`nums = [1,1,2,1,1], k = 3`

- `Output:`
  `2`

**Explanation:**
The subarrays with exactly 3 odd numbers are:
- [1,1,2,1]
- [1,2,1,1]

## 💡 Approach: Sliding Window + AtMost Trick

We need to count the number of subarrays with **exactly** `k` odd numbers.

---

## 🔁 Step-by-Step Strategy

We use this identity:

- `Count of subarrays with exactly k odd numbers = atMost(k) - atMost(k - 1)`

This works because:

- `atMost(k)` counts all subarrays with **at most** `k` odd numbers.
- `atMost(k - 1)` counts all subarrays with **at most** `k - 1` odd numbers.
- So, their difference gives us the number of subarrays with **exactly** `k` odd numbers.

---
## ⚙️ How the `atMost(k)` Function Works

We use the **sliding window** technique to count the number of subarrays with at most `k` odd numbers.

### 🔢 Steps:

1. **Initialize variables**:
   - `left = 0`
   - `odd = 0` → to track the number of odd elements in the current window
   - `count = 0` → total number of valid subarrays

2. **Iterate** through the array using `right` pointer from `0` to `n - 1`:
   - If `nums[right]` is **odd**, increment `odd` by 1

3. **Shrink the window** from the left while `odd > k`:
   - If `nums[left]` is **odd**, decrement `odd` by 1
   - Move `left` forward (`left++`)

4. **Count the subarrays ending at index `right`**:
   - Add `(right - left + 1)` to `count`
   - This value represents the number of valid subarrays that end at index `right` and have at most `k` odd numbers

5. **Repeat** steps 2–4 for all elements in the array.

6. **Return `count`** at the end. It holds the total number of subarrays with at most `k` odd numbers.

---

### ✅ Why `(right - left + 1)`?

At each step, the subarrays that end at index `right` and start anywhere from `left` to `right` (inclusive) are all valid.  
So their count is exactly `(right - left + 1)`.

---


---

## 🧠 Dry Run Example

Let:
- `nums = [1, 1, 2, 1, 1]`
- `k = 3`

- `atMost(3) = 14`  
- `atMost(2) = 12`

**Final result:**  
- `exactly(3) = 14 - 12 = 2`

---

## 📘 Similar Pattern Used In

### **Binary Subarrays With Sum**

- Formula used:  
  `exactly(goal) = atMost(goal) - atMost(goal - 1)`

Only difference: we count **number of 1s** instead of **odd numbers**.

---

## 📚 Learning Summary

- The trick `atMost(k) - atMost(k - 1)` is **powerful** and reusable.
- Works great when:
  - You're counting something cumulative (odds, 1s, vowels, etc.)
  - You can **shrink** the window from the left
- Try using this whenever you're asked to find **exactly k** of something in a subarray.

---





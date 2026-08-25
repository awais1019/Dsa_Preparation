# 🧠 LeetCode 01 - Two Sum 

## 📄 Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to the target.

You may assume that each input would have **exactly one solution**, and you **may not use the same element twice**.

## 🔗 Problem Link

[Two Sum – LeetCode](https://leetcode.com/problems/two-sum/)

---

## 📥 Input

- `nums`: Array of integers (e.g. `[2, 7, 11, 15]`)
- `target`: Target sum (e.g. `9`)

## 📤 Output

- Indices of the two numbers that add up to the target (e.g. `[0, 1]`)

---

## 💡 Approaches

---

### 🚫 Approach 1: Brute Force (Nested Loops)

**Steps**:
1. Loop through every element in the array using index `i`.
2. For each `i`, loop through the rest of the array using index `j = i + 1`.
3. Check if `nums[i] + nums[j] == target`.
4. If yes, return the pair of indices `[i, j]`.

**Flaws**:
- Time complexity is **O(n²)**, which is inefficient for large arrays.
- It checks **every pair**, even if the result was already found.
- Not scalable or optimal in interviews or production.

---

### ⚡ Approach 2: One-pass HashMap (Efficient)


#### 🔍 Idea:

If you're trying to find two numbers that sum to the `target`, and you're currently at an element where `nums[i] = 8`, then the value you need is:

 `secondValue = target - nums[i] = 14 - 8 = 6`

 So while iterating:

- Ask: **"Have I seen the number 6 (secondValue) before?"**
- If **yes**:
  - You’ve found the pair.
  - Return the current index and the index where `secondValue` was found.
- If **no**:
  - Store the current number with its index in a HashMap for future lookup.

**Steps**:
1. Initialize a HashMap to store numbers and their indices.
2. For each element in the array:
   - Calculate the secondValue: `secondValue = target - nums[i]`
   - Check if this secondValue is already in the map.
   - If yes, return the current index and the index of the secondValue.
   - If not, store the current number with its index in the map.

**Why It Works**:
- Each number is processed only once.
- Map lookups are O(1), so the whole solution is O(n) time.
- Ensures early return without looping through all combinations.

---

## 🆚 Approach Comparison

| Feature               | Brute Force      | One-pass HashMap   |
|----------------------|------------------|--------------------|
| Time Complexity       | O(n²)            | ✅ O(n)             |
| Space Complexity      | O(1)             | ❗ O(n)             |
| Readability           | Easy             | Intermediate       |
| Interview-friendly    | ❌ No             | ✅ Yes              |
| Real-time performance | ❌ Bad            | ✅ Excellent        |

---

## 📘 Learning Points

- You can **reduce time complexity** from O(n²) to O(n) using a HashMap.
- Always think: **“What do I need to find?”** – here, `target - currentNumber`.
- **HashMap = memory trade-off** to gain speed (time vs. space).
- Always **check for the value before inserting** to avoid same-index issues.
- This is a common pattern in similar problems like **Two Sum II**, **3Sum**, **4Sum** etc.

---

## ✅ Summary

- Brute force is simple but slow.
- HashMap allows for fast, one-pass solutions.
- Understand **complement logic**: if `a + b = target`, then `b = target - a`.

 

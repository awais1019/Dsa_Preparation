# 🧩 LeetCode 268: Missing Number

## 📄 Problem Statement

You are given an array `nums` containing `n` distinct numbers in the range `[0, n]`.  
Return the only number in the range that is **missing** from the array.

---

## 🔗 Problem Link

[LeetCode 268 - Missing Number](https://leetcode.com/problems/missing-number/)

---

## 🔢 Input and Output

**Input:**  
`nums = [3, 0, 1]`  
**Output:**  
`2`

---

## 💡 Approaches

We explore **4 different methods** to solve this problem:

---

### 🔸 Approach 1: Frequency Array (Brute Force)

#### ✅ Idea:
- Use an extra array to mark the presence of each number.
- Find the index that was never marked — that’s the missing number.

#### 🧩 Steps:
1. Create a frequency array of size `n + 1`.
2. Mark `freq[nums[i]] = 1` for all values.
3. Loop through `freq[]` to find the index where the value is 0.

#### 📌 Learning:
- Beginner-friendly and easy to implement.
- Requires **extra space** of O(n).
- Time: O(n), Space: O(n)

---

### 🔸 Approach 2: Sum Formula (Gauss' Formula)

#### ✅ Idea:
- The sum of numbers from `0` to `n` is: `n * (n + 1) / 2`.
- Subtract the sum of the array to find the missing number.

#### 🧩 Steps:
1. Compute expected total: `n * (n + 1) / 2`.
2. Subtract the actual array sum from it.
3. The result is the missing number.

#### 📌 Learning:
- Simple and efficient.
- May **overflow** for large `n`.
- Time: O(n), Space: O(1)

---

### 🔸 Approach 3: Index - Value Difference Accumulation

#### ✅ Idea:
- Start with `res = n`.
- For each index `i`, add `(i - nums[i])` to the result.
- This balances values and indices; the result is the missing number.

#### 🧩 Steps:
1. Initialize `res = n`.
2. For each index `i`, do: `res += i - nums[i]`.
3. Return `res`.

#### 📌 Learning:
- Elegant and overflow-safe.
- Useful trick based on index-value symmetry.
- Time: O(n), Space: O(1)

---

### 🔸 Approach 4: XOR Trick (Optimized and Elegant)

#### ✅ Idea:
- Use XOR’s canceling property:
  - `x ^ x = 0`
  - `x ^ 0 = x`
- XOR all indices from `0` to `n`, and all elements of the array.
- Matching values cancel out, leaving the missing number.

#### 🧩 Steps:
1. Initialize `xorIndex = 0`, `xorNums = 0`.
2. Loop from `i = 0` to `n - 1`:
   - `xorIndex ^= i`
   - `xorNums ^= nums[i]`
3. After loop: `xorIndex ^= n`.
4. Final result: `xorIndex ^ xorNums`.

#### 🔍 Dry Run (Example: `[3, 0, 1]`)
- Range = `0, 1, 2, 3` → missing = `2`
- XOR of `0 ^ 1 ^ 2 ^ 3 = full range`
- XOR of `3 ^ 0 ^ 1 = nums[]`
- Final XOR gives `2` ✅

#### 📘 XOR Concept Recap:
- `x ^ x = 0` (cancels out)
- `x ^ 0 = x` (identity)


#### 📌 Learning:
- Most optimal solution.
- Constant space and safe from overflow.
- Time: O(n), Space: O(1)

---

## 📊 Comparison Table

| Approach         | Time | Space | Notes                          |
|------------------|------|-------|--------------------------------|
| Frequency Array  | O(n) | O(n)  | Brute force using extra space  |
| Sum Formula      | O(n) | O(1)  | Simple but risk of overflow    |
| Index Diff       | O(n) | O(1)  | Elegant index-value balance    |
| XOR Trick        | O(n) | O(1)  | Optimal, safe, clean logic     |

---

## 🎯 Key Learning Points

- XOR is powerful for cancellation-based logic.
- Sum method is simple but prone to overflow.
- Using `i - nums[i]` is a subtle index-value trick.
- Always compare expected vs. actual values properly.

---


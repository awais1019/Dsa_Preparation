# 🚀 LeetCode 560: Subarray Sum Equals K

## 📄 Problem Statement
Given an integer array `nums` and an integer `k`, return the **total number of continuous subarrays** whose sum equals to `k`.

## 🔗 Problem Link
[LeetCode 560 - Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

---

## 🧠 Input & Output

### 🔢 Input:
- An integer array `nums`
- An integer `k`

### 📤 Output:
- An integer representing the number of continuous subarrays that sum to `k`

### 🧪 Example:

```
Input: nums = [1, 2, 1, 2], k = 3
Output: 3
```

---

## 🪜 Approach 1: Brute Force (O(n²))

### 📝 Steps:

1. Use two nested loops to try all subarrays `nums[i..j]`
2. For each subarray, calculate the sum.
3. If the sum equals `k`, increment the counter.

### 🔻 Code Sketch:

```java
for (int i = 0; i < nums.length; i++) {
    int sum = 0;
    for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) count++;
    }
}
```

---

## ⚡ Approach 2: Optimized using Prefix Sum + HashMap (O(n))

### 💡 Idea:

- Let `prefixSum[i]` be the sum of elements from `0 to i`.
- If `prefixSum[j] - prefixSum[i] = k`, then the subarray `i+1 to j` sums to `k`.
- We use a HashMap to store how many times a prefix sum has occurred.

### ✅ Why `map.put(0, 1)`?
To handle the case where a subarray starting from index `0` directly equals `k`.

---

## 📚 Concept: Prefix Sum in Easy Terms

A **prefix sum** is a running total of the array. At any index `j`, the prefix sum is:
```
prefixSum[j] = nums[0] + nums[1] + ... + nums[j]
```

If we want to find the **sum from index i to j**, we do:
```
prefixSum[j] - prefixSum[i - 1]
```

To find a subarray that sums to `k` ending at index `j`, we check if:
```
prefixSum[j] - k == some previous prefix sum
```

---

## 🧪 Dry Run with Example

Let `nums = [1, 2, 1, 2]`, `k = 3`

| i | num | prefixSum | prefixSum - k | map                    | count |
|---|-----|-----------|----------------|-------------------------|--------|
| 0 | 1   | 1         | -2             | {0=1, 1=1}              | 0      |
| 1 | 2   | 3         | 0              | {0=1, 1=1, 3=1}         | 1      |
| 2 | 1   | 4         | 1              | {0=1, 1=1, 3=1, 4=1}    | 2      |
| 3 | 2   | 6         | 3              | {0=1, 1=1, 3=1, 4=1, 6=1}| 3      |

✅ So total subarrays that sum to 3 = `3`

---

## 🔍 Explaining the Core Concept:

If `prefixSum = 7` and `k = 3`, then we look for:
```
prefixSum - k = 7 - 3 = 4
```
If `map[4] = 2`, that means two prefix sums with value 4 occurred earlier, so:
- There are 2 subarrays that sum to `k = 3` ending at this point.

---

## 📌 Key Comparison

| Feature             | Brute Force         | Prefix Sum + HashMap |
|---------------------|----------------------|------------------------|
| Time Complexity      | O(n²)               | O(n)                   |
| Space Complexity     | O(1)                | O(n)                   |
| Intuition            | Try all subarrays   | Use math to skip work  |
| Handles Negatives?   | ✅ Yes              | ✅ Yes                 |

---

## 🎓 Learning Points

- Prefix sums help us avoid nested loops.
- HashMap lets us check previous sums in O(1) time.
- `map.put(0, 1)` is critical to handle subarrays from start.

---

## ✅ Summary

- Use brute force to understand the basic idea.
- Use prefix sum + HashMap for optimal performance.
- Count how many times each prefix sum occurred.
- Look for `prefixSum - k` to find valid subarrays.

---

## 🧠 Final Thoughts

This pattern appears in many problems involving ranges, subarrays, and sums. Learn it deeply, and practice variations like:

- Longest subarray with sum `k`
- Subarray with product `k`
- Count of subarrays divisible by `k`
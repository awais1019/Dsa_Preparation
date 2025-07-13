# 🗳️ LeetCode 169: Majority Element

## 🔗 Problem Link  
[LeetCode 169: Majority Element](https://leetcode.com/problems/majority-element/)

---

## 📘 Problem Statement

> Given an array `nums` of size `n`, return the **majority element**.  
>  
> The majority element is the element that appears **more than ⌊n/2⌋ times**.  
>  
> You may assume that the majority element **always exists** in the array.

---

## 🔢 Input and Output

**Input:**  
```
nums = [2, 2, 1, 1, 1, 2, 2]
```

**Output:**  
```
2
```

---

## 🚀 Approaches

### ✅ First Approach: Using HashMap (Frequency Count)

#### 🔹 Steps:
1. Create a HashMap to store frequency of each element.
2. Iterate over the array:
   - If element exists in map, increment its count.
   - Else, add it to the map with count = 1.
3. Iterate through the map:
   - Return the element with frequency > `n / 2`.

#### ⏱️ Time: O(n)  
#### 🧠 Space: O(n)

---

### ✅ Second Approach: **Moore’s Voting Algorithm** (Optimal & Elegant)

> Use this when the **majority element is guaranteed to exist**.

---

## 💡 Real-Life Analogy – "Election Voting"

Imagine you're watching a crowd of people cheering for different candidates. You don't know who will win, but you're tasked with guessing the winner.

So you follow a smart strategy:

1. 🕵️ You observe one person and assume **they're the winner**.
2. 👥 Every time someone else supports that person, you increase your confidence.
3. 🙅 But if someone supports a **different person**, your confidence decreases.
4. 😕 If confidence becomes zero, you assume that person won't win and pick a **new candidate**.
5. 🧠 At the end, if someone truly had **more than half** the votes, they'll be the last one standing.

---

## 🧠 Algorithm Idea

- We don't count all frequencies.
- We just keep track of one **potential winner** and try to **cancel out all others**.
- The **real majority element will always survive** because its frequency is greater than the rest **combined**.

---

## 🪜 Step-by-Step Intuition

| Step | Action |
|------|--------|
| Start | `vote = 0`, no candidate chosen |
| See a number | If vote = 0 → make it the `candidate`, vote = 1 |
| Same as candidate | vote++ |
| Different from candidate | vote-- |
| vote becomes 0 | Drop the current candidate, pick new one in next step |
| After the loop | Final `candidate` is your answer |

> Think of it as a **majority fighter**: Every other number gets a chance to fight the candidate, but the true winner wins all fights because it's the majority.

---

## ✏️ Dry Run Example

Input: `[2, 2, 1, 1, 1, 2, 2]`

We want the element that appears more than `7 / 2 = 3` times.

| i | num | candidate | vote | Explanation                          |
|---|-----|-----------|------|--------------------------------------|
| 0 | 2   | 2         | 1    | vote was 0 → set candidate to 2      |
| 1 | 2   | 2         | 2    | same → vote++                        |
| 2 | 1   | 2         | 1    | different → vote--                   |
| 3 | 1   | 2         | 0    | different → vote--, now vote = 0     |
| 4 | 1   | 1         | 1    | vote was 0 → pick new candidate (1)  |
| 5 | 2   | 1         | 0    | different → vote--, now vote = 0     |
| 6 | 2   | 2         | 1    | vote was 0 → new candidate (2)       |

🎯 Final `candidate = 2`  
Count of 2 = 4 → ✅ Appears more than 3 times → Return 2

---

## 🧮 Time and Space Complexity

| Metric           | Value    |
|------------------|----------|
| Time Complexity  | O(n)     |
| Space Complexity | O(1)     |

---

## ⚠️ What If the Majority Element Is NOT Guaranteed?

In some variations of this problem (for example, interviews or follow-up questions), the input array may **not** contain a majority element.

### ❓ What Could Go Wrong?

Moore’s Voting Algorithm **assumes** that the majority exists. If it doesn’t, the algorithm may return a **wrong candidate**.

### ✅ How to Fix This?

We add a **final verification step** after finding the candidate:

1. Loop through the array again.
2. Count how many times the candidate appears.
3. If it appears more than `n / 2` times → return it.
4. Otherwise → return `-1` or handle accordingly.

---

## 🔍 Why Moore's Voting Works Mathematically

Assume:

- `x` is the majority element.
- It appears **more than ⌊n / 2⌋ times**.
- All other elements together appear **less than ⌊n / 2⌋ times**.

When we cancel one vote of `x` with one vote of a different number, we can only cancel less than half of `x`’s votes. So, **some `x` values will always remain** at the end — making `x` the final candidate.

This works because **no minority group can outvote the majority** when counting pairwise.

---

## 🧾 Comparison of Approaches

| Feature                        | HashMap Frequency Method       | Moore's Voting Algorithm       |
|-------------------------------|--------------------------------|--------------------------------|
| Time Complexity                | O(n)                           | O(n)                           |
| Space Complexity               | O(n) (uses HashMap)            | O(1) (uses only 2 variables)   |
| Majority Guarantee Needed?     | ❌ No                          | ✅ Yes                         |      |
| Best Use Case                  | When majority not guaranteed   | When majority is guaranteed    |
| Implementation Complexity      | Simple                         | Slightly clever/intuitive      |

---

## 🧠 Learning Points

- Moore’s Voting Algorithm is an elegant way to find a majority in linear time and constant space.
- It's based on the idea of **vote cancellation** — powerful and intuitive for problems involving frequencies.
- Always verify the problem constraints:
  - If **majority is guaranteed** → use directly.
  - If **not guaranteed** → add a final verification pass.
- This algorithm can be **extended** to more advanced versions like finding elements that appear more than `n/3`, `n/k`, etc.

---

## ✅ Final Summary

- 🗳️ Moore’s Voting is like running an election — your candidate must survive all opposition.
- ✅ If the problem guarantees a majority, return the candidate directly.
- ⚠️ If not, make sure to **verify** the result by checking its frequency.
- 📦 Compared to HashMap-based counting, it is **much more space-efficient**.
- 💡 It's one of the most elegant and interview-favorite algorithms due to its logic and optimization.

---


# 42. Trapping Rain Water

**Link**: [https://leetcode.com/problems/trapping-rain-water/](https://leetcode.com/problems/trapping-rain-water/)

---

## 🔒 Problem Statement

You are given an array `height[]` where each element represents the height of a building or wall. After it rains, some water will be trapped between these buildings. Your task is to find **how much total water** will be trapped.

---

## 📥 Input

- An array of integers `height` with `n` elements  
- Each `height[i]` means the height of the building at position `i`  
- `1 ≤ n ≤ 2×10⁴`, `0 ≤ height[i] ≤ 10⁵`

---

## 📤 Output

- Return a single integer — the total units of rainwater trapped between the buildings.

---

## 💡 Example

```
Input:  height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

---

## 🔍 What Should Come to Mind?

Before writing any code, think logically:

### 🧠 How do we know if a building can trap water?

- To trap water **at a building**, it must have **taller buildings on both sides**.
- If both left and right are higher, water stays in the middle.
- But **how much water**?  
  You can only trap water **above your height** and **below the shorter side**:
  
  ```text
  Water = min(max height to left, max height to right) - current height
  ```

- Why **min**?  
  Because water will always overflow from the **shorter wall**, not the taller one.

---

## ✅ Approaches

---

### 🔶 Approach 1: Prefix and Suffix Max Arrays

#### 💭 Idea:
- For each building, check:
  - What is the highest wall to its left?
  - What is the highest wall to its right?
- Use this info to calculate trapped water.

#### 🔧 Steps:

1. Create `leftMax[i]`: max height from 0 to i
2. Create `rightMax[i]`: max height from n-1 to i
3. At each index, calculate:
   - `water[i] = min(leftMax[i], rightMax[i]) - height[i]` (if > 0)
4. Sum all `water[i]`

#### 📈 Time: O(n)  
#### 📦 Space: O(n)

---

### 🔷 Approach 2: Save Space (Left Max in real-time, Right Max using array)

#### 💭 Idea:
- Use a single array for `rightMax[]`
- Keep `leftMax` updated while scanning

#### 🔧 Steps:

1. Build `postMax[]` from right to left
2. Track `leftMax` while looping
3. Water at each index = `min(leftMax, postMax[i]) - height[i]` (if > 0)

#### 📈 Time: O(n)  
#### 📦 Space: O(n)

---

### 🟢 Approach 3: Two Pointer (Best One)

#### 💭 Idea:
- Use two pointers: `left` and `right`
- Always move the smaller height inward
- Track max seen from both sides

#### 🔧 Steps:

1. Set `left = 0`, `right = n - 1`
2. Track `leftMax`, `rightMax`
3. While `left < right`:
   - Move smaller side inward
   - Add trapped water if `current < max`

#### 📈 Time: O(n)  
#### 📦 Space: O(1)

---

## 🔁 Comparison

| Approach | Time | Space | Pros | Cons |
|----------|------|-------|------|------|
| Prefix + Suffix | O(n) | O(n) | Easy logic | High space |
| LeftMax real-time + PostMax | O(n) | O(n) | Slightly better | Still needs one array |
| Two Pointer | O(n) | O(1) | Best performance | Needs good understanding |

---

## 🎓 What We Learned

- Trapped water needs taller walls on both sides.
- Use `min(left max, right max) - height[i]`.
- Know how to choose between memory or speed.
- Two-pointer technique is very powerful.

---

## 📌 Summary

- This is a classic question with 3 solid ways to solve it.
- Understand the concept **first**, code **second**.
- Space-time tradeoff is a key skill.


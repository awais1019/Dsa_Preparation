# LeetCode-1004  Max Consecutive Ones III

## 🧩 Problem Statement

Given a binary array consisting of 0s and 1s, and an integer `k`, the task is to determine the length of the longest contiguous subarray containing only 1s after flipping at most `k` zeros to 1s.

---

## 📌 Example

- **Input**: `[1,1,1,0,0,0,1,1,1,1,0]`, `k = 2`
- **Output**: `6`
- **Explanation**: Flip the two 0s at indices 4 and 5. The longest subarray with only 1s becomes of length 6.

---

## 🚀 Approach

This problem is efficiently solved using the **sliding window** technique. The main idea is to dynamically maintain a window that contains at most `k` zeros and to maximize the window size as much as possible.

---

## 🧠 Algorithm Breakdown

1. **Window Expansion**:
   - Traverse the array from left to right.
   - Expand the right boundary of the window by including the current element.
   - If the element is `0`, increase the count of zeros within the window.

2. **Window Contraction**:
   - If the zero count exceeds `k`, increment the left pointer of the window until the window becomes valid again (i.e., it contains at most `k` zeros).
   - When shrinking, if a zero is removed from the window, decrement the zero counter.

3. **Tracking the Result**:
   - After adjusting the window, calculate the current window length and update the maximum length accordingly.

---

## ⏱️ Time & Space Complexity

- **Time Complexity**: `O(n)` — Every element is visited at most twice (once by the right pointer and once by the left).
- **Space Complexity**: `O(1)` — Constant extra space is used.

---



## 🧠 Key Concepts

- This problem highlights how to **maintain constraints inside a sliding window**.
- Efficient for large arrays due to **constant space** and **linear time**.
- Can be adapted to problems involving a bounded number of violations (like flipping limited elements).

---


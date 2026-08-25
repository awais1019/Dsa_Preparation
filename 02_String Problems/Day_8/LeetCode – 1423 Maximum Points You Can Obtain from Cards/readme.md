# 🃏 LeetCode – 1423: Maximum Points You Can Obtain from Cards

## 🧠 Problem Statement

You are given an integer array `cardPoints` and an integer `k`.

You can pick `k` cards from either the beginning or the end of the array. Your task is to return the **maximum score** you can get by picking exactly `k` cards.

---

## 🔢 Input / Output

### Input:
- `cardPoints = [1, 2, 3, 4, 5, 6, 1]`
- `k = 3`

### Output:
- `12`

### Explanation:
Pick the last three cards: `6 + 1 + 5 = 12` (maximum possible).

---

## 📚 Topics Covered

- Sliding Window
- Two Pointers
- Array Manipulation

---

## 🚀 Approach: Two-Pointer Sliding Window

Instead of picking cards **only from one side**, we try **all combinations** of taking:
- `k` from the start
- `k-1` from start and 1 from end
- `k-2` from start and 2 from end
- ...
- `0` from start and `k` from end

### Steps:

1. Start by calculating the total sum of the first `k` cards from the left.
2. Initialize `maxSum = leftSum`.
3. Use a loop to gradually reduce cards from the left and add from the right.
4. Update the `maxSum` at each step.
5. The loop runs `k` times, giving all possible front-back combinations.

---

## 🧮 Time & Space Complexity

| Metric | Complexity |
|--------|------------|
| ⏱ Time | O(k) |
| 🧠 Space | O(1) |

Efficient even for large arrays because it avoids recomputing full sums.

---

## 📝 Summary

- Elegant use of **two pointers** to simulate picking from both ends.
- Handles edge cases like `k = 0` or `k = cardPoints.length`.
- Avoids the need to scan the entire array, focusing only on `k` elements.

---




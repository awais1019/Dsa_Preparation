# 🔁 LeetCode – Rotate String

## 🧠 Problem Statement

Given two strings `s` and `goal`, return `true` **if and only if** `s` can become `goal` after some number of shifts (rotations).

A **rotation** means moving the first character of `s` to the end. This operation can be done any number of times (including 0).

---

## 🔢 Input / Output

### 🔹 Input
- Two non-empty strings: `s` and `goal`
- Constraints:  
  `1 <= s.length, goal.length <= 100`

### 🔹 Output
- A boolean value: `true` if `goal` is a rotation of `s`, otherwise `false`

---

## 🧪 Examples

### ✅ Example 1
**Input:**  
`s = "abcde"`, `goal = "cdeab"`  
**Output:**  
`true`

**Explanation:**  
Rotate `s` twice to get `"cdeab"`.

---

### ❌ Example 2
**Input:**  
`s = "abcde"`, `goal = "abced"`  
**Output:**  
`false`

**Explanation:**  
No rotation of `s` results in `goal`.

---

## 🧩 Approach

1. Check if lengths of `s` and `goal` are equal. If not, return `false`.
2. Concatenate the string: `s + s`
3. All valid rotations of `s` will appear as substrings within `s + s`
4. Check if `goal` is a substring of the concatenated string

This avoids manually rotating the string and reduces the time complexity significantly.

---



## 🧠 Learning Notes

- Avoid simulating all rotations; instead, look for patterns.
- All rotations of a string are contained in its own double concatenation (`s + s`).
- This trick is common in problems involving string shifts, cyclic checks, or rotations.
- Always check length equality early to short-circuit invalid cases.

---

## ✅ Summary

This problem can be solved with a simple and efficient trick using `s + s`. It’s a perfect example of recognizing patterns to avoid brute-force. Focus on using built-in string operations and checking containment instead of simulating all rotations.

---

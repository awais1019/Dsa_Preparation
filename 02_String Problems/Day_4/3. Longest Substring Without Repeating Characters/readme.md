# 📘 LeetCode 3 – Longest Substring Without Repeating Characters

## 🧠 Problem Statement  
Given a string `s`, find the length of the longest substring without repeating characters.

---

## 🔍 Problem Example

Input: `"pwwkew"`  
Output: `3`  
Explanation: The answer is `"wke"`, with the length of 3.

---

## 📚 Concepts Covered

- Sliding window technique using two pointers
- `StringBuilder`: used to maintain current substring window
- `HashMap<String, Integer>`: used to store substring and its length
- `Collections.max()`: to get the maximum length from the map
- `charAt(index)`: to access characters
- `deleteCharAt(index)`: to remove the first character from the window
- `HashSet<Character>`: in the optimized solution for O(1) duplicate checks

---

## 🧠 Pseudocode – My Solution (StringBuilder + HashMap approach)

1. Create a `StringBuilder` and start with the first character.
2. Loop through the string from index 1 to end:
   - Append the current character to the builder.
   - Check if the current built string contains all unique characters.
     - If yes → put it into a map with its length.
     - If not → remove the first character from builder.
3. After loop, return the maximum value from the map.

🛠️ Helper method:
- I used a method to check if a string is valid by counting character frequency using a `HashMap<Character, Integer>`.
- Then used `Collections.max()` to make sure all frequencies are ≤ 1.

⏱️ Time Complexity: O(n²) (because each substring is rebuilt and re-checked)

---

## 🧠 Pseudocode – Optimized Sliding Window (HashSet)

1. Create a `HashSet<Character>` to keep unique characters.
2. Use two pointers: `left` and `right`.
3. Loop through the string:
   - If current char at `right` is not in set → add it and update max length.
   - If it's a duplicate → remove chars from left pointer until valid again.
4. Return the max window length.

🔧 Tools used:
- `HashSet.add()`, `HashSet.remove()`, `HashSet.contains()` → all O(1)
- Two pointers (`left` and `right`) for maintaining window

⏱️ Time Complexity: O(n) — each character is added and removed at most once.

---

## ✨ Notes Summary

- My approach helped me understand how substrings work and how to check uniqueness manually.
- Learned how `StringBuilder` and `HashMap` can be used together for basic window problems.
- The optimized approach uses a classic sliding window with `HashSet` which improves speed drastically.
- Always prefer two-pointer methods when dealing with subarray or substring questions with constraints like "no repeats".

---

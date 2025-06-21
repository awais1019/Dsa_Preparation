# 📘 LeetCode – Isomorphic Strings

---

## 🧠 Problem Statement

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`.  
All occurrences of a character must be replaced with another character while preserving the order.  
No two characters may map to the same character, but a character may map to itself.

---

## 🔢 Example

**Example 1:**  
Input: `s = "egg"`, `t = "add"`  
Output: `true`

**Example 2:**  
Input: `s = "foo"`, `t = "bar"`  
Output: `false`

**Example 3:**  
Input: `s = "paper"`, `t = "title"`  
Output: `true`

---

## 🧵 Topics Covered

- HashMap
- One-to-one Character Mapping
- String Traversal
- Pattern Matching

---

## 🧮 Pseudocode (Your Solution in English)

1. Create two HashMaps:
   - `map1`: maps characters from `s` → `t`
   - `map2`: maps characters from `t` → `s`

2. Loop through each character position `i`:
   - Let `c1` = `s[i]`, `c2` = `t[i]`
   - If `c1` is already mapped in `map1`:
     - If it doesn't map to `c2`, return false
   - Else, store the mapping `c1 → c2`
   - Repeat the same logic for `map2` with reverse mapping `c2 → c1`

3. If all characters match correctly in both maps, return true.

---

## 🧰 Pattern Used

### 🔁 **Bidirectional Character Mapping**
- One-to-one and onto mapping (bijection) must be maintained.
- If character mapping fails in either direction, the strings are not isomorphic.

---

## 📝 Summary

- This problem is solved using **two HashMaps** to ensure one-to-one and reverse mapping.
- It checks that each character from `s` maps uniquely to a character in `t` **and vice versa**.
- solution is clean, correct, and optimal for interviews.
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1) (since only 256 characters at most)



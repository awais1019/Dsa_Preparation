# 📘 LeetCode – First Unique Character in a String

## 🧠 Problem Statement  
Given a string `s`, return the index of the first non-repeating character. If none exists, return `-1`.

---

## 🔢 Input / Output  

**Input Example:**  
`s = "leetcode"`  
**Output:** `0`  
(First unique character is `'l'` at index 0)


---

## 🧵 Topics Covered  
- Array  
- HashMap  
- Character Frequency  
- String Traversal

---

## ✅ Approach 1 – Using Array (Optimized)  
**Things Used:**  
- `int[] freq = new int[26]` → Frequency count of 'a' to 'z'  
- `freq[c - 'a']++` → Convert char to index  
- Two passes:  
  - First to count frequency  
  - Second to find first char with count `1`

**Time:** O(n)  
**Space:** O(1)

---

## ✅ Approach 2 – Using HashMap (Your Solution)  
**Things Used:**  
- `HashMap<Character, Integer>` → To store frequency  
- `hash.put(c, hash.getOrDefault(c, 0) + 1)` → Count frequency  
- Two passes over the string

**Functions Used:**  
- `containsKey()`  
- `getOrDefault()`  
- `get()`

**Time:** O(n)  
**Space:** O(n)

---

## 📌 Summary  
- Array is faster for fixed lowercase characters.  
- HashMap is flexible and readable.  
- Both follow similar logic: frequency count + index search.

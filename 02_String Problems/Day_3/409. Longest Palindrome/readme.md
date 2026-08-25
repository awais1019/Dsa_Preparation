# 📘 LeetCode – Longest Palindrome

## 🧠 Problem Statement  
Given a string `s` which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Characters are case sensitive, so `'A'` and `'a'` are considered different.

---

## 🔢 Input / Output  

**Input Example:**  
`s = "abccccdd"`  
**Output:** `7`  
(The longest palindrome is `"dccaccd"` or similar)

---

## 🧵 Topics Covered  
- HashMap  
- Character Frequency  
- Greedy Counting  
- String Traversal

---

## ✅ Approach – Using HashMap 
**Things Used:**  
- `HashMap<Character, Integer>` → To count frequency of each character  
- `getOrDefault(c, 0) + 1` → Count each character  
- Greedy addition of even counts + one odd (center of palindrome)

**Functions Used:**  
- `toCharArray()`  
- `map.put()`  
- `map.getOrDefault()`  
- `map.values()`

**Logic:**  
- Add all even frequencies to the total length.  
- For characters with odd count, add `count - 1` (make them even).  
- If any odd frequency was found, add `1` to the result for the center of the palindrome.

**Time:** O(n)  
**Space:** O(n)

---

## 📌 Summary  
- HashMap is ideal for counting all character frequencies (case sensitive).  
- Greedy logic helps maximize the palindrome by using all even counts and just one odd in the middle.  
- Clean, intuitive solution that balances readability and efficiency.

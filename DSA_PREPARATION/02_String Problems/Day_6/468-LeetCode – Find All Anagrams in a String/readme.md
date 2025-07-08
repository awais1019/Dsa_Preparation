# 📘 LeetCode – Find All Anagrams in a String

## 🧠 Problem Statement  
Given two strings `s` and `p`, return a list of all starting indices in `s` where the substring is an anagram of `p`. The order of output does not matter.

---

## 🔢 Input / Output  

**Input:**  
`s = "cbaebabacd"`, `p = "abc"`  

**Output:**  
`[0, 6]`  

**Explanation:**  
- At index 0, the substring `"cba"` is an anagram of `"abc"`.  
- At index 6, the substring `"bac"` is also an anagram of `"abc"`.

---

## 🧩 Topics Covered  
- Sliding Window Technique  
- Frequency Count using Arrays  
- Hashing  
- String Traversal  
- Two Pointers  
- Anagram Detection  

---

## 🔧 Functions / APIs Used  
- Character frequency arrays (`int[]`)  
- `Arrays.equals()` for comparing character distributions  
- Two-pointer sliding window  
- `toCharArray()` and `charAt()` for string traversal  
- Map-based counting in the initial solution  

---

## 🧪 My Initial (Unoptimized) Approach  

This was my own solution submitted on LeetCode. It passed small test cases but failed on larger ones due to inefficiency.  

### ❌ Approach Description:
- For each window of length `p.length()`, a substring was extracted.
- A frequency `HashMap` was built to count characters.
- Then, another loop checked if all characters of `p` were present in that map.
- If valid, the current index was added to the result.

### 🔻 Problems:
- High time complexity due to repeated substring extraction and map construction.  
- Caused **Time Limit Exceeded** on larger inputs.  
- Repetitive logic and excessive object creation.

---

## ✅ Final Optimized Solution (Guided + Accepted)  

This solution was written based on optimization guidance and passed all test cases efficiently.

### ✅ Approach Description:
- Use two fixed-size arrays of size 26 to track the frequency of characters in `p` and the current window in `s`.  
- Initialize the first window and compare it with `p`'s frequency.
- Slide the window one character at a time:
  - Add the incoming character to the window count.
  - Remove the outgoing character.
- Compare the frequency arrays using `Arrays.equals()`.

---

## 🧮 Pseudocode

## 🧮 Pseudocode

- If `length of p > length of s` → return empty list
- Initialize two arrays of size 26: `sFreq` and `pFreq`
- Fill `pFreq` using characters from `p`
- Fill `sFreq` with first `p.length()` characters from `s`
- If `pFreq == sFreq` → add index `0` to result
- For each index from `p.length()` to `s.length()`:
  - Include new character at right end of window in `sFreq`
  - Exclude character at left end of window from `sFreq`
  - If `pFreq == sFreq` → add `(left + 1)` to result
- Return result

---

## 📚 Summary  

- The brute-force solution failed due to unnecessary repeated computation.
- Optimizing with sliding window and character frequency counting improved performance drastically.
- Important lesson: avoid recalculating when results can be incrementally updated.
- The sliding window pattern is powerful for substring problems involving pattern matching or frequency tracking.

---

## 🎯 Learning & Takeaways  

- Replace `HashMap` with fixed-size arrays for character counting when dealing with lowercase letters only.
- Use `Arrays.equals()` for fast frequency array comparison.
- String manipulation with `substring()` or `StringBuilder` inside loops can be costly.
- Optimize time complexity before submitting solutions on large input-size problems on platforms like LeetCode.

---

## ❓ FAQs and Concepts

### 🔄 What is Sliding Window Optimization?

Sliding window optimization is a technique used to reduce the time complexity in problems involving subarrays or substrings.  
Instead of recalculating data from scratch for every window, it incrementally updates the result by:
- Adding the new character entering the window.
- Removing the character leaving the window.
- This keeps operations within **O(1)** time for each shift, reducing the total time complexity to **O(n)**.

---

### 🔠 How to Handle Uppercase Letters Efficiently?

To handle both uppercase and lowercase letters:
- Use a frequency array of size **52** (26 lowercase + 26 uppercase).
- Map `a–z` to `0–25` and `A–Z` to `26–51`.
- Use ASCII checks like:
  - `if (char >= 'a') index = char - 'a'`
  - `else index = char - 'A' + 26`

Alternatively, use a `HashMap<Character, Integer>` if character ranges aren't limited.

---

### ⚠️ Common Pitfalls in Anagram Problems

- Forgetting to reset or slide the window properly.
- Comparing strings instead of character frequencies.
- Using expensive operations like `substring()` or rebuilding `HashMaps` every iteration.
- Ignoring character case sensitivity if the input is mixed-case.
- Not checking edge cases (e.g., when `p.length() > s.length()`).

---

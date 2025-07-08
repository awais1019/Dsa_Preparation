# 🔁 LeetCode-383 Ransom Note

## Problem Statement
Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise.

Each letter in `magazine` can only be used once in `ransomNote`.

---

## Input
- `ransomNote` (String): The note we need to construct.
- `magazine` (String): The string from which letters can be used.

## Output
- Boolean (`true` or `false`): Whether the ransom note can be constructed.

---

## Examples

### Example 1:
**Input**:  
`ransomNote = "a"`, `magazine = "b"`  
**Output**:  
`false`  
**Explanation**:  
The letter "a" is not present in "b".

---


### Example 2:
**Input**:  
`ransomNote = "aa"`, `magazine = "aab"`  
**Output**:  
`true`  
**Explanation**:  
Two "a"s are available in magazine.

---


## Approach

1. If the ransomNote is longer than magazine, return false immediately (optimization).
2. Create an integer array `freq` of size 26 to represent frequency of each lowercase character in magazine.
3. Loop through each character in magazine and increment the corresponding frequency.
4. Loop through each character in ransomNote:
    - Decrement the frequency.
    - If frequency goes below 0, return false as it means that letter is overused.
5. If the loop completes without returning false, return true.

---

## Takeaways
✅ Learn to map characters to array indices using `'c' - 'a'`  
✅ Prefer arrays over maps for fixed character sets (like lowercase alphabets)  
✅ Always optimize with early returns if possible  
✅ Know how to handle frequency-related string questions efficiently  

---

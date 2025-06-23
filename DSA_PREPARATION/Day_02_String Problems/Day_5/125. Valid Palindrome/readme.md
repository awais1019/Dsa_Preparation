# 📘 LeetCode 125 – Valid Palindrome

## 🧠 Problem Statement  
Given a string s, return true if it is a palindrome, or false otherwise.  
Only alphanumeric characters are considered, and letter casing should be ignored.

---

## 🔍 Problem Example

Input:  
"A man, a plan: a canal, Panama"  

Output:  
true  

Explanation:  
After removing non-alphanumeric characters and converting to lowercase, the string becomes:  
"amanaplanacanalpanama", which is a valid palindrome.

---

## 📚 Concepts Covered

- 🔤 String cleaning / filtering:
  - Regex-based: `s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()`
  - Manual ASCII checks: `(c >= 'a' && c <= 'z')`, `(c >= '0' && c <= '9')`, etc.
  - `Character.isLetterOrDigit(c)` — built-in method to check if char is alphanumeric
- 🔁 Reversal:
  - `StringBuilder.reverse()` to reverse a cleaned string
- 🔍 Character access:
  - `charAt(i)` to compare characters in a string
- ➕ Building strings:
  - `StringBuilder.append()` — efficient for constructing cleaned string
- ⚖️ Two-pointer technique:
  - Comparing characters from both ends moving inward (optimal palindrome checking)

---

## 🧠 Pseudocode – Solution 1 (Clean → Reverse → Compare)

1. Initialize an empty builder for cleaned characters.
2. Traverse each character in the original string:
   - If it's alphanumeric, convert to lowercase and append to builder.
3. Reverse the cleaned string.
4. Compare each character of cleaned string with its reversed version.
5. If all characters match → return true, else false.

---

## 🧠 Pseudocode – Solution 2 (Clean → Two-Pointer Compare)

1. Clean the string using ASCII or `isLetterOrDigit` and convert to lowercase.
2. Initialize two pointers: `left = 0`, `right = cleaned.length - 1`.
3. While `left < right`:
   - Compare characters at both ends.
   - If they don't match → return false.
   - Else move both pointers inward.
4. If loop completes → return true.

---

## ✨ Summary

- Strings must be cleaned before checking for palindromes (non-alphanumerics removed, lowercase).
- Two popular ways to clean:
  - ✅ Manual filtering using char range or `Character.isLetterOrDigit`
  - ✅ Regex-based: `s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()`
- Two solution strategies:
  - Reverse string and compare (simpler, uses extra space)
  - Two-pointer from both ends (optimal, O(1) space)


---

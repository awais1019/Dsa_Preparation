# 📘 LeetCode 557 – Reverse Words in a String III

## 🧠 Problem Statement
Given a string `s`, reverse the characters of each word individually, keeping the word order and spacing intact.

## 🔍 Problem Example

Input: "Mr Awais"
Output: "rM siawA"


## 📚 Concepts Covered

- `String.split(" ")`: Splits the sentence into an array of words using space as delimiter.
- `charAt(index)`: Used to access characters in a word.
- `StringBuilder.append()`: Efficiently builds strings in memory.
- `StringBuilder.reverse()`: Built-in method to reverse characters of a word.
- `String.join(" ", array)`: Joins words into a sentence with space.
- String immutability: Avoid `+=` in loops; prefer `StringBuilder`.

## 🧠 Pseudocode – Solution 1 (Manual Reversal with Helper)

Split the input string into an array of words using space.
For each word in the array:
a. Reverse the word manually using a loop from end to start.
Join the reversed words with a space separator.
Return the final sentence.



## 🧠 Pseudocode – Solution 2 (Optimized with StringBuilder.reverse())

Split the input string into an array of words.
For each word:
a. Use built-in reverse method to reverse the word.
b. Append it to a result builder with a space.
Remove the last trailing space from the result.
Return the final sentence.



## ✨ Notes Summary

- Strings in Java are immutable – always prefer `StringBuilder` when modifying strings in loops.
- `String.split(" ")` is useful for word-level problems.
- `String.join()` helps rebuild clean output strings.
- Built-in methods like `.reverse()` improve performance and reduce manual error.
- Always handle extra trailing spaces when appending words.

---

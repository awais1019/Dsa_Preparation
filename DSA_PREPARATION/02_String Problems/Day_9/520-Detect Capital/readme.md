# 🧠 LeetCode Problem 520: Detect Capital

## 📄 Problem Statement

We define the usage of capitals in a word to be correct when one of the following cases holds:

1. All letters in this word are capitals.  
2. All letters in this word are not capitals.  
3. Only the first letter in this word is capital and all others are not.

Given a string `word`, return `true` if the usage of capitals in it is right.

---

## 🧪 Input and Output

### ✅ Input:
- A single string `word` (1 ≤ `word.length` ≤ 100)
- Contains only uppercase and lowercase English letters

### ✅ Output:
- Return `true` if capital usage is correct, else `false`

---

## 🔍 Examples

| Input       | Output |
|-------------|--------|
| `"USA"`     | `true` |
| `"FlaG"`    | `false`|
| `"Google"`  | `true` |
| `"leetcode"`| `true` |
| `"g"`       | `true` |

---

## 🧠 Topics Covered

- Strings
- Character manipulation
- ASCII values
- Built-in string functions
- Conditional logic

---

## 🛠️ Java Functions Used

### ✅ Custom Version
- `charAt(index)`
- `checkLowerCase()`
- `checkUpperCase()`
- `checkFirstCapital()`
- Manual ASCII checks: `'A' <= ch <= 'Z'`, `'a' <= ch <= 'z'`

### ✅ Built-in Version
- `String.equals()`
- `toUpperCase()`
- `toLowerCase()`
- `substring()`
- `Character.isUpperCase()`

---


## 🧱 Steps

### 1️⃣ Custom Implementation

1. If the word has only 1 character, return `true` (any case is valid).
2. Check if the first character is uppercase:
   - If **yes**, check:
     - Are **all** characters uppercase? Return `true`.
     - OR are **all remaining** characters (from index 1 onward) lowercase? Return `true`.
   - If **no**, check:
     - Are **all** characters lowercase? Return `true`.
3. If none of the above match, return `false`.

---

### 2️⃣ Built-in Java Version

1. If the entire word is uppercase using `word.toUpperCase()`, return `true`.
2. If the entire word is lowercase using `word.toLowerCase()`, return `true`.
3. If only the **first character is uppercase** and the **rest is lowercase**:
   - Check using `Character.isUpperCase(word.charAt(0))`
   - Then check `word.substring(1).equals(lowercase)`
   - If true, return `true`.
4. Otherwise, return `false`.


---



## 📝 Summary

- ✅ **Both solutions** are functionally correct.
- 🛠️ The **custom version** uses ASCII comparisons and manual looping.
- 🧰 The **built-in version** leverages high-level Java methods for string and character operations.

---

## 📚 Takeaways & Learning

- Master capital usage rules by identifying 3 clear cases.
- Practice both manual ASCII checks and built-in Java methods.
- Use helper functions for cleaner, testable logic.
- Java methods like `toUpperCase()` and `isUpperCase()` are interview-friendly.

---


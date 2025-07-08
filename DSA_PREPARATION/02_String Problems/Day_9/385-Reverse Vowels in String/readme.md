# 🔁 345- Reverse Vowels of a String 

## 🧠 Problem Statement

Given a string `s`, reverse only the vowels of the string and return the resulting string.

Vowels include: `a, e, i, o, u` and their uppercase versions.

---

## 🧾 Input

- A string `s` where `1 <= s.length <= 3 × 10⁵`

---

## 📤 Output

- A new string where **only the vowels are reversed**, while all other characters remain in the same position.

---

## 🧪 Example Cases

### Case 1
**Input:** `hello`  
**Output:** `holle`

### Case 2
**Input:** `leetcode`  
**Output:** `leotcede`

---

## 🧰 Topics Covered

- Two-pointer technique  
- String manipulation  
- Mutable string structures  
- Character swapping  
- Helper methods for clarity

---

## 🔍 Approach

### ✅ Algorithm Steps

```md
1. Initialize two pointers:
   - left = 0
   - right = s.length() - 1

2. Create a mutable structure from the input string (e.g., StringBuilder).

3. While left < right:
   a. Check if character at left is a vowel → store result in leftSide
   b. Check if character at right is a vowel → store result in rightSide

   c. If both are vowels:
      - Swap characters at left and right
      - Move both pointers inward

   d. If only one side is a vowel:
      - Move the other pointer

   e. If neither is a vowel:
      - Move both pointers

4. Return the modified structure as a string.
```

### 🎯 Takeaways

```md
- ✅ The **two-pointer pattern** is essential for problems requiring pairwise operations on strings or arrays from both ends.
- ✅ Java strings are **immutable**, so always use a mutable structure like `StringBuilder` or `char[]` when modifying characters.
- ✅ Encapsulating logic like vowel-checking in a **helper method** improves reusability and readability.
- ✅ Using `indexOf()` on a small string is fast and sufficient for vowel lookups, but `Set<Character>` is better for large character classes.
- ✅ Boolean flags (`leftSide`, `rightSide`) can make logic easier to follow, but can be removed for a cleaner, more concise version once the logic is stable.
```

# 🤝 859 - Buddy Strings

## 📘 Problem Description

Given two strings `s` and `goal`, return `true` if you can swap exactly two characters in `s` so that the result equals `goal`. Otherwise, return `false`.


---

## 📥 Input

- `s`: a string of lowercase English letters (length: 1 to 20,000)
- `goal`: another string of lowercase English letters

---

## 📤 Output

- A boolean value:
  - `true` → if one swap of two characters in `s` makes it equal to `goal`
  - `false` → otherwise

---

## 🧪 Examples

### Example 1:
- `Input:`  
   `s = "ab"`
   `goal = "ba"`

- `Output:`  
  `true`

### Example 2:
- `Input:`  
   `s = "ab"`  
   `goal = "ab"`

- `Output:`  
   `false`

   ### Example 3:
- `Input:`  
   `s = "aa"`  
   `goal = "aa"`

- `Output:`  
   `true`

---


## 🛠️ Functions/Concepts Used

- `String.equals()`
- `charAt(index)`
- Character arrays and counting
- ArrayList to store mismatch indices
- Basic control structures: `if`, `for`, `return`
- Custom helper methods for clean logic separation

---

## 🪜 Steps / Pseudocode

1. **Check length mismatch**: If the lengths of `s` and `goal` are different, return false immediately.
2. **Check for equality**:
   - If `s.equals(goal)`:
     - Only return true if there’s at least one duplicate character in `s` (swap possible between duplicates).
3. **Find mismatched positions**:
   - Traverse both strings together.
   - Record indices where characters mismatch.
4. **Validate swap possibility**:
   - If there are **exactly 2 mismatches**, check if swapping the characters at those positions makes the strings equal.
   - If not, return false.

---

## 🎓 Summary / Learning

- This problem sharpens your skills in **edge case handling**, such as when strings are already equal.
- You practice separating logic into reusable methods like checking duplicate characters and identifying mismatches.

---

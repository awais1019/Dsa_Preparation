# 🔠 58 - Length of Last Word

## 📘 Problem Description

Given a string `s` consisting of words and spaces, return the length of the **last word** in the string.

A **word** is a maximal substring consisting of **non-space characters only**.

---

## 📥 Input

- `s`: A string consisting of uppercase and lowercase English letters and spaces `' '` (1 ≤ s.length ≤ 10⁴)

---

## 📤 Output

- An integer representing the length of the last word.

---

## 🧪 Example

### Example 1:
- `Input:`  
  `s = "Hello World"`

- `Output:`  
 ` 5`

### Example 2:
- `Input:`  
  `s = "   fly me   to   the moon  "`

- `Output:`  
  `4`

### Example 3:
- `Input:`  
 ` s = "luffy is still joyboy"`

- `Output:`  
  `6`

---


## 🛠️ Functions/Concepts Used

- `String.charAt(int)`  
- `Character.isLetter(char)`  
- `StringBuilder.append()`  
- Reverse traversal using `while` loop  
- Manual space handling instead of built-in methods like `trim()` or `split()`  

---

## 🪜 Steps / Pseudocode

1. **Initialize a pointer** at the end of the string (`end = s.length() - 1`).  
2. **Iterate in reverse**:
   - If character is a letter → append it to a `StringBuilder`.
   - If it's not a letter and `StringBuilder` already has characters → stop the loop.
3. **Return the length** of the collected characters in the `StringBuilder`.  
4. The result is the length of the **last word** (ignoring trailing spaces).  

---

## 🎓 Summary / Learning

- This approach avoids using extra space-heavy functions like `split()` and is optimal in terms of time and space.  
- Helps build understanding of **low-level string parsing**, especially useful in environments where use of standard library methods is restricted.  
- Demonstrates manual control over string traversal, especially from **end-to-start**, which is a common interview technique.  

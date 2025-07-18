# LeetCode 20 - Valid Parentheses

### 🧩 Problem Statement  
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is **valid**.

A string is considered **valid** if:
1. Every open bracket has a corresponding closing bracket of the same type.
2. Brackets are closed in the correct order.

---

### 📥 Input  
- A single string `s` consisting of parentheses characters.
- Example: `"()[]{}"`

---

### 📤 Output  
- A boolean value:  
  - `true` if the string is valid.  
  - `false` if not.

---

### 🔍 Examples

| Input       | Output |
|-------------|--------|
| `"()"`      | `true` |
| `"()[]{}"`  | `true` |
| `"(]"`      | `false`|
| `"([)]"`    | `false`|
| `"{[]}"`    | `true` |

---

### 🧠 Why Use a Stack?

We use a **stack** because of its **Last-In, First-Out (LIFO)** nature, which is perfect for matching open-close pairs.

- When we encounter an opening bracket, we **push** it onto the stack.
- When we see a closing bracket, we want to match it with the **most recent** (last) opening bracket — this is exactly what the **top of the stack** gives us.

This way, we can easily verify if the brackets are nested and ordered correctly.

---

### 🪜 Step-by-Step Approach (In Simple English)

1. **Create a stack** to store opening brackets.
2. **Loop through each character** of the string:
   - If the stack is not empty, and the current character **closes** the last bracket in the stack:
     - Remove that last bracket (pop from the stack).
     - Continue to the next character.
   - Otherwise, **push** the character to the stack.
3. After processing all characters:
   - If the stack is empty → ✅ All brackets matched correctly.
   - If the stack is not empty → ❌ Some brackets were not closed properly.

---

### 🧠 Learning Points

- **Stacks are ideal** for problems involving "nested" or "paired" structure validation.
- Matching pairs (`( )`, `{ }`, `[ ]`) must not only be of the same type but also **closed in the correct order**.
- The moment an incorrect closing bracket appears, we can detect the string is invalid **early**.
- Checking from the **top of the stack** helps us validate the most recent open bracket.

---

### ✅ Summary

- This problem is a **classic example** of stack usage in validating sequences.
- It teaches you how to:
  - Track order of elements (LIFO).
  - Use conditions to check for structured patterns.
- Mastering this logic helps with more complex problems like parsing expressions, validating HTML/XML, and implementing compilers.

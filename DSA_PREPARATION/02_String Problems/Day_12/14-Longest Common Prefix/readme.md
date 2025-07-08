# 🌟 14 - Longest Common Prefix — String Problem

### 🚀 Problem Statement

Given an array of strings `strs`, write a function to find the **longest common prefix string** among them.

If there is no common prefix, return an **empty string** `""`.

---

### 📥 Input

- `strs`: An array of strings containing only lowercase English letters.
- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`

---

### 📤 Output

- A string representing the longest common prefix among all strings in the input array.

---


### 📶 `Steps to Solve`

1. **Initialize** the prefix as the first string in the array.  
2. **Iterate** through each remaining string in the array.  
3. For each string:
   - Check if it starts with the current prefix.
   - If not, remove the last character from the prefix.
   - Repeat this until the current string starts with the prefix.
   - If the prefix becomes empty, return `""`.
4. After the loop, return the final prefix.

---

### 🔁 `Dry Run`

**Input**:
 `strs = ["flower", "flow", "flight"]`

**Execution**:

1. `Start with prefix` = `"flower"`

Compare with `"flow"`:  
`"flow".startsWith("flower")` ❌ → trim to `"flowe"`  
`"flow".startsWith("flowe")` ❌ → trim to `"flow"`  
`"flow".startsWith("flow")` ✅ → keep

Compare with `"flight"`:  
`"flight".startsWith("flow")` ❌ → trim to `"flo"`  
`"flight".startsWith("flo")` ❌ → trim to `"fl"`  
`"flight".startsWith("fl")` ✅ → final prefix is `"fl"`

**Output**: `fl`


---

### 📘 `Learning Points`

✅ Use of `startsWith()` for prefix matching  
✅ Greedy trimming strategy (remove from end when mismatch)  
✅ Efficient for prefix-based problems  
✅ Break early if prefix becomes empty  
❗ Problem reduces the prefix on each iteration, never increases  

---



# 🧠 LeetCode 819 - Most Common Word

## 📝 Problem Description

You are given a paragraph of text and a list of banned words. Your task is to determine the most frequent word that is **not included in the banned list**. The result should be in **lowercase**, and punctuation should be ignored when analyzing the paragraph.

---

## 📥 Input Format

- A single string `paragraph` representing a body of text. It may contain:
  - Uppercase and lowercase English letters
  - Punctuation marks like commas, periods, semicolons, etc.
- An array `banned[]` of strings containing banned words in lowercase.

---

## 📤 Output Format

- Return a single string — the most frequent word in the paragraph that is not banned.
- The word should be returned in lowercase.

---

## 🧪 Example

**Input:**
- `paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."`
- `banned = ["hit"]`

**Output:**
- `"ball"`


---

## 🛠️ Approach

The solution follows these core steps:

1. **Convert to Lowercase:** Normalize the entire paragraph to lowercase to ensure case-insensitive comparison.

2. **Split into Words:** Use regular expressions to separate the paragraph into words by splitting on any group of non-letter characters. This avoids issues with punctuation and whitespace.

3. **Store Banned Words:** Use a `Set` to store banned words. This allows for fast lookup when filtering words.

4. **Count Word Frequencies:** Traverse through the list of words and increment their counts using a frequency map, skipping any banned or empty strings.

5. **Find the Most Common Word:** Iterate through the frequency map to identify the word with the highest frequency that is not banned.

---

## 🧠 Concepts and Java Topics Used

- **String Manipulation:** Lowercasing and splitting strings for consistent processing.
- **Regular Expressions:** A robust way to isolate valid words and ignore punctuation.
- **HashMap (Dictionary):** To count occurrences of each word efficiently.
- **HashSet:** To quickly check whether a word is banned.
- **Greedy Search:** To find the word with the highest frequency in a single pass.

---


## 🎯 Key Takeaways

- Regular expressions make word extraction clean and accurate.
- Converting both paragraph words and banned words to lowercase ensures consistency.
- Using `HashSet` and `HashMap` together leads to an optimal solution.
- Proper handling of punctuation and empty strings is essential in text-based problems.

---


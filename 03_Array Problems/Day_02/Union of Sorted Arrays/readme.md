# 🔗 Problem: Union of Two Sorted Arrays

---

## 📜 Problem Statement

Given two **sorted arrays** of integers, return their **union** — a sorted list containing **all unique elements** from both arrays.

---

## 🔢 Input

Two sorted integer arrays:
```text
arr1 = [1, 2, 2, 4, 5, 6, 7, 10, 19]
arr2 = [2, 3, 4, 4, 6, 8]
```

---

## ✅ Output

```text
[1, 2, 3, 4, 5, 6, 7, 8, 10, 19]
```

---

## 💡 Approach

### 🧭 Main Approach: Two-Pointer Technique with Duplicate Handling

- Use two pointers `i` and `j` for `arr1` and `arr2`, respectively.
- Traverse both arrays together and compare elements:
  - If `arr1[i] <= arr2[j]`, check if the element is already in the result. If not, add it. Increment `i`.
  - Else, do the same for `arr2[j]` and increment `j`.
- Once one array is fully traversed, **add the remaining elements** from the other array (avoiding duplicates) using **two additional while-loops**.

### 🔁 Why Extra Loops?

- The initial `while` loop stops when **either** array ends.
- To ensure all **remaining elements** of the longer array are also considered, we use two **additional loops**:
  - One for remaining elements in `arr1`.
  - One for remaining elements in `arr2`.

### ✅ Duplicate Check

- Before adding any element to the list, we check:  
  `list.isEmpty() || list.get(list.size() - 1) != current_element`
- This guarantees that each element is added **only once**, preserving uniqueness.

---

## ⏱️ Time & Space Complexity

- **Time Complexity**: O(n + m)  
- **Space Complexity**: O(1) (excluding result list)

---

## 🧠 Learning Points:

- Handling **duplicates** efficiently in a sorted array.
- Merging two sorted arrays without creating an intermediate set.
- Using **two-pointer technique** effectively.
- Writing clean and condition-based logic for array operations.

---

## 🧺 Alternate Approach (Using Set)

You can solve this problem by:

- Adding all elements of both arrays to a `TreeSet` or `HashSet`.
- For a **sorted union**, use a `TreeSet` which keeps elements in order.

### 📦 Trade-Off

- **Simple** and quick to write.
- But uses **extra space** and may not work well for large inputs or when input arrays are already sorted.

---

## 🧾 Summary Table

| Criteria              | Two-Pointer Approach | Set-Based Approach         |
|----------------------|----------------------|----------------------------|
| Time Complexity       | O(n + m)             | O(n + m + k log k)         |
| Space Complexity      | O(1)                 | O(n + m)                   |
| Output Sorted         | ✅ Yes                | ✅ Yes (TreeSet only)      |
| Handles Duplicates    | ✅ Yes                | ✅ Yes                     |
| Recommended When      | Arrays are sorted    | Simpler logic needed       |

---

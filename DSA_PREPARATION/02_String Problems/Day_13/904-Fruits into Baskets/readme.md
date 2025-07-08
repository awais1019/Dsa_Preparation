## 🍇 Leetcode 904 - Fruit Into Baskets

---

### 📥 Input:
- An array of integers `fruits[]` where each integer represents a type of fruit growing on a tree in a row.
- You can only carry **2 types** of fruits in your baskets.

---

### 📤 Output:
- Return the **length of the longest subarray** that contains at most **two different types of fruits**.

---

### 💡 Examples:

- `Input: fruits = [1,2,1,2,3]`
- `Output: 4`
**Explanation:** We can pick from trees [1,2,1,2].

- `Input: fruits = [0,1,2,2]`
- `Output: 3`
**Explanation:** We can pick from trees [1,2,2].


---

### 🛠️ Functions / Concepts Used:
- `HashMap` to track fruits
- `Sliding Window` technique
- `Math.max()` to update max length
- `map.size()` to ensure only 2 fruit types are picked
- Looping and pointer shifting (`left`, `right`)

---

### 🚶 Approach One (Last Index Tracking):
Uses a **HashMap of fruit type → last seen index**.

#### Steps:
1. Initialize `left` and `right` pointers, and an empty map.
2. Loop through each fruit at `right` pointer.
3. Add/update the fruit with its latest index in the map.
4. If more than 2 types exist in the map:
   - Find the fruit with the **smallest last seen index**.
   - Remove that fruit from the map.
   - Move the `left` pointer just after that index.
5. Calculate the window size and update the maximum.
6. Return the max size found.

> ✅ This approach is concise but a little tricky because of `Collections.min()`.

---

### 🚶 Approach Two (Frequency Count):
Uses a **HashMap of fruit type → count in current window**.

#### Steps:
1. Initialize `left` and `right` pointers, and an empty map.
2. Loop through each fruit at `right` pointer.
3. Add or increment the fruit's count in the map.
4. If map size exceeds 2:
   - Decrease count of fruit at `left`.
   - If its count becomes 0, remove it from map.
   - Move `left` pointer to shrink the window.
5. Calculate the current window length.
6. Return the max window length found.

> ✅ This is the **standard sliding window** method and more efficient in practice.

---

### 📚 Learning:
- How to use **HashMap** to manage dynamic windows.
- The difference between **tracking last seen index** vs. **count frequency**.
- How to apply the **sliding window** pattern when you have a constraint on the number of unique items.

---

### 🧾 Summary:
| Feature                 | Approach One              | Approach Two                  |
|-------------------------|---------------------------|--------------------------------|
| Map Stores              | Fruit → Last Index        | Fruit → Frequency Count       |
| Remove Strategy         | Based on `min index`      | Based on `count == 0`         |
| Pointer Movement        | After `min index`         | Increment until size ≤ 2      |
| Performance             | Slightly more overhead    | More optimized & common       |
| Readability             | Moderate                  | Clear and beginner-friendly   |

---

### 🎯 Takeaways:
- Use **sliding window + HashMap** when handling problems with "at most K distinct elements".
- Track **frequency** if you want **cleaner logic** for shrinking the window.
- The **sliding window technique** is powerful for optimizing brute force problems.
- Always remember to update your **max length** after shrinking or expanding the window.

---

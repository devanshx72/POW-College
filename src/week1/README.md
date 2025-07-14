# Question 1 – Min in Sorted Rotated Array

---

## Approach & Logic

We use a **modified binary search** algorithm with the following observations:

i. If the middle element is greater than the rightmost element, the minimum lies in the **right half**.
ii. Otherwise, it lies in the **left half** (including `mid`).

We repeat this process until `low == high`, which gives the **index of the minimum element**.

This approach is more efficient than a linear scan (`O(n)`) and leverages the rotated sorted property.

---

## Time & Space Complexity

| Complexity | Value |
|------------|-------|
| Time     | `O(log n)` — due to binary search |
| Space    | `O(1)` — constant space used |

---

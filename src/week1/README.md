# Question 1 – Min in Sorted Rotated Array

---

## Approach & Logic

We use a **modified binary search** algorithm with the following observations:

- If the middle element is greater than the rightmost element, the minimum lies in the **right half**.
- Otherwise, it lies in the **left half** (including `mid`).

We repeat this process until `low == high`, which gives the **index of the minimum element**.

This approach is more efficient than a linear scan (`O(n)`) and leverages the rotated sorted property.

---

## Time & Space Complexity

| Complexity | Value |
|------------|-------|
| Time     | `O(log n)` — due to binary search |
| Space    | `O(1)` — constant space used |

---

# Question 2 – Ruby Second House (Medium)

---

## Approach and Logic

This problem is a variation of the classic **Paint House** dynamic programming problem.  
A brute-force approach would compare all colors for every house and skip the same color as the previous house. But that gives `O(n * k * k)` time, which is slow when `k` is large.

So here's the optimized approach I used:

- For each house, I kept track of the **two smallest costs** (`m1` and `m2`) from the previous row (i.e., previous house).
- While calculating the cost of painting the current house with color `j`, I:
  - Added the cost from `m1` (if `j` was not the same as the color index of `m1` in the previous house)
  - Or added the cost from `m2` (if `j` was equal to `m1`, since we can't reuse the same color)
- After updating the costs for the current house, I again found the new `m1` and `m2` for this row.
- This helped me avoid nested loops and made the solution efficient.

Finally, the answer is the minimum value in the last row of the grid.

---

## Time and Space Complexity

| Complexity | Value         |
|------------|---------------|
| Time       | O(n * k)      |
| Space      | O(1)          | (as we are modifying the array in place)

---

# Question 3 – Subarray Sum Equals K

---

## Approach and Logic

There are two approaches used to solve this problem:

### 1. Using Nested Loops (Brute force approach)

We iterate through all possible subarrays using two nested loops.  
For each starting index, we keep adding the elements one by one and check whether the current sum becomes equal to `k`.  
If yes, we increase the count.

This method ensures that all continuous subarrays are checked and the count of those matching the target sum is returned.

### 2. Using Prefix Sum and HashMap

In this optimized approach, we maintain a running `sum` while traversing the array and use a `HashMap` to store the frequency of prefix sums encountered.

- At each index, we check if `(sum - k)` exists in the map.
- If it does, it means there are one or more subarrays ending at the current index whose sum is exactly `k`, so we add their count.
- We then update the map with the current prefix sum for future lookups.

This reduces unnecessary loops and allows for a more efficient solution.

---

## Time and Space Complexity

| Approach                       | Time Complexity | Space Complexity |
|--------------------------------|------------------|-------------------|
| Nested Loops                   | O(n²)            | O(1)              |
| Prefix Sum + HashMap (Optimized) | O(n)              | O(n)              |

---

# Search Insert Position

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If the target is not found, return the index where it would be inserted to maintain the sorted order.

## Example

**Input**

```text
nums = [1,3,5,6], target = 5
```

**Output**

```text
2
```

---

## Approach

- Use **Binary Search** to efficiently locate the target.
- If the target is found, return its index.
- If not found, return the position where it should be inserted.
- Binary Search reduces the search space by half in each iteration.

---

## Algorithm

1. Initialize two pointers: `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index.
3. If the middle element equals the target, return its index.
4. If the target is greater, search the right half.
5. Otherwise, search the left half.
6. When the loop ends, return `left` as the insertion position.

---

## Complexity Analysis

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---

## Language

- Java

## Platform

- LeetCode

## Status

✅ Solved

## Author

**Yuvasri A**
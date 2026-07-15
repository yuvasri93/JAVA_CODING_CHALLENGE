# Java Loops I (Day 5)

## Problem

Given an integer **N**, print its multiplication table from **1** to **10** in the following format:

```text
N x i = result
```

where **i** ranges from **1** to **10**.

## Approach

* Read the integer **N** using the `Scanner` class.
* Use a `for` loop to iterate from **1** to **10**.
* In each iteration, calculate the product of **N** and the current value of **i**.
* Print the result in the required format.

## Algorithm

1. Import the `java.util.Scanner` package.
2. Create a `Scanner` object.
3. Read the integer **N**.
4. Use a `for` loop from **1** to **10**.
5. Calculate `N * i`.
6. Print the multiplication table in the format `N x i = result`.
7. Close the `Scanner`.

## Time Complexity

**O(1)** (The loop always executes exactly 10 times.)

## Space Complexity

**O(1)**

## Concepts Used

* Java
* Scanner Class
* For Loop
* Arithmetic Operations
* String Concatenation
* Standard Input & Output

## Learning Outcome

This problem strengthens the understanding of `for` loops in Java by generating a multiplication table. It also demonstrates formatted output and basic arithmetic operations.

## Sample Input

```text
2
```

## Sample Output

```text
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

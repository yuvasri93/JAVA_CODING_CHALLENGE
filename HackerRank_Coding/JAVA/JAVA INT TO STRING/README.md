# Java Int to String

## Problem

Given an integer **n**, convert it into a string without using any unnecessary operations. If the conversion is successful, print **"Good job"**; otherwise, print **"Wrong answer"**.

## Approach

* Read the integer input.
* Convert the integer to a string using the `Integer.toString()` method.
* Verify that the conversion is successful by comparing the converted string with the original integer.
* Print `"Good job"` if the conversion is correct; otherwise, print `"Wrong answer"`.

## Algorithm

1. Import the required Java packages.
2. Read the integer **n**.
3. Convert **n** to a string using `Integer.toString(n)`.
4. Compare the converted string with the original integer value.
5. Print `"Good job"` if the conversion is successful; otherwise, print `"Wrong answer"`.

## Time Complexity

**O(1)**

## Space Complexity

**O(1)**

## Concepts Used

* Java
* String Conversion
* `Integer.toString()`
* Wrapper Class (`Integer`)
* Input & Output
* Conditional Statements

## Learning Outcome

This problem demonstrates how to convert primitive data types into strings using Java's built-in methods. It reinforces the use of wrapper classes and highlights efficient type conversion without manual parsing.

## Sample Input

```text
100
```

## Sample Output

```text
Good job
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

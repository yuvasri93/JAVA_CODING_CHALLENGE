# Java Stdin and Stdout II

## Problem

Read the following values from standard input in the given order:

* An integer
* A double
* A string

After reading the integer and double, consume the remaining newline before reading the string. Then print the values in the required format.

## Approach

* Use the `Scanner` class to read input.
* Read the integer using `nextInt()`.
* Read the double using `nextDouble()`.
* Consume the leftover newline using `nextLine()`.
* Read the string using `nextLine()`.
* Print the string, double, and integer in the specified output format.

## Algorithm

1. Import the `java.util.Scanner` package.
2. Create a `Scanner` object.
3. Read the integer.
4. Read the double.
5. Consume the remaining newline using `nextLine()`.
6. Read the string.
7. Print the string, double, and integer.
8. Close the `Scanner`.

## Time Complexity

**O(1)**

## Space Complexity

**O(1)**

## Concepts Used

* Java
* Scanner Class
* `nextInt()`
* `nextDouble()`
* `nextLine()`
* Standard Input and Output
* Input Buffer Handling

## Learning Outcome

This problem demonstrates how to read multiple data types in Java and highlights the importance of handling the newline character left in the input buffer after using `nextInt()` and `nextDouble()` before reading a complete line with `nextLine()`.

## Sample Input

```text
42
3.1415
Welcome to HackerRank's Java tutorials!
```

## Sample Output

```text
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

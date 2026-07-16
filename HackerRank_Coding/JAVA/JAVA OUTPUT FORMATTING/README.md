# Java Output Formatting

## Problem

Read three pairs of inputs, where each pair consists of:

* A string
* An integer

Print each pair in a formatted table where:

* The string is left-justified in a field of **15 characters**.
* The integer is displayed using **3 digits**, adding leading zeros if necessary.
* The output is enclosed between two separator lines made of equal signs (`=`).

## Approach

* Use the `Scanner` class to read three string-integer pairs.
* Print the header and footer using separator lines.
* Use `System.out.printf()` with formatting specifiers:

  * `%-15s` for left-justified strings.
  * `%03d` for three-digit integers with leading zeros.

## Algorithm

1. Import the `java.util.Scanner` package.
2. Create a `Scanner` object.
3. Print the separator line.
4. Repeat three times:

   * Read a string.
   * Read an integer.
   * Print the formatted output using `printf()`.
5. Print the closing separator line.
6. Close the `Scanner`.

## Time Complexity

**O(1)** (The loop always executes exactly 3 times.)

## Space Complexity

**O(1)**

## Concepts Used

* Java
* Scanner Class
* `System.out.printf()`
* Format Specifiers
* Loops
* String Formatting
* Standard Input & Output

## Learning Outcome

This problem introduces formatted output in Java using `System.out.printf()`. It demonstrates how to align text, control field width, and display integers with leading zeros to produce clean, structured console output.

## Sample Input

```text
java 100
cpp 65
python 50
```

## Sample Output

```text
================================
java           100
cpp            065
python         050
================================
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

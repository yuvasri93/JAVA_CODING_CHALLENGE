# Java Date and Time

## Problem

Given a date in the format **MM DD YYYY**, determine and print the corresponding day of the week in uppercase.

## Approach

* Read the month, day, and year from the input.
* Use Java's `LocalDate` class (or `Calendar` class) to create a date object.
* Retrieve the day of the week using the appropriate method.
* Convert the result to uppercase and print it.

## Algorithm

1. Read the month, day, and year.
2. Create a `LocalDate` object using the input values.
3. Retrieve the day of the week with `getDayOfWeek()`.
4. Convert the day to uppercase.
5. Print the result.

## Time Complexity

**O(1)**

## Space Complexity

**O(1)**

## Concepts Used

* Java
* `LocalDate`
* Date and Time API
* `getDayOfWeek()`
* String Manipulation
* Standard Input & Output

## Learning Outcome

This problem introduces Java's modern Date and Time API (`java.time` package). It demonstrates how to create date objects, determine the day of the week, and manipulate strings for formatted output.

## Sample Input

```text
08 05 2015
```

## Sample Output

```text
WEDNESDAY
```

## Key Java Methods

```java
LocalDate date = LocalDate.of(year, month, day);
String day = date.getDayOfWeek().toString();
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

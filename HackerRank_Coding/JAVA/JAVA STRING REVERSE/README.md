# Java String Reverse

## Problem

Given a string **A**, determine whether it is a palindrome. A palindrome is a string that reads the same forward and backward. Print **"Yes"** if the string is a palindrome; otherwise, print **"No"**.

## Approach

* Read the input string.
* Reverse the string by traversing it from the last character to the first.
* Compare the reversed string with the original string.
* If both are equal, print `"Yes"`; otherwise, print `"No"`.

## Algorithm

1. Read the input string.
2. Initialize an empty string to store the reversed value.
3. Traverse the original string from the last character to the first.
4. Append each character to the reversed string.
5. Compare the original and reversed strings using `equals()`.
6. Print `"Yes"` if they are the same; otherwise, print `"No"`.

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

## Concepts Used

* Java
* Strings
* String Reversal
* For Loop
* Character Manipulation
* `equals()` Method
* Conditional Statements

## Learning Outcome

This problem demonstrates how to manipulate strings in Java by reversing them and comparing the original and reversed versions. It reinforces the concept of palindromes, string traversal, loops, and conditional logic.

## Sample Input

```text
madam
```

## Sample Output

```text
Yes
```

## Key Java Methods

```java
char ch = str.charAt(i);

if (str.equals(reverse)) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

---

**Platform:** HackerRank
**Language:** Java
**Difficulty:** Easy

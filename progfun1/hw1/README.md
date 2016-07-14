## Overview

### Exercise 1: Pascal’s Triangle
The following pattern of numbers is called Pascal’s triangle.
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

### Exercise 2: Parentheses Balancing
Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:
```
(if (zero? x) max (/ 1 x))
I told him (that it’s not (yet) done). (But he wasn’t listening)
```

The function should return false for the following strings:
```
:-)
())(
```

There are three methods on List[Char] that are useful for this exercise:
 - chars.isEmpty: Boolean returns whether a list is empty
 - chars.head: Char returns the first element of the list
 - chars.tail: List[Char] returns the list without the first element

### Exercise 3: Counting Change
Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.
# Task 1

**Description**: *Return minimum number from array*

**Explanation**: *Base case: n = 1, in this case we return the first element of the array. Otherwise, we compare two neighbouring elements with recursion and return one that is lesser*


# Task 2

**Description**: *Return average number from array*

**Explanation**: *To find average we need to sum all elements of an array and divide this sum on number of elements and return the value of division*


# Task 3

**Description**: *Return conclusion on prime number or not*

**Explanation**: *Setting a flag for further identifying of prime a number or not, then creating for loop through all numbers from 2 to n/2 with creating if statement to find prime numbers through dividing them on i element in for loop*


# Task 4

**Description**: *Return factorial of integer n* 

**Explanation**: _Base case: if n is 0 or 1 then return 1 because 0! = 1 and 1! = 1. Recursive case: if n is greater than 1 - use __n * factorial(n - 1)___


# Task 5

**Description**: *Return n-th element of Fibonacci sequence*

**Explanation**: _Base case: if n is 0 or 1 then return **n**. Recursive case: if n is greater than 1 - calculate the n-th element of Fibonacci sequence with **fibonacci(n-1) + fibonacci(n-2)**_


# Task 6

**Description**: *Return __a__ to the power of __n__*

**Explanation**: _Base case: if n is 0 - return 1 because a^0 = 1. Recursive case: if n is greater than 0, calculate **a^n as a*a^(n-1)**_


# Task 7

**Description**: *Return reversed array*

**Explanation**: *Base case: if there's only one element in the array - print it. Recursive case: print the last element of the array then call the function on the rest of the array*


# Task 8

**Description**: *Return true if string consists all of digits and false if not*

**Explanation**: *Check for base case: if the string is empty - return true, because of the how recursion part works. Check if the first character is a digit. Recursively check the remaining substring. If this character is not digit then the string is not all digits*

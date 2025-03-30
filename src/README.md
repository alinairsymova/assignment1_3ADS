## Factorial Calculator
## Description
This program calculates the factorial of a given number using an iterative approach. It computes factorials for values less than 20 and prints the result along with the execution time.

## Method Explanation:
### `calculateFactorial`
- **@param n**: The number for which the factorial is calculated.
- **@return**: The factorial value of `n`.
- Uses a **for loop** to multiply numbers from `1` to `n`.
  This program calculates the factorial of a given number
  Uses an iterative loop to calculate factorial
  Calculate all factorials < 20
  A for loop iterates from 1 to n, multiplying each number to compute the factorial
  It prints the factorial result and the execution time
 Handles invalid input (e.g., negative numbers).

## Time Complexity
O(n) (linear complexity): The algorithm iterates n times, making it proportional to the input size.

## Usage
Run the program.
Enter a number (n).
View the factorial result and execution time.

**Example Output**
Enter number for factorial: 7
Factorial of 7 is 5040
Execution time: 0.0013

## Notes:
- Large numbers may cause **integer overflow**. Consider using `BigInteger` for larger values.
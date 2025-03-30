## Factorial Calculator
## Description
This program calculates the factorial of a given number using an iterative approach. It computes factorials for values less than 20 and prints the result along with the execution time.

## Iteration method Explanation:
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
Execution time: 0.0013ms

## Notes:
- Large numbers may cause **integer overflow**. Consider using `BigInteger` for larger values.

## Precomputed Method Explanation:
factorialPrecomputed
@param n: The number for which the factorial is retrieved.
@return: The factorial value of n, fetched from a precomputed array.
Uses an array to store factorial values from 0 to 20 in advance.
Precomputes all factorials up to 20 using a loop, storing them in an array for instant retrieval.
Retrieves the factorial instantly instead of recalculating it each time.
Handles invalid input by ensuring n is within the precomputed range.

## Time Complexity
O(1) (constant complexity): The factorial is retrieved in constant time, regardless of input size.

## Usage
Run the program.
Enter a number (n).
View the factorial result and execution time using the precomputed method.

## Example Output
Enter number for factorial: 7
Factorial of 7 is 5040
Execution time: 0.0023ms

## Notes:
This method is significantly faster for small numbers but limited to precomputed values (0-20).
For larger numbers, consider using the iterative or BigInteger method.
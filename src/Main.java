/**
 * Iteration method
        This program calculates the factorial of a given number
        Uses an iterative loop to calculate factorial
        Calculate all factorials < 20
        Time complexity: O(n) - linear complexity
        A for loop iterates from 1 to n, multiplying each number to compute the factorial
        It prints the factorial result and the execution time

 * Saved values method
        Uses an array to store precomputed factorial values for numbers from 0 to 20.
        Time complexity: O(1) (constant complexity) – the factorial of any number n is retrieved instantly from the saved values.
        A loop precomputes values for all factorials ≤ 20 and stores them in an array
        Retrieves the factorial result instantly from the precomputed array instead of recalculating it.
        Prints the factorial result and the execution time.
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int number = scanner.nextInt(); // Ask user to enter a number of factorial

        if (number < 0) { // Check if there is a negative number
         System.out.println("Factorial of a negative number is undefined.");
         return;
         }

         // Iterative method
         double startTime = System.nanoTime(); // Records the start time
         long factorial = 1;
         for (int i = 1; i <= number; i++) {
         factorial *= i;  // Calculate factorial by iterations
         }
         double endTime = System.nanoTime();
         double duration = (endTime - startTime) / 1000000; // Execution time in ms

         System.out.println("Iterative method: Factorial of " + number + " is " + factorial);
         System.out.println("Execution time: " + duration + " ms");

        /**
         // Saved values method
         if (number > 20) {
         System.out.println("Number too large for precomputed factorial.");
         return;
         }
         double startTime = System.nanoTime(); // Records the start time

         long[] fact = new long[21];  // Saved values method
         fact[0] = 1;
         for (int i = 1; i <= 20; i++) {
         fact[i] = fact[i - 1] * i;
         }
         double endTime = System.nanoTime();
         double duration = (endTime - startTime) / 1000000; // Execution time in ms
         System.out.println("Saved values method: Factorial of " + number + " is " + fact[number]);
         System.out.println("Execution time: " + duration + " ms");
         **/
    }
}

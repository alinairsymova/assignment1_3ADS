/**
 This program calculates the factorial of a given number
 Uses an iterative loop to calculate factorial
 Calculate all factorials < 20
 Time complexity: O(n) - linear complexity
 A for loop iterates from 1 to n, multiplying each number to compute the factorial
 It prints the factorial result and the execution time
**/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int number = scanner.nextInt(); // Ask user to enter a number of factorial

        if (number < 0) { // Chek if there is negative number
            System.out.println("Factorial of a negative number is undefined.");
            return;
        }

        double startTime = System.nanoTime(); // Records the start time using

        long factorial = 1;
        for (int i = 1; i <= number; i++) {  // Calculate factorial by iterations
            factorial *= i;
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000 ; // Records the end time and calculates the execution time in milliseconds

        System.out.println("Factorial of " + number + " is " + factorial);
        System.out.println("Execution time: " + duration ); // Print result of time duration and factorial of num
    }
}

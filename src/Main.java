import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial of a negative number is undefined.");
            return;
        }

        double startTime = System.nanoTime();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000 ;

        System.out.println("Factorial of " + number + " is " + factorial);
        System.out.println("Execution time: " + duration );
    }
}
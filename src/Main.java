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
    }
}
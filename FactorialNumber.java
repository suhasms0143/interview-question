import java.util.Scanner;

public class FactorialNumber {

    // Factorial method
    public static long factorial(long n) {
        if (n <= 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number to find its factorial: ");
        long number = scanner.nextLong(); // Read the user input
        long result = factorial(number); // Call the factorial method
        System.out.println("Factorial of " + number + " is: " + result); // Print the result
        scanner.close(); // Close the scanner
    }
}

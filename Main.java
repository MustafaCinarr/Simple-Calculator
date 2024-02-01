import java.util.Scanner;

public class Main {

    // Function to perform addition of two numbers
    public static int addition(int a, int b) {
        return a + b;
    }

    // Function to perform addition of three numbers
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    // Function to perform subtraction of two numbers
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // Function to perform multiplication of two numbers
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Function to perform division of two numbers
    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number, operator, and second number
        int number1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int number2 = scanner.nextInt();

        double result = 0;

        // Perform the operation based on the entered operator
        switch (operator) {
            case '+':
                result = addition(number1, number2);
                break;
            case '-':
                result = subtraction(number1, number2);
                break;
            case '*':
                result = multiplication(number1, number2);
                break;
            case '/':
                result = division(number1, number2);
                break;
            default:
                System.out.println("Invalid Operation");
        }

        // Display the result
        System.out.println("Result = " + result);
    }
}

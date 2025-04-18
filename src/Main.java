/*
Name: Pranjali Vishwakarma
PRN: 23070126092
Batch: SY AIML B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("----- Welcome to the Java Calculator -----");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        System.out.println("Result: " + calculator.add(sc.nextDouble(), sc.nextDouble()));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        System.out.println("Result: " + calculator.subtract(sc.nextDouble(), sc.nextDouble()));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        System.out.println("Result: " + calculator.multiply(sc.nextDouble(), sc.nextDouble()));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        System.out.println("Result: " + calculator.divide(sc.nextDouble(), sc.nextDouble()));
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        System.out.println("Result: " + calculator.square(sc.nextDouble()));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        System.out.println("Result: " + calculator.cube(sc.nextDouble()));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        System.out.println("Result: " + calculator.squareRoot(sc.nextDouble()));
                        break;
                    case 8:
                        System.out.println("Thank you for using the calculator!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

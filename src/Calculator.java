public class Calculator {

    // Function for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Function for division with exception handling
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Function to calculate square
    public double square(double a) {
        return a * a;
    }

    // Function to calculate cube
    public double cube(double a) {
        return a * a * a;
    }

    // Function to calculate square root with exception handling
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}


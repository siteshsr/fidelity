import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();


        System.out.println("Choose an operation (+, -, *, /):");
        char operator = sc.next().charAt(0);

        Calculator calc = new Calculator();


        int result;
        double quotient;
        double[] remainder = new double[1];
        switch (operator) {
            case '+':
                result = calc.Addition(a, b);
                System.out.println("Result of Addition: " + result);
                break;
            case '-':
                result = calc.Subtraction(a, b);
                System.out.println("Result of Subtraction: " + result);
                break;
            case '*':
                result = calc.Multiplication(a, b);
                System.out.println("Result of Multiplication: " + result);
                break;
            case '/':
                if (b != 0) {
                    quotient = calc.Division(a, b, remainder);
                    System.out.println("Quotient: " + quotient);
                    System.out.println("Remainder: " + remainder[0]);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }


    }
}
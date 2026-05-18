// Calculator.java
// beginner java calculator - just learning the basics

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Type 'exit' to quit");
        System.out.println("");

        while (true) {

            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();

            if (input1.equals("exit")) {
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Thats not a valid number, try again");
                continue;
            }

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            if (operator.equals("exit")) {
                break;
            }

            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();

            if (input2.equals("exit")) {
                break;
            }

            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Thats not a valid number, try again");
                continue;
            }

            double result;

            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Error: cant divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            } else {
                System.out.println("Unknown operator. Use +, -, *, /");
            }

            System.out.println("");
        }

        System.out.println("Bye!");
        scanner.close();
    }
}

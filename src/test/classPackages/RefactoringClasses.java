package test.classPackages;

import java.util.Scanner;

public class RefactoringClasses {

    public static class CountGroceries {

        public static int solve(String[] groceries) {
            return groceries.length * 10;
        }
    }
    public static class MessyCalculator {

        public static double solve() {

            Scanner scanner = new Scanner(System.in);

            double num1 = 0;
            double num2 = 0;

            System.out.println("Simple Calculator");

            num1 = getNumberInput(num1, scanner);
            num2 = getNumberInput(num1, scanner);

            int choice = getOperationChoice(scanner);

            double result = checkFunctionChoice(choice, num1, num2);

            scanner.close();

            return result;
        }

        public static double getNumberInput(double num, Scanner scanner) {
            if (num == 0) {
                System.out.println("Enter first number:");
                return scanner.nextDouble();
            } else {
                System.out.println("Enter second number:");
                return scanner.nextDouble();
            }
        }

        public static int getOperationChoice(Scanner scanner) {
            System.out.println("Select operation: 1. Add  2. Subtract  3. Multiply  4. Divide");
            System.out.println("Please enter a number:");
            return scanner.nextInt();
        }

        public static double checkFunctionChoice(int choice, double num1, double num2) {
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    return result;
                case 2:
                    result = num1 - num2;
                    return result;
                case 3:
                    result = num1 * num2;
                    return result;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        return result;
                    } else {
                        return result;
                    }
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    return 0;
            }
        }
    }
}

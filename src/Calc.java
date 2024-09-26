import java.util.Scanner;

public class Calc {
    public static double Add(double number1, double number2) {
        return number1 + number2;
    }

    public static double Subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double Multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double Divide(double number1, double number2) {
        if (number1 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error");
            return Double.NaN;
        }
    }

    public static double Number1(Scanner scan) {
        System.out.println("number1:");
        return scan.nextDouble();
    }

    public static double Number2(Scanner scan) {
        System.out.println("number2:");
        return scan.nextDouble();
    }

    public static void Calc(Scanner scan, int choice) {
        double number1 = Number1(scan);
        double number2 = Number2(scan);
        double result = 0;

        switch (choice) {
            case 1 -> result = Add(number1, number2);
            case 2 -> result = Subtract(number1, number2);
            case 3 -> result = Multiply(number1, number2);
            case 4 -> result = Divide(number1, number2);
            default -> System.out.println("Invalid choice");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculator Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scan.nextInt();

            if (choice >= 1 && choice <= 4) {
                Calc(scan, choice);
            } else if (choice != 5) {
                System.out.println("Invalid choice");
            }
        } while (choice != 5);

        System.out.println("Exiting the calculator.");
    }
}

import java.util.Scanner;

public class Currency {
    public static double UAH(double uah) {
        System.out.println("uah :");
        return uah * 1;
    }

    public static double USD(double uah) {
        System.out.println("usd :");
        return uah * 42;
    }

    public static double CAD(double uah) {
        System.out.println("cad :");
        return uah * 31;
    }

    public static double EU(double uah) {
        System.out.println("eu :");
        return uah * 46;
    }

    public static double getGroshi(Scanner scanner) {
        double s;
        System.out.println("Enter Groshi :");
        s = scanner.nextDouble();
        return s;
    }

    public static void currency(Scanner scanner, int choice) {
        double s = getGroshi(scanner);
        double result = 0;

        switch (choice) {
            case 1 -> result = UAH(s);
            case 2 -> result = USD(s);
            case 3 -> result = CAD(s);
            case 4 -> result = EU(s);
            default -> System.out.println("Invalid choice");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Convert to: ");
            System.out.println("1. UAH");
            System.out.println("2. USD");
            System.out.println("3. CAD");
            System.out.println("4. EU");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                currency(scanner, choice);
            } else if (choice != 5) {
                System.out.println("Invalid choice");
            }
        } while (choice != 5);

        System.out.println("Exiting the currency converter.");
    }
}

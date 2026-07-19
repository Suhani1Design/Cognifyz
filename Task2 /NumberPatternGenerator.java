import java.util.Scanner;

public class NumberPatternGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Number Pattern Generator =====");
        System.out.println("1. Increasing Stars");
        System.out.println("2. Decreasing Stars");
        System.out.println("3. Repeated Numbers");
        System.out.println("4. Increasing Numbers");
        System.out.println("5. Reverse Numbers");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;

            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            case 5:
                for (int i = 1; i <= 5; i++) {
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

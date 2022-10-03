package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println(checkNumber(num));
    }

    private static String checkNumber(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return "This number is not prime";
            }
        }

        return "This number is prime";
    }
}

package lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        if (Math.abs(number % 10) == 3) {
            System.out.println("The last digit of this number is 3");
        } else {
            System.out.println("The last digit of the number is not 3");
        }
    }
}

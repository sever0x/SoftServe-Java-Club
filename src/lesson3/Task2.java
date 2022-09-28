package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        if (number < 0 || number > 10) {
            System.out.println("Does not meet the conditions of the assignment");
        } else if (number == 1) {
            System.out.println(number + " гривня");
        } else if (number > 1 && number < 5) {
            System.out.println(number + " гривні");
        } else {
            System.out.println(number + " гривень");
        }
    }
}

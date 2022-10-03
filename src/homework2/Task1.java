package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int[] oddNums = getOddNumbers(num);
        System.out.println(Arrays.toString(oddNums));
        System.out.println(getSumOfArray(oddNums));
    }

    private static int[] getOddNumbers(int amount) {
        int i = 0;
        int counter = 1;
        int[] oddNums = new int[amount];

        while (i < amount) {
            if (counter % 2 != 0) {
                oddNums[i++] = counter;
            }
            counter++;
        }

        return oddNums;
    }

    private static int getSumOfArray(int[] oddNums) {
        int sum = 0;
        for (int oddNum : oddNums) sum += oddNum;
        return sum;
    }
}

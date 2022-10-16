package homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int[] sortValues = Arrays.copyOf(values, values.length);
        Arrays.sort(sortValues);

        int[] indexes = findIndexInArray(values, sortValues[0], sortValues[sortValues.length - 1]);
        System.out.printf("Min index: %d | Max index: %d \n", indexes[0], indexes[1]);
        System.out.printf("Sum: %d", sum(values, indexes[0], indexes[1]));
    }

    private static int[] findIndexInArray(int[] values, int min, int max) {
        int counter = 0;
        int[] indexes = new int[2];

        for (int i = 0; i < values.length; i++) {
            if (values[i] == min || values[i] == max) {
                indexes[counter++] = i;
            }
        }

        return indexes;
    }

    private static int sum(int[] values, int start, int end) {
        int sum = 0;

        for (int i = start + 1; i < end; i++) {
            sum += values[i];
        }

        return sum;
    }
}

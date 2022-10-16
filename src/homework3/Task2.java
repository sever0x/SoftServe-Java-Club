package homework3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        System.out.println(Arrays.toString(offsetArray(values)));
    }

    private static int[] offsetArray(int[] values) {
        int[] newValues = new int[values.length];
        System.arraycopy(values, values.length - 1, newValues, 0, 1);
        System.arraycopy(values, 0, newValues, 1, values.length - 1);
        return newValues;
    }
}

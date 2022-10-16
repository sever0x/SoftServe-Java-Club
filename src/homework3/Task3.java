package homework3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 0, 2, 5, 6, 4, 10, 3};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        boolean isArrayEnd = false;
        int counter = 0;

        for (int i = 0; i < merge.length; i++) {
            if (i % 2 == 0 && counter < arr1.length && !isArrayEnd) {
                merge[i] = arr1[counter];
            } else if (i % 2 != 0 && counter < arr2.length && !isArrayEnd) {
                merge[i] = arr2[counter];
                counter++;
            } else isArrayEnd = true;

            if (isArrayEnd) {
                merge[i] = counter < arr1.length ? arr1[++counter] : arr2[counter++];
            }
        }

        return merge;
    }
}

package homework2;

public class Task4 {
    private static int sum = 0;

    public static void main(String[] args) {
        int[] arr = getFibonacciArray(20);
        System.out.println(getAverage(arr.length));
    }

    private static int[] getFibonacciArray(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            if (i == 0) {
                arr[i] = 1;
                arr[i + 1] = 1;
                sum += arr[i] + arr[i + 1];
            }

            if (i - 1 >= 0 && i - 2 >= 0) {
                arr[i] = arr[i - 1] + arr[i -2];
                sum += arr[i];
            }
        }

        return arr;
    }

    private static double getAverage(int arrayLength) {
        return (double) sum / arrayLength;
    }
}

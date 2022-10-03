package homework2;

public class Task2 {
    private static final int NUM_START = 10;
    private static final int NUM_END = 50;
    private static final int MULTIPLE = 3;

    public static void main(String[] args) {
        for (int i = NUM_START; i < NUM_END; i++) {
            if (i % MULTIPLE == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

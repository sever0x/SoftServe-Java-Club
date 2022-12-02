package homework5;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 4. Дано список цілих чисел, вивести рядок, що є конкатенацією представлення рядковим типом  цих чисел.
 *
 * Приклад: список {5, 2, 4, 2, 1}
 * Результуючий рядок: "52421"
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 2, 1};

        System.out.println(concatenateArray(array));
    }

    private static String concatenateArray(int[] array) {
        return Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}

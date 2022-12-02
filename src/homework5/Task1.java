package homework5;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Дано список цілих чисел. Знайти середнє всіх непарних чисел, що діляться на 5
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 41, 25, 65, 84);

        double average = list.stream()
                .filter(e -> (e % 2) != 0 && e % 5 == 0)
                .mapToDouble(e -> e)
                .average()
                .orElse(0.0);

        System.out.println("Average _ " + average);
    }
}

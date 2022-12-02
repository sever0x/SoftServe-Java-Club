package homework5;

import java.util.*;

/**
 * 2. Дано перелік рядків (можна взяти вірш, як варіант). Знайти кількість унікальних
 * рядків завдовжки більше 8 символів (можна варіювати в залежності від Вашого вхідного
 * тексту).
 */
public class Task2 {
    public static void main(String[] args) {
        String str = """
                В лесу родилась ёлочка,
                В лесу родилась ёлочка,
                В лесу она росла
                В лесу она росла
                Зимой и летом стройная
                Зеленая
                Была""";

        Map<String, Integer> map = new HashMap<>();
        fillMap(str.split("\n"), map);

        System.out.println(countUniqueStrings(map));
    }

    private static void fillMap(String[] splitStrArray, Map<String, Integer> map) {
        Arrays.stream(splitStrArray)
                .forEach(s -> map.put(s,
                        map.containsKey(s) ? map.get(s) + 1 : 1));
    }

    private static int countUniqueStrings(Map<String, Integer> map) {
        return (int) map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1 && e.getKey().length() > 8)
                .count();
    }
}

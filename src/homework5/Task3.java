package homework5;

import java.util.Map;

/**
 * 3. Дана Map <String, Integer>. Знайти суму всіх значень, довжина ключів яких менше 7 символів.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("shadowraze", 57, "lolz", 12, "sever0x", 94);
        System.out.println(map);

        System.out.println(valueSum(map));
    }

    private static int valueSum(Map<String, Integer> map) {

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }
}

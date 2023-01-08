package Lab.MapsLambdAandStreamAPI;

import java.lang.reflect.Array;
import java.util.*;

public class P3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 0);
            }
            int value = wordsMap.get(word);
            wordsMap.put(word, value + 1);

        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}


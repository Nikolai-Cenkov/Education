package Exercise.MapsLambdaStreamAPI;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class P1CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll(" ", "");
        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            symbolCount.putIfAbsent(symbol, 0);
            symbolCount.put(symbol, symbolCount.get(symbol) + 1);


        }
            symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
////            countMap.putIfAbsent(num, 0);
////            countMap.put(num, countMap.get(num) + 1);
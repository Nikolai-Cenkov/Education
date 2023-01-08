package Exercise.MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P7LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> needItem = new LinkedHashMap<>();
        needItem.put("shards", 0);
        needItem.put("fragments", 0);
        needItem.put("motes", 0);

        Map<String, Integer> junkItem = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = needItem.get(material);
                    needItem.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItem.containsKey(material)) {
                        junkItem.put(material, quantity);
                    } else {
                        int current = junkItem.get(material);
                        junkItem.put(material, current + quantity);
                    }

                }
                if (needItem.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    needItem.put("shards", needItem.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (needItem.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    needItem.put("fragments", needItem.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (needItem.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    needItem.put("motes", needItem.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin){
                break;
            }
        }
        needItem.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItem.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

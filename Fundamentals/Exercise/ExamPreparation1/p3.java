package Exercise.ExamPreparation1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, Double> plantsRating = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantsRarity.putIfAbsent(name, 0);
            plantsRarity.put(name, rarity);

        }
        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String command = input.split("[: -]+")[0];
            String plant = input.split("[: -]+")[1];
            if (!plantsRarity.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        plantsRating.putIfAbsent(plant, 0.0);
                        double rating = Double.parseDouble(input.split("[: -]+")[2]);
                        if (plantsRating.get(plant) == 0) {
                            plantsRating.put(plant, rating);
                        }else {
                            double newRate = plantsRating.get(plant) + rating;
                            plantsRating.put(plant, newRate / 2);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(input.split("[: -]+")[2]);
                        plantsRarity.put(plant, rarity);
                        break;
                    case "Reset":
                        plantsRating.put(plant, 0.0);
                        break;
                }
            }


            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().

                forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantsRating.get(entry.getKey())));

    }
}


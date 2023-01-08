package ExamPreparation22;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2aadAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(#|\\|)(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int allCalories = 0;

        StringBuilder outPutItems = new StringBuilder();


        while (matcher.find()){
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            allCalories += calories;
            outPutItems.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", itemName, expirationDate, calories));
        }
        int days = allCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

            System.out.println(outPutItems);
        }
    }


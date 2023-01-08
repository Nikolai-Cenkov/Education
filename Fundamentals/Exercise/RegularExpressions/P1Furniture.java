package Exercise.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = ">>(?<furnitureName>[A-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double totalMoney = 0;
        List<String> furnitureList = new ArrayList<>();


        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                furnitureList.add(furnitureName);
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double priceForFurniture = price * quantity;
                totalMoney += priceForFurniture;
            }
                input = scanner.nextLine();
        }
            System.out.println("Bought furniture:");
            furnitureList.forEach(System.out::println);
            System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
//furnitureNames.forEach(System.out::println);
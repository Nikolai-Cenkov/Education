package Exercise.MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productConsist = scanner.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        while (!productConsist.equals("buy")){
            String product = productConsist.split("\\s+")[0];
            double price = Double.parseDouble(productConsist.split("\\s+")[1]);
            int quantity = Integer.parseInt(productConsist.split("\\s+")[2]);

            productPrice.put(product, price);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product, quantity);
            }else {
                productQuantity.put(product,productQuantity.get(product) + quantity);
            }
            productConsist = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrice.entrySet()){
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }

}

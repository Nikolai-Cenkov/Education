package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class Cinema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticket = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

       if ("Premiere".equals(ticket)) {
           price = r * c * 12;

       }else if ("Normal".equals(ticket)) {
           price = r * c * 7.50;

       }else if ("Discount".equals(ticket)){
           price = r * c * 5;
       }
        System.out.printf("%.2f", price);

    }
}

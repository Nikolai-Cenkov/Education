package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Friday") && typePeople.equals("Students")) {
            price = 8.45;
            if (countPeople >= 30) {
                price = price -  ( price * 0.15);

            }

        } else if (day.equals("Saturday") && typePeople.equals("Students")) {
            price = 9.80;
            if (countPeople >= 30) {
                price = price -  ( price * 0.15);

            }


        } else if (day.equals("Sunday") && typePeople.equals("Students")) {
            price = 10.46;
            if (countPeople >= 30) {
                price = price -  ( price * 0.15);

            }
        } else if (day.equals("Friday") && typePeople.equals("Business")) {
            price = 10.90;
            if (countPeople >= 100) {
                countPeople -= 10;
            }
        } else if (day.equals("Saturday") && typePeople.equals("Business")) {
            price = 10.90;
            if (countPeople >= 100) {
                countPeople -= 10;
            }

        } else if (day.equals("Sunday") && typePeople.equals("Business")) {
            price = 10.90;
            if (countPeople >= 100) {
                countPeople -= 10;
            }
        } else if (day.equals("Friday") && typePeople.equals("Regular")) {
            price = 15;
            if (countPeople >= 10 && countPeople <= 20) {
                price = price - (price * 0.05);
            }

        } else if (day.equals("Saturday") && typePeople.equals("Regular")) {
            price = 20;
            if (countPeople >= 10 && countPeople <= 20) {
                price = price - (price * 0.05);
            }

        } else if (day.equals("Sunday") && typePeople.equals("Regular")) {
            price = countPeople * 22.50;
            if (countPeople >= 10 && countPeople <= 20) {
                price = price - (price * 0.05);
            }

        }
        double totalprice = countPeople * price;
        System.out.printf("Total price: %.2f", totalprice);
    }

}




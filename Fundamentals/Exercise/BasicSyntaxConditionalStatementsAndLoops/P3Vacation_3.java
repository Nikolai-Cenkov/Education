package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P3Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (typePeople) {
            case "Students":
                if (day.equals("Friday")) {
                    price = countPeople * 8.45;
                    if (countPeople >= 30) {
                        price = price - (price * 0.15);
                    }
                    break;
                } else if (day.equals("Saturday")) {
                    price = countPeople * 9.80;
                    if (countPeople >= 30) {
                        price = price - (price * 0.15);
                    }
                    break;
                } else if (day.equals("Sunday")) {
                    price = countPeople * 10.46;
                    if (countPeople >= 30) {
                        price = price - (price * 0.15);
                    }
                    break;
                }

            case "Business":
                if (day.equals("Friday")) {
                    price = countPeople * 10.90;
                    if (countPeople >= 100) {
                        price = (countPeople - 10) * 10.90;
                    }
                    break;
                } else if (day.equals("Saturday")) {
                    price = countPeople * 15.60;
                    if (countPeople >= 100) {
                        price = (countPeople - 10) * 15.60;
                    }
                    break;
                } else if (day.equals("Sunday")) {
                    price = countPeople * 16;
                    if (countPeople >= 100) {
                        price = (countPeople - 10) * 16;
                    }
                    break;
                }
            case "Regular":
                if (day.equals("Friday")) {
                    price = countPeople * 15;
                    if (countPeople >= 10 && countPeople <= 20) {
                        price = price - (price * 0.05);
                    }
                    break;
                } else if (day.equals("Saturday")) {
                    price = countPeople * 20;
                    if (countPeople >= 10 && countPeople <= 20) {
                        price = price - (price * 0.05);
                    }
                    break;
                } else if (day.equals("Sunday")) {
                    price = countPeople * 22.50;
                    if (countPeople >= 10 && countPeople <= 20) {
                    }
                    break;
                }

        }
        System.out.printf("Total price: %.2f", price);


    }
}


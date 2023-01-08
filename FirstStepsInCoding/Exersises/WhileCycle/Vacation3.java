package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class Vacation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double spendCount = 0;
        int alldays = 0;
        boolean isFailed = false;

        while (availableMoney < needMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            alldays++;
            switch (action) {
                case "spend":
                    availableMoney -= money;
                    spendCount++;
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                        break;
                case "save":
                    availableMoney += money;
                    spendCount = 0;
                    break;

            }
            if (spendCount == 5) {
                isFailed = true;
                break;
            }
        }
        if (isFailed) {
            //         System.out.printf("You saved the money for %d%n days.", alldays);
            System.out.println("You can't save the money.");
            System.out.printf("%d", alldays);

        } else {
            System.out.printf("You saved the money for %d days.", alldays);


        }

    }
}








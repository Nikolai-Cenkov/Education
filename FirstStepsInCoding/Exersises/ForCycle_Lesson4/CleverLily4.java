package FirstStepsInCoding.Exersises.ForCycle_Lesson4;

import java.util.Scanner;

public class CleverLily4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingmashinePrice = Double.parseDouble(scanner.nextLine());
        int countToys = Integer.parseInt(scanner.nextLine());
        double moneyForBirthday = 0.0;
        int toys = 0;
        int bd = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    moneyForBirthday = 10;
                } else {
                    moneyForBirthday += 10.00 * i / 2;
                }
                bd++;
            } else {
                toys++;
            }
        }
        double money = moneyForBirthday - bd;
        double toysPrice = countToys * toys;
        double allmoney = toysPrice + money;
        if (allmoney >= washingmashinePrice){
            System.out.printf("Yes! %.2f", allmoney - washingmashinePrice);
        }else {
            System.out.printf("No! %.2f", washingmashinePrice - allmoney);
        }


    }

}


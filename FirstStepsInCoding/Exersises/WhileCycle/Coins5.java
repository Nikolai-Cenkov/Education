package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class Coins5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double instead = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        double coins = instead * 100;
        while (coins != 0) {
            if (coins >= 200) {
                coins -= 200;
                counter++;
            } else if (coins >= 100) {
                coins -= 100;
                counter++;
            } else if (coins >= 50) {
                coins -= 50;
                counter++;
            } else if (coins >= 20) {
                coins -= 20;
                counter++;
            } else if (coins >= 10) {
                coins -= 10;
                counter++;
            } else if (coins >= 5) {
                coins -= 5;
                counter++;
            }else if (coins>=2){
                coins -=2;
                counter++;
            }else if (coins>=1){
                coins -=1;
                counter++;
            }else {
                break;
            }
        }
        System.out.println(counter);
    }
}

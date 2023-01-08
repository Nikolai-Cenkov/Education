package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLight = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(countStudents + (countStudents * 0.10)) * priceOfLight;
        double sumRobes = countStudents * priceOfRobes;
        double sumBelts = (countStudents  - countStudents / 6) * priceOfBelts;

        double totalSum = sumLight + sumRobes + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }


    }
}

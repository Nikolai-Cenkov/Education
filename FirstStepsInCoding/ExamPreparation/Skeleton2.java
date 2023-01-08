package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class Skeleton2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minControl = Integer.parseInt(scanner.nextLine());
        int secControl = Integer.parseInt(scanner.nextLine());
        double lengthChute = Double.parseDouble(scanner.nextLine());
        int secPer100Meter = Integer.parseInt(scanner.nextLine());

        int allSecond = minControl * 60 + secControl;
        double timePlus = lengthChute / 120;
        double allTimePlus = timePlus * 2.5;
        double marinTime = (lengthChute / 100) * secPer100Meter - allTimePlus;

        if (marinTime <= allSecond){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", marinTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(marinTime - allSecond));
        }
    }
}

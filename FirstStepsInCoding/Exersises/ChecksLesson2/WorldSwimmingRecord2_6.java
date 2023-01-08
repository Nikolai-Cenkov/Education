package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class WorldSwimmingRecord2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     double worldRecord = Double.parseDouble(scanner.nextLine());
     double distance = Double.parseDouble(scanner.nextLine());
     double secPerMeter = Double.parseDouble(scanner.nextLine());

     double IvanTime = distance * secPerMeter;
     double resistance = Math.floor(distance / 15) * 12.5;
     IvanTime = IvanTime + resistance;
        if (IvanTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", IvanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", IvanTime - worldRecord);
        }



    }
}

package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class RafiansToDegree1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radian = Double.parseDouble(scanner.nextLine());
        double degrees = radian * 180 / Math.PI;
        System.out.println(degrees);
    }
}



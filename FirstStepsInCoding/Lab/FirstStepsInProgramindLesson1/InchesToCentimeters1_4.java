package FirstStepsInCoding.Lab.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class InchesToCentimeters1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double santimeters = inch * 2.54;

        System.out.println(santimeters);
    }
}


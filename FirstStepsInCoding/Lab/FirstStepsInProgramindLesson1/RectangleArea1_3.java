package FirstStepsInCoding.Lab.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class RectangleArea1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.println(area);
    }
}


package FirstStepsInCoding.Lab.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class YardGreening1_9 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double area = Double.parseDouble(scanner.nextLine());
       double price = area * 7.61;
       double dis = (18 / 100.00) * price;
        double total = price - dis;
        System.out.printf("The final price is: %f lv." , area);
        System.out.printf("The discount is: %f lv.", dis);

    }
}


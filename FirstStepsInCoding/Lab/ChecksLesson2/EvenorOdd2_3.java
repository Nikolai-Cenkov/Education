package FirstStepsInCoding.Lab.ChecksLesson2;

import java.util.Scanner;

public class EvenorOdd2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        if (number % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}

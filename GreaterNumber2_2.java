package FirstStepsInCoding.Lab.ChecksLesson2;

import java.util.Scanner;

public class GreaterNumber2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.next());
        if (num > num1) {
            System.out.println(num);
        }else{
            System.out.println(num1);
        }

    }
}

package FirstStepsInCoding.Lab.WhileCycleLesson5;

import java.util.Scanner;

public class ReadText1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            System.out.println(input);
            input = scanner.nextLine();

        }
    }
}

package FirstStepsInCoding.Lab.ForCycleLesson4;

import java.util.Scanner;

public class VowelsSum06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == 'a'){
                sum += 1;
            }else if (symbol == 'e'){
                sum += 2;
            }else if (symbol == 'i'){
                sum += 3;
            }else if (symbol == 'o'){
                sum += 4;
            }else if (symbol == 'u'){
                sum += 5;
            }

        }
        System.out.println(sum);






    }
}

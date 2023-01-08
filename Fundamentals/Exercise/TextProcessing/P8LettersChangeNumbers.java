package Exercise.TextProcessing;

import java.util.Scanner;

public class P8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] line = input.split("\\s+");

        double sumModifiedNumber = 0;
        for(String code : line){
            sumModifiedNumber += modifiedLine(code);

        }
        System.out.printf("%.2f", sumModifiedNumber);

    }
    public static double modifiedLine (String code){
        double sum = 0;

        char symbol1 = code.charAt(0);
        char symbol2 = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(symbol1, ' ').replace(symbol2, ' ').trim());
        if (Character.isUpperCase(symbol1)){
            int positionUpperCase = (int) symbol1 - 64;
            double divideNumber = number / positionUpperCase;
            sum += divideNumber;
        }else {
            int positionLowercase = (int) symbol1 - 96;
            double multiPlyNumber = number * positionLowercase;
            sum += multiPlyNumber;
        }
        if (Character.isUpperCase(symbol2)){
            int positionUpperCase = (int) symbol2 - 64;
            sum -= positionUpperCase;
        }else {
            int positionLowercase = (int) symbol2 - 96;
            sum += positionLowercase;
        }
        return sum;



    }
}
//int positionUpperLetter = (int) firstLetter - 64;
//            number /= positionUpperLetter;

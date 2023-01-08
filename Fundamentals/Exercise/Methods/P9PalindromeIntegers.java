package Exercise.Methods;

import java.util.Scanner;

public class P9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")){
            if (!palindromeNumber(input)){
                System.out.println("false");
            }else {
                System.out.println("true");
            }




            input = scanner.nextLine();
        }
    }
    public static boolean palindromeNumber (String input){
        String palindromeNum = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            palindromeNum += input.charAt(i);
        }
        return input.equals(palindromeNum);
    }
}

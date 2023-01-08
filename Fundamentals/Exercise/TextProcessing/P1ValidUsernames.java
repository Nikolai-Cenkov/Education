package Exercise.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] userNames = inputLine.split(", ");

        for (String userName : userNames) {
            if (isValid(userName)){
                System.out.println(userName);
            }
        }
    }
    public static boolean isValid (String userName){
        boolean isValidLength = userName.length() >= 3 && userName.length() <=12;
        for (char symbol : userName.toCharArray()){
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;

            }
        }
        return isValidLength;
    }
}





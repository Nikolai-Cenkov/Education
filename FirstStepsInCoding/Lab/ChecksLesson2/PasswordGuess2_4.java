
package FirstStepsInCoding.Lab.ChecksLesson2;

import java.util.Scanner;

public class PasswordGuess2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String correctPassword = "s3cr3t!P@ssw0rd";

        if (pass.equals(correctPassword)) {
            System.out.println("Welcome!");
        }else
            System.out.println("Wrong password!");





    }
}







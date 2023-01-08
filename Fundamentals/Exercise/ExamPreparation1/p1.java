package Exercise.ExamPreparation1;

import java.util.Locale;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String substring = "";

            String command = input.split(">>>")[0];
            if (command.equals("Contains")) {
                 substring = input.split(">>>")[1];
                if (firstLine.contains(substring)) {
                    System.out.printf("%s contains %s%n", firstLine, substring);
                } else {
                    System.out.println("Substring not found!");
                }


            } else if (command.equals("Flip")) {
                String upperOrLower = input.split(">>>")[1];
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                substring = firstLine.substring(startIndex, endIndex);
                if (upperOrLower.equals("Upper")) {
                    firstLine = firstLine.replace(substring, substring.toUpperCase(Locale.ROOT));
                } else if (upperOrLower.equals("Lower")) {
                    firstLine = firstLine.replace(substring, substring.toLowerCase(Locale.ROOT));
                }
                System.out.println(firstLine);

            } else if (command.contains("Slice")) {

                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex = Integer.parseInt(input.split(">>>")[2]);
                substring = firstLine.substring(startIndex, endIndex);
                firstLine = firstLine.replace(substring, "");

                System.out.println(firstLine);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", firstLine);

    }
}

package Exercise.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Making input! - ok.
        //2.Making loop! -ok.
        //3.Making commands:
        //-marge
        //-divide
        //4.Print on the console!
        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            int index1 = Integer.parseInt(commands[1]);
            int index2 = Integer.parseInt(commands[2]);


            switch (command) {
                case "merge":

                    if (index1 < 0) {
                        index1 = 0;
                    }
                    if (index2 > inputLine.size() - 1) {
                        index2 = inputLine.size() - 1;
                    }
                    boolean isValid = index1 <= inputLine.size() - 1 && index2 >= 0 && index1 < index2;

                    if (isValid) {
                        String mergeText = "";
                        for (int i = index1; i <= index2; i++) {
                            String currentText = inputLine.get(i);
                            mergeText += currentText;
                        }
                        for (int i = index1; i <= index2; i++) {
                            inputLine.remove(index1);
                        }
                        inputLine.add(index1, mergeText);
                    }
                    break;
                case "divide":
                    String divide = inputLine.get(index1);
                    inputLine.remove(index1);
                    int partSize = divide.length() / index2;

                    int beingIndexOfText = 0;
                    for (int part = 1; part < index2; part++) {
                        inputLine.add(index1, divide.substring(beingIndexOfText, beingIndexOfText + partSize));
                        index1++;
                        beingIndexOfText += partSize;
                    }
                    inputLine.add(index1, divide.substring(beingIndexOfText));
                    break;


            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputLine));

    }


}





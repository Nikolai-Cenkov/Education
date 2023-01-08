package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > inputLine.size() - 1) {
                    endIndex = inputLine.size() - 1;
                }
                boolean isValid = startIndex <= inputLine.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValid) {
                    String margeIndex = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentText = inputLine.get(i);
                        margeIndex += currentText;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        inputLine.remove(startIndex);

                    }
                    inputLine.add(startIndex, margeIndex);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);
                String divideIndex = inputLine.get(index);
                inputLine.remove(index);

                int partSize = divideIndex.length() / parts;
                int beingIndexOfText = 0;
                for (int i = 1; i < parts; i++) {
                    inputLine.add(index, divideIndex.substring(beingIndexOfText, beingIndexOfText + partSize));
                    index++;
                    beingIndexOfText += partSize;
                }
                inputLine.add(index, divideIndex.substring(beingIndexOfText));
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputLine));
    }
}

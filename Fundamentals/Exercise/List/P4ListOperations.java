package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numberAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberAdd);

            } else if (command.contains("Insert")) {
                int insertNumber = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(index, numbers)) {
                    numbers.add(index, insertNumber);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(indexRemove, numbers)) {
                    numbers.remove(indexRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= countLeft; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);

                }
            } else if (command.contains("Shift right")) {
                int countRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= countRight; i++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);

                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}

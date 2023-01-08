package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Maka the initial schedule, separated with comma and spase! - check!
        //2.Create the loop! - check!
        //3.Create command:
        // - Add.
        // - Insert.
        // - Remove.
        // - Swap.
        // - Exercise.
        //4. Print modify schedule!

        List<String> scheduleUnit = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] commands = input.split(":");
            String command = commands[0];

            switch (command) {
                case "Add":
                    String unit1 = commands[1];
                    if (!itemExist(scheduleUnit,unit1)){
                        scheduleUnit.add(unit1);
                    }
                case "Insert":
                case "Remove":
                case "Swap":
                case "Exercise":
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i <= scheduleUnit.size() - 1 ; i++) {
            String currentUnit = scheduleUnit.get(i);
            System.out.println(currentUnit);
        }
    }

    public static boolean itemExist(List<String> scheduleList, String unit) {
        boolean result = false;
        for (int i = 0; i <= scheduleList.size() - 1; i++) {
            if (scheduleList.get(i).equals(unit)) {
                result = true;
                break;
            }

        }
        return result;
    }
}




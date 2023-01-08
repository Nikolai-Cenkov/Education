package Exercise.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());
        //•	"{name} is going!"
        //•	"{name} is not going!"
        List<String> guestNames = new ArrayList<>();
        for (int i = 1; i <= commandCount ; i++) {
            String command = scanner.nextLine();

            List<String> commandsList = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
            String name = commandsList.get(0);
            if (commandsList.size() == 3){
                if (guestNames.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    guestNames.add(name);
                }
            }else if (commandsList.size() == 4){
                if (guestNames.contains(name)){
                    guestNames.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guestNames){
            System.out.println(name);
        }
    }
}

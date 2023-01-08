package Exercise.MapsLambdaStreamAPI;

import java.awt.image.ImageProducer;
import java.util.*;

public class P9ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. We receive several input lines!
        //2. We make a loop!
        //3.Make line "{force_side | force_user"}:
        //4."{force_user} -> {force_side}"
        //5. Print the lines!
        String command = scanner.nextLine();
        Map<String, List<String>> line = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String side = command.split("\\s+\\|\\s+")[0];
                String member = command.split("\\s+\\|\\s+")[1];

                if (!line.containsKey(side)) {
                    line.put(side, new ArrayList<>());
                }
                boolean isExist = false;
                for (List<String> users : line.values()) {
                    if (users.contains(member)) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    line.get(side).add(member);
                }

            } else if (command.contains(" -> ")) {
                String member = command.split("\\s+->\\s+")[0];
                String side = command.split("\\s+->\\s+")[1];
                line.entrySet().forEach(entry -> entry.getValue().remove(member));
                if (line.containsKey(side)) {
                        line.get(side).add(member);
                    } else {
                        line.put(side, new ArrayList<>());
                        line.get(side).add(member);
                }
                System.out.printf("%s joins the %s side!%n", member, side);

            }
            command = scanner.nextLine();
        }
        line.entrySet().stream().filter(entry -> entry.getValue().size() > 0).forEach(entry -> {
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(user -> System.out.println("! " + user));
        });
    }
}



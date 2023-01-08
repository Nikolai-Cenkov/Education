package Exercise.MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Make input!
        //2. Make Map!
        //3.Make loop!
        //4.Make command:
        // - register
        // - unregister
        //5.Print registered user!
        Map<String, String> registeredUsers = new LinkedHashMap<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCommands; i++) {
            String users = scanner.nextLine();
            String command = users.split("\\s+")[0];
            if (command.equals("register")) {
            String user = users.split("\\s+")[1];
            String licenceNumber = users.split("\\s+")[2];


                if (!registeredUsers.containsKey(user)) {

                    registeredUsers.put(user, licenceNumber);
                    System.out.printf("%s registered %s successfully%n", user, licenceNumber);
                } else if (registeredUsers.containsValue(licenceNumber)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licenceNumber);

                }
            } else if (command.equals("unregister")) {
                String user = users.split("\\s+")[1];

                if (!registeredUsers.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found%n", user);
                } else if (registeredUsers.containsKey(user)) {
                    registeredUsers.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);

                }
            }


        }
        registeredUsers.entrySet().forEach(entry -> {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        });
    }
}

package Exercise.MapsLambdaStreamAPI;

import java.util.*;

public class P8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> employeesIds = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String employee = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];


            if (employeesIds.containsKey(employee)) {
                employeesIds.get(employee).add(id);
            } else {
                employeesIds.put(employee, new ArrayList<>());
                employeesIds.get(employee).add(id);
            }
            input = scanner.nextLine();


        }
        employeesIds.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employees -> System.out.println("-- " + employees));
        });
    }

}

// line.entrySet().forEach(entry -> entry.getValue().remove(member));





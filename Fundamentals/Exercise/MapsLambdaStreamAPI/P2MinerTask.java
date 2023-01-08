package Exercise.MapsLambdaStreamAPI;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resourceList = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourceList.containsKey(resource)){
                resourceList.put(resource, 0);
            }
            int resourceQuantity = resourceList.get(resource);
            resourceList.put(resource, resourceQuantity + quantity);

            resource = scanner.nextLine();
        }
        resourceList.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

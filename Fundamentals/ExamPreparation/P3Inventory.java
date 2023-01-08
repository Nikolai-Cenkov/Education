package ExamPreparation.ExamPreparation1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> metalLS = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        //Collect
        //Drop - - you should remove the item from your inventory if it exists
        //Combine Items - you should check if the old item exists. If so, add the new item after the old one. Otherwise, ignore the command.
        //Renew - if the given item exists, you should change its position and put it last in your inventory.
        while (!input.equals("Craft!")) {
            String command = input.split(" - ")[0];
            switch (command) {
                case "Collect":
                    String item = input.split(" - ")[1];
                    if (!metalLS.contains(item)) {
                        metalLS.add(item);
                    }
                    break;
                case "Drop":
                    String item1 = input.split(" - ")[1];
                    metalLS.remove(item1);
                    break;
                case "Combine Items":
                    String item11 = input.split("[ \\- :]+")[2];
                    String item2 = input.split("[ \\- :]+")[3];
                    if (metalLS.contains(item11)) {
                        int index = metalLS.indexOf(item11);
                        metalLS.add(index + 1, item2);
                    }
                    break;
                case "Renew":
                    String item111 = input.split(" - ")[1];
                    if (metalLS.contains(item111)) {
                        metalLS.remove(item111);
                        metalLS.add(item111);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < metalLS.size(); i++) {
            if (i < metalLS.size() - 1){
                System.out.print(metalLS.get(i) + ", ");
            }else System.out.println(metalLS.get(i));
        }
        }


    }




package Exercise.Arrays;

import java.util.Scanner;

public class P10TreasureHunt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] treasureArr = command.split(" ");
            switch (treasureArr[0]) {
                case "Loot":
                    for (int i = 1; i < treasureArr.length; i++) {
                        boolean alreadyContains = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (treasureArr[i].equals(treasureChest[j])) {
                                alreadyContains = true;
                                break;
                            }
                        }
                        if (!alreadyContains) {
                            String newChest = treasureArr[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(treasureArr[1]);

                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfStealItem = Integer.parseInt(treasureArr[1]);
                    if (numberOfStealItem >= 0 && numberOfStealItem < treasureChest.length) {
                        for (int i = 0; i < numberOfStealItem; i++) {
                            System.out.print(treasureChest[treasureChest.length - numberOfStealItem + i]);
                            if (i != numberOfStealItem - 1) {
                                System.out.print(", ");

                            }
                        }
                        String[] tempChest = new String[treasureChest.length - numberOfStealItem];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;
                    }else if (numberOfStealItem >= 0){
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1){
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageSum = (charCounter * 1.0) / treasureChest.length;
        if (charCounter > 0){
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageSum);
        }else {
            System.out.println("Failed treasure hunt.");
        }


    }
}


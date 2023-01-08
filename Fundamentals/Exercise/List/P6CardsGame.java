package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCountDesc = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCountDesc = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

//10 20 30 40 50
//50 40 30 30 10
        while (firstCountDesc.size() != 0 && secondCountDesc.size() != 0) {
            int firstPlayerCards = firstCountDesc.get(0);
            int secondPlayerCards = secondCountDesc.get(0);
            firstCountDesc.remove(0);
            secondCountDesc.remove(0);
//20 30 40 50
//10 20 30 40
            if (firstPlayerCards > secondPlayerCards) {
                firstCountDesc.add(firstPlayerCards);
                firstCountDesc.add(secondPlayerCards);
            } else if (secondPlayerCards > firstPlayerCards) {
                secondCountDesc.add(secondPlayerCards);
                secondCountDesc.add(firstPlayerCards);
            }
        }
        if (firstCountDesc.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", sumOfIndex(secondCountDesc));
        } else if (secondCountDesc.size() == 0){
            System.out.printf("First player wins! Sum: %d", sumOfIndex(firstCountDesc));
        }

    }

    public static Integer sumOfIndex(List<Integer> cards) {
        int sum = 0;
        for (int list : cards) {
            sum += list;
        }
        return sum;
    }
}


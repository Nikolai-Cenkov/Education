package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String [] characters = scanner.nextLine().split(" ");
        String bombNumber = characters[0];
        int power = Integer.parseInt(characters[1]);
        int sum = 0;

        while (numbers.contains(bombNumber)){
            int numberIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, numberIndex - power);
            int right = Math.min(numberIndex + power, numbers.size() - 1);
//1 2 2 4 2 2 2 9
            for (int i = right; i >= left ; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());

    }
}

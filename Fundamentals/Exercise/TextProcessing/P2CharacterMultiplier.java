package Exercise.TextProcessing;

import java.util.Scanner;

public class P2CharacterMultiplier {
    private static long calculateSum(String first, String second) {
        char [] firstArr = first.toCharArray();
        char [] secondArr = second.toCharArray();

        int minLength = Math.min(first.length(), second.length());
        int maxLength = Math.max(first.length(), second.length());
        long sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += firstArr[i] * secondArr[i];
        }
        if (firstArr.length == maxLength){
            for (int i = minLength; i < maxLength ; i++) {
                sum += firstArr[i];
            }
        }else {
            for (int i = minLength; i < maxLength ; i++) {
                sum += secondArr[i];

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] line = scanner.nextLine().split(" ");
        String first = line[0];
        String second = line[1];
        long result = calculateSum(first, second);
        System.out.println(result);
    }
}

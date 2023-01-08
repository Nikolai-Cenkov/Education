package Exercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int removeSumElements = 0;

        while (sequenceOfNumbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= sequenceOfNumbers.size() - 1) {
                int removedElement = sequenceOfNumbers.get(index);
                removeSumElements += removedElement;
                sequenceOfNumbers.remove(index);
                modifyList(sequenceOfNumbers, removedElement);


            }else if (index < 0){
                int firstElement = sequenceOfNumbers.get(0);
                removeSumElements += firstElement;
                sequenceOfNumbers.remove(0);
                int lastElement = sequenceOfNumbers.get(sequenceOfNumbers.size() - 1);
                sequenceOfNumbers.add(0, lastElement);
                modifyList(sequenceOfNumbers,firstElement);
            }else if (index > sequenceOfNumbers.size() - 1){
                int lastElement = sequenceOfNumbers.get(sequenceOfNumbers.size() -1);
                removeSumElements += lastElement;
                sequenceOfNumbers.remove(sequenceOfNumbers.size() - 1);
                int firstElement = sequenceOfNumbers.get(0);
                sequenceOfNumbers.add(firstElement);
                modifyList(sequenceOfNumbers,lastElement);
            }
        }
        System.out.println(removeSumElements);
    }


    public static void modifyList(List<Integer> sequenceOfNumbers, int removedElement) {
        for (int indexList = 0; indexList <= sequenceOfNumbers.size() - 1; indexList++) {
            int currentNumber = sequenceOfNumbers.get(indexList);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            sequenceOfNumbers.set(indexList, currentNumber);

        }
    }
}






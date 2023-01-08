package Lab.MapsLambdAandStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> countNumbers = new TreeMap<>();

        for (int num : numbersArr) {
            if (!countNumbers.containsKey(num)){
                countNumbers.put(num , 1);
            }else {
            int value = countNumbers.get(num);
                countNumbers.put(num, value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countNumbers.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }


    }

}

//TreeMap<Integer, Integer> countMap = new TreeMap<>();
//        for (int num : numbersArr) {
//            countMap.putIfAbsent(num, 0);
//            countMap.put(num, countMap.get(num) + 1);
//
////            if (!countMap.containsKey(num)) {
////                countMap.put(num, 0);
////            }
////            int value = countMap.get(num);
////            countMap.put(num, value + 1);
//
////            if (!countMap.containsKey(num)) {
////                countMap.put(num, 1);
////            } else {
////                int value = countMap.get(num);
////                countMap.put(num, value + 1);

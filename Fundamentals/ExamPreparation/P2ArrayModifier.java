package ExamPreparation.ExamPreparation1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// int [] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] lineArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(input.split("\\s+")[1]);
                    int index2 = Integer.parseInt(input.split("\\s+")[2]);
                    int element1 = lineArr[index1];
                    int element2 = lineArr[index2];
                    lineArr[index1] = element2;
                    lineArr[index2] = element1;


                    break;
                case "multiply":
                    int index11 = Integer.parseInt(input.split("\\s+")[1]);
                    int index22 = Integer.parseInt(input.split("\\s+")[2]);
                    int element11 = lineArr[index11];
                    int element22 = lineArr[index22];
                    int result = element11 * element22;
                    lineArr[index11] = result;


                    break;
                case "decrease":
                    for (int i = 0; i < lineArr.length ; i++) {
                        lineArr[i] = lineArr[i] - 1;
                    }


                    break;
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < lineArr.length; i++) {
            if (i < lineArr.length - 1 ){
                System.out.printf(lineArr[i] + ", ");
            }else {
                System.out.println(lineArr[i]);
            }

        }



    }
}

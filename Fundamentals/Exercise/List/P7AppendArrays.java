package Exercise.List;

import java.security.AllPermission;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Making arrays!
        //2.Separate the value!
        //3.Order the arrays from the last to the first and their values from left to right.
        String input = scanner.nextLine();
        List <String> listSeparated = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(listSeparated);

        System.out.println(listSeparated.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));

    }
}
//1 2 3 |4 5 6 |  7  8
//[  7  8, 4 5 6 , 1 2 3 ]
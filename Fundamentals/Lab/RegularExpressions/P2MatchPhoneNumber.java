package Lab.RegularExpressions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(input);

        List<String> matchesPhones = new ArrayList<>();
        while (phoneMatcher.find()){
            matchesPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchesPhones));
    }
}

package Lab.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[]A-Z][a-z]{2})\\2(?<year>[\\d]{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(input);

        while (dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");
        System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }


    }
}

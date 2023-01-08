package Exercise.MapsLambdaStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> studentPoints = new LinkedHashMap<>();
        Map<String, Integer> useLanguage = new LinkedHashMap<>();

        while (!input.equals("exam finished")){
            String[] inputLine = input.split("-");
            String student = input.split("-")[0];
            if (inputLine.length == 3) {
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                if (input.contains("banned")) {
                    studentPoints.remove(student);
                }

                if (!studentPoints.containsKey(student)) {
                    studentPoints.put(student, points);
                } else {
                    int currentPoint = studentPoints.get(student);
                    if (points > currentPoint) {
                        studentPoints.put(student, points);
                    }
                }
                if (!useLanguage.containsKey(language)) {
                    useLanguage.put(language, 1);
                } else {
                    int languageCount = useLanguage.get(language);
                    useLanguage.put(language, languageCount + 1);
                }
            }else {
                studentPoints.remove(student);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        studentPoints.entrySet()
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        useLanguage.entrySet()

                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
//   System.out.println("Results:");
//        userPoints.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
//
//        System.out.println("Submissions:");
//        languageCount.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
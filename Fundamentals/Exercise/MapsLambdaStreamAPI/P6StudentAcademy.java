package Exercise.MapsLambdaStreamAPI;

import java.util.*;

public class P6StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(student)) {
                studentsGrade.put(student, new ArrayList<>());
            }
            studentsGrade.get(student).add(grade);
        }

        Map<String, Double> averageStudent = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrade = entry.getValue();
            double averageGrade = getAverage(listGrade);
            if (averageGrade >= 4.50) {
                averageStudent.put(studentName, averageGrade);
            }
        }
        averageStudent.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));


    }

    public static Double getAverage(List<Double> listGrade) {
        double averageGrade = 0;
        for (double grade : listGrade) {
            averageGrade += grade;
        }
        return averageGrade / listGrade.size();
    }
}





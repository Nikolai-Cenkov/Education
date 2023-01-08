package Exercise.MapsLambdaStreamAPI;

import java.util.*;

public class P5Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Make input! - ok
        //2.Make Map! - ok
        //3.Make loop!  ok
        //4.Maka Print!

        String input = scanner.nextLine();
        Map<String, List<String>> registeredStudents = new LinkedHashMap<>();

        while (!input.equals("end")){

            String course = input.split(" : ")[0];
            String students = input.split(" : ")[1];

            if (!registeredStudents.containsKey(course)){
                registeredStudents.put(course, new ArrayList<>());
            }
            registeredStudents.get(course).add(students);

            input = scanner.nextLine();
        }
        registeredStudents.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
//urses.entrySet()
//                .forEach(entry -> {
//                    //key: име на курса
//                    //value: списък с хората
//                    //име на курса -> бр. хората
//                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
//                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
//                    //ascending order / нарастващ ред
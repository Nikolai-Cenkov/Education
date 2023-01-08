package Exercise.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesPlayers = scanner.nextLine();
        List<String> names = Arrays.stream(namesPlayers.split(", ")).collect(Collectors.toList());

        Map<String, Integer> raceDistances = new LinkedHashMap<>();
        names.forEach(name -> raceDistances.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);

            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {
                int currentDistance = raceDistances.get(racerName.toString());
                raceDistances.put(racerName.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        List<String> top3Names = raceDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // сортирали сме по value (дистанция) в намаляващ ред
                .limit(3) //оставяме само първите 3 записа
                .map(entry -> entry.getKey()) //на всеки от трите записа взимаме ключа (име на играча)
                .collect(Collectors.toList()); // {"George", "Peter", "Tom"}

        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));


        // int count = 1;
        //     for (Map.Entry<String, Integer> pair : raceDistances.entrySet()){
        //        if (count == 1 ){
        //          System.out.println("1st place: " + pair.getKey());
        //        count++;
        //   }else if (count == 2){
        //     System.out.println("2nd place: " + pair.getKey());
        //    count++;
        // }else if (count == 3){
        //   System.out.println("3rd place: " + pair.getKey());
        //  break;
        //  }
//}


    }
}

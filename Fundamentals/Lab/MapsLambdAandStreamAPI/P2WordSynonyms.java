package Lab.MapsLambdAandStreamAPI;

import java.util.*;

public class P2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.White input!
        //2.Make maps, who holds the synonyms!
        //3.Make a loop!

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordSynonyms.containsKey(word)){
                wordSynonyms.put(word, new ArrayList<>());
            }
            wordSynonyms.get(word).add(synonym);

            }
            for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()){
                System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));



        }

    }
}

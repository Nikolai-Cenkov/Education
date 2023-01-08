package Exercise.TextProcessing;

import java.util.Scanner;

public class P3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //C:\Internal\training-internal\Template.pptx
        String text = scanner.nextLine();
        String [] input = text.split("\\\\");
        String file = input[input.length - 1];
        String [] nameExtension = file.split("\\.");
        String name = nameExtension[0];
        String extension = nameExtension[1];
        System.out.printf("File name: %s%n", name );
        System.out.printf("File extension: %s%n", extension );
        }
    }


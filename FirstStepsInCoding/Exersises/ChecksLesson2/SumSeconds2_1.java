package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class SumSeconds2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int f = Integer.parseInt(scanner.nextLine());
       int s = Integer.parseInt(scanner.nextLine());
       int t = Integer.parseInt(scanner.nextLine());

       int totalTime = f + s + t;
       int min = totalTime / 60;
       int sec = totalTime % 60;
       if (sec < 10){
           System.out.printf("%d:0%d", min , sec);
       }else {
           System.out.printf("%d:%d", min, sec);
       }





    }
}

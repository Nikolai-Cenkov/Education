package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class Repainting1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int naylon = Integer.parseInt(scanner.nextLine());
       int paint = Integer.parseInt(scanner.nextLine());
       int thinner = Integer.parseInt(scanner.nextLine());
       int hours = Integer.parseInt(scanner.nextLine());
       double naylonPrice = (naylon + 2) * 1.50;
       double paintPrice = (paint + paint * 10 / 100.00) * 14.50;
       double thinnerPrice = thinner * 5;
       double totalPrice = naylonPrice + paintPrice + thinnerPrice + 0.40;
        double workman = (totalPrice * 30 / 100) * hours;
       totalPrice = totalPrice + workman;
        System.out.println(totalPrice);


}
}


package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class OldBooks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameBook = scanner.nextLine();
        int bookCounter = 0;
        boolean isFound = false;
        String input = scanner.nextLine();

        while (!input.equals("No More Books")) {
            if (input.equals(nameBook)) {
                isFound = true;
                break;
            }
            bookCounter++;
            input = scanner.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", bookCounter);

        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);

        }
    }

}



//        if (foundBook.equals(nameBook)){
//            System.out.printf("You checked %d books and found it.", bookCounter);
//        }else {
//            System.out.println("The book you search is not here!");
//            System.out.printf("You checked %d books.", bookCounter);
//        }

package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class HotelRoom7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String mount = scanner.nextLine();
        int countNight = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;

        if (mount.equals("May") || mount.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (countNight > 7 && countNight <= 14) {
                priceStudio = priceStudio - priceStudio * 0.05;
            } else if (countNight > 14) {
                priceStudio = priceStudio - priceStudio * 0.30;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        }
        else if (mount.equals("June") || mount.equals("September")){
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (countNight > 14){
                priceStudio = priceStudio - priceStudio * 0.20;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        }
        else  {
            priceStudio = 76;
            priceApartment = 77;
            if (countNight > 14) {
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        }
        System.out.printf("Apartment: %.2f lv. %n",countNight * priceApartment);
        System.out.printf("Studio: %.2f lv.",countNight * priceStudio);

        }
    }




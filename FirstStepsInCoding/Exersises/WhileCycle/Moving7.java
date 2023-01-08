package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class Moving7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * length * height;
        int box = 0;

        while (freeSpace >= box){
            String boxes = scanner.nextLine();
            if (boxes.equals("Done")){
                break;
            }
            int boxess = Integer.parseInt(boxes);
            box += boxess;
        }
        if (box > freeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", box - freeSpace);
        }else {
            System.out.printf("%d Cubic meters left.", freeSpace - box);
        }
    }
}

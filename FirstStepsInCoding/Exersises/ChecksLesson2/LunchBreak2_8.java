package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class LunchBreak2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int LaunchBreak = Integer.parseInt(scanner.nextLine());
        double timeLaunch = LaunchBreak * 0.125;
        double relaxTime = LaunchBreak * 0.25;
        double totalTime = episode + timeLaunch + relaxTime;
        double timeLeft = Math.abs(LaunchBreak - totalTime);
        if (LaunchBreak >= totalTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name , Math.ceil(timeLeft));
        }




    }
}

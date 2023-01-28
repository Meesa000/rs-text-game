import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        charCreation();
        firemakingFishingTutorial();
    }

    //character creation method
    public static void charCreation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to runescape!");
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

        System.out.println("Welcome to the world of runescape, " + playerName + "!");
    }

    public static void firemakingFishingTutorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My name is Brianna! Here's an axe and a tinderbox, cut a nearby tree!");

        boolean keepAsking = true;

        while (keepAsking) {
            System.out.println("You see a nearby tree, do you want to cut it? (Y/N)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                System.out.println("You swing your axe at the tree.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You receive 1 log");
                keepAsking = false;
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("You decided not to cut the tree.");
            }
        }
        System.out.println("Brianna: Great! Use your tinderbox on the logs to create fire.");

        boolean keepAsking3 = true;
        while (keepAsking3) {
            System.out.println("Press 1 to use your tinderbox to light the logs.");
            String lightLogs = scanner.nextLine();

            if (lightLogs.equals("1")) {
                System.out.println("Lighting the logs...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You create a fire!");
                keepAsking3 = false;
            } else {
                System.out.println(lightLogs + " is an invalid choice.");
            }
        }
    }
}
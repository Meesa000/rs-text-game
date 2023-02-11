import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        charCreation();
        firemakingFishingTutorial();
        briannaCooking();
        System.out.println("You will now move on to the next segment of the tutorial.");
        breadMake();
    }

    //character creation method
    public static void charCreation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to runescape!");
        System.out.println("What is your name, adventurer?");
        String playerName = scanner.nextLine(); //user inputs their char name

        System.out.println("Loading Tutorial island...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nWelcome to the world of runescape, " + playerName + "!");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void firemakingFishingTutorial() { //firemaking and fishing skill on tutorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBrianna: My name is Brianna! Here's an axe and a tinderbox, cut a nearby tree!");

        boolean keepAsking = true; //if this remains true, it will keep asking if you want to cut the tree

        while (keepAsking) { //while loop to keep asking if user wants to cut the tree
            System.out.println("You see a nearby tree, do you want to cut it? (Y/N)");
            String input = scanner.nextLine(); //user input to cut a tree

            if (input.equalsIgnoreCase("y")) { //if user input is y
                System.out.println("You swing your axe at the tree."); //print this
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace(); //timer for 1 second to simulate rs cutting tree
                }
                System.out.println("You receive 1 log"); //user receives 1 log, then can choose to light it by pressing 1
                keepAsking = false;

            } else if (input.equalsIgnoreCase("n")) { //but if they input n, they dont cut tree
                System.out.println("\nYou decided not to cut the tree.");
            }
        }
        System.out.println("\nBrianna: Great! Use your tinderbox on the logs to create fire.");

        boolean keepAsking2 = true;
        while (keepAsking2) {
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
                keepAsking2 = false;
            } else {
                System.out.println(lightLogs + " is an invalid choice.");
                System.out.println("Brianna: This is a tutorial, you must light it.");
            }
        }
    }

    public static void briannaCooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBrianna: Now that you know how to make a fire, take this fishing net.");
        System.out.println("Brianna hands you a fishing net");
        System.out.println("\nGo to the river and fish some shrimps, then cook it on the fire you made.");
        boolean keepAsking3 = true;

        while (keepAsking3) {

            System.out.println("Fish at the river? (Y/N)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                System.out.println("You cast out your net...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You caught some shrimp!");
                keepAsking3 = false;

            }


        }


    }

    public static void breadMake() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chef: It's time for you to learn how to make bread!");
        System.out.println("First pick up the flour, pour some water on it and then cook it on the range");

        boolean keepAsking = true;

        while (keepAsking){

            System.out.println("Press 1 to take the flour: ");
            String playerChoice = scanner.nextLine();


            if (playerChoice.equalsIgnoreCase("1") ){
                System.out.println("You take the flour.");
                keepAsking = false;
            }else {
                System.out.println(playerChoice + " is not a valid input.");

            }
        }


    }
}


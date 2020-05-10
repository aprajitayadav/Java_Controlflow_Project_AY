package Project;

import java.util.*;

import jdk.internal.agent.resources.agent;

public class Main {

    public static void main(String[] args) {

        AsciiChars.printNumbers();
        AsciiChars.printUpperCaseLetters();
        AsciiChars.printLowerCaseLetters();
        String answer2 = "N";
        Integer magicmax = 75;
        Integer lottemax = 65;
        Integer jersey = 0;
        Integer magic = 0;
        Integer lot1 = 0;
        Integer lot2 = 0;
        Integer lot3 = 0;
        Integer lot4 = 0;
        Integer lot5 = 0;
        Integer luckynum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?   ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        System.out.println("Do you wish to continue to the interactive portion?");
        String answer = scanner.next();
        switch (answer) {
            case "yes":
            case "Yes":
            case "YES":
            case "y":
            case "Y":
                System.out.println("Happy to continue!. Please provide your response to the below questions...");
                break;
            case "no":
            case "No":
            case "NO":
            case "n":
            case "N":
                System.out.println("Thank You for visiting!");
                break;
            default:
                System.out.println("Please try again later!");
                return;
        }

        do {
            System.out.println("Do you have a red car?(yes or No)");
            String car = scanner.next();
            System.out.println("Write the name of your fav pet :");
            String pet = scanner.next();
            System.out.println("Write the age of your favorite pet :");
            int age = scanner.nextInt();
            System.out.println("What is your lucky number?");
            luckynum = scanner.nextInt();
            System.out.println("Do you have a favorite quarterback?(yes or No)");
            String quarter = scanner.next();
            switch (quarter) {
                case "yes":
                case "Yes":
                case "YES":
                case "y":
                case "Y":
                    System.out.println("Great!, What is your jersey number?");
                    jersey = scanner.nextInt();
                    break;
                case "no":
                case "No":
                case "NO":
                case "n":
                case "N":
                    break;
                default:
                    break;
            }
            System.out.println("What is two-digit model year of your car?");
            int model = scanner.nextInt();
            System.out.println("What is the first name of your favorite actor or actress?");
            String actor = scanner.next();
            System.out.println("Enter a random number between 1 and 50.");
            int random = scanner.nextInt();

            System.out.println("Just a momment while we generate the magic ball and lottery numbers for you!");

            // Generate random number - Start
            Random rand = new Random();
            int rand_int1 = rand.nextInt(75);
            // Generate random number - End

            // Generate magic ball number - Start
            if (jersey != 0) {
                magic = rand_int1 * jersey;
                if (magic > 75) {
                    do {
                        magic = magic - 75;
                    } while (magic > 75);
                }
            } else {
                magic = rand_int1 * luckynum;
                if (magic > 75) {
                    do {
                        magic = magic - 75;
                    } while (magic > 75);
                }
            }
            // Generate magic ball number - End

            // Generate lottery numbers - Start
            // lottery numbers - 01
            char charAtthree = pet.charAt(2);
            lot1 = (int) charAtthree;

            // lottery numbers - 02
            lot2 = luckynum + model;

            // lottery numbers - 03
            char actorAtone = actor.charAt(0);
            lot3 = (int) actorAtone;

            // lottery numbers - 04
            lot4 = age + model;

            // lottery numbers - 05
            lot5 = jersey + age + luckynum;

            System.out.println("Lottery numbers: " + lot1 + ", " + lot2 + ", " + lot3 + ", " + lot4 + ", " + lot5
                    + " Magic ball: " + magic);

            // Generate lottery numbers - End

            jersey = 0;
            magic = 0;
            lot1 = 0;
            lot2 = 0;
            lot3 = 0;
            lot4 = 0;
            lot5 = 0;
            luckynum = 0;

            System.out.println("Do you wish to generate another set of numbers?");
            answer2 = scanner.next();
            switch (answer2) {
                case "yes":
                case "Yes":
                case "YES":
                case "y":
                case "Y":
                    System.out.println("Great!. Please provide your response to the below questions...");
                    break;
                case "no":
                case "No":
                case "NO":
                case "n":
                case "N":
                    System.out.println("Thank You for visiting, have a lovely day!");
                    return;
                default:
                    System.out.println("Please come back again later!");
                    break;
            }
        } while ((answer2 != "Yes") || (answer2 != "YES") || (answer2 != "yes") || (answer2 != "Y")
                || (answer2 != "y"));
    }
};

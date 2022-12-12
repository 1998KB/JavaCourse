package Chapter2;

import java.util.Scanner;

public class CompleteSentence {
    public static void main(String arg[]){

        System.out.println("Complete the following sentence: 'On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee.'");

        System.out.println("Enter an adjective: ");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();

        System.out.println("Enter a season of the year: ");
        String season = scanner.nextLine();

        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}

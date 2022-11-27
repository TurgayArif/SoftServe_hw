import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        var randomNum = random.nextInt(100);

        System.out.println("I picked a random number between 0 and 99. Can you guess it?");

        var userInput = sc.nextInt();
        var count = 9;
        var guesses = 10;

        for (int i = 1; i < guesses; i++) {

            if (userInput == randomNum) {
                System.out.println("Congrats! You guessed it! The number was: " + randomNum);
                break;
            }

            if (userInput < randomNum) {
                System.out.println("The number that I picked is higher than " + userInput +
                        "\nYou have " + count + " guesses left!");
                userInput = sc.nextInt();
            }

            if (userInput > randomNum) {
                System.out.println("The number that I picked is lower than " + userInput);
                System.out.println("You have " + count + " guesses left!");
                userInput = sc.nextInt();
            }

            if (i == (guesses - 1) && userInput != randomNum) {
                System.out.println("Sorry! Good luck next time!");
            }

            count -= 1;
        }
    }
}

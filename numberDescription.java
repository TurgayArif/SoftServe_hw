import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize Scanner to scan inputs from console
        Scanner sc = new Scanner(System.in);

        //Message to user to enter an integer
        System.out.print("Enter any integer: ");

        // Read the user input and assign it to variable
        var input = sc.nextLine();

        try {
            // Loop while the input is an integer using regex to check if the input matches any positive or negative integer
            while (!input.matches("-?\\d+")) {
                // Check if the user input is blank and give them a chance to enter something
                if (input.isBlank()) {
                    System.out.print("You have to enter something. :)\n Let's try this again! \n Please enter any integer: ");
                    input = sc.nextLine();
                }
                //Check if the user input is not an integer and give them a chance to enter integer
                if (input.matches("\\D+")) {
                    System.out.print("Please enter integers only!\n Enter any integer: ");
                    input = sc.nextLine();
                }
            }

            /*
            Assign the length of the input to variable
            Check if the input is negative number, if the input is negative number take 1 from length
            Use switch statement to convert the length numbers to words
             */
            var inputLength = Integer.toString(input.length());
            if(Integer.parseInt(input) < 0) {
                inputLength = Integer.toString((input.length() -1));
            }
            switch (inputLength) {
                case "1" -> inputLength = "one";
                case "2" -> inputLength = "two";
                case "3" -> inputLength = "three";
                case "4" -> inputLength = "four";
                case "5" -> inputLength = "five";
                case "6" -> inputLength = "six";
                case "7" -> inputLength = "seven";
                case "8" -> inputLength = "eight";
                case "9" -> inputLength = "nine";
                case "10" -> inputLength = "ten";
            }

            // Check if the user input is 0 and print message
            if (Integer.parseInt(input) == 0) {
                System.out.println("You entered a zero.");
            } else if (Integer.parseInt(input) < 0) { // Check if the user input is negative number and print message
                System.out.println("You entered a " + inputLength + "-digit " + "negative number.");
            } else { // Otherwise the input is positive number and print message
                System.out.println("You entered a " + inputLength + "-digit " + "positive number.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
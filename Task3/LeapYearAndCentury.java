import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an year: ");

        var input = sc.nextLine();

        // Loop while the input is an correct year using regex to check if the input matches any positive integer
        while (!input.matches("-?\\d+")) {
            // Check if the user input is blank and give them a chance to enter something
            if (input.isBlank()) {
                System.out.print("You have to enter something. :)\n Let's try this again! \n Please enter correct year: ");
                input = sc.nextLine();
            }
            //Check if the user input is not an integer and give them a chance to enter integer
            if (input.matches("\\D+")) {
                System.out.print("Please enter integers only!\n Enter correct year: ");
                input = sc.nextLine();
            }
        }


        // Check if the input is equal to 0 and return proper message
        if (Integer.parseInt(input) == 0) {
            System.out.println("There is no year 0! You can check https://en.wikipedia.org/wiki/Year_zero, for more information! \n " +
                    "Please enter correct year: ");
            input = sc.nextLine();
        }

        // Check if the input is negative number and return proper message
        if (Integer.parseInt(input) < 0) {
            System.out.println("An year can't be a negative integer!\n" +
                    "Please enter correct year: ");
            input = sc.nextLine();
        }

        System.out.println("You entered year " + input);

        // Check if the input is leap year and return in which century is it
        if(leapYear(Integer.parseInt(input))) {
            System.out.println("Year " + input + " is a leap year and is in " + centuryFromYear(Integer.parseInt(input)) + " century!");
        } else {
            System.out.println("Year " + input + " is not a leap year and is in " + centuryFromYear(Integer.parseInt(input)) + " century!");
        }




    }

    // Method to check if the input year is leap year
    public static boolean leapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return the century from given year
    public static int centuryFromYear(int year) {
        if (year >= 1 && year <= 100) {
            return 1;
        } else {
            return (year / 100) + 1;
        }
    }

}

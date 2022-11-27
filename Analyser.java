
import java.util.Scanner;

public class Analyser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder result = new StringBuilder();

        int count = 0;

        if (input.equals("0")){
            result.append("neutral");
        } else if ( input.charAt(0) == '-'){
            result.append("negative ");
            count = input.length() -1;
        } else {
            result.append("positive ");
            count = input.length();
        }

        //switch case checks for number of digits

        switch (count){
            case 1: result.append("one-digit");
            break;
            case 2: result.append("two-digit");
            break;
            case 3: result.append("three-digit");
            break;
            case 4: result.append("four-digit");
            break;
            case 5: result.append("five-digit");
            break;
            case 6: result.append("six-digit");
            break;
            case 7: result.append("seven-digit");
            break;
        }


        System.out.println(result);

    }
}

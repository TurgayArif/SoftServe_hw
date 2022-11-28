import java.util.Scanner;

public class YearsCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year = Integer.parseInt(scan.nextLine());


       if (year >= 400){
           if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
       } else {
           if (year % 4 == 0 && year % 100 != 0){
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
       }
    }
}

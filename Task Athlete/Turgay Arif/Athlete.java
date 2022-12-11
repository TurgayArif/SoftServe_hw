import java.util.Locale;
import java.util.Scanner;

public class Athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the kilometers that the athlete will run first day:");

        double km = sc.nextDouble();

        var daysToTwenty = 1;
        var daysToHundred = 1;

        var increaseDailyRate = 0.1;

        var totalDistance = km;
        do {
            if (km <= 20) {
                daysToTwenty++;
            }
            km += (km * increaseDailyRate);

            if (totalDistance <= 100) {
                daysToHundred++;
            }
            totalDistance += km;
        } while (km <= 20 || totalDistance <= 100);

        System.out.printf("Days to 20 km: %d %nDays to 100 km. total distance: %d", daysToTwenty, daysToHundred);
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the kilometers that the athlete will run first day:");

        double km = sc.nextDouble();

        var daysToTwenty = 2;
        var daysToHundred = 2;

        var increaseDailyRate = 0.1;

        var totalDistance = 0;
        do {
            km += (km * increaseDailyRate);
            totalDistance += km;
            if (km < 20) {
                daysToTwenty++;
            }
            if (totalDistance < 100) {
                daysToHundred++;
            }
        } while (totalDistance < 100);

        System.out.printf("Days to 20 km: %d %nDays to 100 km. total distance: %d", daysToTwenty, daysToHundred);
    }
}

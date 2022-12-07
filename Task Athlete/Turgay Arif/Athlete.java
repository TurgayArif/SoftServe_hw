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
        System.out.printf(String.format(Locale.US,"Day: %d | %.2f km. %n", 1, km));
        do {
            km += (km * increaseDailyRate);
            System.out.printf(String.format(Locale.US,"Day: %d | %.2f km. %n", daysToHundred, km));
            if (km < 20) {
                daysToTwenty++;
            }
            if (km < 100) {
                daysToHundred++;
            }
        } while (km < 100);

        System.out.printf("Days to 20 km: %d %nDays to 100 km: %d", daysToTwenty, daysToHundred);
    }
}

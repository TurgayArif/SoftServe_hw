import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country bg = new Country("Bulgaria");

        bg.addCity("Varna");
        bg.addCity("Sofia");
        bg.addCity("Pleven");
        bg.addCity("Ruse");

        Country en = new Country("England");
        en.addCity("London");
        en.addCity("Manchester");

        Country ua = new Country("Ukraine");
        ua.addCity("Kiev");
        ua.addCity("Lviv");

        Country usa = new Country("United States Of America");
        usa.addCity("New York");
        usa.addCity("Vashington");
        usa.addCity("Los Angelis");

        Map<Country, ArrayList<City>> dict = new HashMap<>();
        dict.put(bg, bg.citiesCopy());
        dict.put(en, en.citiesCopy());
        dict.put(ua, ua.citiesCopy());
        dict.put(usa, usa.citiesCopy());


        System.out.print("Type some city: ");

        var userInput = sc.nextLine();


        for (Map.Entry<Country, ArrayList<City>> entry : dict.entrySet()) {
            var temp = entry.getValue();
            for (City c : temp) {
                if (userInput.equalsIgnoreCase(c.getName())) {
                    System.out.println(userInput + " is city in " + entry.getKey().getName());
                }
            }
        }

    }
}

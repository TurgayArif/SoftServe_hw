import java.util.*;

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

        List<Country> countryList = new ArrayList<>();
        countryList.add(bg);
        countryList.add(en);
        countryList.add(ua);
        countryList.add(usa);
        System.out.print("Type some city: ");

        var userInput = sc.nextLine();

        for (Country c : countryList) {
            var citiesList = c.citiesCopy();
            for (City c1 : citiesList) {
                if (userInput.equalsIgnoreCase(c1.getName())) {
                    System.out.println(userInput + " is city in " + c.getName());
                    break;
                }
            }
        }
    }
}
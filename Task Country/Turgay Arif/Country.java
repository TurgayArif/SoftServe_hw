import java.util.Locale;

public class Country {
    private final String name;
    private String continent;
    private int population;
    private double area;

    enum Continents {
        EUROPE("Europe"),
        ASIA("Asia"),
        AFRICA("Africa"),
        AUSTRALIA("Australia"),
        SOUTH_AMERICA("South America"),
        NORTH_AMERICA("North America"),
        ANTARCTICA("Antarctica");

        private final String displayName;
        Continents(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return this.displayName;
        }
    }

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setContinent(String continent) {
        for (Continents c : Continents.values()) {
            if (continent.equalsIgnoreCase(c.displayName)) {
                this.continent = continent;
                return;
            }
        }
        System.out.println("You entered a non-existing continent!");
    }

    public void display() {
        if (this.continent == null) {
            System.out.println("You need to set continent to the country!");
            return;
        }
        if (this.area == 0) {
            System.out.println("You need to set area to the country!");
            return;
        }
        System.out.printf("Name: %s%n" +
                "Continent: %s%n" +
                "Population: %,d%n" +
                "Area: %,.2f square km.", name, continent, population, area);
    }

    private double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static void compareTwoCountriesByArea(Country c1, Country c2){
        if(c1.getArea() == 0 || c2.getArea() ==0) {
            System.out.println("The area is 0.");
            return;
        } else if(c1.getArea() > c2.getArea()){
            System.out.printf(String.format(Locale.US, "%s is bigger than %s. %n" +
                    "Area of %s is: %,.2f square km.%n" +
                    "Area of %s is: %,.2f square km.%n", c1.name, c2.name, c1.name, c1.getArea(), c2.name, c2.getArea()));
            return;
        }
        System.out.printf(String.format(Locale.US, "%s is bigger than %s. %n" +
                "Area of %s is: %,.2f square km.%n" +
                "Area of %s is: %,.2f square km.%n", c2.name, c1.name, c2.name, c2.getArea(), c1.name, c1.getArea()));
    }
}


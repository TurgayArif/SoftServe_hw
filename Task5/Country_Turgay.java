import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;
    private List<City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<City> citiesCopy() {
        return new ArrayList<>(cities);
    }

    public void addCity(String cityName) {
        cities.add(new City(cityName));
    }

    @Override
    public String toString() {
        return this.name;
    }
}

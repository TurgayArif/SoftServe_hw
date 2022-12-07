public class Main {
    public static void main(String[] args) {

        Country bulgaria = new Country("Bulgaria", 6899000);
        bulgaria.setArea(110994);
        Country moldova = new Country("Moldova", 2574000);
        moldova.setArea(33846);

        Country.compareTwoCountriesByArea(bulgaria, moldova);

        bulgaria.display();

        bulgaria.setContinent("Europe");

        bulgaria.display();
    }
}

enum Continents {
    EUROPE("Europe"),
    ASIA("Asia"),
    AFRICA("Africa"),
    AUSTRALIA("Australia"),
    SOUTH_AMERICA("South America"),
    NORTH_AMERICA("North America"),
    ANTARCTICA("Antarctica");

    final String displayName;

    Continents(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
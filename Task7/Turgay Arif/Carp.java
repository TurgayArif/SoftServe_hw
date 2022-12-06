public class Carp extends Fish {
    private String color;

    public String getColor() {
        return color;
    }

    public Carp(double weight, String color) {
        setWeight(weight);
        this.color = color;
    }

    public static void createCarpFish(double weight, String color) {
        Carp carp = new Carp(weight, color);
        Fish.getFishList().add(carp);
        System.out.println("Successfully created " + carp);
    }

    @Override
    public String toString() {
        return "Carp fish\n" +
                "Weight: " + getWeight() + " kg." + "\n" +
                "Color: " + getColor();
    }
}

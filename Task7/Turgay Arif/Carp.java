public class Carp extends Fish {
    private String color;

    public String getColor() {
        return color;
    }

    public Carp(double weight, String color) {
        super(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carp fish\n" +
                "Weight: " + getWeight() + " kg." + "\n" +
                "Color: " + getColor();
    }
}

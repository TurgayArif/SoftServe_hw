public class SheatFish extends Fish {

    private int whiskerLength;

    public SheatFish(double weight, int whiskerLength) {
        super(weight);
        this.whiskerLength = whiskerLength;
    }

    public int getWhiskerLength() {
        return whiskerLength;
    }

    @Override
    public String toString() {
        return "SheatFish\n" +
                "Weight: " + getWeight() + " kg." + "\n" +
                "Whiskers length: " + getWhiskerLength() + " cm.";

    }
}

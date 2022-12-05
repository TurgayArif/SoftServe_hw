public class SheatFish extends Fish {

    private int whiskerLength;

    public SheatFish(double weight, int whiskerLength) {
        setWeight(weight);
        this.whiskerLength = whiskerLength;
    }

    public int getWhiskerLength() {
        return whiskerLength;
    }

    public static void createSheatFish(double weight, int whiskerLength) {
        SheatFish sheatFish = new SheatFish(weight, whiskerLength);
        System.out.println("Successfully created " + sheatFish);
        Fish.getFishList().add(sheatFish);
    }

    @Override
    public String toString() {
        return "SheatFish\n" +
                "Weight: " + getWeight() + " kg." + "\n" +
                "Whiskers length: " + getWhiskerLength() + " cm.";

    }
}

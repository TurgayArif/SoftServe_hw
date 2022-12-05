import java.util.ArrayList;
import java.util.List;

public class Fish {
    private double weight;
    private static List<Fish> fishList = new ArrayList<>();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected static List<Fish> getFishList() {
            return fishList;
    }

    public static int getFishListSize() {
        return fishList.size();
    }

    public static void showFishList() {
        if (fishList.size() == 0) {
            System.out.println("You need to create at least 1 fish!");
        }
        var count = 1;
        for (Fish fish : fishList) {
            System.out.println(count + ": " + fish);
            count++;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pond {

    private List<Fish> capacity;
    private enum States {
        POOR,
        NORMAL,
        RICH
    };
    private States state;

    public Pond() {
        this.capacity = new ArrayList<>();
        setState();
    }

    private void setState() {
        if (capacity.size() < 5) {
            state = States.POOR;
        } else if (capacity.size() <= 10) {
            state = States.NORMAL;
        } else {
            state = States.RICH;
        }
    }

    public void showCapacity() {
        System.out.println("The pond have " + capacity.size() + " fish in it!");
    }

    public void showState() {
        System.out.println("Current state of the Pond is: " + state.toString());
    }

    public void addFish(Fish fish) {
        capacity.add(fish);
        Fish.getFishList().remove(fish);
        System.out.println("Successfully added " + capacity.get(capacity.size()-1).toString() + " to the Pond!");
        setState();
    }

    public void lostFish() {
        if (capacity.size() == 0) {
            System.out.println("There is no more fish left in the Pond!");
            return;
        }

        Random r = new Random();
        int index = r.nextInt(capacity.size());
        var offTheHook = r.nextBoolean();
        if (!offTheHook) {
            System.out.println("Congrats! You catch " + capacity.get(index) + " from Pond!");
            capacity.remove(capacity.get(index));
            setState();
        } else {
            System.out.println("The fish gets off the hook! Better luck next time!");
        }

    }
}

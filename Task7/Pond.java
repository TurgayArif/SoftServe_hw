import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pond {

    private List<Fish> capacity;
    private States state;

    public Pond() {
        this.capacity = new ArrayList<>();
        setState();

    }

    public List<Fish> getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        this.capacity = new ArrayList<>();
    }

    public States getState() {
        return state;
    }

    private void setState() {

        if (capacity.size() < 5){
            this.state = States.poor;
        } else if (capacity.size() <=10){
            this.state = States.normal;
        } else {
            this.state = States.rich;
        }
    }

    public void obtainFish(Fish fish){

        capacity.add(fish);
        setState();
    }

    public void lostFish(){

        if (capacity.size() ==0){
            System.out.println("No more fish left");
            return;
        }

        Random r = new Random();

        int fishIndex = r.nextInt(-1, capacity.size()+1);

        System.out.println(capacity.get(fishIndex));

        capacity.remove(fishIndex);
        setState();
    }

    public void showCapacity(){
        System.out.println(this.capacity.size());
    }

    public void showState(){
        System.out.println(this.state);
    }
}

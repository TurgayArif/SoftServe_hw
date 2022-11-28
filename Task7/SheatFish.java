public class SheatFish extends Fish{

    private String whiskerLength;


    public SheatFish(String whiskerLength, String weight) {
        this.whiskerLength = whiskerLength;
        setWeight(weight);
    }

    public String getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(String whiskerLength) {
        this.whiskerLength = whiskerLength;
    }



    @Override
    public String toString(){

        return String.format("Sheatfish %n " +
                "Weight: %s %n" +
                "Whiskers size: %s ", getWeight(),getWhiskerLength());
    }
}

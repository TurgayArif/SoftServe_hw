public class MultiplicationTableBySeven {
    public static void main(String[] args) {
        int multiplier = 7;
        int sum;
        for (int i = 1; i <= 9; i++) {
            sum = i * multiplier;
            System.out.println(i + " x " + multiplier + " = " + sum);
        }
    }
}
import java.util.Scanner;

public class FishingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pond pond = new Pond();
        showMenu();

        var input = sc.nextLine();
        while (!input.equals("7")) {
            switch (input) {
                case "1" -> pond.showCapacity();
                case "2" -> pond.showState();
                case "3" -> {
                    if (Fish.getFishListSize() > 0) {
                        System.out.println("Which fish do you want to add?");
                        Fish.showFishList();
                        var fishToAdd = sc.nextLine();
                        var fish = Fish.getFishList().get(Integer.parseInt(fishToAdd) - 1);
                        pond.addFish(fish);
                    } else {
                        System.out.println("You need to create a fish!");
                    }
                }
                case "4" -> pond.lostFish();
                case "5" -> {
                    System.out.println("Sheat or carp?");
                    var type = sc.nextLine();
                    System.out.println("How many kg?");
                    var weight = sc.nextLine();
                    if (type.equalsIgnoreCase("sheat")) {
                        System.out.println("How long is its whiskers in cm? ");
                        var length = sc.nextLine();
                        SheatFish.createSheatFish(Double.parseDouble(weight), Integer.parseInt(length));
                    } else {
                        System.out.println("What color?");
                        var color = sc.nextLine();
                        Carp.createCarpFish(Double.parseDouble(weight), color);
                    }
                }
                case "6" -> showMenu();
            }
            input = sc.nextLine();
        }
    }

    public static void showMenu() {
        System.out.println("""
                \t1. Show capacity of the pond.
                \t2. Show current state of the pond.
                \t3. Add fish to the pond.
                \t4. Catch fish.
                \t5. Create fish.
                \t6. Show menu.
                \t7. Finish the game!""");
    }
}

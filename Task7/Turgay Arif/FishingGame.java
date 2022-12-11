import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FishingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pond pond = new Pond();
        List<Fish> fishList = new ArrayList<>();
        showMenu();

        var input = sc.nextLine();
        while (!input.equals("7")) {
            switch (input) {
                case "1" -> pond.showCapacity();
                case "2" -> pond.showState();
                case "3" -> {
                    if (fishList.size() > 0) {
                        System.out.println("Which fish do you want to add?");
                        for (int i = 0; i < fishList.size(); i++) {
                            System.out.println(i + ": " + fishList.get(i));
                        }
                        var fishToAdd = sc.nextLine();
                        var fish = fishList.get(Integer.parseInt(fishToAdd));
                        pond.addFish(fish);
                        fishList.remove(Integer.parseInt(fishToAdd));
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
                    if (type.equalsIgnoreCase(String.valueOf(FishType.SHEAT))) {
                        System.out.println("How long is its whiskers in cm? ");
                        var length = sc.nextLine();
                        SheatFish sheatFish = new SheatFish(Double.parseDouble(weight), Integer.parseInt(length));
                        System.out.println("You created: " + sheatFish);
                        fishList.add(sheatFish);
                    } else {
                        System.out.println("What color?");
                        var color = sc.nextLine();
                        Carp carp = new Carp(Double.parseDouble(weight), color);
                        System.out.println("You created: " + carp);
                        fishList.add(carp);
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

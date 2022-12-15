package Interfaces;

public interface IPerson {

    void work();

    default void takeABreak() {
        System.out.println("Taking a break...");
    }
}

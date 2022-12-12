package Interfaces;

import Objects.Singer;

public interface IntJukeboxFunctions {


    void mainMenu();
    void listOfSingers(String genre);
    void listOfSongs(String album);
    void listOfAlbums(String input);


    default void startJukebox(){

        System.out.println("Powering on!");

        mainMenu();
    }

}

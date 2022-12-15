package Objects;

import Interfaces.IntJukeboxFunctions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Jukebox implements IntJukeboxFunctions {

    private Map<String, List<Singer>> genres;

    public Jukebox() {
        this.genres = new HashMap<>();
    }

    public Map<String, List<Singer>> getGenres() {
        return genres;
    }




    @Override
    public void mainMenu() {

        System.out.println("""
                Please select genre:
                
                1. Rock
                2. Pop
                3. Classical music
                4. Exit""");


    }


    @Override
    public void listOfSingers(String genre) {

        System.out.println("Select singer:");
        for (Singer singer : genres.get(genre)){
            System.out.printf("%s%n", singer.getName());
        }

    }

    @Override
    public void listOfSongs(String album) {
        for (Map.Entry<String, List<Singer>>  entry: genres.entrySet()){

            for (Singer singer:entry.getValue()){
                for (Map.Entry<String, List<String>> alb : singer.getAlbums().entrySet()) {
                    if (alb.getKey().equals(album)){
                        singer.singAlbum(album);
                    }
                }

            }
        }


    }

    @Override
    public void listOfAlbums(String input) {
        System.out.println("Select album:");

        for (Map.Entry<String, List<Singer>>  entry: genres.entrySet()){

            for (Singer singer:entry.getValue()){
                if (singer.getName().equals(input)) {
                    for (Map.Entry<String, List<String>> album : singer.getAlbums().entrySet()) {
                        System.out.println(album.getKey());
                    }
                }
            }
        }

    }
}

package Objects;

import java.util.*;

public class Seeder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> fmSongs  = new ArrayList<>();
        fmSongs.add("1. Let's Turn It On");
        fmSongs.add("2. Mr. Bad Guy");
        fmSongs.add("3. My Love Is Dangerous");
        fmSongs.add("4. Living On My Own");
        fmSongs.add("5. Foolin' Around");
        Map<String, List<String>> fmAlbum = new HashMap<>();
        fmAlbum.put("Mr. Bad Guy", fmSongs);
        Singer freddyMercury = new RockSinger("Freddy Mercury",fmAlbum);

        List<String> rbSongs = new ArrayList<>();
        rbSongs.add("1. Burning down one side");
        rbSongs.add("2. Moonlight in Samosa");
        rbSongs.add("3. Pledge pin");
        rbSongs.add("4. Slow Dance");
        Map<String,List<String>> rbAlbum = new HashMap<>();
        rbAlbum.put("Pictures at Eleven", rbSongs);
        Singer robertPlant = new RockSinger("Robert Plant",rbAlbum);

        List<String> mjSongs = new ArrayList<>();
        mjSongs.add("1. Bad");
        mjSongs.add("2. Man in the mirror");
        mjSongs.add("3. I just can`t stop loving you");
        mjSongs.add("4. Liberian girl");
        Map<String, List<String>> mjAlbum = new HashMap<>();
        mjAlbum.put("Bad", mjSongs);
        Singer michaelJackson = new PopSInger("Michael Jackson", mjAlbum);

        List<String> sgSongs = new ArrayList<>();
        sgSongs.add("1. Birthday");
        sgSongs.add("2. Slow down");
        sgSongs.add("3. Stars dance");
        sgSongs.add("4. Like a champion");
        Map<String, List<String>> sgAlbum = new HashMap<>();
        sgAlbum.put("Stars dance", sgSongs);
        Singer selenaGomez = new PopSInger("Selena Gomez",sgAlbum);

        List<String> bhSongs = new ArrayList<>();
        bhSongs.add("1. Symphony No.5");
        bhSongs.add("2. Piano Sonata No.23");
        bhSongs.add("3. Moonlight Sonata");
        bhSongs.add("4. A song of joy");
        Map<String, List<String>> bhAlbum = new HashMap<>();
        bhAlbum.put("Classical music collection", bhSongs);
        Singer beethoven = new ClassicalMusicSinger("Ludwig van Beethoven",bhAlbum);

        List<String> lpSongs = new ArrayList<>();
        lpSongs.add("1. O, sole mio");
        lpSongs.add("2. A vucchella");
        lpSongs.add("3. O, Surdato");
        lpSongs.add("4. Marechiare");
        Map<String, List<String>> lpAlbum = new HashMap<>();
        lpAlbum.put("O, sole mio", lpSongs);
        Singer lucianoPavarotti = new ClassicalMusicSinger("Luciano Pavarotti",lpAlbum);

        List<Singer> classSingers = new ArrayList<>();
        classSingers.add(beethoven);
        classSingers.add(lucianoPavarotti);

        List<Singer> popSingers = new ArrayList<>();
        popSingers.add(michaelJackson);
        popSingers.add(selenaGomez);

        List<Singer> rockSingers = new ArrayList<>();
        rockSingers.add(freddyMercury);
        rockSingers.add(robertPlant);

        Jukebox jukebox = new Jukebox();
        jukebox.getGenres().put("Rock",rockSingers);
        jukebox.getGenres().put("Classical Music", classSingers);
        jukebox.getGenres().put("Pop", popSingers);

        jukebox.startJukebox();

        String input = scan.nextLine();
        while (true){

            switch (input) {
                case "1" -> jukebox.listOfSingers("Rock");
                case "2" -> jukebox.listOfSingers("Pop");
                case "3" -> jukebox.listOfSingers("Classical Music");
                case "4" -> System.exit(1);
            }

            input = scan.nextLine();
            jukebox.listOfAlbums(input);
            input = scan.nextLine();
            jukebox.listOfSongs(input);
            System.out.println();
            jukebox.mainMenu();
            input = scan.nextLine();
        }
    }
}

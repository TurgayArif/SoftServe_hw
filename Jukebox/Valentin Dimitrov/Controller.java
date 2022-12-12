import java.util.*;

public class Controller {

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

        List<String> mjSongs = new ArrayList<>();

        mjSongs.add("1. Bad");
        mjSongs.add("2. Man in the mirror");
        mjSongs.add("3. I just can`t stop loving you");
        mjSongs.add("4. Liberian girl");

        Map<String, List<String>> mjAlbum = new HashMap<>();
        mjAlbum.put("Bad", mjSongs);

        Singer michaelJackson = new PopSInger("Michael Jackson", mjAlbum);

        List<String> bhSongs = new ArrayList<>();

        bhSongs.add("1. Symphony No.5");
        bhSongs.add("2. Piano Sonata No.23");
        bhSongs.add("3. Moonlight Sonata");
        bhSongs.add("4. A song of joy");

        Map<String, List<String>> bhAlbum = new HashMap<>();
        bhAlbum.put("Classical music collection", bhSongs);

        Singer beethoven = new ClassicalMusicSinger("Ludwig van Beethoven",bhAlbum);

        List<Singer> singers = new ArrayList<>();
        singers.add(freddyMercury);
        singers.add(michaelJackson);
        singers.add(beethoven);

        Jukebox jukebox = new Jukebox(singers);

        System.out.println(jukebox.startJukebox());

    }


}

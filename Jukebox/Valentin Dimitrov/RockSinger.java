import java.util.List;
import java.util.Map;


public class RockSinger extends Singer implements Sing {

    public RockSinger(String name,  Map<String, List<String>> albums) {
        super(name, albums);
    }



    @Override
    public void singAlbum(String album) {

        System.out.println(album);

        getAlbums().get(album).forEach(System.out::println);
    }

    @Override
    public void singAll() {

        for (Map.Entry<String, List<String>> entry : getAlbums().entrySet()) {

            System.out.println(entry.getValue());
            entry.getValue().forEach(System.out::println);
            System.out.println();
        }


    }
}

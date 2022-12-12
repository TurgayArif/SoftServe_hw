import java.util.List;
import java.util.Map;

public class ClassicalMusicSinger extends Singer implements Sing{

    public ClassicalMusicSinger(String name, Map<String, List<String>> albums) {
        super(name, albums);
    }


    @Override
    public void singAlbum(String album) {

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

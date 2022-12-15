package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Singer{

    private String name;
    private Map<String, List<String>> albums;

    public Singer(String name, Map<String, List<String>> albums) {
        this.name = name;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<String, List<String>> getAlbums() {
        return albums;
    }

    public void setAlbums(Map<String, List<String>> albums) {
        this.albums = albums;
    }



    public void singAlbum(String album){
        getAlbums().get(album).forEach(System.out::println);
    }


    public void singAll(){
        for (Map.Entry<String, List<String>> entry : getAlbums().entrySet()) {

            System.out.println(entry.getValue());
            entry.getValue().forEach(System.out::println);
            System.out.println();
        }
    }
}

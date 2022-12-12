import java.util.List;
import java.util.Map;

public abstract class Singer {

    private String name;
    private List<String> repertoire;
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

    public List<String> getRepertoire() {
        return repertoire;
    }

    public Map<String, List<String>> getAlbums() {
        return albums;
    }

    public void setAlbums(Map<String, List<String>> albums) {
        this.albums = albums;
    }

    public void addSongToRepertoire(String song){

        this.repertoire.add(song);
    }
}

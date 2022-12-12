
import java.util.List;



public class Jukebox implements JukeboxFunctions{

    private List<Singer> singers;

    public Jukebox(List<Singer> singers) {
        this.singers = singers;
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }

    @Override
    public Singer selectSinger(String name) {

        return singers.stream().filter(s-> s.getName().equals(name)).findFirst().get();
    }
}

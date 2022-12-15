package Objects;



import Interfaces.Phrases;

import java.util.List;
import java.util.Map;

public class ClassicalMusicSinger extends Singer implements Phrases {

    public ClassicalMusicSinger(String name, Map<String, List<String>> albums) {
        super(name, albums);
    }



    @Override
    public void greetings() {

        System.out.println("I hope you enjoy this fine collection of classical music");
    }
}

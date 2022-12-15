package Objects;

import Interfaces.Phrases;

import java.util.List;
import java.util.Map;

public class PopSInger extends Singer implements Phrases {

    public PopSInger(String name, Map<String, List<String>> albums) {
        super(name, albums);
    }


    @Override
    public void greetings() {

        System.out.println("C`mon everybody. Let`s dance!");
    }
}



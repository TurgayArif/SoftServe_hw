package Objects;


import Interfaces.Phrases;

import java.util.List;
import java.util.Map;


public class RockSinger extends Singer implements Phrases {

    public RockSinger(String name,  Map<String, List<String>> albums)
    {
        super(name, albums);
    }



    @Override
    public void greetings() {

        System.out.println("Okay everybody! Let`s rock!");
    }
}

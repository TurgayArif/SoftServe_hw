import java.util.Optional;

public interface JukeboxFunctions {

    Singer selectSinger(String genre);

    default String startJukebox(){

        return """
                Select artist:
                1. Freddy Mercury
                2. Michael Jackson
                3. Ludvig van Beethoven
                4. Exit""";
    }
}

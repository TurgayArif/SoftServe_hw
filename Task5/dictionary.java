import java.util.*;

public class Dictionary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> bulgarianCities = new ArrayList<>();
        bulgarianCities.add("Sofia");
        bulgarianCities.add("Plovdiv");
        bulgarianCities.add("Varna");

        List<String> ukrainianCities = new ArrayList<>();
        ukrainianCities.add("Kyiv");
        ukrainianCities.add("Kharkiv");
        ukrainianCities.add("Odesa");

        Map<String,List<String>> dictionary = new HashMap<>();

        dictionary.put("Bulgaria",bulgarianCities);
        dictionary.put("Ukraine", ukrainianCities);

        String input = scan.nextLine();

        String result = "";

        result = findCity(input, dictionary);

        System.out.println(result);





    }


    public static String findCity(String input, Map<String, List<String>> countries){

        String result = "No such country in database";

        for (Map.Entry<String, List<String>> entry : countries.entrySet()){

            for (String city: entry.getValue()){

                if (city.equals(input)){
                    result = entry.getKey();
                    break;
                }
            }
        }


        return result;
    }
}

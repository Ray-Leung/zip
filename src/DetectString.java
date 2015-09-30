
/**
 * Created by Administrator on 2015/9/29.
 */
public class DetectString {
    public static String detectString(Place[] place, String input) {
        String result = null;

        if (input == null) {
            System.exit(-1);
        }
        else if (input.matches("\\d+")== true ){
            System.out.println("You asked me to search for zip code: " + input);
            result = BinarySearch.binarySearch(place, input);
            System.out.println(result);
        }

        else {
            System.out.println("You asked me to search for city: " + input);
            result = Search.Search(place, input);
            System.out.println(result);
        }

        return result;
    }

}

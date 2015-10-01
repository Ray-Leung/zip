/**
 * Created by Administrator on 2015/9/28.
 */
import java.util.*;


public class BinarySearch {

    // input the same value as what has inputted into the original Search method to search the zip using binarySearch,
    //and calculate the run time of binarySearch
    public static String binarySearch(Place[] place, String input) {
    String result = null;

        Place placeT = new Place(input,null,null);
        Arrays.sort(place);
        if(input.length() == 5) {
        long startTime = System.currentTimeMillis();
        int i =   Arrays.binarySearch(place,placeT);
            if(i < 0) {
                result = "this zip code do not exist.";
            }
            else {
                result = place[i].toString();
            }
            long endTime   = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
    }
        else {
            result = "this zip code is invalid";
        }

        return result;
    }
}

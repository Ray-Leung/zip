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

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        result = place[i].toString();
        System.out.println(totalTime);
    }

        return result;
    }
}

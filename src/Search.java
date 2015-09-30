
/**
 * Created by Administrator on 2015/9/27.
 */
public class  Search {

    //input a String using original research method to search the zip in the Place[]
    public static String Search(Place[] place, String input) {
        int leng = place.length;
        String result = null;


            long startTime = System.currentTimeMillis();

            for (int i = 0; i < leng; i++) {
                if (place[i].equalsIgnoreCase(input) == true) {
                    result = place[i].toString();
                    long endTime   = System.currentTimeMillis();
                    long totalTime = endTime - startTime;
                    System.out.println(totalTime);
                    return result;
                }
            }
        if (result == null) {
            result = "The city " + input + " " + "does not exist.";
            long endTime   = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println("run time: "+ totalTime);
        }
        return result;
    }
}


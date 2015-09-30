    /**
 * Created by Administrator on 2015/9/26.
 */
            import java.io.IOException;
            import java.util.List;

    public class Read {
        public static Place[] read() throws IOException {

            //in
           List<String> lines = Scan.Scanner();
            String[] array = lines.toArray(new String[0]);
            String[] onePlace = new String[4];
            String[] onePlace2 = new String[2];
            String[] zip = new String[array.length-1];
            String[] state = new String[array.length-1 ];
            String[] town = new String[array.length-1];
            Place[] place = new Place[array.length-1];

            for (int i = 0; i < array.length ; i++) {
                if (i == 0) continue;
                onePlace = array[i].split("\t");
                onePlace2 = onePlace[3].split(",");
                zip[i - 1] = onePlace[0];
                state[i - 1] = onePlace2[1];
                town[i - 1] = onePlace2[0];
                place[i - 1] = new Place(zip[i - 1], state[i - 1], town[i - 1]);
                }
            return place;
            }
        }

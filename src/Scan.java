/**
 * Created by Administrator on 2015/9/28.
 */
import java.io.*;
import java.util.*;

public class Scan {

    //Scan the certain file into an List<String>
    public static List  Scanner() throws IOException{
        List<String> lines = new ArrayList<String>();
        InputStream iS = null;
        BufferedReader br = null;
        String line =null;

        iS = Scan.class.getResourceAsStream("/zips.txt");
       // FileReader fr = new FileReader("src/zips.txt");
        br = new BufferedReader(new InputStreamReader(iS));
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
}

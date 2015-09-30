import javax.swing.*;

/**
 * Created by Administrator on 2015/9/27.
 */
public class Switch {

    //Input a int from Main.java switch to certain method
    public static String Switch(int input,Place[] place) {
        String result = null;

        switch (input) {

            //input YES
            case 0:
               String inputS = JOptionPane.showInputDialog("You asked me to search for zip code: ");
              //  System.out.println("You asked me to search for zip code: " + inputS);
                if (inputS == null) {
                    System.exit(0);
                }
                else {
                    result = DetectString.detectString(place, inputS);
                    return result;
                }

            //input No
            case 1:
                 result =" bye";
                return result;
            default:
                result ="bye";
                break;
        }
    return result;
    }
}

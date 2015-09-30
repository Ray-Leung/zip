import javax.swing.*;
import java.io.IOException;

/**
 * Created by Administrator on 2015/9/27.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String  input,result;
        int loop = 0;

        // calls read method
        Place[] place = Read.read();

        //get input value
            input = JOptionPane.showInputDialog("You asked me to search for zip code or city: ");

            result = DetectString.detectString(place, input);
        JOptionPane.showMessageDialog(null, result);


        // make a loop
            do {
               int in = JOptionPane.showConfirmDialog(null,  "Do you want to check again","check",JOptionPane.YES_NO_OPTION);
                // select no and call the Switch method
                //set the int loop = 1 then end the loop
                if (in == 1){
                    result = Switch.Switch(in, place);
                    System.out.println(result);
                    loop=1;
                }
                //select yes and call the switch method
                // search go on
                  else if (in == 0) {
                        result = Switch.Switch(in, place);
                        JOptionPane.showMessageDialog(null,result);

                }
            } while (loop == 0);

        //close system
         JOptionPane.showConfirmDialog(null,"BYE,SEE YOU LATER","Confirm",JOptionPane.CLOSED_OPTION);
        System.exit(-1);
    }
        }


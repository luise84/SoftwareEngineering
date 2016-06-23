import javax.swing.*;
import java.awt.*;

/**
 * Created by Thundersama on 23.06.2016.
 */
public class Field {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel field = new JPanel(new GridLayout());
        frame.add(field);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 480));
        frame.pack();
        frame.setVisible(true);
    }
}

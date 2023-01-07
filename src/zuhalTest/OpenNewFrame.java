package zuhalTest;

import javax.swing.*;
import java.awt.*;

public class OpenNewFrame {
    JFrame frame = new JFrame();
    JLabel label= new JLabel("Hello World");

    OpenNewFrame(){

        frame.setDefaultCloseOperation(3);
        frame.setSize(420,420);
        frame.setLayout(null);

        label.setBounds(0,0,250,50);
        label.setFont(new Font(Font.MONOSPACED,Font.ITALIC,25));

        frame.add(label);
        frame.setLocation(600,400);


        frame.add(label);
        frame.setVisible(true);

    }
}

package zuhalTest;

import javax.swing.*;

public class OpenNewFrame {
    JFrame frame = new JFrame();
    JLabel label= new JLabel("Hello World");

    OpenNewFrame(){

        frame.setDefaultCloseOperation(3);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.setLocation(600,400);


        frame.add(label);
        frame.setVisible(true);

    }
}

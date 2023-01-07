package zuhalTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage  implements ActionListener {
    JFrame frame = new JFrame();
    JButton btn= new JButton("New Page");
    LaunchPage(){

        frame.setDefaultCloseOperation(3);
        frame.setSize(420,420);
        frame.setLayout(null);

        btn.setBounds(100,160,200,40);
        btn.setFocusable(false);
        btn.addActionListener(this);
        frame.setLocation(600,400);


        frame.add(btn);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn){
            OpenNewFrame op= new OpenNewFrame();
        }
    }
}

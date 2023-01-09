package Hack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {

    private JComboBox comboBox;

    public ComboBox(){

        setTitle("ComboBox");
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        // takes array of objects
        String[] animals={"Cat","Dog","Horse","Bird"};

        comboBox= new JComboBox(animals);
        comboBox.addActionListener(this);


        add(comboBox);
        setLocation(500,350);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String[] args) {


        new ComboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedIndex());
            System.out.println(comboBox.getItemCount());
        }
    }
}

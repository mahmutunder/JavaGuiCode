package Hack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame  implements ActionListener {

    private JCheckBox checkBox;
    private JButton btn;

    private ImageIcon xIcon;
    private ImageIcon okIcon;
    public CheckBox(){

        setTitle("Check it");
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());


        xIcon= new ImageIcon("x.png");
        okIcon= new ImageIcon("ok.png");

        btn= new JButton();
        btn.setText("Submit");
        btn.addActionListener(this);
        checkBox= new JCheckBox();
        checkBox.setText("I' am not robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,30));
        // change images
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(okIcon);




        add(btn);
        add(checkBox);
        setLocation(500,350);
        setSize(400,250);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

        if (e.getSource()==btn){
           if (checkBox.isSelected()){
               checkBox.setText("You're not robot");
           }else{
               checkBox.setText("I'm not robot");
           }
        }


    }

    public static void main(String[] args) {
        new CheckBox();
    }

}

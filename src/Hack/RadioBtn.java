package Hack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioBtn extends JFrame implements ActionListener {

    private JRadioButton pizza;
    private JRadioButton burger;
    private  JRadioButton kebab;
    private  ButtonGroup group;
    public RadioBtn(){
        setTitle("Check it");
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        pizza=new JRadioButton("pizza");
        burger= new JRadioButton("burger");
        kebab= new JRadioButton("kebab");
        group= new ButtonGroup();
        pizza.addActionListener(this);
        burger.addActionListener(this);
        kebab.addActionListener(this);
        group.add(pizza);
        group.add(burger);
        group.add(kebab);






        add(pizza);
        add(burger);
        add(kebab);
        setLocation(500,350);
        setSize(400,250);
        setVisible(true);

    }
    public static void main(String[] args)   {
        new RadioBtn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==pizza){
            System.out.println("pizza");
        }else if(e.getSource()==burger){
            System.out.println("burger");
        }else if(e.getSource()==kebab){
            System.out.println("kebab");
        }

    }
}

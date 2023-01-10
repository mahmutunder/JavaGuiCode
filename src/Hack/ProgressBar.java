package Hack;

import javax.swing.*;
import java.awt.*;


public class ProgressBar extends JFrame {

    private JProgressBar pb;

    public ProgressBar(){

        setTitle("Progress Bar");
        setDefaultCloseOperation(3);
        setLayout(null);
        pb= new JProgressBar();
        pb.setValue(0);
        pb.setBounds(0,0,420,50);
        pb.setStringPainted(true);
        pb.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        pb.setForeground(Color.red);
        pb.setBackground(Color.black);




        add(pb);
        setLocation(500,350);
        setSize(420,250);
        setVisible(true);

        fillProgressBar();

        try {
            System.out.println("Exit");
            Thread.sleep(3000);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private void fillProgressBar()  {
        int i=0;
        while (i<=100){
            pb.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            i++;
        }
        pb.setString("Done!!");

    }

    public static void main(String[] args) {
        new ProgressBar();
        new Slider();
    }

}

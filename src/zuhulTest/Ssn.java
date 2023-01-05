package zuhulTest;

import javax.swing.*;
import java.awt.*;

public class Ssn extends JFrame {
    private JPanel ssnPanel;
    private JTextField ssn;
    private JLabel showFormat;
    private JTextField ssnShow;

    private JPanel btnPanel;
    private JButton ssnBtn;


    public Ssn(){


        setTitle("Check SSN");
        setSize(400,300);
        setDefaultCloseOperation(3);
        setLocation(600,300);
        buildSsPanel();
        buildBtnPanel();

        add(ssnPanel, BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);


        setVisible(true);
    }

    private void buildBtnPanel() {
        btnPanel=new JPanel();
        ssnBtn= new JButton("Check SSN");


        btnPanel.add(ssnBtn);
    }

    private void buildSsPanel() {
       ssnPanel=new JPanel();
        ssnPanel.setLayout(null);
       ssn= new JTextField(10);
       ssn.setBounds(100,20,200,40);

       showFormat= new JLabel();
       showFormat.setText("Enter SSN: 123456789 or 123-45-6789");
        showFormat.setBounds(100,80,200,20);
        ssnShow= new JTextField(10);
        ssnShow.setEditable(false);
        ssnShow.setBorder(null);
        ssnShow.setBackground(Color.BLACK);
        ssnShow.setForeground(Color.WHITE);
        ssnShow.setBounds(100,120,200,40);

       ssnPanel.add(ssn);
       ssnPanel.add(showFormat);
       ssnPanel.add(ssnShow);



    }


    public static void main(String[] args) {
        new  Ssn();
    }
}

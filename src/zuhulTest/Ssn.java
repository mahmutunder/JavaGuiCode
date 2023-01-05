package zuhulTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ssn extends JFrame implements ActionListener {
    private JPanel ssnPanel;
    private JTextField ssn;
    private JLabel showFormat;
    private JTextField ssnShow;

    private JPanel btnPanel;
    private JButton ssnBtn;


    public Ssn() {


        setTitle("Check SSN");
        setSize(400, 300);
        setDefaultCloseOperation(3);
        setLocation(600, 300);
        buildSsPanel();
        buildBtnPanel();

        add(ssnPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

    private void buildBtnPanel() {
        btnPanel = new JPanel();
        ssnBtn = new JButton("Check SSN");

        ssnBtn.addActionListener(this);

        btnPanel.add(ssnBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String getInfo = "";
        if (e.getSource() == ssnBtn) {
            getInfo = ssn.getText();
            checkValid(getInfo);
        }


    }

    private void checkValid(String getInfo) {

        if (getInfo.length() != 11) {
            ssnShow.setText("No Valid!");
        }

        boolean checkInFor = true;

        for (int i = 0; i < getInfo.length(); i++) {
            if (Character.isLetter(getInfo.charAt(i))) {
                ssnShow.setText("No Valid! Only Digits please!");
                checkInFor = false;
                break;


            }
        }

        String[] check = getInfo.split("-");

        boolean first3 = (check[0].charAt(0) == check[0].charAt(1)) &&
                (check[0].charAt(2) == check[0].charAt(0));

        boolean second2 = (check[1].charAt(0) == check[1].charAt(1));


        boolean last4 = (check[2].charAt(0) == check[2].charAt(1)) &&
                (check[2].charAt(2) == check[2].charAt(3)) &&
                (check[2].charAt(0) == check[2].charAt(3));


        if (first3 || second2 || last4) {
            ssnShow.setText("No valid SSN");
        } else if (checkInFor) {
            ssnShow.setText("Valid SSN");
        }


    }

    private void buildSsPanel() {
        ssnPanel = new JPanel();
        ssnPanel.setLayout(null);
        ssn = new JTextField(10);
        ssn.setBounds(100, 20, 200, 40);
        ssn.setHorizontalAlignment(JTextField.CENTER);

        showFormat = new JLabel();
        showFormat.setFont(new Font(Font.DIALOG, Font.ITALIC & Font.BOLD, 17));
        showFormat.setText("Enter SSN:123-45-6789");
        showFormat.setBounds(100, 80, 200, 20);
        ssnShow = new JTextField(10);
        ssnShow.setEditable(false);
        ssnShow.setBorder(null);
        ssnShow.setBackground(Color.BLACK);
        ssnShow.setForeground(Color.WHITE);
        ssnShow.setBounds(100, 120, 200, 40);
        ssnShow.setHorizontalAlignment(JTextField.CENTER);

        ssnPanel.add(ssn);
        ssnPanel.add(showFormat);
        ssnPanel.add(ssnShow);


    }


    public static void main(String[] args) {
        new Ssn();
    }


}

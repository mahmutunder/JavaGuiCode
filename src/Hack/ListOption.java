package Hack;

import javax.swing.*;

public class ListOption {
    public static void main(String[] args) {

        String[] options={"Java","C#","Javascript","C++","Python"};

        int answer= JOptionPane.showOptionDialog(null,
                "What is best Language to create app?","Best Language",
               JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,0);

        JOptionPane.showMessageDialog(null,("Maybe " + options[answer]),"Answer",JOptionPane.INFORMATION_MESSAGE);


    }
}

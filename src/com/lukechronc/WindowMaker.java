package com.lukechronc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class WindowMaker extends JFrame implements ActionListener {
    private JTextArea area;
    private JLabel label;

    public WindowMaker(String title) {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle(title);
        setResizable(false);

        area = new JTextArea();
        area.setRows(3);
        label = new JLabel("big oof");

        JButton button = new JButton("fUcK iT up");
        button.addActionListener(this);
        add(area);
        add(button);
        add(label);
        setLayout(new GridLayout(3,1,25,25));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String plain = area.getText();
        label.setText(fuckItUp(plain));
    }

    private String fuckItUp(String plain) {
        //TODO implement this method
        Random rand = new Random();
        int i;
        String[] words = plain.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            char[] chars = word.toCharArray();
            for (Character c : chars){
                i = rand.nextInt(2);
                if (i == 0){
                    sb.append(Character.toUpperCase(c));
                }else {
                    sb.append(c);
                }
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}

package com.lukechronc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowMaker extends JFrame implements ActionListener {
    private JTextArea area;
    private JLabel label;

    public WindowMaker(String title) {
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle(title);
        setResizable(false);

        area = new JTextArea();
        area.setRows(3);
        label = new JLabel("big oof");

        JButton button = new JButton("fUcK iT up");
        button.addActionListener(this);
        add(area, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String plain = area.getText();
        label.setText(fuckItUp(plain));
    }

    private String fuckItUp(String plain) {
        //TODO implement this method
        return null;
    }
}

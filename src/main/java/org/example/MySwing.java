package org.example;

import javax.swing.*;

public class MySwing {
    public void init(){
        JFrame jFrame = new JFrame("MySwing");
        jFrame.setVisible(true);
        jFrame.setBounds(300,300,300,300);
        jFrame.setLayout(null);

        JButton jButton = new JButton("A");
        jButton.setBounds(100,100,100,100);
        jButton.addActionListener(e -> System.out.println("aaa~~"));
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MySwing().init();
    }
}

package org.example;

import javax.swing.*;

public class MySwing {
    public void init(){
        JFrame jFrame = new JFrame("MySwing");
        jFrame.setVisible(true);
        jFrame.setBounds(300,300,300,300);

        JLabel jLabel = new JLabel("aaa");
        jFrame.add(jLabel);

        JButton jButton = new JButton("A");
        jButton.addActionListener(e -> System.out.println("你干嘛~~"));
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MySwing().init();
    }
}

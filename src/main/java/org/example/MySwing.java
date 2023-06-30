package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwing {
    public void init(){
        JFrame jFrame = new JFrame("MySwing");
        jFrame.setVisible(true);
        jFrame.setBounds(300,300,300,300);

        JLabel jLabel = new JLabel("aaa");
        jFrame.add(jLabel);

        JButton jButton = new JButton("A");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你干嘛~~");
            }
        });
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MySwing().init();
    }
}

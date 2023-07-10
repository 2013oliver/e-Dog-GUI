package org.example;

import javax.swing.*;
import java.awt.*;

public class MySwing {
    public void init() {
        JFrame jFrame = new JFrame("MySwing");
        jFrame.setVisible(true);
        jFrame.setBounds(300,300,300,300);
        jFrame.setLayout(null);
        Toolkit took = Toolkit.getDefaultToolkit();
        Image icon = took.getImage("src/main/java/org/example/img/E-Dog-icon.png");
        jFrame.setIconImage(icon);

        JButton jButton = new JButton("A");
        jButton.setBounds(25,25,50,25);
        jButton.addActionListener(e -> System.out.println("你干嘛~~"));
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MySwing().init();
    }
}

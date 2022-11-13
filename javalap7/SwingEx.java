package javalap7;

import javax.swing.*;
public class SwingEx {
public static void main(String[] args) {
JFrame f=new JFrame();//creating instance of JFrame
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);
f.add(b);//adding button in JFrame
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}
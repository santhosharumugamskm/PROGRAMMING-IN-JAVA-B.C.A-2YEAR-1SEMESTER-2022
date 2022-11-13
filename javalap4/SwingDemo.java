import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingDemo {
public static void main(String[] args) {
JButton btnA = new JButton("Button1 (Left)");
JButton btnB = new JButton("Button2 (Right)");
JButton btnC = new JButton("Button3 (Left)");
JButton btnD = new JButton("Button4 (Right)");
btnA.setPreferredSize(new Dimension(150, 20));
btnB.setPreferredSize(new Dimension(150, 20));
btnC.setPreferredSize(new Dimension(150, 20));
btnD.setPreferredSize(new Dimension(150, 20));
JPanel btnAPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
JPanel btnBPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
JPanel btnCPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
JPanel btnDPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
btnAPanel.add(btnA);
btnBPanel.add(btnB);
btnCPanel.add(btnC);
btnDPanel.add(btnD);
JPanel panelGrid = new JPanel(new GridLayout(10, 5, 10, 10));
panelGrid.add(new JCheckBox("Demo CheckBox1"));
panelGrid.add(new JCheckBox("Demo CheckBox2"));panelGrid.add(btnAPanel);
panelGrid.add(btnBPanel);
panelGrid.add(btnCPanel);
panelGrid.add(btnDPanel);
JPanel lBrdLayout = new JPanel(new BorderLayout());
lBrdLayout.add(panelGrid, BorderLayout.SOUTH);
lBrdLayout.setPreferredSize(new Dimension(550, 300));
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(lBrdLayout);
frame.setSize(550, 400);
frame.setVisible(true);
}
}
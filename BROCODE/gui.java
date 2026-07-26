package BROCODE;

import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        String name = javax.swing.JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("add your age"));
        JOptionPane.showMessageDialog(null, "you are " + age + "Years old");
    }
}

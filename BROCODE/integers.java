package BROCODE;

import javax.swing.JOptionPane;

public class integers {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Type in your name");
        System.out.println(name);
        JOptionPane.showInputDialog("");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, name + age);
    }
}

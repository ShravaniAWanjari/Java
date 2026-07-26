package BROCODE;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("give side"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("give base"));
        double z;

        z = Math.sqrt((x * x) + (y * y));
        System.out.println(z);
    }
}

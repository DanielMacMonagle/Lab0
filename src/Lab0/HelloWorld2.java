package Lab0;

import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args) {

        //This is where the user inputs their name
        String name = JOptionPane.showInputDialog("Enter name: ");

        JOptionPane.showMessageDialog(null, name);
    }
}

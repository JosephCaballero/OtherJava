import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type something:");
        System.out.println(input);
        //Parse the input as an int.
        int input0 = Integer.parseInt(input);
        //Print its value +1
        System.out.println(input0 + 1);
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        int input1 = Integer.parseInt(JOptionPane.showInputDialog("Type something else:")) +1;
        //You should have only one semicolon (;) in this line.


    }
}

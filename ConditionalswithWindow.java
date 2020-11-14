// Importing Abstract Window Toolkit and Swing and Scanner
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class ConditionalswithWindow{

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        
        // Create and setting up the window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content of the window and the size
        // Using of ternary operator, if number is very high or a right amount, showing different messages
        JLabel textLabel = new JLabel(inputNum > 10 ? "This is my first window, hurray! Oh and the number " + inputNum + " is reeeeeeeeeeeeeeeeeeeeaaaaaaaaally high" : "This is my first window, hurray! Oh and the number " + inputNum + " is quite ok!", SwingConstants.CENTER);

        textLabel.setPreferredSize(new Dimension(800,800));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        // Disply the windos
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
        // Closing scanner
        scanner.close();
    }

}
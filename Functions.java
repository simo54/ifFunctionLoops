// Importing Abstract Window Toolkit and Swing
import java.awt.*;
import javax.swing.*;

public class Functions {

    public static void working(){
        boolean working = true;
        while(working) {
            try{
                // Declaring variable with current time
                long millis = System.currentTimeMillis();
                // Giving a loop a break every second. Every second the code will be executed
                Thread.sleep(1000 - millis % 1000);
                System.out.println("working");

                JFrame frame = new JFrame();
                // Commenting the code below we will not be able to stop the execution by clicking x on the java frame window
                // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                JLabel textLabel = new JLabel("Yes I am working", SwingConstants.CENTER);
                textLabel.setPreferredSize(new Dimension(500,800));
                frame.getContentPane().add(textLabel, BorderLayout.CENTER);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);

                // Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. https://docs.oracle.com/javase/7/docs/api/java/lang/InterruptedException.html
            } catch(InterruptedException e){
                // Prints the stack trace of the instance to System.err.
                 e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) {
        working();
    }
}

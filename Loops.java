import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Creating new Scanner that will await for user's input
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        // While loop, emulating a repeat function
        while(isOnRepeat) {
            System.out.println("Current Song");
            System.out.println("Stop Repeat? if yes, write yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
                System.out.println("Current Song Stopped");
            }
        }
        input.close();
    }
}

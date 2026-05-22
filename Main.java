import java.util.*;
import javax.swing.*;

public class Main{
    public static void main(String [] args)
    {
        boolean on = false;
        int emotionTimer =0;
        int thoughtTimer =0;
        System.out.println("to start enter 1");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        Pet a = new Pet();

        on=true;
        System.out.println("starting code");
        while(on){
            //check for input
            System.out.println("");
            System.out.println("pick an input!");
            if(in.hasNextInt()){
                int b = in.nextInt();
                if(b==1){
                }
                else if(b==2){
                    System.out.println("1");
                    emotionTimer = a.petYourPet(emotionTimer);
                }
                else if(b==3){
                    System.out.println("2");
                    emotionTimer = a.feedYourPet(emotionTimer);
                }
                else if(b==4){
                    System.out.println("3");
                    emotionTimer = a.trainYourPet(emotionTimer);
                }
                else if(b==0){
                    on=false;
                }
            }

            emotionTimer = a.update(emotionTimer); // update emotion
            thoughtTimer = a.thoughts(thoughtTimer);

            System.out.println("");
            System.out.println("Status update!");
            a.runStatus();
            // run animation

        }
    }
}

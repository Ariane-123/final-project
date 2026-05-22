import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Pet
{

    private Scanner in;
    private String status = "happy";

    public Pet()
    {
        in = new Scanner(System.in);
    }    
    
    public void test(){
        System.out.println("enter 1");
        if(in.nextInt()==1){
            System.out.println("₍^. .^₎Ⳋ");

            try {
                Thread.sleep(500); // 2-second delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Best practice to reset interrupt flag
            }
            
            System.out.println("₍^.⩊.^₎⟆");
            
        }   
    }


    // emotion animations
    public void happy(){
        // runs normal animation
        System.out.println("happy1 :)");
        System.out.println("happy2 :D");
        System.out.println("happy3 :P");
    }
    public void stable(){
        // runs normal animation
        System.out.println("stable1 :|");
        System.out.println("stable2 :/");
        System.out.println("stable3 -_-");
    }
    public void sad(){
        // runs normal animation
        System.out.println("sad1 :(");
        System.out.println("sad2 :'(");
        System.out.println("sad3 ToT");
    }



    public int thoughts(int thoughtcount){
        if(thoughtcount>=15){
            int a = (int)(Math.random()*3)+1;
            if(a==1){
                System.out.println("wow I love ap cs!");
            }
            if(a==2){
                System.out.println("food is cool");
            }
            if(a==3){
                System.out.println("I can eat your hw for u <3");
            }
            thoughtcount=0;
        }

        return thoughtcount;
    }

    public int update(int timer){
        //check if emotion should change
        //
        if(timer<10){
            status = "happy";
        }
        if(timer>=10){
            status = "stable";
        }
        if(timer>=20){
            status = "sad";
        }
        if(timer==10 || timer==20){
            System.out.println("now" + status);
        }
        return (timer+2);
    }

    public void runStatus(){
        if(status.equals("happy")){
            System.out.println("happy");
            happy();
        }
        if(status.equals("stable")){
            stable();
        }
        if(status.equals("sad")){
            sad();
        }
    }

    public int petYourPet(int count){
        count-=3;
        System.out.println("you are petting your pet");
        System.out.println("yay ^-^");
        System.out.println("pet animation");

        update(count);

        return count;
    }

    public int feedYourPet(int count){
        count-=5;
        System.out.println("you are feeding your pet");
        System.out.println("yum :P");
        System.out.println("eating animation");

        update(count);

        return count;
    }

    public int trainYourPet(int count){
        count-=3;
        System.out.println("you are training your pet");
        System.out.println("wowow :0");
        System.out.println("cool trick animation");

        update(count);

        return count;
    }

}
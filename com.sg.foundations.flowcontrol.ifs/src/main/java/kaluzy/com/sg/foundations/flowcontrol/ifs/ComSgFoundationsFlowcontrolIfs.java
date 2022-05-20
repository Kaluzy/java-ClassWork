/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package kaluzy.com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author kaluzy
 */

import java.util.Scanner;


public class ComSgFoundationsFlowcontrolIfs {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox?");
        
        
        String action = userInput.nextLine();
        
        if(action.equals("open the mailbox")){
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there");
            
            System.out.println("Look inside or stick your hand in?");
            action = userInput.nextLine();
            
            if(action.equals("look inside")){
            System.out.println("You peer inside the mailbox.");
            System.out.println("It's really very dark. So ... so very dark.");
            
            System.out.println("Run away or keep looking?");
            action = userInput.nextLine();
            
            if (action.equals("keep looking")){
            System.out.println("Turns out, hanging out around dark places isn't a good idea.");
            System.out.println("You've been eaten by a grue.");
            
            } else if(action.equals("run away")){
                System.out.println("You run away screaming across the fields - looking very foolish.");
                System.out.println("But you alive. Possibly a wise choice.");
                
            }
            } else if (action.equals("stick your hand in")){
             System.out.println("Feels like soft");
             System.out.println("What is it???");
             System.out.println("Turns out a black feather... Humm");
            }
            
        } else if (action.equals("go to the house")){
                System.out.println("Oh no my soup is cold. I had to warm it up");

        }
    }
}

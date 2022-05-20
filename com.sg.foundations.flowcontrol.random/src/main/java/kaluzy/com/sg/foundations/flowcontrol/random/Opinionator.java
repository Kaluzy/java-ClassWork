/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaluzy.com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author kaluzy
 */
public class Opinionator {
    
   public static void main(String[] args){
       Random randomizer = new Random();

       System.out.println("I can't decide what animal I like the best.");
       System.out.println("I know! Random can decide FOR ME!");
       
       int x = randomizer.nextInt(5);
       
        System.out.println("The number we chose was: " + x);

       switch (x) {
           case 0 -> System.out.println("Llamas are the best!");
           case 1 -> System.out.println("Dodos are the best!");
           case 2 -> System.out.println("Woolly mammoths are DEFINITELY the best!");
           case 3 -> System.out.println("Sharks are the greatest, they have their own week!");
           case 4 -> System.out.println("Cockatoos are the awesomme!");
           case 5 -> System.out.println("Have you ever met a neked mole-rat? They're GREAT!");
       }
        
        System.out.println("Thank Random, maybe YOU'RE the best!");
   }
}

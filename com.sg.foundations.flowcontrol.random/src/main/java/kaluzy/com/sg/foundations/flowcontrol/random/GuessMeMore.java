/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaluzy.com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kaluzy
 */
public class GuessMeMore {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int answer;
        int guess;
        
        // random is btw -100 - 100
        // Max 100
        // Min -100
        
        Random rGen = new Random();
        answer = (int) (rGen.nextDouble() * (100 - -100)+ -100);
        
        while (true){
        System.out.println("I've Chosen a number between -100 and 100. Bet you can't guess it!");
        guess = sc.nextInt();
        
        System.out.println("Random is: " + answer);
        
        if(guess == answer){
            break;
        }
        
        if (guess < -100 || guess > 100){
            System.out.println("Your guess must be btw -100 & 100");
            continue;
        }
        
        if (guess > answer){
            System.out.println("Ha, nice try - too high! Try again");
            System.out.println("Your guess: " + guess);
            continue;
        }
        System.out.println("Ha, nice try - too low!! " + guess);
        
    }
    System.out.println("Wow, nice guess! That was it!! " + answer);
 
}
}
import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Declare total dollar user has
        int money = 0;

        // two random number btw 0 and 7
        // sum of two dice is equal to 7 add $4 else loses $1
        Random rGen = new Random();
        int dice1 = rGen.nextInt(7)+1;;
        int dice2 = rGen.nextInt(7)+1;
        int count = 0;
//        System.out.println("Dice output: " + dice1);

        //Prints out how many $$ they have to bet
        System.out.print("How many dollars do you have? ");
        money = sc.nextInt();
        int balance =money  ;
        int totalDiceRolled = 0;
        int bestMoney=money;
         int bestRoll = 0;

        // program rolls dice until the money is gone.
        // loop until money gone
            for (int i = 0; i<balance; i++){
                int dice = rGen.nextInt(7)+1;;
                System.out.println("Dice output: " + dice);

                if(dice == 7){
//                    money=0;
                    balance += 4;
                    bestRoll+=1 ;
                    bestMoney = balance;
                } else {
                    balance -= 1;
                    totalDiceRolled +=1;
                }
                i-=1;

//                balance -= 1;
//                count +=1 ;
//                System.out.println("Money: " + money);
                System.out.println("Balance: " + balance);

            }

            if (balance <1){
            System.out.println("Oh no! You run out your money!");
            System.out.println("You are broke after "+ totalDiceRolled+ " rolls.");
        }

            if (bestRoll >= 1){
                System.out.println("You should have quit after " + bestRoll+ " rolls when you had "+ bestMoney);
        }System.out.println("You should have quit after your first Roll");
    }




    }


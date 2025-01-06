/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numgame;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class NumGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("WELCOME!!");
        System.out.println("You have "+chances+" to win the game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance"+(i+1)+"Enter your guess:");
                int user=scanner.nextInt();  
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won it");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too high...");
                }
                else{
                    System.out.println("Too low...");
            }
        }
        if(guess==false){
            System.out.println("You lost the chance.The number is "+rand);
        }
        System.out.println("Do you want to play again(Y/N)");
        String pA=scanner.next();
        playAgain=pA.equalsIgnoreCase("y");
    }
        System.out.println("Your score is "+finals);
    }
        public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
        }
    }


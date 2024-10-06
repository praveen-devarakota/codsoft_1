import java.io.*;
import java.util.*;

public class Main {
     static Scanner sc = new Scanner(System.in);
     static Random r = new Random();
     static int max = 100;  static int min =1;
     static int number = r.nextInt(max-min+1)+min; 
   static int limit = 3;  static int score =limit;  
     static void singleRound() {
       
        for (int i=0;i<limit;i++) {
            System.out.print("Enter your guess: ");
            int guess=sc.nextInt();
            if (number==guess) {
                System.out.println("Correct!");
                System.out.println("score : "+score);
                break;
            } else if (number < guess) {
                System.out.println("Too High");
                score--;
            } else {
                System.out.println("Too Low"); 
                score--;
            }
            if (i == limit-1) {
                System.out.println("Limit over! The number was: " + number);
                System.out.println("score : "+score);
            }
        }
    }

    public static void multipleRounds() {
        int round = 1; int rw =0;
        while (true) {
            System.out.println("Round " + round);
            singleRound();
           if(score!=0){
               rw++;
           }
            round++;
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String ans = sc.next();
            if (ans.equals("yes") == false) {
                            System.out.println("rounds won : "+rw);
                            break;
                    }
            number = r.nextInt(max-min+1) + min; 
        }
    }

    public static void main(String[] args) {
        System.out.println("Choose Mode of Game");
        System.out.print("1. Multiple rounds   2. Single round: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                multipleRounds();
                break;
            case 2:
                singleRound();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
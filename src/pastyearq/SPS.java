/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyearq;

/**
 *
 * @author Jassper
 */

import java.util.Random;
import java.util.Scanner;
public class SPS {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random r = new Random();
         int t=1;
        int com=0,player=0,a,b;
        //1 scissors 2 rock 3 paper
        while(true){
            while(true){
               a=r.nextInt(3)+1;//c
                System.out.print("Enter score 1.Scissors 2. Rock 3.Paper :");
                b=in.nextInt();//p
                System.out.println(a+" "+b);
                if(b==1){
                 switch (a) {
                     case 1:
                         System.out.println("Computer chose "+a+" ||Draw!");
                         break;
                     case 2:
                         System.out.println("Computer chose "+a+" You lose!");
                         com++;
                         break;
                     case 3:
                         System.out.println("Computer chose "+a+" You win!");
                         player++;
                         break;
                     default:
                         break;
                 }
                }
                if(b==2){
                 switch (a) {
                     case 2:
                         System.out.println("Computer chose "+a+" ||Draw!");
                         break;
                     case 3:
                         System.out.println("Computer chose "+a+" You lose!");
                         com++;
                         break;
                     case 1:
                         System.out.println("Computer chose "+a+" You win!");
                         player++;
                         break;
                     default:
                         break;
                 }
                }
                 if(b==3){
                 switch (a) {
                     case 3:
                         System.out.println("Computer chose "+a+" ||Draw!");
                         break;
                     case 1:
                         System.out.println("Computer chose "+a+" You lose!");
                         com++;
                         break;
                     case 2:
                         System.out.println("Computer chose "+a+" You win!");
                         player++;
                         break;
                     default:
                         break;
                 }
                }
                 if(player==2||com==10){
                     break;
                 }
                 
        }
            System.out.println("Would you like to try again ?(Y for yes N for No) ");
            String c=in.nextLine();
            c=in.nextLine();
            if(in.nextLine().equalsIgnoreCase("N")){
               break;
        }
            
            
    
}
}
}

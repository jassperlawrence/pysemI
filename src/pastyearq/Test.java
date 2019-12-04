/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyearq;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Test {
    public static void main(String[] args) {
//        Rebate a = new Rebate("John Lim","1111222233334444");
//        a.getReward("Grocery",124.8);
//        a.display();
//        Point p= new Point("John ","1111222233334444");
//        p.getReward("Saturday", 124.8);
//        a.display();
//        String cheapest;
//        Apple a = new Apple("Apple","Red",8);
//        a.totalPrice();
//        System.out.println(a.toString());
//        Watermelon b= new Watermelon(7.6,"Watermelon","Local");
//        b.totalPrice();
//        System.out.println(b.toString());
//        if(a.totalPrice()<b.totalPrice()){
//            cheapest=b.toString();
//        }
//        else
//            cheapest=b.toString();
//        
//        System.out.println("Cheapest item is \n"+cheapest);
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the values of a, b, c, d, e and f: ");
        int matrix[]=new int [6];
        for(int i=0;i<matrix.length;i++){
            matrix[i]=in.nextInt();
        }
        LinearEquation l=new LinearEquation(matrix[0],matrix[1],matrix[2],matrix[3],matrix[4],matrix[5]);
        
        if(l.isSolvable()==false)
        {
            System.out.println("The equation has no solution");
        }
        else{
            
        System.out.println("\n"+ l.toString()+"\n");
        System.out.println("x="+l.computeX()+"  y="+l.computeY());
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Bubble {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0,count=0,m=0;
        //if you dont know can split and solve by converting string array to int array
        String[]s1;
        System.out.print("Enter the numbers you would like to input : ");
        String s=in.nextLine();
        s1=s.split("\\s+");// split with delimiter of whitespace
        int [] num=new int [s1.length];//Input is one string , split into array string and then create a int array with same size as string split array , then parse from string to int then answer 
        for(int i=0;i<s1.length;i++){
            num[i]=Integer.parseInt(s1[i]);
            n+=num[i];
            System.out.print(num[i]+" ");
        }
        System.out.println("\nSum is "+n);
        bubbleSort(num);
    }
    public static int gcd(int n1,int n2){
        if(n2==0){
            return n1;//base case
        }
        return gcd(n2,n1%n2);//the n1 returned is the gcd 
    }
    public static int lcm(int n1,int n2){
      int lcm=(n1>n2)?n1:n2;//if lcm = n1 if true , n2 if false 
        while(true){
           if(lcm%n1==0&&lcm%n2==0){
               System.out.printf("The LCM of %d and %d is %d .",n1,n2,lcm);
               break;
           }
           ++lcm;
        }
        return lcm;
    }
    public static void bubbleSort(int[]n){
        int temp=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length-i-1;j++){
                //ascending order
                if(n[j]>n[j+1]){
                    temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int s: n){
            System.out.print(s+" ");
        }
    }
        
    
}

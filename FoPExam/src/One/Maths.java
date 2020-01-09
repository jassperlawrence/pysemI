/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Maths {
    //method that generates a random prime number
    //variance mean sorting median 
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n;
        
        System.out.print("Enter how many numbers you would like : ");
        n=in.nextInt();
        int number[]= new int[n];
        for(int i=0;i<n;i++){
            //generate the random no.
            number[i]=randprime();
        }
        //sorting
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length-i-1;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j+1];
                    number[j+1]=number[j];
                    number[j]=temp;
                }
            }
        }
        //display sorted array
        for(int s : number){
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.println("Median is "+median(number)+" Mean is "+mean(number));
        System.out.println("Variance is "+variance(number));
    }
    public static int randprime(){
        Random r = new Random();
        int rand=r.nextInt(100);
        boolean check=true;
        //check if random
        for(int i=2;i<rand/2;i++){// rand%i
            if(rand%i==0){
                check=false;
            }
        }
        if(check==false){
            return randprime();
        }
          else
            return rand;
      }
    public static double mean(int []a){
        double mean,total=0;
        
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
       return total/a.length;
    }
    
    public static double median(int[]a){
        double median;
        if(a.length%2==0){
           median = ((a[(a.length/2)-1])+(a[(a.length/2)]))/2;
         }
        else 
            median = a[(a.length/2)];
        
        return median;
    }
    public static double variance(int []a){//(sum of(x from data - mean)squared)/n-1 sample if population its all so divide n only
        double variance=0;
        for(int i=0;i<a.length;i++){
            variance+=Math.pow((a[i]-mean(a)),2);
        }
        return variance=variance/(a.length-1);
    }
    
}

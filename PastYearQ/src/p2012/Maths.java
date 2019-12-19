/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2012;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random r= new Random();
        System.out.print("Enter how many numbers you would like : ");
        int c=in.nextInt();
        double [] num= new double [c];
        //Generate prime number 2 - 100
        for(int i=0;i<num.length;i++){
            num[i]=prime();
        }
        sort(num);
        for(double s: num){
            System.out.print(s+" ");
        }
        System.out.println("Median is "+median(num));
        System.out.println("Mean is "+mean(num));
        System.out.println("Variance is "+variance(num)+"\nStandard Deviation is "+Math.sqrt(variance(num)));
        
    }
    public static double median(double []a){
        double median;
        if(a.length%2==0){
            median=(a[a.length/2]+a[a.length/2+(1)])/2;
        }
        else 
            median=(a[a.length/2]);
        
        return median;
    }
    public static void sort(double []a){
        //sort in increasing order
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    double temp=a[j];
                    a[j]=a[j+1];     
                    a[j+1]=temp;
                }
            }
        }
    }
    public static double mean(double a[]){
        double mean=0;
        for(int i=0;i<a.length;i++){
            mean+=a[i];
        }
        mean/=a.length;
        
        return mean;
    }
    public static double variance(double[]a){
        double sum1=0;
        double sum2=0;
        double variance;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
            sum2+=Math.pow(a[i],2);
            
        }
        sum1=Math.pow(sum1,2);
        
        variance=(sum2-(sum1/a.length))/a.length-1;
        
        return variance;
    }
    public static double prime(){
        Random r= new Random();
         boolean check=true;//prime
        
            int rand=r.nextInt(99)+2;
           for(int i=2;i<rand/2;i++){
            if(rand%i==0){
                check=false;//mean that not prime number
            }
      }
             if(check==false)
                 return prime();
             else 
                 return rand;
        
    }   
}

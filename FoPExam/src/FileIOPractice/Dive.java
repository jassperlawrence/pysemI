/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Dive {
    public static void main(String[] args) {
        try{
            int line=0;
            Scanner in= new Scanner(new FileInputStream("dive_score.txt"));
            //find how many lines first
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
                line++;
            }
            in.close();
            in=new Scanner(new FileInputStream("dive_score.txt"));//hence there are 4 players 5 scores 1 mult.
            String name[]= new String[5];
            int score[]=new int[5];
            int mult[]=new int[5];
            int total[]= new int [5];
            int j=0;
            while(in.hasNextLine()){//check how many lines and then understand the question , write it down on a piece of paper if you have to .
               
                int[] scorein=new int [5];//for each player
                name[j]=in.nextLine();//store details of each player
                scorein[0]=Integer.parseInt(in.nextLine());
                scorein[1]=Integer.parseInt(in.nextLine());
                scorein[2]=Integer.parseInt(in.nextLine());
                scorein[3]=Integer.parseInt(in.nextLine());
                scorein[4]=Integer.parseInt(in.nextLine());
                score[j]=max(scorein);
                mult[j]=Integer.parseInt(in.nextLine());
                total[j]=score[j]*mult[j];
                j++;
                if(j==5){
                    break;
                }
               
            }
            in.close();
            //display unsorted
            System.out.println("Unsorted Array : ");
            for(int i=0;i<score.length;i++){
                System.out.println(name[i]+"  "+total[i]);
            }
            sort(total,name);
            System.out.println("Sorted Array : ");
            for(int i=0;i<score.length;i++){
                System.out.println(name[i]+"  "+total[i]);
            }
            PrintWriter p= new PrintWriter(new FileOutputStream("results.txt"));
            
            for(int i=0;i<score.length;i++){
                p.print(name[i]+"  "+total[i]+"\n");
            }
            
            
            p.close();
            
        }catch(FileNotFoundException e){}
    }
    public static int max(int []a){
        int max=-1,sum=0;
        for(int i=0;i<a.length;i++){
            //check for max
            
            if(a[i]>max){
                max=a[i];
            }
            sum+=a[i];
        }
        sum-=max;
        return sum;
    }
    public static void sort(int[]a,String[]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    String temp1=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp1;
                }
                
            }
        }
    }
    
}

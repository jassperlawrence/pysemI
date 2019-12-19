/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PY2014;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Q2 {
    
   /*
    Write a program  that request the user input enter number of employees .Program will request name and salary . Display name and salary in increasing order of their salaries
    
    MAIN PROBLEM:
    ->HOW TO READ MULTIPLE INPUT IN ONE LINE if .nextLine() method doesnt work
    */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Please enter number of employees : " );
        num=in.nextInt();
        String []name= new String[num];
        double []salary = new double[num];
        
        for(int i=0;i<num;i++){
            System.out.print("Enter name : ");//how to get to string input in Scanner class in one line
            name[i]=in.next();//works for one word names but not two words . .next for one string but nextLine doesnt work to read with spaces
            System.out.print("Enter salary : ");
            salary[i]=in.nextDouble();
            in=new Scanner(System.in);
        }
        double  temp;
        String  temp2;
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                
                if(salary[j]>salary[j+1]){
                    //sorting
                    temp=salary[j];
                    salary[j]=salary[j+1];
                    salary[j+1]=temp;
                    temp2=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp2;
                    
                }
                
            }
        }
        //display name of employees in increasing order of salary
        System.out.println("Name of employees in increasing order of their salaries : ");
        for(String s: name){
            System.out.print(s+" ");
        }
        
    }
    
}

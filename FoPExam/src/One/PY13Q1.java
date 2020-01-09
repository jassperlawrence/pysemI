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
public class PY13Q1 {
    //Accept input of  5 students and display in alphabetical order
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name[]= new String[5];
       
        char name1[]= new char[5];
        String temp;
        char temp1;
        //Create and initialise the array
        for(int i=0;i<=4;i++){
        System.out.print("Enter student name : ");
        name[i]=in.nextLine();
        
        name1[i]=a(name[i]);
        }
       
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name.length-i-1;j++){
                //ascending order
                if(name1[j]>name1[j+1]){
                    temp1=name1[j+1];
                    name1[j+1]=name1[j];
                    name1[j]=temp1;
                    temp=name[j+1];
                    name[j+1]=name[j];
                    name[j]=temp;//Have to sort both arrays!!
                }
            }
        }
        System.out.println("The student names in alphabetical order are : ");
        for(String s : name){
            System.out.println(s);
        }
    }
    public static char a(String b){
        return b.toLowerCase().charAt(0);
    }
    
}

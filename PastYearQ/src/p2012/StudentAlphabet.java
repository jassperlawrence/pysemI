/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2012;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class StudentAlphabet {
    public static void main(String[] args) {
//        Write a program that accepts input of five student names then display the names based on alphabetical order.
        //ignore case 
        Scanner in= new Scanner(System.in);
        String temp;
        String[] name= new String[5];
        String []name2=new String[5];
        for(int i=0;i<name.length;i++){
            System.out.print("Enter student name : ");
            name[i]=in.next();
            
        }//create and store the names in an array
        for(int i=0;i<name.length;i++){
            name2[i]=name[i];
            name2[i].toLowerCase();
        }//create a second array convert to lowercase and compare
        //compare the first letter and ignore case 
        for(int i=0;i<name.length;i++){//sort the names
            for(int j=0;j<i;j++){
                if(name2[j].charAt(0)>=name2[j+1].charAt(0)){
                    temp=name[j+1];
                    name[j+1]=name[j];
                    name[j]=temp;//sort in alphabetical order 
                }
            }
        }//Display the names in Alphabetical Order
        System.out.println("The student name in alphabetical order are : ");
        for(String s: name){
            System.out.println(s);
        }
    }
    
}

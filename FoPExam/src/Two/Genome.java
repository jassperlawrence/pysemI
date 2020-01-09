/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Genome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //starts after triplet ATG and ends with TAG TGA TAA
        System.out.println("Enter genome [quit to stop] : ");
        String n=in.nextLine();
        int count=1;
        
        
        
    }
    public static boolean check(String n){//for gene
        boolean check1=false;
        boolean check2=false;
        
        if(n.length()%3==0){//gene string
            check1=true;
        }
        if(!n.contains("ATG")||!n.contains("TAG")||!n.contains("TAA")||!n.contains("TGA")){
            check2=true;
        }
        if(check1==true&&check2==true){
            return true;
        }
        else 
            return false;
    }
    public static String gene(String n){//return the gene
        String s="";
        boolean check3=false;
        boolean check4=false;
        int j=1;
        if(check(n)==true){
             for(int i=n.length()-1;i>=0;i--){
                 //check if there is GTA
                 if(j==3){
                     j=0;
                     s="";
                 }
                 s+=n.charAt(i);//for every 3 chars check
                 j++;
                   if(s.equals("GTA")){//check whether there is a gene 1st
                       check3=true;
                   }
                   if(s.contains("TAG")||s.contains("TAA")||s.contains("TGA")){//last part of gene
                       check4=true;
                   }
                  
        }
        }
        else{
            return "No gene is found";
        }
        return"";
        
    }
}
/*
   Substring can use .contains() .index0f() .indexOf()
*/

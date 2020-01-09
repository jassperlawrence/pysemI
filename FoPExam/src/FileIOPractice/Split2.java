/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Split2 {
    public static void main(String[] args) {
        try{
            int line=0;
            Scanner in =new Scanner(new FileInputStream("logs.txt"));
            while(in.hasNextLine()){
               in.nextLine();
               line++;
            }
            
            in.close();
            String []sentence= new String[line];
           
            
            in=new Scanner(new FileInputStream("logs.txt"));
            int count=0;
            while(in.hasNextLine()){
              sentence[count]=in.nextLine();
              count++;
            }
            String full="";
            int c=0;
            for(int i=0;i<sentence.length;i++){
                String s=sentence[i];
                String []sentence1=s.split("--");
                for(String d: sentence1){
                    if(c==2){
                        c=0;
                        full+="\n";
                    }
                    full+=d;
                    c++;
                    
                }
            }
            System.out.println(full);
        }catch(FileNotFoundException e){}
    }//holy shit it worked
    //split => convert and put all in one string =>display
    //Read from : USE SCANNER CLASS 
    //Write to : USE PRINTWRITER CLASS
    
}

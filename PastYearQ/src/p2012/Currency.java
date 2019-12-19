/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Currency {
    public static void main(String[] args) {
        
        int c=0;//Ask sir why its throwing an error
        try{
            Scanner in= new Scanner(new FileInputStream("ringgit.txt"));
            while(in.hasNextLine()){
               in.nextLine();
                c++;
               
            }
            in.close();
            in= new Scanner(new FileInputStream("ringgit.txt"));    
             double [] amount= new double[c];
          String [] type= new String[c];
          int i=0;
            while(in.hasNext()){
                type[i]=in.next();
                amount[i]=Double.parseDouble(in.next());
                i++;
        }
            in.close();
            double total[]= new double [c];
            for(int j=0;j<c;j++){
                if(type[j].equalsIgnoreCase("AUD")){
                    total[j]=Math.round(amount[j]*3.25*100)/100.0;
                }
                else if(type[j].equalsIgnoreCase("SG")){
                    total[j]=Math.round(amount[j]*2.53*100)/100.0;
                }
                else if(type[j].equalsIgnoreCase("EU")){
                    total[j]=Math.round(amount[j]*4.03*100)/100.0;
                }
                else if(type[j].equalsIgnoreCase("USD")){
                    total[j]=Math.round(amount[j]*3.11*100)/100.0;
                }
                
                
                
            }
            for(int j=0;j<c;j++){
                System.out.println(type[j]+" "+amount[j]+" = "+total[j]);
            }
        }
           
        catch(FileNotFoundException e){}
    }
}

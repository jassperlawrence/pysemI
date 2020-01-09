/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOPractice;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class LabNo6 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new FileInputStream("order.txt"));
            Scanner in1 = new Scanner(new FileInputStream("product.txt"));
               int line=0,line1=0;
            while(in.hasNextLine()){
                in.nextLine();
                line++;
                System.out.println(line);
            }
           in.close();
           while(in1.hasNextLine()){
               in1.nextLine();
                line1++;
               System.out.println(line1);
            }
            in1.close();
            in = new Scanner(new FileInputStream("order.txt"));
            in1 = new Scanner(new FileInputStream("product.txt"));
            int i=0,j=0;
            String []pid=new String[line1];
            String []pname=new String[line1];
            double []price=new double[line1];
            int []quantity=new int[line];
            while(in1.hasNextLine()){
                if(i==line1){
                    break;
                }
            String sentence=in1.nextLine();
                String []ayat=sentence.split(",");
                pid[i]=ayat[0];
                pname[i]=ayat[1];
                price[i]=Double.parseDouble(ayat[2]);
                i++;
               for(String a : ayat){
                   System.out.println(a);
               }
            }
            
            String[]oid=new String[line];
            String[] pid1=new String[line];
            
            while(in.hasNextLine()){
                 if(j==line){
                    break;
                }
               String sentence=in.nextLine();
                String []ayat1=sentence.split(",");
                oid[j]=ayat1[0];
                pid1[j]=ayat1[1];
                quantity[j]=Integer.parseInt(ayat1[2]);
                j++;
                for(String b : ayat1){
                   System.out.println(b);
               }
            }
            
             in.close();
             in1.close();
            //must follow the order
            double[] price1=new double[line];
            double total[]=new double [line];//search for the correct pid
            for(int k=0;k<line;k++){//order
               for(int l=0;l<line1;l++){//product
                   if(pid1[k].equals(pid[l])){
                       total[k]=price[l]*quantity[k];
                       price1[k]=price[l];
                   }
               }
            }
            System.out.println("ProductID "+"  ProductName           "+"Quantity "+"PricePerUnit "+"  Total");
            for(int k=0;k<line1;k++){
            System.out.printf("%-10s %-24s %-9s %-11s %-5s",pid1[k],pname[k],quantity[k],price1[k],total[k]+"\n");
            }
            
        }catch(Exception e){}
    }
    
}

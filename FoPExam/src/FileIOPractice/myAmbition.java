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
public class myAmbition {
    public static void main(String[] args) {
        try{
            int words=0;
            int sentences=0;
            //create an array to store the words and check each array if there is a .
           
        Scanner in= new Scanner(new FileInputStream("myAmbition.txt"));
        //check how many words
        while(in.hasNext()){
            in.next();
            words++;
        }
        in.close();
        int i=0;
        String sentence[]= new String[words];//
        String ayat[]=new String[words];
        in = new Scanner(new FileInputStream("myAmbition.txt"));
         while(in.hasNext()){
             sentence[i]=in.next();
             ayat[i]=sentence[i].toLowerCase();
             i++;
                     
         }
         for(String s: sentence){
             System.out.println(s);
         }
         for(int j=0;j<sentence.length;j++){
             for(int k=0;k<sentence[j].length();k++){
                 if(sentence[j].charAt(k)=='.'){
                     sentences++;
                 }
             }
         }
         String ayat1="";
         for(int j=0;j<sentence.length;j++){
            ayat1+=ayat[j];
            
         }
         in.close();
            System.out.println("Number of words is : "+words);
            System.out.println("Number of sentences is : "+sentences);
            
            frequency(ayat1);
        }catch(FileNotFoundException e){}
}
    public static void frequency(String full){
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,y=0,x=0,z=0;
        for(int a1=0;i<full.length();a1++){
         switch(full.charAt(a1)){
               case 'a':
                    a++;
                    break;
                case 'b':
                    b++;  
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'f':
                    f++;
                    break;
                case 'g':
                    g++;
                    break;
                case 'h':
                    h++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'j':
                    j++;
                    break;
                case 'k':
                    k++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'm':
                    m++;
                    break;
                case 'n':
                    n++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'p':
                    p++;
                    break;
                case 'q':
                    q++;
                    break;
                case 'r':
                    r++;
                    break;
                case 's':
                    s++;
                    break;
                case 't':
                    t++;
                    break;
                case 'u':
                   u++;
                   break;
                case 'v':
                   v++;
                   break;
                case 'w':
                    w++;
                    break;
                case 'x':
                    x++;
                    break;
                case 'y':
                    y++;
                    break;
                case 'z':
                    z++;    
                    break;
              
             }
             if(a1==258){
                 break;
             }
        }
        System.out.println("A : "+a+" B : "+b+" C : "+c+" D : "+d+" E : "+e+" F : "+f+" G : "+g+" H : "+h);
        System.out.println("I : "+i+" J : "+j+" K : "+k+" L : "+l+" M : "+m+" N : "+n+" O : "+o+" P : "+p);
        System.out.println("Q : "+q+" R : "+r+" S : "+s+" T : "+t+" U : "+u+" V : "+v+" W : "+w+" X : "+x);
        System.out.println("Y : "+y+" Z : "+z   );
        
    
}
}

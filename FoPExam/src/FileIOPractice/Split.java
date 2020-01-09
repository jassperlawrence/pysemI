/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Jassper
 */
public class Split {
    public static void main(String[] args) {
        try{
          PrintWriter p= new PrintWriter(new FileOutputStream("logs.txt"));
          
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          p.print("12/12/2000 -- AAAA/BBBB/CCCC/DDDD/EEEE/FFFF\n");
          
          p.close();
        }catch(FileNotFoundException e){}
    }
    
}

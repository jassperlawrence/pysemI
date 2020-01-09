/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jassper
 */
public class Genome1 {
    public static void main(String[] args) {
        String test = "java <c> ranch <c> ";
        Pattern pattern = Pattern.compile("<c>");
        Matcher matcher = pattern.matcher(test);
 
while (matcher.find()){
     System.out.println(matcher.start());
     System.out.println(matcher.end());
}
    }
    
}

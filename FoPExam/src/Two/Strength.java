/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Random;

/**
 *
 * @author Jassper
 */
public class Strength extends Hero {
    
    
    
    public Strength(String name, String type, int hp) {
        super(name, type, hp);
    }
    
    public static int damage(){
        Random r = new Random();
        return r.nextInt(8)+3;
    }
    
    
}

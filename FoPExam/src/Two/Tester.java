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
public class Tester {
    
    public static void main(String[] args) {
//        PermanentStaff p1 = new PermanentStaff("Ahmad Taheri","801001-14-1765","A03");
//        System.out.println(p1.toString());
//        
//        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "811223-08-3301",23);
//        System.out.println(p2.toString());
         Strength a = new Strength("Chaos Knight","Strength",30);
         a.display();
         Agility b = new Agility("Bloodseeker","Agility",25);
         b.display();
         playGame(a,b);
                
    }
    public static void playGame(Strength a,Agility b){
        Random r= new Random();
        int first =r.nextInt(2);
        if(first==0){
            //a goes first
            while(b.hp>=0&&a.hp>=0){
           int attack=a.damage();
           b.setHp(b.hp-attack);
           System.out.println(a.getName()+" damage "+attack+" *** "+b.getName()+"("+b.type+") - HP: "+b.getHp());
           attack=b.damage();
           a.setHp(a.hp-attack);
           System.out.println(b.getName()+" damage "+attack+" *** "+a.getName()+"("+a.type+") - HP: "+a.getHp());
        }
            if(a.hp>=0){
            System.out.println(a.getName()+" wins the game");
        }
        else
             System.out.println(b.getName()+" wins the game");
        }
        else{
           while(b.hp>=0&&a.hp>=0){
           int attack=b.damage();
           a.setHp(a.hp-attack);
           System.out.println(b.getName()+" damage "+attack+" *** "+a.getName()+"("+a.type+") - HP: "+a.getHp());
           attack=a.damage();
           b.setHp(b.hp-attack);
           System.out.println(a.getName()+" damage "+attack+" *** "+b.getName()+"("+b.type+") - HP: "+b.getHp());
        }
           if(a.hp>=0){
            System.out.println(a.getName()+" wins the game");
        }
        else
             System.out.println(b.getName()+" wins the game");
        }
        
        
    }
    
}

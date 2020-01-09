/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

/**
 *
 * @author Jassper
 */
public class Point extends CreditCard{
    
    public Point(String name, String number) {
        super(name, number);
        this.type="Point";
    }
     public void getReward(String a,double total){
         double point=0;
         double score;
         switch(a){
             case ("Monday"):
                point=Math.floor(total);
             case ("Tuesday"):
                point=Math.floor(total);
             case ("Wednesday"):
                point=Math.floor(total);
             case ("Thursday"):
                point=Math.floor(total);
             case ("Friday"):
                point=2*Math.floor(total);
             case ("Saturday"):
                point=3*Math.floor(total);
             case("Sunday"):
                point=4*Math.floor(total);
         }
         score=point*0.01;
         this.reward+=score;
     }
}

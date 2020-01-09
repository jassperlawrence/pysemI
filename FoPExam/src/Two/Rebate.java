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
public class Rebate extends CreditCard {

    public Rebate(String name, String number) {
        super(name, number);
        this.type="Rebate";
    }
    public void getReward(String a,double total){
        double b=0;
        switch(a){
            case "Grocery":
                b= 0.2*total;
            case "Fuel":
                b=0.8*total;
            case "Utility":
               b=0.5*total; 
            case "Other":
               b=0.02*total;    
               
        }
        System.out.println("b is "+b);
        this.reward+=b;
        
    }
    
    
}

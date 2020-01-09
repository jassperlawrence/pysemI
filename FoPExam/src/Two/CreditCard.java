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
public class CreditCard {
    
    protected String name,number,type;
    protected double reward;

    public CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
        
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    
    public String toString() {
        return "Credit Card : "+name+"  ("+number+")"+"\nCard Type: "+type+"\nTotal Cash Reward: "+reward;
    }

    
    
    
    
    
    
}

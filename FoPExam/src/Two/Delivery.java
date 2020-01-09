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
public class Delivery {
    
    protected String sender,recipient;
    protected double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(double w){
        
        double w2=w;
        double cost=0;//w2!=0 decrement and add until total is obtained
        while(true){
           if(w2<=5) {
           cost+=(2.8*w2);
           w2=0;
           break;
        }
        
        if(w2>5&&w2<=20){
            cost+=(5.2*(w2-5));
             w2=5;  
             
        }
        if(w2>20&&w2<=50){
            cost+=(7*(w2-20));
             w2=20;  
        }
        if(w2>50){
           cost+=(8.6*(w2-50));
           w2=50;  
        }
         
    }
         return cost;
    }
    @Override
    public String toString() {
        return "From : "+sender+" To: "+recipient+"\nWeight of Package :"+weight+"\nShipping Cost : "+totalCost(weight);
    }
    
    
    
    
}

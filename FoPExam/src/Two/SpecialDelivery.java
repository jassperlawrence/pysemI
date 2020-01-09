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
public class SpecialDelivery extends Delivery {
    
    private boolean weekend,night;//cannot override static method but can overload

    public SpecialDelivery( String sender, String recipient, double weight,boolean weekend, boolean night) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.night = night;
    }
     public  double totalCost(double w){
        if(weekend==true&&night==true){
            return (super.totalCost(weight)*1.2)+50;
        } 
        else if(weekend==false&&night==true){
         return (super.totalCost(weight)*1.2);
     }
        else if(weekend==true&&night==false){
            return (super.totalCost(weight)+50);
        }
        else
            return super.totalCost(weight);
     }

    @Override
    public String toString() {
        if(weekend==true&&night==true){
           return super.toString()+"\nWeekend Delivery+\nNight Time Delivery";
        } 
        else if(weekend==false&&night==true){
          return super.toString()+"\nNight Time Delivery";
     }
        else if(weekend==true&&night==false){
             return super.toString()+"\nWeekend Delivery";
        }
        else
            return super.toString();
    }
     
     
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyearq;

/**
 *
 * @author Jassper
 */
public class Watermelon extends Fruit{
    
    private  double weight;

    public Watermelon(double weight, String name, String type) {
        super(name, type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        if(type.equalsIgnoreCase("Imported")){
            if(weight<2){
                return weight*3.75;
        }
            else if(weight>2&&weight<5){
                return weight*3.45;
            }
            else if(weight>5){
                return weight*3.15;
            }
       
   }
        if(type.equalsIgnoreCase("Local")){
            if(weight<2){
                return weight*2.25;
        }
            else if(weight>2&&weight<5){
                return weight*1.95;
            }
            else if(weight>5){
                return weight*1.65;
            }
        }
        
         return 0;
    }

    @Override
    public String toString() {
       return super.toString()+"-"+weight+"=RM"+totalPrice();
    }
    
    
    
}
    

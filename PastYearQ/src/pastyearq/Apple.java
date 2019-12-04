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
public class Apple extends Fruit{

    private int quantity;
    
    public Apple(String name, String type,int quantity) {
        super(name, type);
        this.quantity=quantity;
    }

    @Override
    public double totalPrice() {
       if(type.equalsIgnoreCase("Red")){
           return quantity*1.8;
       }
       else if(type.equalsIgnoreCase("Green")){
           return quantity*1.2;
       }
       else
           return 0;

    }

    @Override
    public String toString() {
        return super.toString()+"-"+quantity+"=RM"+totalPrice();
    }
    
    

    

    
    
    
    
}

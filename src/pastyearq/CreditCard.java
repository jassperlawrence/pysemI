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
public class CreditCard {
    
    protected String name;
    protected String number;
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    protected double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
        
    }

    @Override
    public String toString() {
        return "Credit Card: "+name+"("+number+")\n"+"Card Type: "+type;
    }
    
    
    
    
    
}

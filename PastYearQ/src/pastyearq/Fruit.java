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
public abstract class Fruit {
    protected String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }
   public abstract double totalPrice();

    @Override
    public String toString() {
        return type+" "+name;
    }
   
}

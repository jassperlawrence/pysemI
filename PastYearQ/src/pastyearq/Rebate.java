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
public class Rebate extends CreditCard{

    public Rebate(String name, String number) {
        super(name, number);
        getType();
        setType("Cash Rebate");
        
       
    }
    public void getReward(String type,double Total){
         getTotal();//method overriding
         setTotal(total);
         total=Total;
         if(type.equalsIgnoreCase("Grocery")){
             total+=.08*total;
         }
         if(type.equalsIgnoreCase("Fuel")){
              total+=.05*total;
         }
         if(type.equalsIgnoreCase("Utility")){
              total+=.02*total;
         }
         if(type.equalsIgnoreCase("Other")){
              total+=0.002*total;
         }
         else
             total=total;
        
    }
    public void display(){
        System.out.println(super.toString()+"\nTotal: RM"+total);
    }
    
}

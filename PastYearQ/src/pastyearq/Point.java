/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyearq;

import java.text.DecimalFormat;

/**
 *
 * @author Jassper
 */
public class Point extends CreditCard {
    
    

    public Point(String name, String number) {
        super(name, number);
        getType();
        setType("Point Reward");
        
    }
    
    
    
        public void getReward(String day,double Total){
        
        getTotal();
        setTotal(total);
        
        if(day.equalsIgnoreCase("Friday"))
            Total=Total*2;
        else if(day.equalsIgnoreCase("Saturday"))
            Total*=3;
        else if(day.equalsIgnoreCase("Sunday"))
            Total*=4;
        else if(day.equalsIgnoreCase("Monday")){
            Total*=1;
        }
        else if(day.equalsIgnoreCase("Tuesday")){
            Total*=1;
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            Total*=1;
        }
        else if(day.equalsIgnoreCase("Thursday")){
            Total*=1;
        }
        Total=Total*0.01;
        
         int a=(int)Total;
         total=a;
        
        
    }

    public void display(){
        System.out.println(super.toString()+"\nTotal: RM"+String.format("%.0f", total));
    }
    
        
    
}

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
public class Test {
    public static void main(String[] args) {
//        Rebate a = new Rebate("John Lim","1111222233334444");
//        a.getReward("Grocery",124.8);
//        a.display();
//        Point p= new Point("John ","1111222233334444");
//        p.getReward("Saturday", 124.8);
//        a.display();
        String cheapest;
        Apple a = new Apple("Apple","Red",8);
        a.totalPrice();
        System.out.println(a.toString());
        Watermelon b= new Watermelon(7.6,"Watermelon","Local");
        b.totalPrice();
        System.out.println(b.toString());
        if(a.totalPrice()<b.totalPrice()){
            cheapest=b.toString();
        }
        else
            cheapest=b.toString();
        
        System.out.println("Cheapest item is \n"+cheapest);
        
    }
    
}

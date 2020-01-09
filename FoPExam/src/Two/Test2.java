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
public class Test2 {
    public static void main(String[] args) {
        Rebate r = new Rebate ("John Lim","1111222233334444");
        Point p= new Point("John Lim","5555666677778888");
        r.getReward("Grocery", 124.8);
        p.getReward("Saturday", 124.8);
        r.getReward("Other", 64.6);
        p.getReward("Friday", 64.6);
        r.getReward("Fuel", 95.4);
        p.getReward("Sunday", 95.4);
        r.getReward("Utility", 100);
        p.getReward("Friday", 100);
        r.getReward("Other", 220);
        p.getReward("Tuesday", 220);
        System.out.println(r.toString());
        System.out.println(p.toString());
        if(r.getReward()>p.getReward()){
            System.out.println("The best card is Cash Rebate Card");
        }
        else
            System.out.println("The best card is Point Reward");
    }
}

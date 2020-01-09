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
public class PartTimeStaff extends Staff{
    
    protected int num;

    public PartTimeStaff( String name, String IC,int num) {
        super(name, IC);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int getSalary(){
        return (num*50);
    }

    @Override
    public String toString() {
        return super.toString()+"\nNumber of working hours : "+num+"\nSalary: RM"+getSalary()+"\n";
    }
    
    
    
    
}

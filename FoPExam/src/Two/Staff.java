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
public class Staff {
    protected String name,IC;

    public Staff(String name, String IC) {//accessor and mutator method
        this.name = name;
        this.IC = IC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }
    
    

    @Override
    public String toString() {
        return "Full Name : "+name+"\nIC : "+IC;
    }
    
    
    
}

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
public class PermanentStaff extends Staff{
    
    protected String grade;

    public PermanentStaff(String name, String IC,String grade) {
        super(name, IC);
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getSalary(){
        switch(grade){
            case "A01":
                return "RM5000";
            case "A02":
                return "RM4000";
            case "A03":
                return "RM3000";
            case "A04":
               return "RM2000";    
                
        }
           return"0";     
    }

    @Override
    public String toString() {
        return super.toString()+"\nGrade: "+grade+"\nSalary: "+getSalary()+"\n";
    }
    
    
    
    
}

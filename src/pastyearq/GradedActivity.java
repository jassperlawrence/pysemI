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
public class GradedActivity {
    
    protected int numeric_score;

    public int getNumeric_score() {
        return numeric_score;
    }

    public void setNumeric_score(int numeric_score) {
        this.numeric_score = numeric_score;
    }
    
    public String getGrade(){
        if(numeric_score>=90){
            return "A";
        }
        else if(numeric_score>=80){
            return "B";
        }
        else if(numeric_score>=70){
            return "C";
        }
        else if(numeric_score>=60){
            return "D";
        }
        else{
            return "F";
        }
        
    }

    @Override
    public String toString() {
        return "Total Score: "+numeric_score+"\nGrade: "+getGrade();
    }
    
    
}

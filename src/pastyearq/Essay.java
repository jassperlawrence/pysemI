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
public class Essay extends GradedActivity {
    
    private int grammar,spelling,length,content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        setNumeric_score(grammar+spelling+length+content);
    }

    
    public String toString() {
        return "Grammar: "+grammar+"\nSpelling:" +spelling+"\nLength: "+length+"\nContent: "+content+"\n"+super.toString();
    }
    

   
    
    
    
}

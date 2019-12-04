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
public class LinearEquation {
    
    private int a,b,c,d,e,f ;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return a+"x+"+b+"y="+e+"\n"+c+"x+"+d+"y="+f;
    }
    
    public boolean isSolvable(){
        if((a*d)-(b*c)==0){
            return false;
        }
        else
            return true;
    }
    
    public int computeX(){
        return (e*d-b*f)/(a*d-b*c); 
    }
       public int computeY(){
        return (a*f-e*c)/(a*d-b*c); 
    } 
    
    
}

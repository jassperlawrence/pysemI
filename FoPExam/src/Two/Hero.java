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
public class Hero {
    
    protected String name, type;
    protected int hp;

    public Hero(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp=hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
    public void display() {
        System.out.println(name+" ("+type+") - HP: "+hp);
    }
    
    
            
}

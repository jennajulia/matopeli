/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.osaset;

import java.util.Objects;

/**
 *
 * @author Omistaja
 */
public class Koordinaatti {
    
    private Integer x;
    private Integer y;
    
    public Koordinaatti(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public boolean tormaa(Koordinaatti xy) {
        return Objects.equals(this.x, xy.x) && Objects.equals(this.y, xy.y);
        //return this.x == xy.x && this.y == xy.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.pisteet;

/**
 *
 * @author Omistaja
 */
public class PisteLaskuri {
    
    private int pisteet;
    
    public PisteLaskuri() {
        this.pisteet = 0;
    }
    
    public void lisaaPiste() {
        this.pisteet++;
    }
    
    public int getPisteet() {
        return this.pisteet;
    }
    
    public void nollaa() {
        this.pisteet = 0;
    }
    
}

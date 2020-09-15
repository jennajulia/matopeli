/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.osaset;


import matopeli.osaset.Koordinaatti;
import java.util.ArrayList;
import java.util.List;
import matopeli.Suunta;

/**
 *
 * @author Omistaja
 */
public class Mato {
    
    private ArrayList<Koordinaatti> matoJono;
    private Suunta suunta;
    final Integer aloitusPituus = 3;
    private boolean syo;
    
    public Mato(){
        this.matoJono = new ArrayList<Koordinaatti>();
        this.matoJono.add(new Koordinaatti(10, 10));
        this.syo = false;
        this.suunta = Suunta.RIGHT;
    }
    
    public Suunta getSuunta(){
        return this.suunta;
    }
    
    public void setSuunta(Suunta suunta){
        this.suunta = suunta;
    }
    
    public List<Koordinaatti> getKoordinaatit(){
        return this.matoJono;
    }
    
    public Integer getJononPituus(){
        return this.matoJono.size();
    }
    
    public void liikkuu(){
        Koordinaatti kohta = this.matoJono.get(0);
        
        int nextX = kohta.getX();
        int nextY = kohta.getY();
        
        if (null != this.suunta)switch (this.suunta) {
            case DOWN:
                nextY = nextY + 1;
                break;
            case LEFT:
                nextX = nextX - 1;
                break;
            case RIGHT:
                nextX = nextX + 1;
                break;
            case UP:
                nextY = nextY - 1;
                break;
            default:
                break;
        }
        
        this.matoJono.add(0, new Koordinaatti(nextX, nextY));
        
        if (!this.syo && this.matoJono.size() > this.aloitusPituus){
            this.matoJono.remove(this.matoJono.size() -1);
        } else {
            this.syo = false;
        }
    }
    
    public void syo(){
        this.syo = true;
    }
    
    public boolean tormaaItseensa(){
        return tormaa(this.matoJono.get(0));
    }
    
    public boolean tormaa(Koordinaatti xy){
        for(Koordinaatti kohta : this.matoJono){
            if (kohta != xy && kohta.tormaa(xy)){
                return true;
            }
        }
        return false;
    }
    
}

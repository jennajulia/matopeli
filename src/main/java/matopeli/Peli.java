/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;

import matopeli.osaset.Mato;
import matopeli.osaset.Koordinaatti;
import matopeli.osaset.Syotti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import matopeli.pisteet.PisteLaskuri;

/**
 *
 * @author Omistaja
 */
public class Peli extends Timer implements ActionListener {
    
    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitys paivitys;
    private Mato mato;
    private Syotti syotti;
    private PisteLaskuri laskuri;

    public Peli(int leveys, int korkeus) {
        super(1000, null);
        
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;
        
        this.syotti = arvoOmena();
        this.mato = new Mato();
        
        this.laskuri = new PisteLaskuri();
        
        addActionListener(this);
        setInitialDelay(2000);
    }
    
    public boolean jatkuu() {
        return jatkuu;
    }
    
    public Integer getKorkeus(){
        return this.korkeus;
    }
    
    public Integer getLeveys(){
        return this.leveys;
    }
    
    public void setPaivitettava(Paivitys paivitys) {
        this.paivitys = paivitys;
    }
    
    public Mato getMato() {
        return mato;
    }
    
    public void setMato(Mato mato) {
        this.mato = mato;
    }
    
    public Syotti getOmena() {
        return syotti;
    }
    
    public void setSyotti(Syotti syotti) {
        this.syotti = syotti;
    }
    
    public Integer pisteet(){
        return this.laskuri.getPisteet();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!jatkuu) {
            return;
        }
        liiku();
        syoOmena();
        tarkistaTormaykset();
        piirra();
        setDelay(100);
    }
    
    private void liiku() {
        mato.liikkuu();
    }
    
    private void syoOmena() {
        if (!mato.tormaa(syotti)) {
            return;
        }
        syotti = arvoOmena();
        mato.syo();
        this.laskuri.lisaaPiste();
    }
    
    private void tarkistaTormaykset() {
        List<Koordinaatti> palat = mato.getKoordinaatit();
        
        Koordinaatti eka = mato.getKoordinaatit().get(0);
        
        if(eka.getX() == -1 | eka.getY() == -1 | eka.getX() == this.korkeus+10 | eka.getY() == this.leveys+8){
            jatkuu = false;
        }
        
        for (int i = 1; i < mato.getKoordinaatit().size(); i++) {
            if (eka.tormaa(palat.get(i))) {
                jatkuu = false;
            }
        }   
    }
    
    private void piirra() {
        paivitys.paivitys();
    }
    
    private Syotti arvoOmena() {
        Random random = new Random();
        return new Syotti(random.nextInt(this.getKorkeus()+8), random.nextInt(this.leveys)+8);
    }
    
    public void aloitaUusiPeli(){
        if(this.jatkuu == false){
            this.mato = new Mato();
            this.syotti = arvoOmena();
            this.jatkuu = true;
            this.laskuri.nollaa();
        }
    }
    
    
}

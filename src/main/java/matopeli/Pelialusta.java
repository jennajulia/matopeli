/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;

import matopeli.osaset.Mato;
import matopeli.osaset.Koordinaatti;
import matopeli.osaset.Syotti;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Omistaja
 */
public class Pelialusta extends JPanel implements Paivitys {
    
    private final Peli peli;
    private final int palanSivunPituus;
    
    public Pelialusta(Peli peli, int palanSivunPituus) {
        super.setBackground(Color.BLACK);
        this.peli = peli;
        this.palanSivunPituus = palanSivunPituus;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        piirraMato(graphics);
        piirraOmena(graphics);
        piirraPisteTilanne(graphics);
        if(peli.jatkuu() == false){
            peliLoppui(graphics);
        }
    }
    
    private void peliLoppui(Graphics graphics){
        int pisteet = peli.pisteet();
        Font fontti = new Font("SansSerif", Font.PLAIN, 24);
        graphics.setFont(fontti);
        graphics.drawString("Peli loppui! Yhteensä " + pisteet + " pistettä", 150, 250);
    }
    
    private void piirraPisteTilanne(Graphics graphics){
        int pisteet = peli.pisteet();
        Font fontti = new Font("SansSerif", Font.PLAIN, 24);
        graphics.setFont(fontti);
        graphics.drawString("Pisteet " + pisteet, 25, 25);
    }

    private void piirraMato(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        Mato mato = peli.getMato();
        for (Koordinaatti koordinaatti : mato.getKoordinaatit()) {
            graphics.fill3DRect(
                    koordinaatti.getX() * this.palanSivunPituus,
                    koordinaatti.getY() * this.palanSivunPituus,
                    this.palanSivunPituus,
                    this.palanSivunPituus,
                    true);
        }
    }
    
    private void piirraOmena(Graphics graphics) {
        Syotti syotti = peli.getOmena();
        graphics.setColor(Color.BLUE);
        graphics.fillOval(
                syotti.getX() * this.palanSivunPituus,
                syotti.getY() * this.palanSivunPituus,
                this.palanSivunPituus,
                this.palanSivunPituus);
    }
    
    @Override
    public void paivitys() {
        repaint();
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;


import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Omistaja
 */
public class Sovellusliittyma extends JFrame implements Runnable {
    private JFrame frame;
    private Pelialusta pelialusta;
    private final Peli peli;
    private final Integer alustanKoko = 20;
    
    public Sovellusliittyma(Peli peli){
        this.peli = peli;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Extreme Matopeli");
        frame.setPreferredSize(new Dimension(600, 600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void luoKomponentit(Container container) {
        pelialusta = new Pelialusta(peli, alustanKoko);
        container.add(pelialusta);
        
        NappaimistoKomennot kuuntelija = new NappaimistoKomennot(peli.getMato());
        
        frame.addKeyListener(kuuntelija);
        
    }

    public Paivitys getPaivitettava() {
        return pelialusta;
    }

    public JFrame getFrame() {
        return frame;
    }
    
}

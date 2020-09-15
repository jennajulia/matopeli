/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;

import javax.swing.SwingUtilities;

/**
 *
 * @author Omistaja
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Peli peli = new Peli(20, 20);

        Sovellusliittyma sovellusliittyma = new Sovellusliittyma(peli);
        SwingUtilities.invokeLater(sovellusliittyma);
        
        while (sovellusliittyma.getPaivitettava() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Virhe");
            }
        }
        
        peli.setPaivitettava(sovellusliittyma.getPaivitettava());
        peli.start();
        
    }
    
}

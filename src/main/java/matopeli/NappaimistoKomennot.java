/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;

import matopeli.osaset.Mato;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Omistaja
 */
public class NappaimistoKomennot extends KeyAdapter {
    
    private Mato mato;
    
    public NappaimistoKomennot(Mato mato) {
        this.mato = mato;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if(mato.getSuunta() != Suunta.DOWN){
                    mato.setSuunta(Suunta.UP);
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(mato.getSuunta() != Suunta.LEFT){
                    mato.setSuunta(Suunta.RIGHT);
                }
                break;
            case KeyEvent.VK_DOWN:
                if(mato.getSuunta() != Suunta.UP){
                    mato.setSuunta(Suunta.DOWN);
                }
                break;
            case KeyEvent.VK_LEFT:
                if(mato.getSuunta() != Suunta.RIGHT){
                    mato.setSuunta(Suunta.LEFT);
                }
                break;
            default:
                break;
        }
    }
    
}

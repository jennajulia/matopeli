/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli;

import java.awt.event.ActionEvent;
import matopeli.osaset.Mato;
import matopeli.osaset.Syotti;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Omistaja
 */
public class PeliTest {
    
    public PeliTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of jatkuu method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testJatkuu() {
        System.out.println("jatkuu");
        Peli instance = null;
        boolean expResult = false;
        boolean result = instance.jatkuu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKorkeus method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testGetKorkeus() {
        System.out.println("getKorkeus");
        Peli instance = null;
        Integer expResult = null;
        Integer result = instance.getKorkeus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeveys method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testGetLeveys() {
        System.out.println("getLeveys");
        Peli instance = null;
        Integer expResult = null;
        Integer result = instance.getLeveys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaivitettava method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testSetPaivitettava() {
        System.out.println("setPaivitettava");
        Paivitys paivitys = null;
        Peli instance = null;
        instance.setPaivitettava(paivitys);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMato method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testGetMato() {
        System.out.println("getMato");
        Peli instance = null;
        Mato expResult = null;
        Mato result = instance.getMato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMato method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testSetMato() {
        System.out.println("setMato");
        Mato mato = null;
        Peli instance = null;
        instance.setMato(mato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOmena method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testGetOmena() {
        System.out.println("getOmena");
        Peli instance = null;
        Syotti expResult = null;
        Syotti result = instance.getOmena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSyotti method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testSetSyotti() {
        System.out.println("setSyotti");
        Syotti syotti = null;
        Peli instance = null;
        instance.setSyotti(syotti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pisteet method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testPisteet() {
        System.out.println("pisteet");
        Peli instance = null;
        Integer expResult = null;
        Integer result = instance.pisteet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Peli instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aloitaUusiPeli method, of class Peli.
     */
    @org.junit.jupiter.api.Test
    public void testAloitaUusiPeli() {
        System.out.println("aloitaUusiPeli");
        Peli instance = null;
        instance.aloitaUusiPeli();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.osaset;

import java.util.List;
import matopeli.Suunta;
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
public class MatoTest {
    
    @BeforeAll
    public void setUp(){
        
    }
    
    public MatoTest() {
    }
    
    @Test
    public void testLiikkuu() {
        
        Mato mato = new Mato();
        
        Koordinaatti k = mato.getKoordinaatit().get(0);
        Koordinaatti a = new Koordinaatti(k.getX()+1, k.getY());
        mato.liikkuu();
        assertEquals(a.getX(), mato.getKoordinaatit().get(0).getX());
    }
    
    
    @Test
    public void matoTormaaItseensa() {
        
        Mato mato = new Mato();
        
        mato.liikkuu();
        mato.setSuunta(Suunta.DOWN);
        mato.liikkuu();
        mato.setSuunta(Suunta.RIGHT);
        mato.syo();
        mato.liikkuu();
        mato.setSuunta(Suunta.UP);
        mato.syo();
        mato.liikkuu();
        
        assertEquals(true, mato.tormaaItseensa());
    }
    
    @Test
    public void testSetSuunta() {
        
        Mato mato = new Mato();
        mato.setSuunta(Suunta.UP);
        
        assertEquals(Suunta.UP, mato.getSuunta());
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getSuunta method, of class Mato.
//     */
//    @Test
//    public void testGetSuunta() {
//        System.out.println("getSuunta");
//        Mato instance = new Mato();
//        Suunta expResult = null;
//        Suunta result = instance.getSuunta();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSuunta method, of class Mato.
//     */
//    @Test
//    public void testSetSuunta() {
//        System.out.println("setSuunta");
//        Suunta suunta = null;
//        Mato instance = new Mato();
//        instance.setSuunta(suunta);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKoordinaatit method, of class Mato.
//     */
//    @Test
//    public void testGetKoordinaatit() {
//        System.out.println("getKoordinaatit");
//        Mato instance = new Mato();
//        List<Koordinaatti> expResult = null;
//        List<Koordinaatti> result = instance.getKoordinaatit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getJononPituus method, of class Mato.
//     */
//    @Test
//    public void testGetJononPituus() {
//        System.out.println("getJononPituus");
//        Mato instance = new Mato();
//        Integer expResult = null;
//        Integer result = instance.getJononPituus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of liikkuu method, of class Mato.
//     */
//    @Test
//    public void testLiikkuu() {
//        System.out.println("liikkuu");
//        Mato instance = new Mato();
//        instance.liikkuu();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of syo method, of class Mato.
//     */
//    @Test
//    public void testSyo() {
//        System.out.println("syo");
//        Mato instance = new Mato();
//        instance.syo();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tormaaItseensa method, of class Mato.
//     */
//    @Test
//    public void testTormaaItseensa() {
//        System.out.println("tormaaItseensa");
//        Mato instance = new Mato();
//        boolean expResult = false;
//        boolean result = instance.tormaaItseensa();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tormaa method, of class Mato.
//     */
//    @Test
//    public void testTormaa() {
//        System.out.println("tormaa");
//        Koordinaatti xy = null;
//        Mato instance = new Mato();
//        boolean expResult = false;
//        boolean result = instance.tormaa(xy);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

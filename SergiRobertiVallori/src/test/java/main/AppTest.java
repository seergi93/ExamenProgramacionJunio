/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import static main.App.collectIds;
import static main.App.explodeMrMeeseeks;
import static main.App.ids;
import static main.App.setMrMe;
import meeseeks.MrMeeseeks;
import meeseeks.ProxyMrMeeseeks;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class AppTest {

    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        App.setMrMe.clear();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
    /**
     * Test of explodeMrMeeseeks method, of class App.
     */
    @Test
    public void botonCrearMeeseek() {

        ProxyMrMeeseeks box = new ProxyMrMeeseeks();
        box.pushButton(setMrMe);
        assertNotNull(setMrMe);

    }

    @Test
    public void collectIDS() {
        ProxyMrMeeseeks box = new ProxyMrMeeseeks();
        box.pushButton(setMrMe);
        collectIds(setMrMe, ids);
        assertNotNull(ids);

    }

    @Test
    public void eliminarMeeseek() {

        ProxyMrMeeseeks box = new ProxyMrMeeseeks();
        box.pushButton(setMrMe);
        App.collectIds(setMrMe, ids);
        System.out.println("Adios, Mr Meeseeks...");
        for (Integer id : ids) {
            explodeMrMeeseeks(setMrMe, id);
        }

        assertEquals(0, setMrMe.size());

    }

}

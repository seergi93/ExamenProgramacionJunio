/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
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

    @Test
    public void botonCrearMeeseek() {
        ProxyMrMeeseeks box = new ProxyMrMeeseeks();

        box.pushButton(App.setMrMe);
        assertNotNull(App.setMrMe);
        assertNotNull(App.ids);

    }

    @BeforeClass
    public static void setUpClass() {

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

}

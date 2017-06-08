/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import meeseeks.MrMeeseeks;
import meeseeks.ProxyMrMeeseeks;

/**
 *
 * @author Sergi
 */
public class App {

    // Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
    public static ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
    public static ArrayList<Integer> ids = new ArrayList<>();
    public static ProxyMrMeeseeks box = new ProxyMrMeeseeks();

    public static void main(String[] args) {


        box.pushButton(setMrMe);
        System.out.println("Open Jerry's stupid mayonnaise jar");
        box.getMrMe().formulateRequest("Open", "stupid jar");
        System.out.println();

        box.pushButton(setMrMe);
        System.out.println("I wanna be popular at school!");
        box.getMrMe().formulateRequest("Be", "popular at school");
        System.out.println();

        box.pushButton(setMrMe);
        System.out.println("I wanna be a more complete woman!");
        box.getMrMe().formulateRequest("Be", "a more complete woman");
        System.out.println();

        System.out.println("Estos son los Mr Meeseeks creados:");
        listMrMeeseeks(setMrMe);
        System.out.println();

        collectIds(setMrMe, ids);

        System.out.println("Adios, Mr Meeseeks...");
        for (Integer id : ids) {
            explodeMrMeeseeks(setMrMe, id);
        }
    }

    /* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
     */

 /* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
     */

 /* explodeMrMeeseeks(setMrMe, id)
		 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
     */
    private static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {

        for (MrMeeseeks mrme : App.setMrMe) {
            System.out.println(mrme.getId());
        }

    }

    private static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
        for (MrMeeseeks mrme : App.setMrMe) {
            App.ids.add(mrme.getId());

        }

    }

    private static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id) {
       
        App.ids.remove(id);
        setMrMe.get(id).sayMessageOnExplode();
        
        
        
        
    
    }
}

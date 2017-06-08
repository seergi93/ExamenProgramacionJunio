/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeseeks;

/**
 *
 * @author Sergi
 */
import interfaces.Doable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import main.App;

// cambia el nombre de la clase
public class MrMeeseeks  {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private Integer id;
    private String[] mrMeesesksResonse = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
    private String onDone = "All Done", onExplode = "Pooooof";
    private String[] messatgeOnRequestString;

    public MrMeeseeks() {
        this.id = ID_GENERATOR.incrementAndGet();
    }

    public void formulateRequest(String verbo, String adjetivo) {

        sayMessageOnRequest();
        String sms = doRequest(verbo, adjetivo);
        System.out.println(sms);
        sayMessageOnDone();

    }

    public static AtomicInteger getID_GENERATOR() {
        return ID_GENERATOR;
    }

    public static void setID_GENERATOR(AtomicInteger ID_GENERATOR) {
        MrMeeseeks.ID_GENERATOR = ID_GENERATOR;
    }

    public void sayMessageOnCreate() {
        System.out.println("I'm Mr Meeseeks " + getId() + ".Look at meee!");
    }

    public void sayMessageOnRequest() {
        generateMessageOnRequest();

    }

    public void generateMessageOnRequest() {

        Random random = new Random();
        int aleatorio = random.nextInt(3);

        System.out.println(this.mrMeesesksResonse[aleatorio].toString());

    }

    public void sayMessageOnDone() {

        System.out.println(this.onDone);

    }

    public void sayMessageOnExplode() {

        System.out.println(onExplode+": "+getId());

    }

    public void stopExisting() {
        sayMessageOnExplode();
    }
    
    public String doRequest(String request, String action) {
        String sms = request + " " + action;
        return sms;
    }

    /*
    GETTERS AND SETTERS
     */
    public Integer getId() {
        return id;
    }


}

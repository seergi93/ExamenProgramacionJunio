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
import java.util.concurrent.atomic.AtomicInteger;

// cambia el nombre de la clase
public class MrMeeseeksAlumnado {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private Integer id;

    public MrMeeseeksAlumnado() {
        this.id = ID_GENERATOR.incrementAndGet();
    }

    /* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
     */
}

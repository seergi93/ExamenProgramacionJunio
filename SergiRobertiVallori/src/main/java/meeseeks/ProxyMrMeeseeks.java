/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeseeks;

import java.util.ArrayList;
import main.App;

/**
 *
 * @author Sergi
 */
public class ProxyMrMeeseeks extends MrMeeseeks {


    private MrMeeseeks mrMeeseek = new MrMeeseeks();

    public MrMeeseeks getMrMe() {
        return mrMeeseek;
    }

    public void setMrMeeseek(MrMeeseeks MrMeeseek) {
        this.mrMeeseek = MrMeeseek;
    }

    private void createMrMeeseeks(ArrayList<MrMeeseeks> listaMeeseeks) {
        App.setMrMe.add(mrMeeseek);
        App.ids.add(mrMeeseek.getId());

    }

    public void pushButton(ArrayList<MrMeeseeks> listaMeeseeks) {
        createMrMeeseeks(listaMeeseeks);
        this.mrMeeseek.sayMessageOnCreate();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeseeks;

import java.util.ArrayList;

/**
 *
 * @author Sergi
 */
public class ProxyMrMeeseeks extends MrMeeseeks {

    private MrMeeseeks mrMeeseek = null;

    public MrMeeseeks getMrMe() {
        return mrMeeseek;
    }

    public void setMrMeeseek(MrMeeseeks MrMeeseek) {
        this.mrMeeseek = MrMeeseek;
    }

    public void pushButton(ArrayList<MrMeeseeks> setMrMe) {
        createMrMeeseeks(setMrMe);
        getMrMe().sayMessageOnCreate();
    }

    public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMt) {
        mrMeeseek = new MrMeeseeks();
        setMrMt.add(mrMeeseek);
    }

}

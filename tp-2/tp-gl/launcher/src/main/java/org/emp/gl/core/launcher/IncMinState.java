/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.core.launcher;

/**
 *
 * @author User
 */
public class IncMinState implements IState{

    @Override
    public void changeMode(WatchEngine watchEngine) {
        watchEngine.getAfficheur().makeIncMinFontSizeSmaller();
        watchEngine.getAfficheur().makeIncSecFontSizeBigger();
        watchEngine.setState(new SecIncState());
    }

    @Override
    public void doIncremete(WatchEngine watchEngine) {
        watchEngine.getAfficheur().incMinLabel();
    }
    
}

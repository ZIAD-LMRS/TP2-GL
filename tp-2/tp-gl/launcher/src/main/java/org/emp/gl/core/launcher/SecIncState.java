/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.core.launcher;

/**
 *
 * @author User{

 */
public class SecIncState implements IState {
    @Override
    public void changeMode(WatchEngine watchEngine) {
        watchEngine.getAfficheur().makeIncSecFontSizeSmaller();
        watchEngine.setState(new NormalFunctionState(watchEngine));
    }
    @Override
    public void doIncremete(WatchEngine watchEngine) {
        watchEngine.getAfficheur().incSecLabel();
    }
    
}

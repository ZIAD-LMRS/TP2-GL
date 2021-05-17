/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.core.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.timer.service.TimerService;

/**
 *
 * @author User
 */
public class NormalFunctionState implements IState{

    public NormalFunctionState(WatchEngine watchEngine) {
        TimerService ts=Lookup.getInstance().getService(TimerService.class);
        ts.addTimeChangeListener(watchEngine.getAfficheur());
    }

    NormalFunctionState() {
    
    }

    @Override
    public void changeMode(WatchEngine watchEngine) {
        watchEngine.getAfficheur().makeIncHourFontSizeBigger();
         watchEngine.setState(new IncHourState(watchEngine));
         
    }

    @Override
    public void doIncremete(WatchEngine watchEngine) {
        
    }

}

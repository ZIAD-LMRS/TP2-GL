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
public class IncHourState implements IState {

    public IncHourState(WatchEngine watchEngine) {
       Lookup.getInstance().getService(TimerService.class).removeTimeChangeListener(watchEngine.getAfficheur());
    }
    
    
    @Override
    public void changeMode(WatchEngine watchEngine) {
        watchEngine.getAfficheur().makeIncHourFontSizeSmaller();
        watchEngine.getAfficheur().makeIncMinFontSizeBigger();
        watchEngine.setState(new IncMinState());
    }
    
    @Override
    public void doIncremete(WatchEngine watchEngine) {
      watchEngine.getAfficheur().incHourLabel();
    }

}

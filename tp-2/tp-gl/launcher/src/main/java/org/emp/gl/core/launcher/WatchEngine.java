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
public class WatchEngine  {
    private Afficheur afficheur;
    private IState state;

    public WatchEngine() {
        this.afficheur=Lookup.getInstance().getService(Afficheur.class);
        TimerService ts=Lookup.getInstance().getService(TimerService.class);
        this.afficheur.setHourLabel(String.valueOf(ts.getHeures()));
        this.afficheur.setMinLabel(String.valueOf(ts.getMinutes()));
        this.afficheur.setSecLabel(String.valueOf(ts.getSecondes()));
        this.afficheur.setDisSecLabel(String.valueOf(ts.getDixiemeDeSeconde()));
        this.state=new NormalFunctionState(this);
    }
    
    
    public void changeMode() {
      state.changeMode(this);
    }

    public void doIncremete() {
        state.doIncremete(this);
    }

    void setState(IState iState){
        this.state = iState;
    }
    public void setAfficheur(Afficheur afficheur) {
        this.afficheur = afficheur;
    }

    public Afficheur getAfficheur() {
        return afficheur;
       }
   
}

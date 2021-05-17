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
public interface IState {
    
   public void doIncremete(WatchEngine watchEngine);

   public void changeMode(WatchEngine watchEngine);

}

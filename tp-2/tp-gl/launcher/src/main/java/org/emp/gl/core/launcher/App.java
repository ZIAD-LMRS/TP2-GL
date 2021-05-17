package org.emp.gl.core.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

/**
 * Hello world!
 *
 */
public class App {

    // ce code nous permettra d'enregistrer les service que notre application utilsiera 
    // lors de l'execution
    static {
        Lookup.getInstance().register(TimerService.class, new DummyTimeServiceImpl());
        Lookup.getInstance().register(Afficheur.class,new Afficheur());
        Lookup.getInstance().register(Controleur.class,new Controleur());
        Lookup.getInstance().register(WatchEngine.class, new WatchEngine());
    }

    public static void main(String[] args) {
        
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

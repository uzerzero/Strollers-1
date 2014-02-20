package model;

import java.util.TimerTask;

/**
 * Created by clodagh on 15/02/14.
 */
public class Temps extends TimerTask {
    private Vehicule _v;
    public Temps(Vehicule v)
    {
        _v = v;
    }

    @Override
    public void run() {
         _v.update(1);
    }
}

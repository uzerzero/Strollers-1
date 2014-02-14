package model;

import com.sun.javafx.geom.Vec2d;

import java.util.Observable;

/**
 * Created by Sarah on 31/01/14.
 */
public class Vehicule extends Observable {

    private Vec2d _position2D;
    private int _speedKmPerHour;

    public Vehicule(Vec2d _position2D) {
        this._position2D = _position2D;
    }

    public Vec2d getPosition() {
        return _position2D;
    }

    public void setPosition(Vec2d position2D) {
        this._position2D = position2D;
        setChanged();
        notifyObservers(position2D);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "_position2D=" + _position2D +
                ", _speedKmPerHour=" + _speedKmPerHour +
                '}';
    }

}

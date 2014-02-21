package model;

import java.util.Observable;

/**
 * Created by Sarah on 31/01/14.
 */
public class Vehicule extends Observable {

    private int _posX, _posY;
    private int _velocityX, _velocityY;

    public Vehicule(int posX, int posY)
    {
        _posX = posX;
        _posY = posY;

        _velocityX = _velocityY = 0;
    }

    public int get_posY() {
        return _posY;
    }

    public void set_posY(int posY) {
        this._posY = posY;

        setChanged();
        notifyObservers();
    }

    public int get_posX() {
        return _posX;
    }

    public void update(float elapsed) {
        _posX+=10;
        setChanged();
        notifyObservers();
    }

    public void move(int x, int y) {
        this._posX += x;
        this._posY += y;

        setChanged();
        notifyObservers();
    }

    public void set_posX(int posX) {
        this._posX = posX;

        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "_position2D=" + _posX + ", "+_posY+'}';
    }

}

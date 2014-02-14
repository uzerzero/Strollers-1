package model;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Hakkragor on 14/02/14.
 */
public class Triangle implements Observer {
    private int _posX;
    private int _posY;

    private Image _image;

    public Triangle(int posX, int posY) {
        _posX = posX;
        _posY = posY;
    }

    public int get_posX() {
        return _posX;
    }

    public void set_posX(int _posX) {
        this._posX = _posX;
    }

    public int get_posY() {
        return _posY;
    }

    public void set_posY(int _posY) {
        this._posY = _posY;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Changes done: " + arg);
    }
}

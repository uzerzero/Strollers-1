package model;

import java.util.Observable;

/**
 * Created by Sarah on 31/01/14.
 */
public class Vehicule extends Observable {

    private float _posX, _posY;
    private float _speed, _angle;
    private Domain _domain;

    public Vehicule(Domain domain, float posX, float posY)
    {
        _posX = posX;
        _posY = posY;

        _speed = 0;
        _angle = 0;
        _domain = domain;
    }

    public float get_posY() {
        return _posY;
    }

    public void set_posY(float posY) {
        this._posY = posY;

        setChanged();
        notifyObservers();
    }

    public float get_posX() {
        return _posX;
    }

    public void update(float elapsed) {
        _posX += _speed * Math.cos(_angle);
        _posY += _speed * Math.sin(_angle);

        if (_domain.isOutOfDomain(this)) {
            stop();
            _domain.replaceVehiculeInside(this);
        }

        setChanged();
        notifyObservers();
    }

    public void accelerate() {
        float acc = 1;
        _speed += acc;
    }

    public void decelerate() {
        float acc = 1;

        _speed -= acc;
        if (_speed < 0)
            _speed = 0;
    }

    public void stop() {
        _speed = 0;
    }

    public void backUp(){
        float acc = 1;
        _speed -= acc;
    }

    public void turn(boolean left) {
        if (!left)
            _angle += .2f;
        else
            _angle -= .2f;
    }

    public void turnLeft(){
        _angle += .2f;
    }

    public void turnRight(){
        _angle -= .2f;
    }

    public void move(int x, int y) {
        this._posX += x;
        this._posY += y;

        setChanged();
        notifyObservers();
    }

    public void set_posX(float posX) {
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

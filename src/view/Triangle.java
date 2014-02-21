package view;

import model.Vehicule;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Hakkragor on 14/02/14.
 */
public class Triangle implements Observer{
    private int _posX;
    private int _posY;
    private MyCanvas _myCanvas;
    private Vehicule _voiture;

    public Triangle(Vehicule voiture, MyCanvas myCanvas){
        _posX = voiture.get_posX();
        _posY = voiture.get_posY();
        _voiture = voiture;
        _myCanvas = myCanvas;
        _myCanvas.attachObject(this);
        _voiture.addObserver(this);
    }
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
        System.out.println("Changes done: "+get_posX()+", " +get_posY());
        this.set_posY(_voiture.get_posY());
        this.set_posX(_voiture.get_posX());
        this._myCanvas.draw();

    }
}

package view;

import model.Building;

import java.awt.*;

/**
 * Created by clodagh on 28/02/14.
 */
public class Carre implements DrawableObject{

    private float _posX;
    private float _posY;
    private MyCanvas _myCanvas;
    private Building _building;

    public Carre(Building building, MyCanvas myCanvas) {
        this._posX = building.get_posX();
        this._posY = building.get_posY();
        this._myCanvas = myCanvas;
        this._building = building;
        myCanvas.attachObject(this);
    }

    public float get_posX() {
        return _posX;
    }

    public void set_posX(float _posX) {
        this._posX = _posX;
    }

    public float get_posY() {
        return _posY;
    }

    public void set_posY(float _posY) {
        this._posY = _posY;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.black);
        g2d.fillRect((int) get_posX(), (int) get_posY(),(int) _building.get_width(),(int) _building.get_height());

    }
}

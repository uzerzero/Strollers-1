package model;

/**
 * Created by clodagh on 28/02/14.
 */
public class Building {

    private float _posX, _posY;
    private float _width, _height;

    public Building(float _posX, float _posY, float _width, float _height) {
        this._posX = _posX;
        this._posY = _posY;
        this._width = _width;
        this._height = _height;
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

    public float get_width() {
        return _width;
    }

    public void set_width(float _width) {
        this._width = _width;
    }

    public float get_height() {
        return _height;
    }

    public void set_height(float _height) {
        this._height = _height;
    }
}

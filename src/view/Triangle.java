package view;

import model.Vehicule;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Hakkragor on 14/02/14.
 */
public class Triangle implements Observer, DrawableObject{
    private float _posX;
    private float _posY;
    private BufferedImage image;
    private MyCanvas _myCanvas;
    private Vehicule _voiture;

    public Triangle(Vehicule voiture, MyCanvas myCanvas){
        _posX = voiture.get_posX();
        _posY = voiture.get_posY();
        try {
            this.image = ImageIO.read(new File("./src/img/vehicule.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        _voiture = voiture;
        _myCanvas = myCanvas;
        _myCanvas.attachObject(this);
        _voiture.addObserver(this);
    }
    public Triangle(int posX, int posY) {
        _posX = posX;
        _posY = posY;
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
    public void update(Observable o, Object arg) {
        this.set_posY(_voiture.get_posY());
        this.set_posX(_voiture.get_posX());
        this._myCanvas.draw();

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.pink);
        g2d.drawImage(this.image, null, (int)this._posX, (int)this._posY);
    }
}

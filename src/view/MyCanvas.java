package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by clodagh on 15/02/14.
 */
class MyCanvas extends JPanel {
    ArrayList<DrawableObject> _drawableObjects;

    public MyCanvas () {
        _drawableObjects = new ArrayList<DrawableObject>();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    public void attachObject(DrawableObject object) {
        _drawableObjects.add(object);
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawableObject d : _drawableObjects) {
            d.draw(g2d);
        }
    }

    public void draw()
    {
        repaint();
    }
}
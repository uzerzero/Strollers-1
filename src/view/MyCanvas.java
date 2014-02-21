package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by clodagh on 15/02/14.
 */
class MyCanvas extends JPanel {
    ArrayList<Triangle> _drawableObjects;

    public MyCanvas () {
        _drawableObjects = new ArrayList<Triangle>();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    public void attachObject(Triangle object) {
        _drawableObjects.add(object);
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
        for (Triangle t : _drawableObjects) {
            g2d.fillOval(t.get_posX(), t.get_posY(), 5, 5);
        }
    }

    public void draw()
    {
        repaint();
    }
 }
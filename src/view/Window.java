package view;

import model.Temps;
import model.Vehicule;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

/**
 * Created by cactus on 21/02/14.
 */
public class Window extends JFrame implements KeyListener {
    private Vehicule voiture;

    public static void main(String[] args ) {
        Window window = new Window();
        window.init();
    }

    public void init() {
        voiture = new Vehicule(10,10);
        MyCanvas canvas = new MyCanvas();
        Triangle triangle = new Triangle(voiture, canvas);

        setSize(300, 300);
        setTitle("PLOPS");
        setLayout(new BorderLayout());
        add(canvas, BorderLayout.CENTER);
        setVisible(true);

        addKeyListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            } //windowClosing
        } );

        //java.util.Timer timer = new java.util.Timer();
        //timer.scheduleAtFixedRate(new Temps(voiture), 0, 1000);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                voiture.move(10, 0);
                break;
            case KeyEvent.VK_LEFT:
                voiture.move(-10, 0);
                break;
            case KeyEvent.VK_UP:
                voiture.move(0, -10);
                break;
            case KeyEvent.VK_DOWN:
                voiture.move(0, 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}

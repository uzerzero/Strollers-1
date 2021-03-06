package view;

import model.Building;
import model.Domain;
import model.Temps;
import model.Vehicule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        Domain domain = new Domain(0, 0, 1000, 730);

        voiture = new Vehicule(domain, 10,10);
        MyCanvas canvas = new MyCanvas();
        Triangle triangle = new Triangle(voiture, canvas);
        String direction = "Ma direction";

        Building building = new Building(250, 250, 100, 100);
        Carre carre = new Carre(building, canvas);
        domain.addBuilding(building);

        Building building2 = new Building(650, 250, 100, 100);
        Carre carre2 = new Carre(building2, canvas);

        setSize(1024, 768);
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

        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new Temps(voiture), 0, 10);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                voiture.turnRight();
                break;
            case KeyEvent.VK_LEFT:
                voiture.turnLeft();
                break;
            case KeyEvent.VK_UP:
                voiture.accelerate();
                break;
            case KeyEvent.VK_DOWN:
                voiture.backUp();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_UP:
                voiture.decelerate();
                break;
            case KeyEvent.VK_DOWN:
                voiture.decelerate();
                break;
        }
    }
}

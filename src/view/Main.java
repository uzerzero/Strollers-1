package view;

import model.Temps;
import model.Vehicule;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;

/**
 * Created by clodagh on 15/02/14.
 */
public class Main {
    public static void main(String[] args) {

        Vehicule voiture = new Vehicule(10,10);
        MyCanvas taMere = new MyCanvas();
        Triangle triangle = new Triangle(voiture, taMere);
        JFrame window = new JFrame();
        window.setSize(300, 300);
        window.setTitle("PLOPS");
        window.setLayout(new BorderLayout());
        window.add(taMere, BorderLayout.CENTER);
        window.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Temps(voiture), 0, 1000);


    }
}

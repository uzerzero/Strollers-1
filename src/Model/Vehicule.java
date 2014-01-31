package model;

import com.sun.javafx.geom.Vec2d;
import org.junit;
import java.util.Vector;

/**
 * Created by Sarah on 31/01/14.
 */
public class Vehicule {

    private Vec2d position2D;
    private int speedKmPerHour;

    public Vehicule(Vec2d position) {
        this.position2D = position2D;
    }

    public Vec2d getPosition() {
        return position2D;
    }

    public void setPosition(Vec2d position2D) {
        this.position2D = position2D;
    }

    public int getSpeedKmPerHour() {
        return speedKmPerHour;
    }

    public void setSpeedKmPerHour(int speedKmPerHour) {
        this.speedKmPerHour = speedKmPerHour;
    }

    public void move(){

    }

    public void turn(){

    }

    public void speedUp(){
        setSpeedKmPerHour(speedKmPerHour + 5);
    }

    public void stop(){
        setSpeedKmPerHour(0);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "position2D=" + position2D +
                ", speedKmPerHour=" + speedKmPerHour +
                '}';
    }
}

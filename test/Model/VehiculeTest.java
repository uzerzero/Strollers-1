package model;

import com.sun.javafx.geom.Vec2d;
import org.junit.Test;

/**
 * Created by clodagh on 14/02/14.
 */
public class VehiculeTest {

    @Test
    public void newVehiculeObject() throws Exception{
        Vec2d myPos = new Vec2d(0,0);
        Vehicule voiture = new Vehicule(myPos);
        assert voiture.getPosition()==myPos;

    }

    @Test
    public void changePositionOfVehiculeObject() throws Exception{
        Vec2d myPos = new Vec2d(0,0);
        Vec2d newPos = new Vec2d(0,10);
        Vehicule voiture = new Vehicule(myPos);
        voiture.setPosition(newPos);
        assert voiture.getPosition()==newPos;
    }

    @Test
    public void testGetPosition() throws Exception {

    }

    @Test
    public void testSetPosition() throws Exception {

    }

    @Test
    public void testGetSpeedKmPerHour() throws Exception {

    }

    @Test
    public void testSetSpeedKmPerHour() throws Exception {

    }

    @Test
    public void testMove() throws Exception {

    }

    @Test
    public void testTurn() throws Exception {

    }

    @Test
    public void testSpeedUp() throws Exception {

    }

    @Test
    public void testStop() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}

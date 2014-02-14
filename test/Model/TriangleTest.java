package model;

import com.sun.javafx.geom.Vec2d;
import junit.framework.Assert;
import org.junit.Test;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Created by Hakkragor on 14/02/14.
 */
public class TriangleTest {
    @Test
    public void testGet_posX() throws Exception {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 1;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };

        Triangle triangle = new Triangle(2,3, image);
        Assert.assertEquals(2, triangle.get_posX());
    }

    @Test
    public void testSet_posX() throws Exception {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };

        Triangle triangle = new Triangle(2,3, image);
        triangle.set_posX(8);
        Assert.assertEquals(8, triangle.get_posX());
    }

    @Test
    public void testGet_posY() throws Exception {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };

        Triangle triangle = new Triangle(2,3, image);
        Assert.assertEquals(3, triangle.get_posY());
    }

    @Test
    public void testSet_posY() throws Exception {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };

        Triangle triangle = new Triangle(2,3, image);
        triangle.set_posY(42);
        Assert.assertEquals(42, triangle.get_posY());
    }

    @Test
    public void testGet_image() throws Exception {

    }

    @Test
    public void testSet_image() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };
        Triangle triangle = new Triangle(2,3,image);
        Vec2d vector = new Vec2d(0,10);
        Vehicule vehi = new Vehicule(vector);
        vehi.addObserver(triangle);
        Vec2d vector2 = new Vec2d(10,0);
        vehi.setPosition(vector2);
    }
}

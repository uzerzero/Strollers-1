package view;

import javax.swing.*;

/**
 * Created by clodagh on 14/02/14.
 */
public class Canvas extends JFrame {

        public Canvas() {
            setTitle("My Empty Frame");
            setSize(300,200);
            setLocation(10,200);
        }

        public static void main(String[] args) {
            JFrame f = new Canvas();
            f.setVisible(true);
        }
    }


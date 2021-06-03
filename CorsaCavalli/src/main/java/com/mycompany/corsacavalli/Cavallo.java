package com.mycompany.corsacavalli;

import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author informatica
 */
public class Cavallo implements Runnable {

    final JLabel cavallo;

    public Cavallo(JLabel cavallo) {
        this.cavallo = cavallo;
    }

    @Override
    public void run() {

        while (cavallo.getX() < 700 - cavallo.getSize().width) {

            int pos_x = cavallo.getX();

            pos_x += (int) (Math.random() * 4 + 1);

            cavallo.setLocation(pos_x, 0);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}

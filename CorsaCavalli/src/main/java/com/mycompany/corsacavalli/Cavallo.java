package com.mycompany.corsacavalli;

import java.util.logging.*;
import javax.swing.*;

/**
 * Classe che serve a gestire gli oggetti di tipo Cavallo
 *
 * @author informatica
 */
public class Cavallo implements Runnable {

    private final JLabel cavallo;
    private final int numeroCavallo;

    public Cavallo(JLabel cavallo, int numeroCavallo) {
        this.cavallo = cavallo;
        this.numeroCavallo = numeroCavallo;
    }

    @Override
    public void run() {

        while (cavallo.getX() < 700 - cavallo.getSize().width) {

            int pos_x = cavallo.getX();

            //velocità casuale per cavallo
            int velocita = (int) (Math.random() * 10 + 1);

            //controllo che velocità non sia maggiore della distanza tra il cavallo e la fine della pista
            if (velocita > (700 - cavallo.getSize().width) - cavallo.getX()) {

                velocita = (700 - cavallo.getSize().width) - cavallo.getX();

            }

            pos_x += velocita;

            cavallo.setLocation(pos_x, 0);

            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
            }

            //se il cavallo è arrivato aggiungo il suo numero all'ArrayList delle posizioni
            if (cavallo.getX() >= 700 - cavallo.getSize().width) {

                GaraCavalli.posizione.add(numeroCavallo);

            }

            switch (SceltaCavalli.nCavalli) {

                case "2":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "3":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "4":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "5":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "6":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width
                            && GaraCavalli.cavallo6.getX() >= 700 - GaraCavalli.cavallo6.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "7":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width
                            && GaraCavalli.cavallo6.getX() >= 700 - GaraCavalli.cavallo6.getSize().width
                            && GaraCavalli.cavallo7.getX() >= 700 - GaraCavalli.cavallo7.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "8":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width
                            && GaraCavalli.cavallo6.getX() >= 700 - GaraCavalli.cavallo6.getSize().width
                            && GaraCavalli.cavallo7.getX() >= 700 - GaraCavalli.cavallo7.getSize().width
                            && GaraCavalli.cavallo8.getX() >= 700 - GaraCavalli.cavallo8.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "9":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width
                            && GaraCavalli.cavallo6.getX() >= 700 - GaraCavalli.cavallo6.getSize().width
                            && GaraCavalli.cavallo7.getX() >= 700 - GaraCavalli.cavallo7.getSize().width
                            && GaraCavalli.cavallo8.getX() >= 700 - GaraCavalli.cavallo8.getSize().width
                            && GaraCavalli.cavallo9.getX() >= 700 - GaraCavalli.cavallo9.getSize().width) {

                        new Classifica();

                    }

                    break;

                case "10":

                    //controllo che tutti i cavalli siano arrivati
                    if (GaraCavalli.cavallo1.getX() >= 700 - GaraCavalli.cavallo1.getSize().width
                            && GaraCavalli.cavallo2.getX() >= 700 - GaraCavalli.cavallo2.getSize().width
                            && GaraCavalli.cavallo3.getX() >= 700 - GaraCavalli.cavallo3.getSize().width
                            && GaraCavalli.cavallo4.getX() >= 700 - GaraCavalli.cavallo4.getSize().width
                            && GaraCavalli.cavallo5.getX() >= 700 - GaraCavalli.cavallo5.getSize().width
                            && GaraCavalli.cavallo6.getX() >= 700 - GaraCavalli.cavallo6.getSize().width
                            && GaraCavalli.cavallo7.getX() >= 700 - GaraCavalli.cavallo7.getSize().width
                            && GaraCavalli.cavallo8.getX() >= 700 - GaraCavalli.cavallo8.getSize().width
                            && GaraCavalli.cavallo9.getX() >= 700 - GaraCavalli.cavallo9.getSize().width
                            && GaraCavalli.cavallo10.getX() >= 700 - GaraCavalli.cavallo10.getSize().width) {

                        new Classifica();

                    }

                    break;

            }

        }

    }

}

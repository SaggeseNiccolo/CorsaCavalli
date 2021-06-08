package com.mycompany.corsacavalli;

import java.awt.*;
import javax.swing.*;

/**
 * Classe che serve a gestire la classifica
 *
 * @author informatica
 */
public class Classifica {

    private final JFrame frame;
    private final JPanel panel;

    //label per la classifica
    private final JLabel l1;
    private final JLabel l2;
    private final JLabel l3;
    private final JLabel l4;
    private final JLabel l5;
    private final JLabel l6;
    private final JLabel l7;
    private final JLabel l8;
    private final JLabel l9;
    private final JLabel l10;

    public Classifica() {

        frame = new JFrame("Classifica");

        l1 = new JLabel("");
        l1.setBounds(10, 10, 340, 20);
        l1.setFont(new Font("Itim", Font.BOLD, 18));

        l2 = new JLabel("");
        l2.setBounds(10, 40, 340, 20);
        l2.setFont(new Font("Itim", Font.BOLD, 18));

        l3 = new JLabel("");
        l3.setBounds(10, 70, 340, 20);
        l3.setFont(new Font("Itim", Font.BOLD, 18));

        l4 = new JLabel("");
        l4.setBounds(10, 100, 340, 20);
        l4.setFont(new Font("Itim", Font.BOLD, 18));

        l5 = new JLabel("");
        l5.setBounds(10, 130, 340, 20);
        l5.setFont(new Font("Itim", Font.BOLD, 18));

        l6 = new JLabel("");
        l6.setBounds(10, 160, 340, 20);
        l6.setFont(new Font("Itim", Font.BOLD, 18));

        l7 = new JLabel("");
        l7.setBounds(10, 190, 340, 20);
        l7.setFont(new Font("Itim", Font.BOLD, 18));

        l8 = new JLabel("");
        l8.setBounds(10, 220, 340, 20);
        l8.setFont(new Font("Itim", Font.BOLD, 18));

        l9 = new JLabel("");
        l9.setBounds(10, 250, 340, 20);
        l9.setFont(new Font("Itim", Font.BOLD, 18));

        l10 = new JLabel("");
        l10.setBounds(10, 280, 340, 20);
        l10.setFont(new Font("Itim", Font.BOLD, 18));

        panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(480, 360));
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(l5);
        panel.add(l6);
        panel.add(l7);
        panel.add(l8);
        panel.add(l9);
        panel.add(l10);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(GaraCavalli.frame);
        frame.setVisible(true);

        scritturaClassifica(); //scrivo le label

    }

    /**
     * Metodo che serve a scrivere l'arrivo dei cavalli in ordine nelle label
     */
    public final void scritturaClassifica() {

        String s;

        switch (SceltaCavalli.nCavalli) {

            case "2":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO :(";

                l2.setText(s);

                break;

            case "3":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO :(";

                l3.setText(s);

                break;

            case "4":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO :(";

                l4.setText(s);

                break;

            case "5":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO :(";

                l5.setText(s);

                break;

            case "6":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO!";

                l5.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(5) + " è arrivato SESTO :(";

                l6.setText(s);

                break;

            case "7":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO!";

                l5.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(5) + " è arrivato SESTO!";

                l6.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(6) + " è arrivato SETTIMO :(";

                l7.setText(s);

                break;

            case "8":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO!";

                l5.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(5) + " è arrivato SESTO!";

                l6.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(6) + " è arrivato SETTIMO!";

                l7.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(7) + " è arrivato OTTAVO :(";

                l8.setText(s);

                break;

            case "9":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO!";

                l5.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(5) + " è arrivato SESTO!";

                l6.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(6) + " è arrivato SETTIMO!";

                l7.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(7) + " è arrivato OTTAVO!";

                l8.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(8) + " è arrivato NONO :(";

                l9.setText(s);

                break;

            case "10":

                s = "Il Cavallo " + GaraCavalli.posizione.get(0) + " è arrivato PRIMO!";

                l1.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(1) + " è arrivato SECONDO!";

                l2.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(2) + " è arrivato TERZO!";

                l3.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(3) + " è arrivato QUARTO!";

                l4.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(4) + " è arrivato QUINTO!";

                l5.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(5) + " è arrivato SESTO!";

                l6.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(6) + " è arrivato SETTIMO!";

                l7.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(7) + " è arrivato OTTAVO!";

                l8.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(8) + " è arrivato NONO!";

                l9.setText(s);

                s = "Il Cavallo " + GaraCavalli.posizione.get(9) + " è arrivato DECIMO :(";

                l10.setText(s);

                break;

        }

    }

}

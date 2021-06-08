package com.mycompany.corsacavalli;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

/**
 * Classe che serve a gestire la scelta dei cavalli in gara
 *
 * @author informatica
 */
public class SceltaCavalli implements ActionListener {

    public static JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    private final JComboBox combo;
    private final JButton avvia;

    public static String nCavalli;

    public SceltaCavalli() {

        frame = new JFrame();

        label = new JLabel("Scegliere il numero di cavalli");
        label.setBounds(220, 180, 480, 30);
        label.setFont(new Font("Itim", Font.BOLD, 18)); //cambio il font della label

        String[] i = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo = new JComboBox(i);
        combo.setBounds(260, 240, 80, 30);
        combo.setBackground(Color.white);

        avvia = new JButton("Avvia");
        avvia.setBounds(360, 240, 80, 30);
        avvia.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(720, 480));
        panel.add(label);
        panel.add(combo);
        panel.add(avvia);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gara di Cavalli");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    /**
     * Metodo che viene eseguito quando avviene la pressione del pulsante
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        nCavalli = combo.getSelectedItem().toString(); //prendo il numero dei cavalli scelti

        frame.dispose(); //serve per chiudere la finestra per la scelta dei cavalli

        try {
            new GaraCavalli(); //apro la finestra per la corsa dei cavalli
        } catch (IOException ex) {
            Logger.getLogger(SceltaCavalli.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

package com.mycompany.corsacavalli;

import static com.mycompany.corsacavalli.NewMain.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.imageio.*;
import javax.swing.*;

/**
 * Classe che serve a gestire la gara tra i cavalli
 *
 * @author informatica
 */
public class GaraCavalli implements ActionListener, KeyListener {

    public static JFrame frame;
    private final JLayeredPane panel;

    //JTextField che rappresentano le corsie graficamente
    private final JTextField corsia1;
    private final JTextField corsia2;
    private final JTextField corsia3;
    private final JTextField corsia4;
    private final JTextField corsia5;
    private final JTextField corsia6;
    private final JTextField corsia7;
    private final JTextField corsia8;
    private final JTextField corsia9;
    private final JTextField corsia10;

    //JLabel che rappresentano i cavalli graficamente
    public static JLabel cavallo1;
    public static JLabel cavallo2;
    public static JLabel cavallo3;
    public static JLabel cavallo4;
    public static JLabel cavallo5;
    public static JLabel cavallo6;
    public static JLabel cavallo7;
    public static JLabel cavallo8;
    public static JLabel cavallo9;
    public static JLabel cavallo10;

    //pulsante avvia non visibile che serve per far partire la gara
    private final JButton avvia;
    private final JLabel info;

    //ArrayList dove verranno inserite le posizioni dei cavalli in ordine
    public static ArrayList<Integer> posizione = new ArrayList<>();

    public GaraCavalli() throws IOException {

        frame = new JFrame();

        corsia1 = new JTextField();

        corsia2 = new JTextField();

        corsia3 = new JTextField();

        corsia4 = new JTextField();

        corsia5 = new JTextField();

        corsia6 = new JTextField();

        corsia7 = new JTextField();

        corsia8 = new JTextField();

        corsia9 = new JTextField();

        corsia10 = new JTextField();

        info = new JLabel("Premere il tasto invio per avviare la gara");
        info.setBounds(180, 200, 480, 30);
        info.setFont(new Font("Itim", Font.BOLD, 18));

        avvia = new JButton();
        avvia.addActionListener(this);
        avvia.addKeyListener(this);

        panel = new JLayeredPane();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(720, 480));
        panel.add(corsia1, new Integer(1));
        panel.add(corsia2, new Integer(1));
        panel.add(corsia3, new Integer(1));
        panel.add(corsia4, new Integer(1));
        panel.add(corsia5, new Integer(1));
        panel.add(corsia6, new Integer(1));
        panel.add(corsia7, new Integer(1));
        panel.add(corsia8, new Integer(1));
        panel.add(corsia9, new Integer(1));
        panel.add(corsia10, new Integer(1));
        panel.add(info, new Integer(2));
        panel.add(avvia, new Integer(1));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gara di Cavalli");
        frame.setResizable(false);
        frame.getRootPane().setDefaultButton(avvia);
        frame.pack();
        frame.setLocation(SceltaCavalli.frame.getLocation());
        frame.setVisible(true);

        creaCorsie(); //creo le corsie
        creaCavalli(); //creo i cavalli

    }

    /**
     * Metodo che serve per creare le corsie in base al numero dei cavalli
     * scelti
     */
    public final void creaCorsie() {

        switch (SceltaCavalli.nCavalli) {

            case "2":

                corsia1.setBounds(10, 10, 700, 225);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 245, 700, 225);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                break;

            case "3":

                corsia1.setBounds(10, 10, 700, 146);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 166, 700, 146);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 322, 700, 146);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                break;

            case "4":

                corsia1.setBounds(10, 10, 700, 107);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 127, 700, 107);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 244, 700, 107);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 361, 700, 107);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                break;

            case "5":

                corsia1.setBounds(10, 10, 700, 84);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 104, 700, 84);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 198, 700, 84);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 292, 700, 84);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 386, 700, 84);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                break;

            case "6":

                corsia1.setBounds(10, 10, 700, 68);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 88, 700, 68);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 166, 700, 68);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 244, 700, 68);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 322, 700, 68);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                corsia6.setBounds(10, 400, 700, 68);
                corsia6.setBackground(Color.green);
                corsia6.setEditable(false);

                break;

            case "7":

                corsia1.setBounds(10, 10, 700, 58);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 77, 700, 58);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 144, 700, 58);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 211, 700, 58);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 278, 700, 58);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                corsia6.setBounds(10, 345, 700, 58);
                corsia6.setBackground(Color.green);
                corsia6.setEditable(false);

                corsia7.setBounds(10, 413, 700, 58);
                corsia7.setBackground(Color.green);
                corsia7.setEditable(false);

                break;

            case "8":

                corsia1.setBounds(10, 10, 700, 49);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 69, 700, 49);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 128, 700, 49);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 187, 700, 49);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 246, 700, 49);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                corsia6.setBounds(10, 305, 700, 49);
                corsia6.setBackground(Color.green);
                corsia6.setEditable(false);

                corsia7.setBounds(10, 364, 700, 49);
                corsia7.setBackground(Color.green);
                corsia7.setEditable(false);

                corsia8.setBounds(10, 423, 700, 49);
                corsia8.setBackground(Color.green);
                corsia8.setEditable(false);

                break;

            case "9":

                corsia1.setBounds(10, 10, 700, 42);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 62, 700, 42);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 114, 700, 42);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 166, 700, 42);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 218, 700, 42);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                corsia6.setBounds(10, 270, 700, 42);
                corsia6.setBackground(Color.green);
                corsia6.setEditable(false);

                corsia7.setBounds(10, 322, 700, 42);
                corsia7.setBackground(Color.green);
                corsia7.setEditable(false);

                corsia8.setBounds(10, 374, 700, 42);
                corsia8.setBackground(Color.green);
                corsia8.setEditable(false);

                corsia9.setBounds(10, 426, 700, 42);
                corsia9.setBackground(Color.green);
                corsia9.setEditable(false);

                break;

            case "10":

                corsia1.setBounds(10, 10, 700, 37);
                corsia1.setBackground(Color.green);
                corsia1.setEditable(false);

                corsia2.setBounds(10, 57, 700, 37);
                corsia2.setBackground(Color.green);
                corsia2.setEditable(false);

                corsia3.setBounds(10, 104, 700, 37);
                corsia3.setBackground(Color.green);
                corsia3.setEditable(false);

                corsia4.setBounds(10, 151, 700, 37);
                corsia4.setBackground(Color.green);
                corsia4.setEditable(false);

                corsia5.setBounds(10, 198, 700, 37);
                corsia5.setBackground(Color.green);
                corsia5.setEditable(false);

                corsia6.setBounds(10, 245, 700, 37);
                corsia6.setBackground(Color.green);
                corsia6.setEditable(false);

                corsia7.setBounds(10, 292, 700, 37);
                corsia7.setBackground(Color.green);
                corsia7.setEditable(false);

                corsia8.setBounds(10, 339, 700, 37);
                corsia8.setBackground(Color.green);
                corsia8.setEditable(false);

                corsia9.setBounds(10, 386, 700, 37);
                corsia9.setBackground(Color.green);
                corsia9.setEditable(false);

                corsia10.setBounds(10, 433, 700, 37);
                corsia10.setBackground(Color.green);
                corsia10.setEditable(false);

                break;

        }

    }

    /**
     * Metodo che serve per creare i cavalli all'interno delle corsie, in base
     * al numero dei cavalli scelti
     *
     * @throws IOException
     */
    public final void creaCavalli() throws IOException {

        BufferedImage immagineCavallo;
        Image cavallo;

        //prendo l'immagine attraverso un URL
        immagineCavallo = ImageIO.read(new URL("https://image.flaticon.com/icons/png/512/35/35983.png"));

        switch (SceltaCavalli.nCavalli) {

            case "2":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(220, 220, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(220, 220);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(220, 220);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);

                break;

            case "3":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(141, 141, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(141, 141);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(141, 141);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(141, 141);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);

                break;

            case "4":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(102, 102, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(102, 102);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(102, 102);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(102, 102);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(102, 102);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);

                break;

            case "5":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(79, 79, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(79, 79);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(79, 79);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(79, 79);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(79, 79);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(79, 79);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);

                break;

            case "6":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(63, 63, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(63, 63);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(63, 63);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(63, 63);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(63, 63);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(63, 63);

                cavallo6 = new JLabel(new ImageIcon(cavallo));
                cavallo6.setSize(63, 63);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);
                corsia6.add(cavallo6);

                break;

            case "7":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(53, 53, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(53, 53);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(53, 53);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(53, 53);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(53, 53);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(53, 53);

                cavallo6 = new JLabel(new ImageIcon(cavallo));
                cavallo6.setSize(53, 53);

                cavallo7 = new JLabel(new ImageIcon(cavallo));
                cavallo7.setSize(53, 53);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);
                corsia6.add(cavallo6);
                corsia7.add(cavallo7);

                break;

            case "8":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(44, 44, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(44, 44);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(44, 44);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(44, 44);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(44, 44);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(44, 44);

                cavallo6 = new JLabel(new ImageIcon(cavallo));
                cavallo6.setSize(44, 44);

                cavallo7 = new JLabel(new ImageIcon(cavallo));
                cavallo7.setSize(44, 44);

                cavallo8 = new JLabel(new ImageIcon(cavallo));
                cavallo8.setSize(44, 44);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);
                corsia6.add(cavallo6);
                corsia7.add(cavallo7);
                corsia8.add(cavallo8);

                break;

            case "9":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(37, 37, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(37, 37);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(37, 37);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(37, 37);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(37, 37);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(37, 37);

                cavallo6 = new JLabel(new ImageIcon(cavallo));
                cavallo6.setSize(37, 37);

                cavallo7 = new JLabel(new ImageIcon(cavallo));
                cavallo7.setSize(37, 37);

                cavallo8 = new JLabel(new ImageIcon(cavallo));
                cavallo8.setSize(37, 37);

                cavallo9 = new JLabel(new ImageIcon(cavallo));
                cavallo9.setSize(37, 37);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);
                corsia6.add(cavallo6);
                corsia7.add(cavallo7);
                corsia8.add(cavallo8);
                corsia9.add(cavallo9);

                break;

            case "10":

                //ridimensiono l'immagine in base al numero di corsie
                cavallo = immagineCavallo.getScaledInstance(32, 32, Image.SCALE_DEFAULT);

                cavallo1 = new JLabel(new ImageIcon(cavallo));
                cavallo1.setSize(32, 32);

                cavallo2 = new JLabel(new ImageIcon(cavallo));
                cavallo2.setSize(32, 32);

                cavallo3 = new JLabel(new ImageIcon(cavallo));
                cavallo3.setSize(32, 32);

                cavallo4 = new JLabel(new ImageIcon(cavallo));
                cavallo4.setSize(32, 32);

                cavallo5 = new JLabel(new ImageIcon(cavallo));
                cavallo5.setSize(32, 32);

                cavallo6 = new JLabel(new ImageIcon(cavallo));
                cavallo6.setSize(32, 32);

                cavallo7 = new JLabel(new ImageIcon(cavallo));
                cavallo7.setSize(32, 32);

                cavallo8 = new JLabel(new ImageIcon(cavallo));
                cavallo8.setSize(32, 32);

                cavallo9 = new JLabel(new ImageIcon(cavallo));
                cavallo9.setSize(32, 32);

                cavallo10 = new JLabel(new ImageIcon(cavallo));
                cavallo10.setSize(32, 32);

                corsia1.add(cavallo1);
                corsia2.add(cavallo2);
                corsia3.add(cavallo3);
                corsia4.add(cavallo4);
                corsia5.add(cavallo5);
                corsia6.add(cavallo6);
                corsia7.add(cavallo7);
                corsia8.add(cavallo8);
                corsia9.add(cavallo9);
                corsia10.add(cavallo10);

                break;

        }

    }

    /**
     * Metodo che viene eseguito quando avviene la pressione del tasto invio
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        c1 = new Thread(new Cavallo(GaraCavalli.cavallo1, 1));
        c2 = new Thread(new Cavallo(GaraCavalli.cavallo2, 2));
        c3 = new Thread(new Cavallo(GaraCavalli.cavallo3, 3));
        c4 = new Thread(new Cavallo(GaraCavalli.cavallo4, 4));
        c5 = new Thread(new Cavallo(GaraCavalli.cavallo5, 5));
        c6 = new Thread(new Cavallo(GaraCavalli.cavallo6, 6));
        c7 = new Thread(new Cavallo(GaraCavalli.cavallo7, 7));
        c8 = new Thread(new Cavallo(GaraCavalli.cavallo8, 8));
        c9 = new Thread(new Cavallo(GaraCavalli.cavallo9, 9));
        c10 = new Thread(new Cavallo(GaraCavalli.cavallo10, 10));

        if (info.isVisible()) {

            info.setVisible(false);

            switch (SceltaCavalli.nCavalli) {

                case "2":

                    NewMain.c1.start();
                    NewMain.c2.start();

                    break;

                case "3":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();

                    break;

                case "4":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();

                    break;

                case "5":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();

                    break;

                case "6":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();
                    NewMain.c6.start();

                    break;

                case "7":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();
                    NewMain.c6.start();
                    NewMain.c7.start();

                    break;

                case "8":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();
                    NewMain.c6.start();
                    NewMain.c7.start();
                    NewMain.c8.start();

                    break;

                case "9":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();
                    NewMain.c6.start();
                    NewMain.c7.start();
                    NewMain.c8.start();
                    NewMain.c9.start();

                    break;

                case "10":

                    NewMain.c1.start();
                    NewMain.c2.start();
                    NewMain.c3.start();
                    NewMain.c4.start();
                    NewMain.c5.start();
                    NewMain.c6.start();
                    NewMain.c7.start();
                    NewMain.c8.start();
                    NewMain.c9.start();
                    NewMain.c10.start();

                    break;

            }

        }

    }

    //metodi sovrascritti dall'implementazione KeyListener
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

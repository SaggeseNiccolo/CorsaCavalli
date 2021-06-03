package com.mycompany.corsacavalli;

/**
 *
 * @author User
 */
public class NewMain {

    public static Thread c1;
    public static Thread c2;
    public static Thread c3;
    public static Thread c4;
    public static Thread c5;
    public static Thread c6;
    public static Thread c7;
    public static Thread c8;
    public static Thread c9;
    public static Thread c10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new SceltaCavalli();

        c1 = new Thread(new Cavallo(GaraCavalli.cavallo1));
        c2 = new Thread(new Cavallo(GaraCavalli.cavallo2));
        c3 = new Thread(new Cavallo(GaraCavalli.cavallo3));
        c4 = new Thread(new Cavallo(GaraCavalli.cavallo4));
        c5 = new Thread(new Cavallo(GaraCavalli.cavallo5));
        c6 = new Thread(new Cavallo(GaraCavalli.cavallo6));
        c7 = new Thread(new Cavallo(GaraCavalli.cavallo7));
        c8 = new Thread(new Cavallo(GaraCavalli.cavallo8));
        c9 = new Thread(new Cavallo(GaraCavalli.cavallo9));
        c10 = new Thread(new Cavallo(GaraCavalli.cavallo10));

    }

}

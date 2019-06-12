/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Main.Tablero;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Animacion extends Thread {

    private JLabel eti;
    private Tablero p;
    private int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0;

    public Animacion(JLabel eti, Tablero p) {

        this.eti = eti;
        this.p = p;

    }

    public void run() {
        Random r = new Random();
        int h = r.nextInt(10) + 5;
        while (true) {
            try {
                sleep((800));

                c1 = p.getCaballo1().getLocation().x;
                c2 = p.getCaballo2().getLocation().x;
                c3 = p.getCaballo3().getLocation().x;
                c4 = p.getCaballo4().getLocation().x;
                c5 = p.getCaballo5().getLocation().x;
                c6 = p.getCaballo6().getLocation().x;
                c7 = p.getCaballo7().getLocation().x;
                c8 = p.getCaballo8().getLocation().x;
                c9 = p.getCaballo9().getLocation().x;
                c10 = p.getCaballo10().getLocation().x;

                if (c1 < p.getMeta().getLocation().x - 10 && c2 < p.getMeta().getLocation().x - 10 && c3 < p.getMeta().getLocation().x - 10 && c4 < p.getMeta().getLocation().x - 10 && c5 < p.getMeta().getLocation().x - 10 && c6 < p.getMeta().getLocation().x - 10 && c7 < p.getMeta().getLocation().x - 10 && c8 < p.getMeta().getLocation().x - 10 && c9 < p.getMeta().getLocation().x - 10 && c10 < p.getMeta().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + h, eti.getLocation().y);
                    p.repaint();
                } else {
                    break;
                }

            } catch (InterruptedException e) {

            }
            if (eti.getLocation().x >= p.getMeta().getLocation().x - 10) {

                if (c1 > c2 && c1 > c3 && c1 > c4 && c1 > c5 && c1 > c6 && c1 > c7 && c1 > c8 && c1 > c9 && c1 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 1");
                } else if (c2 > c1 && c2 > c3 && c2 > c4 && c2 > c5 && c2 > c6 && c2 > c7 && c2 > c8 && c2 > c9 && c2 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 2");
                } else if (c3 > c1 && c3 > c2 && c3 > c4 && c3 > c5 && c3 > c6 && c3 > c7 && c3 > c8 && c3 > c9 && c3 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 3");
                } else if (c4 > c1 && c4 > c2 && c4 > c3 && c4 > c5 && c4 > c6 && c4 > c7 && c4 > c8 && c4 > c9 && c4 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 4");
                } else if (c5 > c1 && c5 > c2 && c5 > c3 && c5 > c4 && c5 > c6 && c5 > c7 && c5 > c8 && c5 > c9 && c5 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 5");
                } else if (c6 > c1 && c6 > c2 && c6 > c3 && c6 > c4 && c6 > c5 && c6 > c7 && c6 > c8 && c6 > c9 && c6 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 6");
                } else if (c7 > c1 && c7 > c2 && c7 > c3 && c7 > c4 && c7 > c5 && c7 > c6 && c7 > c8 && c7 > c9 && c7 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 7");
                } else if (c8 > c1 && c8 > c2 && c8 > c3 && c8 > c4 && c8 > c5 && c8 > c6 && c8 > c7 && c8 > c9 && c8 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 8");
                } else if (c9 > c1 && c9 > c2 && c9 > c3 && c9 > c4 && c9 > c5 && c9 > c6 && c9 > c7 && c9 > c8 && c9 > 10) {
                    JOptionPane.showMessageDialog(null, "Ganó 9");
                } else if (c10 > c1 && c10 > c2 && c10 > c3 && c10 > c4 && c10 > c5 && c10 > c6 && c10 > c7 && c10 > c8 && c10 > 9) {
                    JOptionPane.showMessageDialog(null, "Ganó 10");
                } else {
                    JOptionPane.showMessageDialog(null, "Empate");

                }
            }
        }

    }
}

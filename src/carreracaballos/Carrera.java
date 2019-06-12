/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;
// importar librerias.

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author santi
 */
public class Carrera extends Thread {

    private JLabel eti;
    private frmCarreraCaballos p;

    public Carrera(JLabel eti, frmCarreraCaballos p) {

        this.eti = eti;//leer el label de cada caballo que se trae con los getter
        this.p = p;

    }

    public void run() {

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0;
        while (true) {
            try {
                sleep((int) (Math.random() * 1000));//movimientos del caballo aleatoriamente
                c1 = p.getlblCaballo1().getLocation().x;
                c2 = p.getlblCaballo2().getLocation().x;
                c3 = p.getlblCaballo3().getLocation().x;
                c4 = p.getlblCaballo4().getLocation().x;
                c5 = p.getlblCaballo5().getLocation().x;
                c6 = p.getlblCaballo6().getLocation().x;
                c7 = p.getlblCaballo7().getLocation().x;
                c8 = p.getlblCaballo8().getLocation().x;
                c9 = p.getlblCaballo9().getLocation().x;
                c10 = p.getlblCaballo10().getLocation().x;
                if (c1 < p.getlblMeta().getLocation().x - 10 && c2 < p.getlblMeta().getLocation().x - 10 && c3 < p.getlblMeta().getLocation().x - 10 && c4 < p.getlblMeta().getLocation().x - 10 && c5 < p.getlblMeta().getLocation().x - 10 && c6 < p.getlblMeta().getLocation().x - 10 && c7 < p.getlblMeta().getLocation().x - 10 && c8 < p.getlblMeta().getLocation().x - 10 && c9 < p.getlblMeta().getLocation().x - 10 && c10 < p.getlblMeta().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);//movimientos del caballo
                    p.repaint();
                } else {
                    break;
                }

            } catch (InterruptedException e) {

            }
            if (eti.getLocation().x >= p.getlblMeta().getLocation().x - 10) { //mensaje que dice que numero de caballo gano
                if (c1 > c2 && c1 > c3 && c1 > c4 && c1 > c5 && c1 > c6 && c1 > c7 && c1 > c8 && c1 > c9 && c1 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 1");
                } else if (c2 > c1 && c2 > c3 && c2 > c4 && c2 > c5 && c2 > c6 && c2 > c7 && c2 > c8 && c2 > c9 && c2 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 2");
                } else if (c3 > c1 && c3 > c2 && c3 > c4 && c3 > c5 && c3 > c6 && c3 > c7 && c3 > c8 && c3 > c9 && c3 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 3");
                } else if (c4 > c1 && c4 > c2 && c4 > c3 && c4 > c5 && c4 > c6 && c4 > c7 && c4 > c8 && c4 > c9 && c4 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 4");
                } else if (c5 > c1 && c5 > c2 && c5 > c3 && c5 > c4 && c5 > c6 && c5 > c7 && c5 > c8 && c5 > c9 && c5 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 5");
                } else if (c6 > c1 && c6 > c2 && c6 > c3 && c6 > c4 && c6 > c5 && c6 > c7 && c6 > c8 && c6 > c9 && c6 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 6");
                } else if (c7 > c1 && c7 > c2 && c7 > c3 && c7 > c4 && c7 > c5 && c7 > c6 && c7 > c8 && c7 > c9 && c7 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 7");
                } else if (c8 > c1 && c8 > c2 && c8 > c3 && c8 > c4 && c8 > c5 && c8 > c6 && c8 > c7 && c8 > c9 && c8 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó cabllo 8");
                } else if (c9 > c1 && c9 > c2 && c9 > c3 && c9 > c4 && c9 > c5 && c9 > c6 && c9 > c7 && c9 > c8 && c9 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 9");
                } else if (c10 > c1 && c10 > c2 && c10 > c3 && c10 > c4 && c10 > c5 && c10 > c6 && c10 > c7 && c10 > c8 && c10 > c9) {
                    JOptionPane.showMessageDialog(null, "Ganó caballo 10");
                } else {
                    JOptionPane.showMessageDialog(null, "Empate.");
                }
            }
        }       
    }
}

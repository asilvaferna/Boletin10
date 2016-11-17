/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 0;
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            rnd.setSeed(i);
        }
        String opt = JOptionPane.showInputDialog("MENÚ:\n1. Jugador v Jugador\n2. Jugador v Maquina\nq. Exit");
        while (!opt.equals("1") && !opt.equals("2") && !opt.equals("q")) {
            opt = JOptionPane.showInputDialog("Introduce un numero valido:\nMENÚ:\n1. Jugador v Jugador\n2. Jugador v Maquina\nq. Exit");
        }
        do {
            switch (opt) {
                case "1":
                    JvJ j1 = new JvJ();
                    j1.juego(5, 8);
                    break;
                case "2":
                    JvM j2 = new JvM();
                    j2.juego2((int) rnd.nextDouble() * 50 + 1);
                    break;
            }
        } while (!opt.equals("q"));
    }

}

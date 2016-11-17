/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class JvM {
    public void juego2(double num){
       double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero entre 0 y 50: "));
       while (numero<0 || numero>50){
           numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero entre 0 y 50: "));  
       }
       double distancia = numero - num;
        while (numero != num){
            if (distancia>20) JOptionPane.showMessageDialog(null,"Muy lejos");
            else if(distancia>=10 && distancia<=20) JOptionPane.showMessageDialog(null,"Lejos");
            else if(distancia<10 && distancia>5) JOptionPane.showMessageDialog(null,"Cerca");
            else if(distancia<=5) JOptionPane.showMessageDialog(null,"Casi lo tienes");
            else JOptionPane.showMessageDialog(null, "¡¡¡Has acertado!!!");
        }
        
    }
}
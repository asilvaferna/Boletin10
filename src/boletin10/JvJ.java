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
public class JvJ {
    
    public void juego(int n, int nveces){
        int i = 0, numero;
        
        do{
                numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
                if(numero>n) JOptionPane.showMessageDialog(null,"El numero que buscas es menor que: " + numero);
                else if(numero==n)JOptionPane.showMessageDialog(null,"¡¡Has acertado, enhorabuena!!");
                else JOptionPane.showMessageDialog(null,"El numero que buscas es mayor que: " + numero);
                i++;
        }while(numero!=n || nveces == i) ;
        
    }
}

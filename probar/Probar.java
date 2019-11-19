/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probar;

import javax.swing.JOptionPane;

/**
 *
 * @author rcarreraamoedo
 */
public class Probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Prueba");
       String resposta = JOptionPane.showInputDialog("Dame un número");
        int numero = Integer.parseInt(resposta);
    }
    
}

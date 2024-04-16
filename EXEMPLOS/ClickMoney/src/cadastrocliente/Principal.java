/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamires Pires
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) ao click-moneey, meu primeiro jogo :D", "Inicial", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seu objetivo é bem simples, conseguir o maximo de money que puder!", "Medio", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Boa sorte!", "fim", JOptionPane.INFORMATION_MESSAGE);
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
    
}
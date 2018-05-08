/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author peter
 */
public class JavaSwing {
    
    private static JFrame frame;
    private static JLabel label;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frame = new JFrame();
        label = new JLabel("Conteúdo", SwingConstants.CENTER);
        // Tamanho da janela 
        frame.setBounds(100, 100, 850, 800);
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Título");
        // exibe a view
        frame.setVisible(true);
    }
    
}

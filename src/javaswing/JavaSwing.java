/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author peter
 */
public class JavaSwing {
    
    private static JFrame frame;
    private static JLabel label;
    private static JPanel mainPanel;
    private static JButton btnAction;

    private static void showGUI(){
        frame = new JFrame();
        label = new JLabel("Conteúdo", SwingConstants.CENTER);
        // Tamanho da janela 
        frame.setBounds(100, 100, 250, 200);
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Título");
        // exibe a view
        frame.setVisible(true);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        frame.add(mainPanel);
        
        btnAction = new JButton("Clique aqui");
        btnAction.setActionCommand("Action");
        btnAction.addActionListener(new BtnHandler());
        mainPanel.add(btnAction);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showGUI();
    }
    
}

class BtnHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command){
            case "Action":
                JOptionPane.showMessageDialog(null, "Evento");
            break;
            default:
                System.out.println("Evento invalido");
        }
    }
    
}

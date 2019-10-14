/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Korisnik
 */
public class GuiSaberiOduzmi {
    
    private JFrame frame;
    private JPanel panel;
    
    private JLabel lblA;
    private JLabel lblC;
    private JLabel lblB;
    
    private JTextField txtA;
    private JTextField txtC;
    private JTextField txtB;
    
    private JButton btnSaberi;
    private JButton btnOduzmi;
    
    public GuiSaberiOduzmi(){
        gui();
    }
    
    public void gui(){
    
        frame = new JFrame("Kalkulator"); //Inicijalizacija i dodeljivanje naziva prozoru
        frame.setSize(300, 300);//Podešavamo veličinu prozora
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); //Kada pritinesmo X na prozoru on će izaći iz programa
        frame.setLocationRelativeTo(null);
        
        panel= new JPanel(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        
      
        txtA = new JTextField(null, 5);
        lblA = new JLabel("A");
        
        txtB = new JTextField(null, 5);
        lblB = new JLabel("B");
        
        txtC = new JTextField(null, 5);
        lblC = new JLabel("C");
        
        txtC.setEditable(false);
        
        btnSaberi = new JButton("Saberi");
        
        btnSaberi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                int br1, br2, rez;
                
                try {
                    br1 = Integer.parseInt(txtA.getText());
                    br2 = Integer.parseInt(txtB.getText());
                    
                    rez = br1 + br2;
                    txtC.setText(Integer.toString(rez));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unesi broj!");
                }
            }
        });
        
        btnOduzmi = new JButton("Oduzmi");
        
        c.insets = new Insets(20, 10, 20, 10);
        
        c.gridx = 0;
        c.gridy = 0;
        panel.add(lblA, c);
        
        c.gridx = 1;
        c.gridy = 0;
        panel.add(txtA,c);
        
        c.gridx = 0;
        c.gridy = 2;
        panel.add(lblB,c);
        
        c.gridx = 1;
        c.gridy = 2;
        panel.add(txtB,c);
        
        c.gridx = 0;
        c.gridy = 3;
        panel.add(lblC,c);
        
        c.gridx = 1;
        c.gridy = 3;
        panel.add(txtC,c);
        
        c.gridx = 0;
        c.gridy = 4;
        panel.add(btnSaberi,c);
        
        c.gridx = 1;
        c.gridy = 4;
        panel.add(btnOduzmi,c);
        
        
        frame.add(panel);
        frame.setVisible(true );//Omogućavamo da se prozor prikaže

    }

    public static void main(String[] args) {
        
        new GuiSaberiOduzmi();
        
    }
    
}

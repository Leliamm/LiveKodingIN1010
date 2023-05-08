import java.awt.BorderLayout;

import java.awt.*;
import javax.swing.*;

class EksempelGrid {
    public static void main (String[] args){
        JFrame vindu = new JFrame("Navn på vinduet");
        vindu.setLayout(new GridLayout(2,1));
        vindu.setSize(600, 400);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel toppPanel = new JPanel();
        toppPanel.setLayout(new GridLayout(1,2)); // rad, kol
        vindu.add(toppPanel);

        JButton knappV = new JButton("Venstre knapp");
        toppPanel.add(knappV);

        JButton knappH = new JButton("Høyre knapp");
        toppPanel.add(knappH);

        JPanel hovedPanel = new JPanel();
        hovedPanel.setLayout(new GridLayout(2,3)); // rad, kol
        //hovedPanel.setPreferredSize(new Dimension(600, 400));
        vindu.add(hovedPanel, BorderLayout.SOUTH);

        for (int i = 0; i<6; i++){
            JButton knapp = new JButton("Tekst knapp " + i);
            hovedPanel.add(knapp);
        }

        //vindu.pack(); // komprimerer vinduet - pakker det sammen
        vindu.setLocationRelativeTo(null); // midtstiller
        vindu.setVisible(true);
    }
}
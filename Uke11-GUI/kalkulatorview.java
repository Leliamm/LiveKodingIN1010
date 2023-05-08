import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KalkulatorView {
    private JFrame vindu;
    private JPanel hovedPanel;

    private JLabel tekstTall1;
    private JTextField tekstOmraade1;
    private JLabel tekstTall2;
    private JTextField tekstOmraade2;
    private JLabel tekstResultat;
    private JTextField resultatOmraade;

    private JButton leggTilKnapp;
    private JButton trekkFraKnapp;
    private JButton gangeKnapp;
    private JButton deleKnapp;
    
    public KalkulatorView(KalkulatorController kontroller){
        vindu = new JFrame("Kalkutor");
        vindu.setSize(600, 400);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hovedPanel = new JPanel();
        hovedPanel.setLayout(new GridLayout(5,2)); // rad,kol
        vindu.add(hovedPanel);

        Font tekstFont = new Font("Arial", Font.PLAIN, 30);
        // Fontkst + tekstområde 1
        tekstTall1 = new JLabel("Tall 1: ");
        tekstTall1.setFont(tekstFont);
        hovedPanel.add(tekstTall1);
        tekstOmraade1 = new JTextField();
        tekstOmraade1.setFont(tekstFont);
        hovedPanel.add(tekstOmraade1);

        // Tekst + tekstområde 2
        tekstTall2 = new JLabel("Tall 2: ");
        tekstTall2.setFont(tekstFont);
        hovedPanel.add(tekstTall2);
        tekstOmraade2 = new JTextField();
        tekstOmraade2.setFont(tekstFont);
        hovedPanel.add(tekstOmraade2);

        // Resultat tekst + tekstområde
        tekstResultat = new JLabel("Resultat: ");
        tekstResultat.setFont(tekstFont);
        hovedPanel.add(tekstResultat);
        resultatOmraade = new JTextField();
        resultatOmraade.setFont(tekstFont);
        hovedPanel.add(resultatOmraade);

        // Legger til knappene
        leggTilKnapp = new JButton("+");
        leggTilKnapp.setFont(tekstFont);
        class LeggTilBehandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                kontroller.leggTil();
            }
        }
        leggTilKnapp.addActionListener(new LeggTilBehandler());
        hovedPanel.add(leggTilKnapp);

        trekkFraKnapp = new JButton("-");
        trekkFraKnapp.setFont(tekstFont);
        class TrekkFraBehandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                kontroller.trekkFra();
            }
        }
        trekkFraKnapp.addActionListener(new TrekkFraBehandler());
        hovedPanel.add(trekkFraKnapp);

        gangeKnapp = new JButton("*");
        gangeKnapp.setFont(tekstFont);
        class GangeBehandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                kontroller.gange();
            }
        }
        gangeKnapp.addActionListener(new GangeBehandler());
        hovedPanel.add(gangeKnapp);

        deleKnapp = new JButton("/");
        deleKnapp.setFont(tekstFont);
        class DeleBehandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                kontroller.dele();
            }
        }
        deleKnapp.addActionListener(new DeleBehandler());
        hovedPanel.add(deleKnapp);

        vindu.setLocationRelativeTo(null); // midtstiller
        vindu.setVisible(true);
    }

    public double hentTall1() {
        return Double.parseDouble(tekstOmraade1.getText());
    }

    public double hentTall2() {
        return Double.parseDouble(tekstOmraade2.getText());
    }

    public void setResultat(double resultat) {
        String stringVerdi = String.format("%.2f", resultat); // 2 desimaler
        resultatOmraade.setText(stringVerdi);
    }
}

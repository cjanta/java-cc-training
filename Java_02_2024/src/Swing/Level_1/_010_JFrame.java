package Swing.Level_1;

import javax.swing.*;

public class _010_JFrame {
    public static void main(String[] args) {


        // Erstelle das Hauptfenster
        JFrame frame = new JFrame("Swing Fenster");


        // Setze die Größe des Fensters
        frame.setSize(800, 600);


        // Setze die Mindest- und Maximalgröße
        frame.setMinimumSize(new java.awt.Dimension(400, 300));
        frame.setMaximumSize(new java.awt.Dimension(1024, 768));


        // Erstelle ein Label
        JLabel label = new JLabel("irgendwas", SwingConstants.CENTER);
        frame.add(label);


        // Ändere die Hintergrundfarbe
        frame.getContentPane().setBackground(java.awt.Color.GREEN); // Andere Farben in der Java-Dokumentation


        // Beenden, wenn das Fenster geschlossen wird
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Fenster sichtbar machen
        frame.setVisible(true);
    }
}


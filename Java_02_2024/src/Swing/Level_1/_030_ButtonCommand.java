package Swing.Level_1;

import javax.swing.*;
import java.awt.*;

public class _030_ButtonCommand {

    public static void main(String[] args) {

        // Hauptfenster erstellen
        JFrame frame = new JFrame("Erweiterte Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null); // Manuelle Platzierung der Komponenten

        // Label erstellen
        JLabel meinLabel = new JLabel("Kein Button wurde gedrückt", SwingConstants.CENTER);
        meinLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        meinLabel.setBounds(10, 10, 360, 30);
        frame.add(meinLabel);

        // Button 1 (Aufruf einer Objektmethode)
        JButton button1 = new JButton("Objektmethode aufrufen");
        button1.setBounds(10, 50, 200, 30);
        button1.addActionListener(e -> updateLabel("Objektmethode wurde ausgeführt!", meinLabel));
        frame.add(button1);

        // Button 2 (direkte Lambda-Funktion)
        JButton button2 = new JButton("Lambda einfach");
        button2.setBounds(220, 50, 150, 30);
        button2.addActionListener(e -> meinLabel.setText("Lambda-Funktion genutzt"));
        frame.add(button2);

        // Button 3 (Lambda mit mehreren Befehlen)
        JButton button3 = new JButton("Lambda erweitert");
        button3.setBounds(10, 90, 360, 30);
        button3.addActionListener(e -> {
            meinLabel.setText("Lambda mit mehreren Befehlen!");
            meinLabel.setForeground(Color.RED);
            System.out.println("Button 3 wurde geklickt!");
        });
        frame.add(button3);

        // Hauptfenster sichtbar machen
        frame.setVisible(true);
    }

    // Objektmethode
    private static void updateLabel(String text, JLabel label) {
        label.setText(text);
        label.setForeground(Color.BLUE); // Ändere die Textfarbe
        System.out.println("updateLabel() wurde aufgerufen!");
    }
}

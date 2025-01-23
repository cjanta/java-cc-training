package Swing.WurfelApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ConfirmButton extends JButton implements ActionListener{

    private JLabel outputLabel; 
    private Random rand;
    
    public ConfirmButton(JLabel outputLabel){
        this.outputLabel = outputLabel;
        this.rand = new Random();
        this.setText("generieren");
        this.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       outputLabel.setText(String.valueOf(rand.nextInt()));
    }
}



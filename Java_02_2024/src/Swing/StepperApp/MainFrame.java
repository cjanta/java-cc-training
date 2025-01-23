package Swing.StepperApp;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    
    private JFrame frame = new JFrame("Hot Stepper");
    private int count = 0;
    private JLabel countLabel = null;
    private Dimension sizeDimension = new Dimension(300,100);


    public MainFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(sizeDimension);
        frame.setSize((int)sizeDimension.getWidth(), (int)sizeDimension.getHeight());

        frame.setLayout(new FlowLayout());
        
        JButton plusButton = new JButton("+");
        // plusButton.setBounds(0, 0, 120, 24);
        plusButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               incrementCounter();
            }
            
        });
        frame.add(Box.createRigidArea(new Dimension(0,15)));
        frame.add(plusButton);

        countLabel = new JLabel("0");
        // countLabel.setBounds(0, 0, 240, 24);
        frame.add(Box.createRigidArea(new Dimension(0,15)));
        frame.add(countLabel);
        
        JButton minusButton = new JButton("-");
        // minusButton.setBounds(0, 0, 120, 24); 
        minusButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                decrementCounter();
            }
           
        });
        frame.add(Box.createRigidArea(new Dimension(0,15)));
        frame.add(minusButton);
        

        frame.pack();
        frame.setVisible(true);

    }

    private void incrementCounter(){
        count++;
        updateCountLabel();
        System.out.println(count);
    }

    private void decrementCounter(){
        count--;
        updateCountLabel();
        System.out.println(count);
    }

    private void updateCountLabel() {
        countLabel.setText(String.valueOf(count));
    }

   

}

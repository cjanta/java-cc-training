package Swing.WurfelApp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

    private Dimension minDimension = new Dimension(400,300);
    
    public MainFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(minDimension);
        this.setSize(minDimension);

        this.setLayout(new FlowLayout());
        OutputLabel outputLabel = new OutputLabel();
        ConfirmButton confirmButton = new ConfirmButton(outputLabel);
        this.add(confirmButton);
        this.add(outputLabel);

        this.pack();
        this.setVisible(true);

    }


}

package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EnterWordDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField textField;
	private JButton abbrechenBtn;
	public JButton bestaetigenBtn;
	
	public EnterWordDialog() {
		super();
		
		this.setTitle("Enter new word!");
		 
        // Höhe und Breite des Fensters werden 
        // auf 200 Pixel gesetzt
        this.setSize(400, 300);
        // Dialog wird auf modal gesetzt
        this.setModal(true);
        // Hinzufügen einer Komponente, 
        // in diesem Fall ein JLabel
        
        this.setLayout(new GridLayout(4, 4));
        
        this.add(new JLabel("Gebe das neue Wort ein:"));
        textField = new JTextField();
        this.add(textField);
        
        abbrechenBtn = new JButton("Abbrechen");
        abbrechenBtn.addActionListener((event) -> {
        	this.setVisible(false); 
        	textField.setText("");	
        });
        this.add(abbrechenBtn);
        
        bestaetigenBtn = new JButton("Bestätigen");
        this.add(bestaetigenBtn);
        
        
        // Wir lassen unseren JDialog anzeigen
        this.setVisible(false);
	}
	
}

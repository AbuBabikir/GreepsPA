package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class HangManImg extends JPanel {
	
	/**
	 * 
	 */
	public int fehlerCounter = 0;
	BufferedImage image = null;
	JLabel lblNewLabel;
	private static final long serialVersionUID = 1L;

	public HangManImg()
	{
		super();

		lblNewLabel = new JLabel("Versuche: " + (10 - fehlerCounter));
		//this.setBackground(Color.green);
		lblNewLabel.setBounds(0, 0, 100, 100);
		this.setBounds(500, 10, 300, 300);
		this.add(lblNewLabel);
	    
	    
		this.setVisible(true);
	}
	
	public void UpdateFehlerCounter() {
		switch(fehlerCounter) {
		case 11:
			lblNewLabel.setText("GAME OVER");
			fehlerCounter = 0;
			this.repaint();
			break;
			default:
				fehlerCounter++;
				this.repaint();
		}
	}
	
	@Override
	  protected void paintComponent(Graphics g) {
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\" + fehlerCounter + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    super.paintComponent(g);
	    g.drawImage(image, 0, 0, 300, 300, this);
	}

}

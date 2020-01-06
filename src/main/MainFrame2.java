package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashSet;

public class MainFrame2 {

	private JFrame frame;
	private HangManImg hangImg;
	private EnterWordDialog enterWordDialog;

	private String momentanerText;
	private HashSet<String> validChars;
	private PlaceholderJLabel[] placeHolderLabels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame2 window = new MainFrame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setBounds(100, 100, 824, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Versuche Sie den Begriff zu erraten.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(80, 150, 366, 33);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("A");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(21, 204, 53, 33);
		frame.getContentPane().add(btnNewButton);

		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnB.setBounds(80, 204, 53, 33);
		frame.getContentPane().add(btnB);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBounds(143, 204, 53, 33);
		frame.getContentPane().add(btnC);

		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnD.setBounds(208, 204, 53, 33);
		frame.getContentPane().add(btnD);

		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnE.setBounds(274, 204, 53, 33);
		frame.getContentPane().add(btnE);

		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnF.setBounds(337, 204, 53, 33);
		frame.getContentPane().add(btnF);

		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnG.setBounds(400, 204, 53, 33);
		frame.getContentPane().add(btnG);

		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnH.setBounds(60, 247, 53, 33);
		frame.getContentPane().add(btnH);

		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnI.setBounds(123, 247, 53, 33);
		frame.getContentPane().add(btnI);

		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnJ.setBounds(188, 247, 53, 33);
		frame.getContentPane().add(btnJ);

		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnK.setBounds(251, 247, 53, 33);
		frame.getContentPane().add(btnK);

		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnL.setBounds(314, 247, 53, 33);
		frame.getContentPane().add(btnL);

		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnM.setBounds(377, 247, 53, 33);
		frame.getContentPane().add(btnM);

		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN.setBounds(21, 290, 53, 33);
		frame.getContentPane().add(btnN);

		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnO.setBounds(80, 290, 53, 33);
		frame.getContentPane().add(btnO);

		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnP.setBounds(143, 290, 53, 33);
		frame.getContentPane().add(btnP);

		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnQ.setBounds(208, 290, 53, 33);
		frame.getContentPane().add(btnQ);

		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnR.setBounds(274, 290, 53, 33);
		frame.getContentPane().add(btnR);

		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnS.setBounds(337, 290, 53, 33);
		frame.getContentPane().add(btnS);

		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnT.setBounds(400, 290, 53, 33);
		frame.getContentPane().add(btnT);

		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnU.setBounds(60, 333, 53, 33);
		frame.getContentPane().add(btnU);

		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnV.setBounds(123, 333, 53, 33);
		frame.getContentPane().add(btnV);

		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnW.setBounds(181, 333, 60, 33);
		frame.getContentPane().add(btnW);

		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(251, 333, 53, 33);
		frame.getContentPane().add(btnX);

		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnY.setBounds(314, 333, 53, 33);
		frame.getContentPane().add(btnY);

		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnZ.setBounds(377, 333, 53, 33);
		frame.getContentPane().add(btnZ);

		hangImg = new HangManImg();
		frame.getContentPane().add(hangImg);

		validChars = new HashSet<String>();

		var menuBar = new JMenuBar();
		var exitIcon = new ImageIcon("src/resources/exit.png");

		var fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		var eMenuItem = new JMenuItem("Exit", exitIcon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener((event) -> System.exit(0));

		enterWordDialog = new EnterWordDialog();
		enterWordDialog.bestaetigenBtn.addActionListener((event) -> {
			if(enterWordDialog.textField.getText().length() > 8)
			{
				JOptionPane.showMessageDialog(null,
						"Gebe ein Wort mit weniger als 8 Buchstaben ein!"
						,"Wort ist zu lange!", JOptionPane.CANCEL_OPTION);
			}
			else
			{
				momentanerText = enterWordDialog.textField.getText();
				enterWordDialog.textField.setText("");
				enterWordDialog.setVisible(false);
				ResetButtons(new JButton[] { btnNewButton, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK,
					btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ });
				initializeLabels();
				validChars = new HashSet<String>();
			}
		});

		var enterWordMenuItem = new JMenuItem("Enter Word");
		enterWordMenuItem.setToolTipText("Enter new word");
		enterWordMenuItem.addActionListener((event) -> enterWordDialog.setVisible(true));

		fileMenu.add(enterWordMenuItem);

		fileMenu.add(eMenuItem);
		menuBar.add(fileMenu);

		frame.setJMenuBar(menuBar);

		AddOnClickListener(new JButton[] { btnNewButton, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK,
				btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ });
	}

	private void initializeLabels() {
		placeHolderLabels = new PlaceholderJLabel[momentanerText.length()];
		
		for (int i = 0; i < placeHolderLabels.length; i++) {
			char target = momentanerText.toCharArray()[i];
			placeHolderLabels[i] = new PlaceholderJLabel(target, 
					80 + i*52, 55, 
					50, 35);

			// placeHolderLabels[i].setVisible(true);
			frame.getContentPane().add(placeHolderLabels[i]);
		}
		
		frame.repaint();
	}
	
	private void ResetButtons(JButton[] buttons) {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setVisible(true);
		}
	}

	private void AddOnClickListener(JButton[] buttons) {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource();
					boolean validCharPressed = false;

					for (char txtChar : momentanerText.toCharArray()) {
						if (btn.getText().toUpperCase().equals((txtChar + "").toUpperCase())) {
							validChars.add(btn.getText().toLowerCase());
							btn.setVisible(false);
							validCharPressed = true;
							UpdateWordLabels(txtChar);
						}
					}

					if (!validCharPressed) {
						hangImg.UpdateFehlerCounter();
					}
				}
			});
		}
	}

	private void UpdateWordLabels(char c) {
		for (PlaceholderJLabel label : placeHolderLabels) {
			label.CheckChar(c);
		}
	}
}

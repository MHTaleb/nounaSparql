package com.talcorp.piecedetachee.pfs_maven;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/******************************************************************** JDAbout */
/******************************************************** A propos de My Expert */

class AboutApp implements ActionListener {
	// / D�claration des variables.
	JDialog boite;
	JButton ok;
	JPanel pan;

	// / Constructeur.
	AboutApp(int x, int y, int lg, int ht, JFrame fen) {
		// Cr�ation de la fen�tre.
		boite = new JDialog(fen, "A propos de notre application", false);
		boite.setBounds(x, y, lg + 10, ht + 30);
		boite.setResizable(false);
		boite.setUndecorated(true);
		boite.getRootPane().setWindowDecorationStyle(1);
		boite.setVisible(true);

		// Cr�ation du panneau principal.
		pan = new pan_about();
		pan.setBackground(Color.lightGray);
		pan.setBounds(0, 0, lg, ht);
		pan.setLayout(null);
		boite.getContentPane().add(pan);

		// Cr�ation des Bouton de validation.
		ok = new JButton("ok");
		ok.setBounds(lg / 2 - 35, ht - 40, 70, 25);
		pan.add(ok);
		ok.setEnabled(true);
		ok.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// Action sur les JButton.
		Object source = e.getSource();

		if (source == ok) {
			boite.setVisible(false);

		}
	}

	// / Description des m�thodes.

	// * Fonction : setVoir(boolean B).
	// Cette fonction permet de rendre visible ou non le JDialog.
	void setVoir(boolean B) {

		boite.setVisible(B);

	}
}

@SuppressWarnings("serial")
class pan_about extends JPanel {
	// D�claration des variables.
	private ImageIcon Ifond;

	pan_about() {
		// Image de fond.
		Ifond = new ImageIcon(getClass().getResource("/AboutApp.png"));
		// Image logo.
		// Ilogo = new ImageIcon (getClass().getResource("/img/logo.gif"));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Ifond.getImage(), 0, 0, null);
		// g.drawImage (Ilogo.getImage(), 205, 20, null);

	}
}
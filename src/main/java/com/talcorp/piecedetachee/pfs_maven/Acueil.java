package com.talcorp.piecedetachee.pfs_maven;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Acueil extends JPanel implements MouseListener {
	private JButton btnStart;

	/**
	 * Create the panel.
	 */
	public Acueil() {
		setLayout(null);
		setSize(700, 500);

		btnStart = new JButton("Start");
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStart.setForeground(new Color(255, 255, 224));
		btnStart.setHorizontalTextPosition(SwingConstants.CENTER);
		btnStart.setIcon(new ImageIcon(getClass().getResource("/starbutt.png")));
		btnStart.setFocusPainted(false);
		btnStart.setFocusable(false);
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.addMouseListener(this);
		btnStart.setBounds(304, 234, 118, 82);
		add(btnStart);

		JButton btnAboutapp = new JButton("AboutApp");
		btnAboutapp.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAboutapp.setForeground(new Color(255, 255, 224));
		btnAboutapp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAboutapp.setIcon(new ImageIcon(getClass().getResource(
				"/starbutt.png")));
		btnAboutapp.setFocusable(false);
		btnAboutapp.setFocusPainted(false);
		btnAboutapp.setContentAreaFilled(false);
		btnAboutapp.setBorderPainted(false);
		btnAboutapp.addMouseListener(this);
		btnAboutapp.setBounds(304, 324, 118, 82);
		add(btnAboutapp);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/bgl.png")));
		label.setBounds(0, 0, 700, 500);
		add(label);
	}

	
	public void mouseClicked(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Start")// TODO
															// Auto-generated
															// method stub
		{
			FramePrincipale.card.show(FramePrincipale.contenaire, "1");
			FramePrincipale.currentMenu++;
		} else {
			if (ap != null)
				ap.setVoir(false);
			ap = new AboutApp(
					Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 200,
					268, 350, 250, Logo.fen.frmPfemaster);
		}

	}

	static AboutApp ap;

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		((JButton) e.getSource()).setIcon(new ImageIcon(getClass().getResource(
				"/starbuttEntered.png")));
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		((JButton) e.getSource()).setIcon(new ImageIcon(getClass().getResource(
				"/starbutt.png")));
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		((JButton) e.getSource()).setIcon(new ImageIcon(getClass().getResource(
				"/starbuttPressed.png")));
		((JButton) e.getSource()).setForeground(Color.black);
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		((JButton) e.getSource()).setIcon(new ImageIcon(getClass().getResource(
				"/starbutt.png")));
		((JButton) e.getSource()).setForeground(new Color(255, 255, 224));
	}
}

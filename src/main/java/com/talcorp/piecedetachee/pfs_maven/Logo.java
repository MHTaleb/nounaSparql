package com.talcorp.piecedetachee.pfs_maven;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Window.Type;

import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;

import org.apache.jena.base.Sys;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Logo {

	public JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Logo() {
		initialize();
	}

	static FramePrincipale fen;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setOpacity(0);
		frame.addWindowListener(new WindowAdapter() {

			public void windowOpened(WindowEvent arg0) {
				for (double i = 0; i < 1.0; i += 0.1) {
					try {
						Thread.sleep(50);
					} catch (Exception e) {
						// TODO: handle exception
					}

					String v = i + "F";
					frame.setOpacity(Float.valueOf(v));

				}
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				for (double i = 1.0; i > 0; i -= 0.1) {
					try {
						if (i > 0.1)
							Thread.sleep(50);

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

					String v = i + "F";
					Float h = Float.valueOf(v);
					frame.setOpacity(h);

				}

				fen = new FramePrincipale();
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		});

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/LOGO.png")));
		label.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setBackground(new Color(0, 0, 0, 0));
	}

}

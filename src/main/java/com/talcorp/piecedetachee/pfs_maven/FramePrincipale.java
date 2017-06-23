package com.talcorp.piecedetachee.pfs_maven;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramePrincipale {

	static JFrame frmPfemaster = new JFrame();
	public static JPanel contenaire = new JPanel();
	public static CardLayout card = new CardLayout(0, 0);
	public static int currentMenu = 0; // intialis� par le menu d'acueil

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// cette ligne a pour evité une exception erreur (log4j) -_+
					org.apache.log4j.Logger.getRootLogger().setLevel(
							org.apache.log4j.Level.OFF);
					Logo logo = new Logo();
					logo.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FramePrincipale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public int xp, yp;
	private final JButton btnNewButton = new JButton("");

	private void initialize() {
		frmPfemaster = new JFrame();
		frmPfemaster.setTitle("PFE-Master2");
		frmPfemaster.setUndecorated(true);
		frmPfemaster.setOpacity(0);
		frmPfemaster.setBounds(100, 100, 700, 500);
		frmPfemaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPfemaster.setLocationRelativeTo(null);
		frmPfemaster.getContentPane().setLayout(null);

		JLabel lblpfeMaster = new JLabel("-PFE Master 2");
		lblpfeMaster.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				int xf = e.getXOnScreen() - xp, yf = e.getYOnScreen() - yp;
				System.out.println(e.getX() + " D " + e.getY());
				frmPfemaster.setLocation(xf, yf);
			}
			//
		});
		lblpfeMaster.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				xp = e.getX();
				yp = e.getY();
				System.out.println(xp + " " + yp);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(667, 0, 33, 23);
		frmPfemaster.getContentPane().add(btnNewButton);
		btnNewButton.setContentAreaFilled(false);
		lblpfeMaster.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblpfeMaster.setForeground(Color.WHITE);
		lblpfeMaster.setHorizontalAlignment(SwingConstants.CENTER);
		lblpfeMaster.setHorizontalTextPosition(SwingConstants.CENTER);
		lblpfeMaster.setBackground(Color.ORANGE);
		lblpfeMaster.setBounds(0, 0, 662, 24);
		frmPfemaster.getContentPane().add(lblpfeMaster);
		contenaire.setOpaque(false);

		contenaire.setLocation(0, 0);
		contenaire.setSize(700, 500);
		frmPfemaster.getContentPane().add(contenaire);
		contenaire.setLayout(card);

		JPanel aceuil = new JPanel();
		aceuil.setBackground(Color.GRAY);
		Acueil acueil = new Acueil();
		contenaire.add(acueil, "0");
		aceuil.setLayout(null);

		JPanel menu1 = new JPanel();
		menu1.setBackground(Color.BLACK);
		contenaire.add(new Menu1(), "1");

		JPanel menu2 = new JPanel();
		contenaire.add(new Menu2(), "2");

		JPanel menu3 = new JPanel();
		contenaire.add(new Menu3(), "3");

		JPanel menu4 = new JPanel();
		contenaire.add(new Menu4(), "4");

		JPanel menu5 = new JPanel();
		contenaire.add(new Menu5(), "5");

		frmPfemaster.addWindowListener(new WindowAdapter() {
			
			public void windowOpened(WindowEvent arg0) {
				for (double i = 0; i < 1.0; i += 0.1) {
					String v = i + "F";
					frmPfemaster.setOpacity(Float.valueOf(v));

					try {
						Thread.sleep(50);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		});
		frmPfemaster.setVisible(true);
	}
}

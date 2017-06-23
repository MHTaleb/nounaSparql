package com.talcorp.piecedetachee.pfs_maven;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

public class Menu3 extends JPanel implements MouseListener {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public Menu3() {
		setLayout(null);
		setSize(700, 500);

		JButton button = new JButton("<<Previous");
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setForeground(new Color(255, 222, 173));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setIcon(new ImageIcon(getClass().getResource("/ButtonNext.png")));
		button.setBounds(32, 445, 115, 31);
		button.addMouseListener(this);
		add(button);

		JButton button_1 = new JButton("Next>>");
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setForeground(new Color(255, 222, 173));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setIcon(new ImageIcon(getClass()
				.getResource("/ButtonNext.png")));
		button_1.setBounds(569, 445, 121, 31);
		button_1.addMouseListener(this);
		add(button_1);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("User");
		tglbtnNewToggleButton.setBorder(new LineBorder(new Color(154, 205, 50),
				3));
		tglbtnNewToggleButton.setForeground(new Color(0, 0, 0));
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBackground(new Color(224, 255, 255));
		tglbtnNewToggleButton.setFocusPainted(false);
		buttonGroup.add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		tglbtnNewToggleButton.setBounds(126, 182, 155, 91);
		add(tglbtnNewToggleButton);

		JToggleButton tglbtnServiceProvider = new JToggleButton(
				"Service provider");
		tglbtnServiceProvider.setBorder(new LineBorder(new Color(154, 205, 50),
				3));
		tglbtnServiceProvider.setForeground(new Color(0, 0, 0));
		tglbtnServiceProvider.setBackground(new Color(224, 255, 255));
		tglbtnServiceProvider.setFocusPainted(false);
		buttonGroup.add(tglbtnServiceProvider);
		tglbtnServiceProvider.setFont(new Font("Tahoma", Font.BOLD, 13));
		tglbtnServiceProvider.setBounds(442, 182, 155, 91);
		add(tglbtnServiceProvider);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/bg0.png")));
		lblNewLabel.setBounds(0, 0, 700, 500);
		add(lblNewLabel);

	}

	public void mouseClicked(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>")// TODO
															// Auto-generated
															// method stub
		{
			FramePrincipale.card.show(FramePrincipale.contenaire, "4");
			FramePrincipale.currentMenu++;
		} else if (e.getSource() instanceof JButton) {
			FramePrincipale.card.show(FramePrincipale.contenaire, "2");
			FramePrincipale.currentMenu--;
			if (Menu1.service == "EducationService"
					|| Menu1.service == "LocationBasedService"
					|| Menu1.service == "OnlineShop"
					|| Menu1.service == "FinanceService") {
				FramePrincipale.card.show(FramePrincipale.contenaire, "1");
				FramePrincipale.currentMenu--;
			}

		}

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNextEntered.png")));
		}
	}

	public void mouseExited(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}

	}

	public void mousePressed(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNextPressed.png")));
		}

	}

	public void mouseReleased(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}

	}
}

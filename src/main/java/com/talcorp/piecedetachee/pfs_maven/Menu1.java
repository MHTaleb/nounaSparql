package com.talcorp.piecedetachee.pfs_maven;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Menu1 extends JPanel implements MouseListener, ActionListener {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static String service = "EducationService";
	JRadioButton r1, r2, r3, r4, r5;
	private JComboBox comboBox;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;

	/**
	 * Create the panel.
	 */
	public Menu1() {
		setBackground(Color.GRAY);
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

		r1 = new JRadioButton("");
		r1.setRolloverEnabled(false);
		r1.setRequestFocusEnabled(false);
		r1.setFocusable(false);
		r1.setFocusPainted(false);
		r1.addActionListener(this);
		r1.setContentAreaFilled(false);
		r1.setSelected(true);
		buttonGroup.add(r1);
		r1.setBounds(212, 174, 256, 27);
		add(r1);

		r2 = new JRadioButton("");
		r2.addActionListener(this);
		r2.setRolloverEnabled(false);
		r2.setRequestFocusEnabled(false);
		r2.setFocusable(false);
		r2.setFocusPainted(false);
		r2.setContentAreaFilled(false);
		buttonGroup.add(r2);
		r2.setBounds(212, 226, 256, 27);
		add(r2);

		r3 = new JRadioButton("");
		r3.addActionListener(this);
		r3.setRolloverEnabled(false);
		r3.setRequestFocusEnabled(false);
		r3.setFocusable(false);
		r3.setFocusPainted(false);
		r3.setContentAreaFilled(false);
		buttonGroup.add(r3);
		r3.setBounds(212, 278, 256, 27);
		add(r3);

		r4 = new JRadioButton("");
		r4.setRolloverEnabled(false);
		r4.setRequestFocusEnabled(false);
		r4.setFocusable(false);
		r4.addActionListener(this);
		r4.setFocusPainted(false);
		r4.setContentAreaFilled(false);
		buttonGroup.add(r4);
		r4.setBounds(212, 331, 256, 27);
		add(r4);

		r5 = new JRadioButton("");
		r5.setRolloverEnabled(false);
		r5.setRequestFocusEnabled(false);
		r5.setFocusable(false);
		r5.setFocusPainted(false);
		r5.addActionListener(this);
		r5.setContentAreaFilled(false);
		buttonGroup.add(r5);
		r5.setBounds(211, 384, 257, 27);
		add(r5);

		comboBox = new JComboBox();
		comboBox.setBackground(new Color(95, 158, 160));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setVisible(false);
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Media online" }));
		comboBox.setBounds(493, 226, 153, 27);
		add(comboBox);

		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(95, 158, 160));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setForeground(new Color(0, 0, 0));
		comboBox_2.setVisible(false);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {
				"Accomodation", "Transportation" }));
		comboBox_2.setBounds(493, 384, 153, 27);
		add(comboBox_2);

		comboBox_1 = new JComboBox();
		comboBox_1.setVisible(false);
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
				"LocationBasedService", "OnlineShop" }));
		comboBox_1.setBackground(new Color(95, 158, 160));
		comboBox_1.setBounds(493, 331, 153, 27);
		add(comboBox_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/menu1.png")));
		label.setBounds(0, 0, 700, 500);
		add(label);

	}


	public void mouseClicked(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>")// TODO
															// Auto-generated
															// method stub
		{
			FramePrincipale.card.show(FramePrincipale.contenaire, "2");
			FramePrincipale.currentMenu++;
			if (r1.isSelected()) {
				service = "EducationService";
				FramePrincipale.card.show(FramePrincipale.contenaire, "3");
				FramePrincipale.currentMenu++;
			} else if (r2.isSelected()) {
				service = "MediaOnline";
				Menu2.comboBox.setEnabled(true);
				Menu2.comboBox_1.setEnabled(false);
				Menu2.comboBox_2.setEnabled(false);
				Menu2.comboBox_3.setEnabled(false);
				Menu2.comboBox_4.setEnabled(false);
				Menu2.rdbtnBbyLand.setEnabled(false);
				Menu2.rdbtnByAir.setEnabled(false);
				Menu2.rdbtnNewRadioButton.setEnabled(false);
			} else if (r3.isSelected()) {
				service = "FinanceService";
				FramePrincipale.card.show(FramePrincipale.contenaire, "3");
				FramePrincipale.currentMenu++;
			} else if (r4.isSelected()) {
				service = comboBox_1.getSelectedItem().toString();
				FramePrincipale.card.show(FramePrincipale.contenaire, "3");
				FramePrincipale.currentMenu++;
			} else {
				Menu2.comboBox.setEnabled(false);
				if (comboBox_2.getSelectedItem().equals("Transportation")) {
					Menu2.comboBox_1.setEnabled(false);
					Menu2.comboBox_2.setEnabled(true);
					Menu2.comboBox_4.setEnabled(false);
					Menu2.comboBox_3.setEnabled(false);
					Menu2.rdbtnBbyLand.setEnabled(true);
					Menu2.rdbtnByAir.setEnabled(true);
					Menu2.rdbtnNewRadioButton.setEnabled(true);
					Menu2.rdbtnNewRadioButton.setSelected(true);

				}
				if (comboBox_2.getSelectedItem().equals("Accomodation")) {
					Menu2.comboBox_1.setEnabled(true);
					Menu2.comboBox_2.setEnabled(false);
					Menu2.comboBox.setEnabled(false);
					Menu2.comboBox_3.setEnabled(false);
					Menu2.comboBox_4.setEnabled(false);
					Menu2.rdbtnBbyLand.setEnabled(false);
					Menu2.rdbtnByAir.setEnabled(false);
					Menu2.rdbtnNewRadioButton.setEnabled(false);

				}
				service = "TravelService";
			}
		} else {
			FramePrincipale.card.show(FramePrincipale.contenaire, "0");
			FramePrincipale.currentMenu--;
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


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == r2) {
			comboBox.setVisible(true);
			service = "MediaOnline";
		} else
			comboBox.setVisible(false);
		if (e.getSource() == r5) {
			comboBox_2.setVisible(true);
			service = comboBox_2.getSelectedItem().toString();
		} else
			comboBox_2.setVisible(false);
		if (e.getSource() == r4) {
			comboBox_1.setVisible(true);
			service = comboBox_1.getSelectedItem().toString();
		} else
			comboBox_1.setVisible(false);

	}
}

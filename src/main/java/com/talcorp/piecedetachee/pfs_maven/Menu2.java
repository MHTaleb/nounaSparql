package com.talcorp.piecedetachee.pfs_maven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;

import java.awt.Rectangle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Menu2 extends JPanel implements MouseListener, ActionListener {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_2;
	static JRadioButton rdbtnNewRadioButton;
	static JRadioButton rdbtnBbyLand;
	static JRadioButton rdbtnByAir;
	static JComboBox comboBox_4;
	static JComboBox comboBox_3;
	static JComboBox comboBox_2;
	private JPanel panel_1;
	static JComboBox comboBox_1;
	private JPanel panel;
	static JComboBox comboBox;
	private JLabel lblPleaseSpecifyMore;

	/**
	 * Create the panel.
	 */
	public Menu2() {
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

		panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2),
				"Media online service", TitledBorder.CENTER, TitledBorder.TOP,
				null, new Color(255, 228, 181)));
		panel.setBounds(96, 92, 530, 59);
		panel.setBackground(new Color(0, 0, 0, 50));
		add(panel);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(154, 205, 50));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "NewsPortal",
				"OnlineNewsPaper", "OnlineRadio", "OnlineTV" }));

		panel.add(comboBox);

		panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.setBorder(new TitledBorder(
				new LineBorder(new Color(0, 0, 0), 2), "AccomodationService",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(238,
						232, 170)));
		panel_1.setBounds(96, 162, 530, 59);
		panel_1.setBackground(new Color(0, 0, 0, 50));
		add(panel_1);

		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setBackground(new Color(154, 205, 50));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
				"ReserveCampingTent", "ReserveHotelRoom" }));
		panel_1.add(comboBox_1);

		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.setBorder(new TitledBorder(
				new LineBorder(new Color(0, 0, 0), 2), "TransportationService",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255,
						218, 185)));
		panel_2.setBounds(96, 232, 530, 190);
		panel_2.setBackground(new Color(0, 0, 0, 50));
		add(panel_2);
		panel_2.setLayout(null);

		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setForeground(new Color(0, 0, 0));
		comboBox_2.setBackground(new Color(154, 205, 50));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {
				"BuyBoatTicket", "ReserveBoatSeat" }));
		comboBox_2.setBounds(286, 27, 109, 20);
		panel_2.add(comboBox_2);

		comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_3.setForeground(new Color(0, 0, 0));
		comboBox_3.setBackground(new Color(154, 205, 50));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {
				"BuyBusTicket", "RentVehicle", "ReserveBusSeat" }));
		comboBox_3.setBounds(286, 77, 109, 20);
		panel_2.add(comboBox_3);

		comboBox_4 = new JComboBox();
		comboBox_4.setEnabled(false);
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_4.setForeground(new Color(0, 0, 0));
		comboBox_4.setBackground(new Color(154, 205, 50));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {
				"BuyFlightTicket", "FlightReservation" }));
		comboBox_4.setBounds(286, 134, 109, 20);
		panel_2.add(comboBox_4);

		rdbtnNewRadioButton = new JRadioButton("By sea");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setRequestFocusEnabled(false);
		rdbtnNewRadioButton.setFocusable(false);
		rdbtnNewRadioButton.setFocusPainted(false);

		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton.setForeground(new Color(238, 232, 170));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setContentAreaFilled(false);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(118, 27, 109, 23);
		panel_2.add(rdbtnNewRadioButton);

		rdbtnBbyLand = new JRadioButton("By land");
		rdbtnBbyLand.setRequestFocusEnabled(false);
		rdbtnBbyLand.setFocusable(false);
		rdbtnBbyLand.addActionListener(this);
		rdbtnBbyLand.setFocusPainted(false);
		rdbtnBbyLand.setForeground(new Color(238, 232, 170));
		rdbtnBbyLand.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnBbyLand.setContentAreaFilled(false);
		buttonGroup.add(rdbtnBbyLand);
		rdbtnBbyLand.setBounds(118, 77, 109, 23);
		panel_2.add(rdbtnBbyLand);

		rdbtnByAir = new JRadioButton("By Air");
		rdbtnByAir.setRequestFocusEnabled(false);
		rdbtnByAir.setFocusable(false);
		rdbtnByAir.setFocusPainted(false);
		rdbtnByAir.addActionListener(this);
		rdbtnByAir.setForeground(new Color(238, 232, 170));
		rdbtnByAir.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnByAir.setContentAreaFilled(false);
		buttonGroup.add(rdbtnByAir);
		rdbtnByAir.setToolTipText("");
		rdbtnByAir.setBounds(118, 134, 109, 23);
		panel_2.add(rdbtnByAir);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 18, 510, 161);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 0, 0, 50));
		panel_2.add(lblNewLabel);

		lblPleaseSpecifyMore = new JLabel(
				"Please specify more the service that you selected before :");
		lblPleaseSpecifyMore.setForeground(new Color(238, 232, 170));
		lblPleaseSpecifyMore.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPleaseSpecifyMore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSpecifyMore.setBounds(57, 36, 590, 44);
		add(lblPleaseSpecifyMore);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/bg0.png")));
		label.setBounds(0, 0, 700, 500);
		add(label);
	}


	public void mouseClicked(MouseEvent e) {
		if (e.getSource() instanceof JButton
				&& ((JButton) e.getSource()).getText() == "Next>>")// TODO
		// Auto-generated
		// method stub
		{
			FramePrincipale.card.show(FramePrincipale.contenaire, "3");
			FramePrincipale.currentMenu++;
			if (Menu1.service == "MediaOnline") {
				Menu1.service = comboBox.getSelectedItem().toString();
			} else if (Menu1.service == "AccomodationService") {
				Menu1.service = comboBox_1.getSelectedItem().toString();
			} else {// transportation service
				if (comboBox_2.isEnabled())
					Menu1.service = comboBox_2.getSelectedItem().toString();
				if (comboBox_3.isEnabled()) {
					Menu1.service = comboBox_3.getSelectedItem().toString();
					System.out.println("Service =" + Menu1.service);
				}
				if (comboBox_4.isEnabled())
					Menu1.service = comboBox_4.getSelectedItem().toString();
			}

		} else if (e.getSource() instanceof JButton) {

			FramePrincipale.card.show(FramePrincipale.contenaire, "1");
			FramePrincipale.currentMenu--;
		}

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton
				&& ((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNextEntered.png")));
		}
		if (e.getSource() instanceof JRadioButton)
			((JRadioButton) e.getSource()).updateUI();
	}


	public void mouseExited(MouseEvent e) {
		if (e.getSource() instanceof JButton
				&& ((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}
		if (e.getSource() instanceof JRadioButton)
			((JRadioButton) e.getSource()).updateUI();
	}


	public void mousePressed(MouseEvent e) {
		if (e.getSource() instanceof JButton
				&& ((JButton) e.getSource()).getText() == "Next>>"
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
		if (e.getSource() instanceof JButton
				&& ((JButton) e.getSource()).getText() == "Next>>"
				| ((JButton) e.getSource()).getText() == "<<Previous")// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}
		if (e.getSource() instanceof JRadioButton)
			((JRadioButton) e.getSource()).updateUI();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == rdbtnBbyLand) {
			comboBox_2.setEnabled(false);
			comboBox_3.setEnabled(true);
			comboBox_4.setEnabled(false);
		} else if (e.getSource() == rdbtnByAir) {
			comboBox_2.setEnabled(false);
			comboBox_3.setEnabled(false);
			comboBox_4.setEnabled(true);
		} else {
			comboBox_2.setEnabled(true);
			comboBox_3.setEnabled(false);
			comboBox_4.setEnabled(false);
		}
	}
}

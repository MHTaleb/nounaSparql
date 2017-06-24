package com.talcorp.piecedetachee.pfs_maven;

import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.Color;

import javax.swing.JSeparator;

import java.awt.Font;

public class Menu5 extends JPanel implements MouseListener {
	private JTextField fnField;
	private JTextField lnField;
	private JTextField adressField;
	JFormattedTextField idcnField, ageField;
	private JDateChooser bdDate;
	private JFormattedTextField ppField;
	private JFormattedTextField dlField;
	private JFormattedTextField ccnField;
	private JComboBox cctCombo;
	private JDateChooser ppED;
	private JDateChooser ppDD;
	private JDateChooser idDD;
	private JDateChooser idED;
	private JDateChooser dlED;
	private JDateChooser dlDD;

	/**
	 * Create the panel.
	 */
	public Menu5() {
		setOpaque(false);
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

		JButton button_3 = new JButton("CHECK");
		button_3.setFocusable(false);
		button_3.setFocusPainted(false);
		button_3.setBorderPainted(false);
		button_3.setContentAreaFilled(false);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setForeground(new Color(255, 222, 173));
		button_3.setHorizontalTextPosition(SwingConstants.CENTER);
		button_3.setIcon(new ImageIcon(getClass().getResource("/ButtonNext.png")));
		button_3.setBounds(569, 445, 115, 31);
		button_3.addMouseListener(this);
		add(button_3);
		
		
		JButton button_1 = new JButton("Save>>");
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setForeground(new Color(255, 222, 173));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setIcon(new ImageIcon(getClass()
				.getResource("/ButtonNext.png")));
		button_1.setBounds(292, 445, 121, 31);
		button_1.addMouseListener(this);
		add(button_1);

		/***************************************/
		fnField = new JTextField();
		fnField.setPreferredSize(new Dimension(130, 30));
		fnField.setMinimumSize(new Dimension(130, 30));
		fnField.setSize(new Dimension(130, 30));
		fnField.setBounds(209, 149, 130, 20);
		add(fnField);
		fnField.setColumns(10);

		lnField = new JTextField();
		lnField.setPreferredSize(new Dimension(130, 30));
		lnField.setMinimumSize(new Dimension(130, 30));
		lnField.setSize(new Dimension(130, 30));
		lnField.setColumns(10);
		lnField.setBounds(207, 180, 130, 20);
		add(lnField);

		bdDate = new JDateChooser();
		bdDate.getCalendarButton().setBackground(new Color(173, 255, 47));
		bdDate.setDateFormatString("dd MM yyyy");
		bdDate.setMinSelectableDate(new Date("1/1/1910"));
		bdDate.setMaxSelectableDate(new Date("1/1/2010"));
		bdDate.setPreferredSize(new Dimension(130, 30));
		bdDate.setMinimumSize(new Dimension(130, 30));
		bdDate.setSize(new Dimension(130, 30));
		bdDate.addPropertyChangeListener(new PropertyChangeListener() {

			
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if (bdDate.getDate() != null) {

					int age = 1;
					int dt1 = Calendar.getInstance().getTime().getDate();
					int dt2 = bdDate.getDate().getDate();
					int m1 = Calendar.getInstance().getTime().getMonth();
					int m2 = bdDate.getDate().getMonth();
					int y1 = Calendar.getInstance().getTime().getYear();
					int y2 = bdDate.getDate().getYear();
					if (y1 >= y2) // c'est logique il faut que la date courante
									// >
									// la date selection�
						if (dt2 > dt1 && m1 <= m2) {// case if somone was born
													// in
													// 1992 27 Dec and the
													// current date is 19 juin
													// 2016 ==> his age = 23 not
													// 24 (2016-1992)
							System.out.println("rana hna aywaa "
									+ bdDate.getDateEditor().getDate()
											.toGMTString());
							age = Calendar.getInstance().getTime().getYear()
									- bdDate.getDate().getYear() - 1;
						} else
							// calcul normal d'age
							age = Calendar.getInstance().getTime().getYear()
									- bdDate.getDate().getYear();
					ageField.setText("" + age);

				}

			}
		});
		;
		bdDate.setBounds(209, 224, 130, 20);
		add(bdDate);

		ageField = new JFormattedTextField();
		ageField.setEditable(false);
		ageField.setPreferredSize(new Dimension(130, 30));
		ageField.setMinimumSize(new Dimension(130, 30));
		ageField.setSize(new Dimension(130, 30));
		ageField.setBounds(209, 255, 130, 20);
		ageField.setVisible(false);
		add(ageField);

		adressField = new JTextField();
		adressField.setPreferredSize(new Dimension(130, 30));
		adressField.setMinimumSize(new Dimension(130, 30));
		adressField.setSize(new Dimension(130, 30));
		adressField.setBounds(209, 289, 130, 20);
		add(adressField);
		adressField.setColumns(10);

		cctCombo = new JComboBox();
		cctCombo.setFont(new Font("Tahoma", Font.BOLD, 11));
		cctCombo.setForeground(new Color(0, 0, 0));
		cctCombo.setBackground(new Color(154, 205, 50));
		cctCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent item) {
				if (!cctCombo.getSelectedItem().equals("No Card"))
					ccnField.setEnabled(true);
				else
					ccnField.setEnabled(false);

			}
		});
		cctCombo.setModel(new DefaultComboBoxModel(new String[] { "No Card",
				"Visa", "MasterCard" }));
		cctCombo.setBounds(523, 149, 130, 20);
		add(cctCombo);

		idcnField = new JFormattedTextField();
		idcnField.setText("");
		idcnField.setPreferredSize(new Dimension(130, 30));
		idcnField.setMinimumSize(new Dimension(130, 30));
		idcnField.setSize(new Dimension(130, 30));
		idcnField.setBounds(209, 336, 130, 20);
		add(idcnField);

		dlField = new JFormattedTextField();
		dlField.setText("");
		dlField.setPreferredSize(new Dimension(130, 30));
		dlField.setMinimumSize(new Dimension(130, 30));
		dlField.setSize(new Dimension(130, 30));
		dlField.setBounds(523, 224, 130, 20);
		add(dlField);

		ppField = new JFormattedTextField();
		ppField.setText("");
		ppField.setPreferredSize(new Dimension(130, 30));
		ppField.setMinimumSize(new Dimension(130, 30));
		ppField.setSize(new Dimension(130, 30));
		ppField.setBounds(523, 336, 130, 20);
		add(ppField);

		JLabel lblFirstName = new JLabel("First name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setForeground(new Color(240, 230, 140));
		lblFirstName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setBounds(73, 149, 123, 20);
		add(lblFirstName);

		JLabel lblLastName = new JLabel("Last name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setForeground(new Color(240, 230, 140));
		lblLastName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(81, 180, 113, 20);
		add(lblLastName);

		JLabel lblBirthDay = new JLabel("Birth date :");
		lblBirthDay.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBirthDay.setForeground(new Color(240, 230, 140));
		lblBirthDay.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBirthDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthDay.setBounds(73, 224, 123, 20);
		add(lblBirthDay);

		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setForeground(new Color(240, 230, 140));
		lblAge.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setBounds(69, 255, 127, 20);
		lblAge.setVisible(false);
		add(lblAge);

		JLabel lblAdress = new JLabel("Adress :");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdress.setForeground(new Color(240, 230, 140));
		lblAdress.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAdress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdress.setBounds(73, 289, 123, 20);
		add(lblAdress);

		JLabel lblCcType = new JLabel("CC Type :");
		lblCcType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCcType.setForeground(new Color(240, 230, 140));
		lblCcType.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCcType.setHorizontalAlignment(SwingConstants.CENTER);
		lblCcType.setBounds(402, 149, 111, 20);
		add(lblCcType);

		JLabel lblCcNumber = new JLabel("CC Number :");
		lblCcNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCcNumber.setForeground(new Color(240, 230, 140));
		lblCcNumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCcNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCcNumber.setBounds(400, 180, 111, 20);
		add(lblCcNumber);

		JLabel lblIdentityCardNumber = new JLabel("Identity card number:");
		lblIdentityCardNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentityCardNumber.setForeground(new Color(240, 230, 140));
		lblIdentityCardNumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdentityCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentityCardNumber.setBounds(59, 336, 137, 20);
		add(lblIdentityCardNumber);

		JLabel lblDriverLicenseNumber = new JLabel("Driver license number :");
		lblDriverLicenseNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDriverLicenseNumber.setForeground(new Color(240, 230, 140));
		lblDriverLicenseNumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDriverLicenseNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriverLicenseNumber.setBounds(373, 224, 140, 20);
		add(lblDriverLicenseNumber);

		JLabel lblPassportNumber = new JLabel("PassPort number :");
		lblPassportNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassportNumber.setForeground(new Color(240, 230, 140));
		lblPassportNumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPassportNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassportNumber.setBounds(373, 336, 140, 20);
		add(lblPassportNumber);

		ccnField = new JFormattedTextField();
		ccnField.setEnabled(false);
		ccnField.setSize(new Dimension(130, 30));
		ccnField.setPreferredSize(new Dimension(130, 30));
		ccnField.setMinimumSize(new Dimension(130, 30));
		ccnField.setBounds(521, 180, 130, 20);
		add(ccnField);

		idDD = new JDateChooser();
		idDD.getCalendarButton().setBackground(new Color(173, 255, 47));
		idDD.setDateFormatString("dd MM yyyy");
		idDD.setSize(new Dimension(130, 30));
		idDD.setPreferredSize(new Dimension(130, 30));
		idDD.setMinimumSize(new Dimension(130, 30));
		idDD.setBounds(209, 367, 130, 20);
		add(idDD);

		idED = new JDateChooser();
		idED.getCalendarButton().setBackground(new Color(173, 255, 47));
		idED.setDateFormatString("dd MM yyyy");
		idED.setSize(new Dimension(130, 30));
		idED.setPreferredSize(new Dimension(130, 30));
		idED.setMinimumSize(new Dimension(130, 30));
		idED.setBounds(209, 398, 130, 20);
		add(idED);

		ppED = new JDateChooser();
		ppED.getCalendarButton().setBackground(new Color(173, 255, 47));
		ppED.setDateFormatString("dd MM yyyy");
		ppED.setSize(new Dimension(130, 30));
		ppED.setPreferredSize(new Dimension(130, 30));
		ppED.setMinimumSize(new Dimension(130, 30));
		ppED.setBounds(523, 398, 130, 20);
		add(ppED);

		dlED = new JDateChooser();
		dlED.getCalendarButton().setBackground(new Color(173, 255, 47));
		dlED.setDateFormatString("dd MM yyyy");
		dlED.setSize(new Dimension(130, 30));
		dlED.setPreferredSize(new Dimension(130, 30));
		dlED.setMinimumSize(new Dimension(130, 30));
		dlED.setBounds(523, 289, 130, 20);
		add(dlED);

		dlDD = new JDateChooser();
		dlDD.getCalendarButton().setBackground(new Color(173, 255, 47));
		dlDD.setDateFormatString("dd MM yyyy");
		dlDD.setSize(new Dimension(130, 30));
		dlDD.setPreferredSize(new Dimension(130, 30));
		dlDD.setMinimumSize(new Dimension(130, 30));
		dlDD.setBounds(523, 255, 130, 20);
		add(dlDD);

		ppDD = new JDateChooser();
		ppDD.getCalendarButton().setBackground(new Color(173, 255, 47));
		ppDD.setDateFormatString("dd MM yyyy");
		ppDD.setSize(new Dimension(130, 30));
		ppDD.setPreferredSize(new Dimension(130, 30));
		ppDD.setMinimumSize(new Dimension(130, 30));
		ppDD.setBounds(523, 367, 130, 20);
		add(ppDD);

		JLabel lblDeliveryDate = new JLabel("Delivery date:");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeliveryDate.setForeground(new Color(240, 230, 140));
		lblDeliveryDate.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDeliveryDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeliveryDate.setBounds(59, 367, 137, 20);
		add(lblDeliveryDate);

		JLabel lblExpirationDate = new JLabel("Expiration date:");
		lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExpirationDate.setForeground(new Color(240, 230, 140));
		lblExpirationDate.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExpirationDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpirationDate.setBounds(49, 401, 147, 20);
		add(lblExpirationDate);

		JLabel label = new JLabel("Delivery date:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setForeground(new Color(240, 230, 140));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(383, 367, 130, 20);
		add(label);

		JLabel label_1 = new JLabel("Delivery date:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setForeground(new Color(240, 230, 140));
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(380, 258, 133, 20);
		add(label_1);

		JLabel label_2 = new JLabel("Expiration date:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setForeground(new Color(240, 230, 140));
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(373, 398, 140, 20);
		add(label_2);

		JLabel label_3 = new JLabel("Expiration date:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setForeground(new Color(240, 230, 140));
		label_3.setHorizontalTextPosition(SwingConstants.CENTER);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(373, 292, 140, 20);
		add(label_3);

		JSeparator separator = new JSeparator();
		separator.setToolTipText("Identity Card Data");
		separator.setBorder(null);
		separator.setOpaque(true);
		separator.setForeground(Color.GRAY);
		separator.setBackground(new Color(50, 205, 50));
		separator.setBounds(73, 323, 124, 2);
		add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("Identity Card Data");
		separator_1.setOpaque(true);
		separator_1.setForeground(Color.GRAY);
		separator_1.setBorder(null);
		separator_1.setBackground(Color.GREEN);
		separator_1.setBounds(73, 432, 124, 2);
		add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setToolTipText("Credit Card Data");
		separator_2.setOpaque(true);
		separator_2.setForeground(Color.GRAY);
		separator_2.setBorder(null);
		separator_2.setBackground(new Color(127, 255, 0));
		separator_2.setBounds(403, 136, 124, 2);
		add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setToolTipText("Driver Lisence Data");
		separator_3.setOpaque(true);
		separator_3.setForeground(Color.GRAY);
		separator_3.setBorder(null);
		separator_3.setBackground(new Color(154, 205, 50));
		separator_3.setBounds(402, 211, 124, 2);
		add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setToolTipText("PassPort  Data");
		separator_4.setOpaque(true);
		separator_4.setForeground(Color.GRAY);
		separator_4.setBorder(null);
		separator_4.setBackground(new Color(50, 205, 50));
		separator_4.setBounds(403, 323, 124, 2);
		add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setToolTipText("PassPort Data");
		separator_5.setOpaque(true);
		separator_5.setForeground(Color.GRAY);
		separator_5.setBorder(null);
		separator_5.setBackground(Color.GREEN);
		separator_5.setBounds(403, 429, 124, 2);
		add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setToolTipText("Personal Data");
		separator_6.setOpaque(true);
		separator_6.setForeground(Color.GRAY);
		separator_6.setBorder(null);
		separator_6.setBackground(new Color(127, 255, 0));
		separator_6.setBounds(73, 134, 124, 2);
		add(separator_6);

		JLabel lblNewLabel = new JLabel(
				"Please fill out the following information:");
		lblNewLabel.setForeground(new Color(238, 232, 170));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(42, 46, 623, 58);
		add(lblNewLabel);

		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setForeground(new Color(240, 230, 140));
		label_4.setIcon(new ImageIcon(getClass().getResource("/bg0.png")));
		label_4.setBounds(0, 0, 700, 500);
		add(label_4);

	}

	// constraint 1
	public boolean checkForBlankRequiredFieldsException() {
		if (fnField.getText() != null && lnField.getText() != null
				&& bdDate.getDateEditor().getDate() != null)

		{
			return true;

		} else {
			JOptionPane.showMessageDialog(this,
					"please fill out the required fields : "
							+ "\n* First name\n" + "*Last name\n"
							+ "*Birth date\n");
			;
			return false;

		}
	}

	// check for privacy concept exceptions
	public boolean checkPrivacyConceptsExceptions() {
		boolean checked = false;
		try {
			if (!dlField.getText().trim().isEmpty()) {
				
					Date dd = new Date(getDateString(dlDD)), ed = new Date(
							getDateString(dlED));
					int diff = ed.compareTo(dd);
					
					if (diff <= 0) {
						JOptionPane
								.showMessageDialog(null,
										"Delivery date can't be bigger than Expiration date");
						return false;
					} else {
						if (ed.compareTo(Calendar.getInstance().getTime()) < 0) {
							JOptionPane.showMessageDialog(null,
									"your Driver License has expired");
							return false;
						}
						if (Menu1.service == "RentVehicle") {
							int dif = 1;
							int dt1 = Calendar.getInstance().getTime()
									.getDate();
							int dt2 = dd.getDate();
							int m1 = Calendar.getInstance().getTime()
									.getMonth();
							int m2 = dd.getMonth();
							int y1 = Calendar.getInstance().getTime().getYear();
							int y2 = dd.getYear();
							if (y1 >= y2)
								if (dt2 > dt1 && m1 <= m2) {

									dif = Calendar.getInstance().getTime()
											.getYear()
											- dd.getYear() - 1;
								} else
									// calcul normal d'iffirence
									dif = Calendar.getInstance().getTime()
											.getYear()
											- dd.getYear();
									System.out.println(Calendar.getInstance().getTime()
											.getYear());
									System.out.println(dd.getYear()	);
						
							
						}

					}
					checked = true;
				
			} else {

				if (Menu1.service == "RentVehicle")

				{

					JOptionPane
							.showMessageDialog(
									null,
									"Based on your service selection wich was "
											+ "Land\n Transportation service ->Rent vehicle ,\nthe Driver License is a required object");
					return false;
				}
                                dlField.requestFocus();
                                return false;
			}
			if (!ppField.getText().trim().isEmpty()) {
				
					Date dd = new Date(getDateString(ppDD)), ed = new Date(
							getDateString(ppED));
					int diff = ed.compareTo(dd);
					if (diff <= 0) {
						JOptionPane
								.showMessageDialog(null,
										"Delivery date can't be bigger than Expiration date");
						return false;
					} else {
						if (ed.compareTo(Calendar.getInstance().getTime()) < 0) {
							JOptionPane.showMessageDialog(null,
									"your passport has expired");
							return false;
						}

					}
					checked = true;
				
			} else {

				if ((Menu1.service == "BuyFlightTicket" || Menu1.service == "FlightReservation"))

				{

					JOptionPane
							.showMessageDialog(
									null,
									"Based on your service selection wich was "
											+ "Air\n Transportation service , the passport is a required object");
					return false;
				}
                                ppField.requestFocus();
                                return false;
			}

			if (!idcnField.getText().trim().isEmpty()) {
				Date dd = new Date(getDateString(idDD)), ed = new Date(
						getDateString(idED));
				int diff = ed.compareTo(dd);

				if (diff <= 0) {
					JOptionPane
							.showMessageDialog(null,
									"Delivery date can't be bigger than Expiration date");
					return false;
				} else {
					if (ed.compareTo(Calendar.getInstance().getTime()) < 0) {
						JOptionPane.showMessageDialog(null,
								"your ID card has expired");
						return false;
					}

				}
				checked = true;
			}else{
                            idcnField.requestFocus();
                            return false;
                        }

		} catch (Exception e) {
                    e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"Please verify your input before you save");
		}
		return checked;
	}

	public void mouseClicked(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Save>>")// TODO
															// Auto-generated
															// method stub
		{
			if (checkForBlankRequiredFieldsException()
					&& checkPrivacyConceptsExceptions()) {
				Client c = new Client(fnField.getText(), lnField.getText(),
						getDateString(bdDate), ageField.getText(),
						adressField.getText(), ccnField.getText(), cctCombo
								.getSelectedItem().toString(),
						idcnField.getText(), dlField.getText(),
						ppField.getText(), getDateString(dlED),
						getDateString(dlDD), getDateString(ppED),
						getDateString(ppDD), getDateString(idED),
						getDateString(idDD), Menu1.service);
				c.insertClient("src/prv.owl");
			}
		} else if (((JButton) e.getSource()).getText() == "<<Previous") {

			FramePrincipale.card.show(FramePrincipale.contenaire, "4");
			FramePrincipale.currentMenu--;

		}else{
			// test housseyn
			String ontologieLocation="src/prv.owl";
			Client readClient = new Client(ontologieLocation);
			readClient.selectByFullName(""+fnField.getText(),""+lnField.getText());
			// DEBUT
//			if (Integer.parseInt(ageField.getText())<25 ||
//					Integer.parseInt(ageField.getText())>75)
//			{
//				JOptionPane
//				.showMessageDialog(null,
//						"To rent a vehicle your age must be\nbetween [25,75].");
//			return;
//			}
//			if (Integer.parseInt(ageField.getText()) < 18) {
//				JOptionPane
//						.showMessageDialog(null,
//								"people under 18 years old doesn't have a driver license");
//				return;
//			}
//			JOptionPane.showMessageDialog(null, "Your age is accepted : you'r allowed to rent a vehicle");
			//FIN
			
		}
		
		

	}

	public String getDateString(JDateChooser d) {

		if (d != null
				&& !((JTextFieldDateEditor) d.getDateEditor().getUiComponent())
						.getText().equals("")) {
			String[] dat = ((JTextFieldDateEditor) d.getDateEditor()
					.getUiComponent()).getText().split(" ");
			return dat[0] + "/"

			+ dat[1] + "/" + dat[2];
		} else
			return "";
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton)// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNextEntered.png")));
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() instanceof JButton)// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}

	}

	public void mousePressed(MouseEvent e) {
		if (e.getSource() instanceof JButton)// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNextPressed.png")));
		}

	}
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() instanceof JButton)// TODO
																		// Auto-generated
																		// method
																		// stub
		{
			((JButton) e.getSource()).setIcon(new ImageIcon(getClass()
					.getResource("/ButtonNext.png")));
		}

	}
}


/**
if (Integer.parseInt(ageField.getText())<25 ||
		Integer.parseInt(ageField.getText())>75)
{
	JOptionPane
	.showMessageDialog(null,
			"To rent a vehicle your age must be\nbetween [25,75].");
return false ;
}
if (Integer.parseInt(ageField.getText()) < 18) {
	JOptionPane
			.showMessageDialog(null,
					"people under 18 years old doesn't have a driver license");
	return false;
}
*/
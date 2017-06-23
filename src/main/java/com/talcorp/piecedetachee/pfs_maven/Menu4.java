package com.talcorp.piecedetachee.pfs_maven;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;

public class Menu4 extends JPanel implements MouseListener {
	static JComboBox fnPurpose;
	static JComboBox fnRetention;
	static JComboBox fnRecipient;
	static JComboBox lnPurpose;
	static JComboBox lnRetention;
	static JComboBox lnRecipient;
	static JComboBox bdPurpose;
	static JComboBox bdRetention;
	static JComboBox bdRecipient;
	static JComboBox agePurpose;
	static JComboBox ageRetention;
	static JComboBox ageRecipient;
	static JComboBox adrPurpose;
	static JComboBox adrRetention;
	static JComboBox adrRecipient;
	static JComboBox idPurpose;
	static JComboBox idRetention;
	static JComboBox idRecipient;
	static JComboBox ccPurpose;
	static JComboBox ccRetention;
	static JComboBox ccRecipient;
	static JComboBox dlPurpose;
	static JComboBox dlRetention;
	static JComboBox dlRecipient;
	static JComboBox ppPurpose;
	static JComboBox ppRetention;
	static JComboBox ppRecipient;

	/**
	 * Create the panel.
	 */

	public Menu4() {
		// setToolTipText("D:\\Documents and Settings\\REDA\\Bureau\\onthologie PFE\\menu4.png");
		setSize(700, 550);
		setLayout(null);

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

		fnPurpose = new JComboBox();
		fnPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		fnPurpose.setForeground(new Color(0, 0, 0));
		fnPurpose.setBackground(new Color(169, 169, 169));
		fnPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		fnPurpose.setBounds(216, 151, 115, 20);
		add(fnPurpose);

		ppPurpose = new JComboBox();
		ppPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		ppPurpose.setForeground(new Color(0, 0, 0));
		ppPurpose.setBackground(new Color(102, 205, 170));
		ppPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		ppPurpose.setBounds(216, 399, 115, 20);
		add(ppPurpose);

		dlRetention = new JComboBox();
		dlRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		dlRetention.setForeground(new Color(0, 0, 0));
		dlRetention.setBackground(new Color(102, 205, 170));
		dlRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		dlRetention.setBounds(362, 368, 115, 20);
		add(dlRetention);

		ppRetention = new JComboBox();
		ppRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		ppRetention.setForeground(new Color(0, 0, 0));
		ppRetention.setBackground(new Color(102, 205, 170));
		ppRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		ppRetention.setBounds(362, 399, 115, 20);
		add(ppRetention);

		fnRetention = new JComboBox();
		fnRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		fnRetention.setForeground(new Color(0, 0, 0));
		fnRetention.setBackground(new Color(169, 169, 169));
		fnRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		fnRetention.setBounds(362, 151, 115, 20);
		add(fnRetention);

		lnPurpose = new JComboBox();
		lnPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		lnPurpose.setForeground(new Color(0, 0, 0));
		lnPurpose.setBackground(new Color(169, 169, 169));
		lnPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		lnPurpose.setBounds(216, 182, 115, 20);
		add(lnPurpose);

		fnRecipient = new JComboBox();
		fnRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		fnRecipient.setForeground(new Color(0, 0, 0));
		fnRecipient.setBackground(new Color(169, 169, 169));
		fnRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		fnRecipient.setBounds(519, 151, 115, 20);
		add(fnRecipient);

		lnRetention = new JComboBox();
		lnRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		lnRetention.setForeground(new Color(0, 0, 0));
		lnRetention.setBackground(new Color(169, 169, 169));
		lnRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		lnRetention.setBounds(362, 182, 115, 20);
		add(lnRetention);

		bdPurpose = new JComboBox();
		bdPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		bdPurpose.setForeground(new Color(0, 0, 0));
		bdPurpose.setBackground(new Color(102, 205, 170));
		bdPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		bdPurpose.setBounds(216, 213, 115, 20);
		add(bdPurpose);

		lnRecipient = new JComboBox();
		lnRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		lnRecipient.setForeground(new Color(0, 0, 0));
		lnRecipient.setBackground(new Color(169, 169, 169));
		lnRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		lnRecipient.setBounds(519, 182, 115, 20);
		add(lnRecipient);

		bdRetention = new JComboBox();
		bdRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		bdRetention.setForeground(new Color(0, 0, 0));
		bdRetention.setBackground(new Color(102, 205, 170));
		bdRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		bdRetention.setBounds(362, 213, 115, 20);
		add(bdRetention);

		agePurpose = new JComboBox();
		agePurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		agePurpose.setForeground(new Color(0, 0, 0));
		agePurpose.setBackground(new Color(102, 205, 170));
		agePurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		agePurpose.setBounds(216, 244, 115, 20);
		agePurpose.setVisible(false);
		add(agePurpose);

		bdRecipient = new JComboBox();
		bdRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		bdRecipient.setForeground(new Color(0, 0, 0));
		bdRecipient.setBackground(new Color(102, 205, 170));
		bdRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		bdRecipient.setBounds(519, 213, 115, 20);
		add(bdRecipient);

		ageRetention = new JComboBox();
		ageRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		ageRetention.setForeground(new Color(0, 0, 0));
		ageRetention.setBackground(new Color(102, 205, 170));
		ageRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		ageRetention.setBounds(362, 245, 115, 20);
		ageRetention.setVisible(false);
		add(ageRetention);

		adrPurpose = new JComboBox();
		adrPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		adrPurpose.setForeground(new Color(0, 0, 0));
		adrPurpose.setBackground(new Color(95, 158, 160));
		adrPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		adrPurpose.setBounds(216, 275, 115, 20);
		add(adrPurpose);

		ageRecipient = new JComboBox();
		ageRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		ageRecipient.setForeground(new Color(0, 0, 0));
		ageRecipient.setBackground(new Color(102, 205, 170));
		ageRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		ageRecipient.setBounds(519, 244, 115, 20);
		ageRecipient.setVisible(false);
		add(ageRecipient);

		adrRetention = new JComboBox();
		adrRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		adrRetention.setForeground(new Color(0, 0, 0));
		adrRetention.setBackground(new Color(95, 158, 160));
		adrRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		adrRetention.setBounds(362, 276, 115, 20);
		add(adrRetention);

		idPurpose = new JComboBox();
		idPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		idPurpose.setForeground(new Color(0, 0, 0));
		idPurpose.setBackground(new Color(95, 158, 160));
		idPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		idPurpose.setBounds(216, 306, 115, 20);
		add(idPurpose);

		adrRecipient = new JComboBox();
		adrRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		adrRecipient.setForeground(new Color(0, 0, 0));
		adrRecipient.setBackground(new Color(95, 158, 160));
		adrRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		adrRecipient.setBounds(519, 275, 115, 20);
		add(adrRecipient);

		idRetention = new JComboBox();
		idRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		idRetention.setForeground(new Color(0, 0, 0));
		idRetention.setBackground(new Color(95, 158, 160));
		idRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		idRetention.setBounds(362, 307, 115, 20);
		add(idRetention);

		ccPurpose = new JComboBox();
		ccPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		ccPurpose.setForeground(new Color(0, 0, 0));
		ccPurpose.setBackground(new Color(102, 205, 170));
		ccPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		ccPurpose.setBounds(216, 337, 115, 20);
		add(ccPurpose);

		idRecipient = new JComboBox();
		idRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		idRecipient.setForeground(new Color(0, 0, 0));
		idRecipient.setBackground(new Color(95, 158, 160));
		idRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		idRecipient.setBounds(519, 306, 115, 20);
		add(idRecipient);

		ccRetention = new JComboBox();
		ccRetention.setFont(new Font("Tahoma", Font.BOLD, 11));
		ccRetention.setForeground(new Color(0, 0, 0));
		ccRetention.setBackground(new Color(102, 205, 170));
		ccRetention.setModel(new DefaultComboBoxModel(new String[] {
				"no-retention", "stated-purpose", "legal-requirement",
				"business-Practices", "indefinitely" }));
		ccRetention.setBounds(362, 338, 115, 20);
		add(ccRetention);

		dlPurpose = new JComboBox();
		dlPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		dlPurpose.setForeground(new Color(0, 0, 0));
		dlPurpose.setBackground(new Color(102, 205, 170));
		dlPurpose.setModel(new DefaultComboBoxModel(new String[] { "current",
				"admin", "develop", "historical", "pseudo-decision",
				"pseudo-analysis", "tailoring", "individuel-decision",
				"individuel-analysis", "telemarketing", "contact",
				"otherPurpose" }));
		dlPurpose.setBounds(216, 367, 115, 20);
		add(dlPurpose);

		ccRecipient = new JComboBox();
		ccRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		ccRecipient.setForeground(new Color(0, 0, 0));
		ccRecipient.setBackground(new Color(102, 205, 170));
		ccRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		ccRecipient.setBounds(519, 337, 115, 20);
		add(ccRecipient);

		dlRecipient = new JComboBox();
		dlRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		dlRecipient.setForeground(new Color(0, 0, 0));
		dlRecipient.setBackground(new Color(102, 205, 170));
		dlRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		dlRecipient.setBounds(519, 368, 115, 20);
		add(dlRecipient);

		ppRecipient = new JComboBox();
		ppRecipient.setFont(new Font("Tahoma", Font.BOLD, 11));
		ppRecipient.setForeground(new Color(0, 0, 0));
		ppRecipient.setBackground(new Color(102, 205, 170));
		ppRecipient
				.setModel(new DefaultComboBoxModel(new String[] { "ours",
						"same", "other-recipient", "delivery", "unrelated",
						"public" }));
		ppRecipient.setBounds(519, 399, 115, 20);
		add(ppRecipient);

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 701, 501);
		add(label);
		label.setIcon(new ImageIcon(getClass().getResource("/menu4.png")));

	}

	public void mouseClicked(MouseEvent e) {
		if (((JButton) e.getSource()).getText() == "Next>>")// TODO
															// Auto-generated
															// method stub
		{
			FramePrincipale.card.show(FramePrincipale.contenaire, "5");
			FramePrincipale.currentMenu++;
			System.out.println("Retention : "
					+ idRetention.getSelectedItem().toString());
		} else {
			FramePrincipale.card.show(FramePrincipale.contenaire, "3");
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
}

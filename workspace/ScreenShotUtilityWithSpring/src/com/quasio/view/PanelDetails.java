package com.quasio.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.quasio.view.event.ViewEvent;

public class PanelDetails extends JPanel implements View {
	/**
		 * 
		 */
	private static final long serialVersionUID = 2237456478139611175L;

	private static final String[] envItems = { "ST", "SIT" };
	private static final String[] functionalityItems = { "Single Payment", "Multiple Payment" };
	private JLabel bfsIdLabel;
	private JLabel envLabel;
	private JLabel functionalityLabel;
	private JTextField bfsId;
	private JComboBox<String> envBox;
	private JComboBox<String> functionalityBox;
	private JButton button;

	public PanelDetails() {
		// Setting size for panel
		Dimension size = getPreferredSize();
		size.width = 420;
		setPreferredSize(size);

		// Adding Border to panel:
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createTitledBorder("Details for the Payment "));

		// Adding Components:
		bfsIdLabel = new JLabel("Bfs in message id : ");
		envLabel = new JLabel("Select Environment : ");
		functionalityLabel = new JLabel("Select type of payment : ");
		bfsId = new JTextField(10);
		envBox = new JComboBox<>(envItems);
		functionalityBox = new JComboBox<>(functionalityItems);
		button = new JButton("Submit");

		// Setting Layout
		setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();

		// First Column:
		g.weightx = 0.5;
		g.weighty = 0.5;

		g.anchor = GridBagConstraints.LINE_END;
		g.gridx = 0;
		g.gridy = 0;
		add(bfsIdLabel, g);
		g.gridy = 1;
		add(envLabel, g);
		g.gridy = 2;
		add(functionalityLabel, g);

		// Second Column:
		g.anchor = GridBagConstraints.LINE_START;
		g.gridx = 1;
		g.gridy = 0;
		add(bfsId, g);
		g.gridy = 1;
		add(envBox, g);
		g.gridy = 2;
		add(functionalityBox, g);

		// Final Row:
		g.weighty = 12;
		g.anchor = GridBagConstraints.FIRST_LINE_START;
		g.gridx = 1;
		g.gridy = 3;
		add(button, g);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String bfsIdSelected = bfsId.getText();
				String env = envBox.getItemAt(envBox.getSelectedIndex());
				String functionality = functionalityBox.getItemAt(functionalityBox.getSelectedIndex());
				ViewEvent event = new ViewEvent(this, bfsIdSelected, env, functionality);
				fireEvent(event);
			}
		});
	}

}

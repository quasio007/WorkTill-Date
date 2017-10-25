package basic.learning;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;

public class PanelDetails extends JPanel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 2237456478139611175L;
	private EventListenerList listnerList = new EventListenerList();

	public PanelDetails() {
		// Setting size for panel
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);

		// Adding Border to panel:
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createTitledBorder("PersonalDetails"));

		// Adding Components:
		JLabel nameLabel = new JLabel("Name: ");
		JLabel ageLabel = new JLabel("Age: ");
		JTextField nameText = new JTextField(10);
		JTextField ageText = new JTextField(10);
		JButton button = new JButton("Add Details");

		// Setting Layout
		setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();

		// First Column:
		g.weightx = 0.5;
		g.weighty = 0.5;

		g.anchor = GridBagConstraints.LINE_END;
		g.gridx = 0;
		g.gridy = 0;
		add(nameLabel, g);
		g.gridy = 1;
		add(ageLabel, g);

		// Second Column:
		g.anchor = GridBagConstraints.LINE_START;
		g.gridx = 1;
		g.gridy = 0;
		add(nameText, g);
		g.gridy = 1;
		add(ageText, g);

		// Final Row:
		g.weighty = 12;
		g.anchor = GridBagConstraints.FIRST_LINE_START;
		g.gridx = 1;
		g.gridy = 2;
		add(button, g);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String age = ageText.getText();
				String text = name + " is '" + age + "' years old";
				DetailsEvent event =new DetailsEvent(this, text,e.getActionCommand());
				fireEvent(event);
				

			}
		});

	}

	public void fireEvent(DetailsEvent event) {
		Object[] listner = listnerList.getListenerList();
		for (int i = 0; i < listner.length; i += 2) {
			 if(listner[i] == DetailsListner.class){
				((DetailsListner)listner[i+1]).detailsEventOccured(event);
			 }
		}
	}

	public void addDetailsListner(DetailsListner listner) {
		listnerList.add(DetailsListner.class, listner);
	}

	public void removeDetailsListner(DetailsListner listner) {
		listnerList.remove(DetailsListner.class, listner);
	}
}

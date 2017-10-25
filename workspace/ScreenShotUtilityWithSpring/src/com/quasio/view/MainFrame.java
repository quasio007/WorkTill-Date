package com.quasio.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3953288220963807963L;

	private PanelDetails detailsPanel;
	private JTextArea textArea ;

	public MainFrame(String title) {
		super(title);
		 setLayout(new BorderLayout());

//		Make Components::
		textArea = new JTextArea();
		detailsPanel = new PanelDetails();

//		Add components to container
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(textArea, BorderLayout.CENTER);
		con.add(detailsPanel, BorderLayout.WEST);
	}
	
	@Override
	public PanelDetails getDetailsPanel() {
		return detailsPanel;
	}
	
	@Override
	public JTextArea getTextArea() {
		return textArea;
	}
}

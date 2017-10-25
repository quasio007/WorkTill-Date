package basic.learning;

import java.awt.BorderLayout;
import java.awt.Container;


import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3953288220963807963L;

	private PanelDetails detailsPanel;

	public MainFrame(String title) {
		super(title);
		// Set Layout::
		// setLayout(new BorderLayout());

		// Make Components::
		JTextArea textArea = new JTextArea();

		detailsPanel = new PanelDetails();
		detailsPanel.addDetailsListner(new DetailsListner(){
			@Override
			public void detailsEventOccured(DetailsEvent event) {
				String text =event.getText();
				textArea.append(text+"\n");
		
//				System.out.println(event.getCommand());
			}
		});

		// add components to container
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(textArea, BorderLayout.CENTER);

		con.add(detailsPanel, BorderLayout.WEST);


	}
}

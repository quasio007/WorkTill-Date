 package basic.learning;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame =new MainFrame("Learning how to add elements");
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(600, 500);
				
			}
		});

	}

}

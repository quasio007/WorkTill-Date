 package com.quasio.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.quasio.controller.Controller;
import com.quasio.view.MainFrame;

public class Main {
	private static Controller controller;
	private static MainFrame frame;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Main::start);
	}
	
	
	public static void start() {
		frame =new MainFrame("Evidence Capturing Utitility");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		controller =new Controller(frame);
	}

}

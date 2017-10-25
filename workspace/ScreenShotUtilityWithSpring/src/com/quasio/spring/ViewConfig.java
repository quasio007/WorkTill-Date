package com.quasio.spring;

import javax.swing.JFrame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.quasio.view.MainFrame;
import com.quasio.view.View;

@ComponentScan("com.quasio.view")
@Configuration
public class ViewConfig {

	@Bean
	public View getView() {
		MainFrame view =new MainFrame("Evidence Capturing Utitility");
		view.setVisible(true);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(600, 500);
		return view;
	}
}

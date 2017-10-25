 package com.quasio.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.quasio.controller.Controller;
import com.quasio.spring.SpringConfig;
import com.quasio.view.MainFrame;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("End");
	}
	


}

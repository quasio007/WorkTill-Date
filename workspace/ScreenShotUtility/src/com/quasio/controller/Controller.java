package com.quasio.controller;

import com.quasio.model.Functionality;
import com.quasio.model.FunctionalityFactory;
import com.quasio.view.MainFrame;
import com.quasio.view.event.ViewEvent;
import com.quasio.view.listner.ViewListner;

public class Controller {
	private Functionality functionality;
	private static MainFrame frame;

//	private String bfsId;

	public Controller(MainFrame mainframe) {
		frame = mainframe;

		frame.getDetailsPanel().addViewListner(new ViewListner() {
			@Override
			public void viewEventOccured(ViewEvent event) {
				

				System.setProperty("environment", event.getEnv());
				// AbstractApplicationContext factory = new
				// AnnotationConfigApplicationContext(SpringConfiguration.class);

//				bfsId = event.getBfsId();
				
//				functionality = FunctionalityFactory.getFunctionality(event.getFunctionality() , event.getBfsId());
//				functionality.execute();
				informView("Check");

			}
		});
	}
	
	private static void informView(String information) {
		 frame.getTextArea().append(information+"\n");
		
	}

}

package com.quasio.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.quasio.model.FunctionalityFactory;
import com.quasio.model.Model;
import com.quasio.model.event.ModelEvent;
import com.quasio.model.listner.ModelListner;
import com.quasio.view.View;
import com.quasio.view.event.ViewEvent;
import com.quasio.view.listner.ViewListner;

@org.springframework.stereotype.Controller
public class Controller implements ViewListner, ModelListner {
	@Autowired
	private View view;

	@Autowired
	private FunctionalityFactory factory;

	private Model model;
	
	private boolean flag = true;

	@PostConstruct
	public void addViewListners() {
		view.addViewListner(this);

	}

	@Override
	public void modelEventOccured(ModelEvent event) {
//		view.getTextArea().append("Check\n");
		view.getTextArea().append(String.format("%s\n", event.getMessage()));
	}

	@Override
	public void viewEventOccured(ViewEvent event) {
		if(flag) {
			model = factory.getFunctionality(event.getFunctionality());

//			 Adding View Listener:
			model.addModelListner(this);
			
//			Executing the method of model:
			model.execute("12");
			flag = false;
		}

	}

}

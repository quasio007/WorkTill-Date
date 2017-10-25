package com.quasio.view;

import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;

import com.quasio.view.event.ViewEvent;
import com.quasio.view.listner.ViewListner;

public interface View {
	public EventListenerList listnerList = new EventListenerList();
	
	 default void addViewListner(ViewListner listner) {
		listnerList.add(ViewListner.class, listner);
	}

	 default void removeViewListner(ViewListner listner) {
		listnerList.remove(ViewListner.class, listner);
	}
	
	 default void fireEvent(ViewEvent event) {
		Object[] listner = listnerList.getListenerList();
		for (int i = 0; i < listner.length; i += 2) {
			 if(listner[i] == ViewListner.class){
				((ViewListner)listner[i+1]).viewEventOccured(event);
			 }
		}
	}

	default PanelDetails getDetailsPanel() {
		return null;
	}
	
	default JTextArea getTextArea() {
		return null;
	}
}

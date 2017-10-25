package com.quasio.model;

import javax.swing.event.EventListenerList;

import com.quasio.model.event.ModelEvent;
import com.quasio.model.listner.ModelListner;

public interface Model {
	
		public EventListenerList listnerList = new EventListenerList();
		
		default void execute(String id) {
			
		}
		
		 default void addModelListner(ModelListner listner) {
			listnerList.add(ModelListner.class, listner);
		}

		 default void removeModelListner(ModelListner listner) {
			listnerList.remove(ModelListner.class, listner);
		}
		
		 default void fireEvent(ModelEvent event) {
			Object[] listner = listnerList.getListenerList();
			for (int i = 0; i < listner.length; i += 2) {
				 if(listner[i] == ModelListner.class){
					((ModelListner)listner[i+1]).modelEventOccured(event);
				 }
			}
		}


	}


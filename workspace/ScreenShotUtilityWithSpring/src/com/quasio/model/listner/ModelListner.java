package com.quasio.model.listner;

import java.util.EventListener;

import com.quasio.model.event.ModelEvent;

public interface ModelListner extends EventListener{
	public void modelEventOccured(ModelEvent event);
}

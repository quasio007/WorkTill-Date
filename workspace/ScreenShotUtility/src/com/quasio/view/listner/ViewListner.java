package com.quasio.view.listner;

import java.util.EventListener;

import com.quasio.view.event.ViewEvent;

public interface ViewListner extends EventListener{
	public void viewEventOccured(ViewEvent event);
}

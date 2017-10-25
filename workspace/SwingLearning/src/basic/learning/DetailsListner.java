package basic.learning;

import java.util.EventListener;

import basic.learning.DetailsEvent;

public interface DetailsListner extends EventListener{
	public void detailsEventOccured(DetailsEvent event);
}

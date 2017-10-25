package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
//Ordered interface can be used to set the priority of postBeanProcessors :
public class DisplayBeanNames implements BeanPostProcessor,Ordered{

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("Post DisplayBeanNames-BeanPostProcessor "+name);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println("Pre DisplayBeanNames-BeanPostProcessor "+name);
		return obj;
	}

	@Override
	public int getOrder() {
		return 4;
	}

}

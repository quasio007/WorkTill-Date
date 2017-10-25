package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class OrderedInterfaceDemo implements BeanPostProcessor,Ordered{

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("Post OrderedInterfaceDemo-BeanPostProcessor "+name);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println("Pre OrderedInterfaceDemo-BeanPostProcessor "+name);
		return obj;
	}

	@Override
	public int getOrder() {
		return 1;
	}

}

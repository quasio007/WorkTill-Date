package spring.day1.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ExampleForFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("Even before configuring Bean Factory/ Application Context");
		
	}

}

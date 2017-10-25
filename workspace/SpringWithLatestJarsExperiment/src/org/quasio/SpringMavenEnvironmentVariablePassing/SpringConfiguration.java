package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan({"org.quasio"})
//We can configure property file in the below manner
@PropertySource({"org/quasio/resource/${test.environment:try1}.properties","try3.properties"})

//It can be configured in below manner if property file directly present in classPath:
//@PropertySource({"${test.environment:try1}.properties"})
public class SpringConfiguration {
	
	@Autowired
	Environment env;
	
//	@Value is working for me without using PropertyPlaceholderConfigurer bean , instead while using it I am getting errors.
//	@Bean
//	public static  PropertyPlaceholderConfigurer placeholderConfigurer() {
//		return new PropertyPlaceholderConfigurer();
//	}
	

	@Bean
	public Shape getCircle() {
		Shape shape = new Circle("Circy");
		System.out.println("Env property : '"+env.getProperty("name")+"' and age is : '"+env.getProperty("age")+"'");
		return shape;
	}
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public Shape getSquare() {
		Shape shape = new Square("Squicy");
		return shape;
	}
	
	@Bean
	public Triangle getTriangle() {
		return new Triangle("Trigy");
	}
	
	
//	Lazy annotation can only be used with beans which are not required for some other beans creation /Or we can say should be a parent bean
	@Bean
	@Lazy
	public ShapeFactory getShapeFactory() {
		return new ShapeFactory();
	}
	

	/*
	Demo for post bean processor :
	Ordered interface can be used to set the priority of postBeanProcessors :
	
	@Bean
	public DisplayBeanNames postBeanProcessorDemo() {
		return new DisplayBeanNames();
	}
	
	@Bean
	public OrderedInterfaceDemo postBeanProcessorDemo1() {
		return new OrderedInterfaceDemo();
	}
	*/
	
//	Demo for Factory post bean processor ::
	
//	WARNING: @Bean method SpringConfiguration.postFactoryBeanProcessorDemo is non-static and returns an object
//	assignable to Spring's BeanFactoryPostProcessor interface. This will result in a failure to 
//	process annotations such as @Autowired, @Resource and @PostConstruct within the method's declaring 
//	@Configuration class. Add the 'static' modifier to this method to avoid these container lifecycle issues;
//	see @Bean javadoc for complete details.
	
//	Below methord should be static because of above reason:
	@Bean
	public static DemoPostFactoryPostProcessor postFactoryBeanProcessorDemo() {
		return new DemoPostFactoryPostProcessor();
	}
	
	/*
	Demo for @Required post bean processor ::
	
	@Bean
	public  RequiredAnnotationBeanPostProcessor requiredAnnotationDemo() {
		return new RequiredAnnotationBeanPostProcessor();
	}
	*/
	
}

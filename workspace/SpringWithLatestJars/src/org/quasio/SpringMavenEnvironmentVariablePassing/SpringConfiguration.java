package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"${test.environment:try1}.properties"})
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
		return shape;
	}
	
	@Bean
	public Shape getSquare() {
		Shape shape = new Square("Squicy");
		return shape;
	}
	
//	Lazy annotation can only be used with beans which are not required for some other beans creation /Or we can say should be a parent bean
	@Bean
	@Lazy
	public ShapeFactory getShapeFactory() {
		return new ShapeFactory();
	}
	
}

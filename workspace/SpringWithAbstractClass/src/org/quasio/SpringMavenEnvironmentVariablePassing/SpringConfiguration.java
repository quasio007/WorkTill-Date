package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.quasio.SpringMavenEnvironmentVariablePassing")
public class SpringConfiguration {
	
	@Bean
	public Student getStudent() {
		return new Student("Mohit");
	}
	
	@Bean
	public Teacher getTeacher() {
		return new Teacher("Arun");
	}

}

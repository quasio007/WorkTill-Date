package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentAnnotationDemo {
	@Autowired
	public Shape getCircle;

	
	public void demo() {
		System.out.println("Before :: From Demo");
		getCircle.draw();
		System.out.println("After :: From Demo");
	}
}

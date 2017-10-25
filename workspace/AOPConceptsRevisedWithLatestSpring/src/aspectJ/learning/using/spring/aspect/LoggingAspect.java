package aspectJ.learning.using.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public void draw())")
	public void beforeLoggingAdvice() {
		System.out.println("Before Advice Printed");
	}
	@After("execution(public void draw())")
	public void afterLoggingAdvice() {
		System.out.println("After Advice Printed");
	}
	
}

package aspectJ.learning.using.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void beforeLoggingAdvice() {
		System.out.println();
	}
	@After("execution(public String getName())")
	public void afterLoggingAdvice() {
		System.out.println();
	}
	
}

package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfiguration.class })

public class TestingWithContextConfiguration 
{
	
	@Autowired
	private ShapeFactory factory ;
	
//	Autowire has many level searches , first it name ,then by type and then with something else..
	@Autowired
	private Shape getCircle ;
	
	@Autowired
	private Environment env;
	
	@Value("${name}")
	private String value;
	
	
    @Test
    public void test() {
    	getCircle.draw();
      	System.out.println("Getting value from property using Environment env : '"+env.getProperty("name")+"'");
      	System.out.println("Getting value from property using @Value tag : '"+value+"'");
     	factory.getShape("circle").draw();
    
    }
}

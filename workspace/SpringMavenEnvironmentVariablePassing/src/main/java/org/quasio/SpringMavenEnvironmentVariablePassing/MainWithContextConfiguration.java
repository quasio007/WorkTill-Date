package org.quasio.SpringMavenEnvironmentVariablePassing;

/**
 * Hello world!
 *
 */

public class MainWithContextConfiguration 
{
    public static void main( String[] args )
    {
    	System.out.println("Value of Variable is : '"+System.getProperty("maven.repo.local")+"'");
    }
}

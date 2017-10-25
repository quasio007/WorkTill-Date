package com.maven;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.PropertyConfigurator;


public class Demo1 {
//private static final Logger log =Logger.getLogger(Demo1.class);
private static final Logger logger = LoggerFactory.getLogger(Demo1.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PropertyConfigurator.configure("logPropertiesFileMethord2/log4j.properties");
		String str ="Check";
//logger.warn(str+" Done"+"1");
		logger.warn("Just {}ing",str);
	}

}

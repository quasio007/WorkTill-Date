package com.quasio.model.daohandler;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.quasio.model.Model;
@Component
@Lazy
public class MapDaoHandler implements Model{
	@PostConstruct
	public void intialize() {
		System.out.println("MapDaoHandler bean created");
	}
	
	public void mapMethod() {
		System.out.println("Map Methord Called");
	}
	
}

package com.quasio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {

	@WebMethod
	public List<String> getProductCatagories() {
		List<String> list = new ArrayList<>();
		list.add("Books");
		list.add("Tshirts");
		list.add("Music");
		return list;
	}

	@WebMethod(action="CheckIt")
	public Person a(int i, int j) {
		return new Person();
	}
	

	@WebMethod
	public int b(Person i, String j) {
		return 0;
	}

}

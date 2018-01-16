package com.quasio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
@WebService
public class ProductCatalog {
public List<String> getProductCatagories(){
	List<String> list =new ArrayList<>();
	list.add("Books");
	list.add("Tshirts");
	list.add("Music");
	return list;
}
}

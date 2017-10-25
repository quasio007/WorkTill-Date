package listExample;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import Selinium_Learing.Try;



public class LinkListed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List fourth = new LinkedList();
//		List third =new Stack();
//		List second =new Vector();
//		Try a = new Try();
//		int b =a.check();
		Integer in = (int) 234.3;
		String s ="how are you";
		List<String> first =new ArrayList<String>();
		first.add("Hi everyone");
		first.add("This is mohit");
//		first.add(341);
		first.add(s);
//		first.addAll(a);
//		first.addAll(in);
		first.add(2, "let's see");
//		first.remove(in);
//		first.remove(1);
//		first.clear();
		
//		third.add(341);
		System.out.println(first.size());
//		System.out.println(second.size());
//		System.out.println(third.size());
//		System.out.println(fourth.size());
//		System.out.println(first.get(0));
//		System.out.println(third.get(0));
		Iterator i1 = first.iterator();
//		while(i1.hasNext()){
//			System.out.println(i1.next());
//		}
		System.out.println();
		for(String o : first){
			System.out.println(o);
		}
////		System.out.println();
//		for(int i =0;i<first.size();++i)
//			System.out.println(first.get(i));
	}

}

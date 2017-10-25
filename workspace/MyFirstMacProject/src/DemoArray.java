import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar ={2,-1,2,-3,4,5};
		char[] ch ={'b','c','A','a'};
		Arrays.sort(ch);
		
		ar=ArrayUtils.removeElement(ar, -1);
		Arrays.sort(ar);
		for(int n:ar){
		System.out.println(n);

	}
		System.out.println();
		for(char h:ch){
		System.out.println(h);

		}
	}

}

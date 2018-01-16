import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenString3DPLMCodingQuestion {

public static void main(String... args) {
	String str ="aabbcc";
	
	System.out.println(isEven(str));
	
}

private static boolean isEven(String str) {
	Map<String,List<Integer>> map =new HashMap();
	if(str.length()==0) {
		System.out.println("Please send a valid string of length >0");
		return false;
	}
	if(str.length()==1) {
		return true;
	}
	for(int i =0;i<str.length();i++) {
		String temp = str.substring(i, i+1);
		
	}
	
	
	
	
	return false;
}
}

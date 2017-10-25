package pattern.matcher.regex;

import java.util.regex.*;

public class PatternLearning {

	public static void main(String[] args) {
		

		// Methord1:
		
		String regex = ".[ba]{1}";
		String str = "footbalal";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		boolean found=false;
		  while (m.find()) {    
              System.out.println("I found the text "+m.group()+" starting at index "+    
               m.start()+" and ending at index "+m.end());    
               found = true;    
          }  
		 System.out.println(found);
		
//		 Mehord2:
		 
		
//		System.out.println(Pattern.matches("[^a-zAZ0-5]*","6768"));
	}

}

import java.util.ArrayList;
import java.util.List;

public  class Test{

public static void main(String... str){
List<String> list = new ArrayList<>();
list.add("Naman");
list.add("Mohit");
list.add("Naman");

System.out.println(checkCondition(list));
}


public static boolean checkCondition(List<String> list){
if(list.size() != 3){
return false;
}
int count =0;
for(String str : list){
if(isPalindrome(str)){
count++;
}
}
if(count == 1){
return true;}

return false;

}



public static boolean isPalindrome(String str){
// considering blank and any single character string would be palindrome only
if(str.length() < 2){
return true;
}

int start =0;
int end = str.length() -1;

while(!(start>end)){
String firstCharacter = str.substring(start, start+1);
String secondCharacter = str.substring(end,end+1);

if(!firstCharacter.equalsIgnoreCase(secondCharacter)){
return  false;
}
start++;
end--;
}
return true;
}



}

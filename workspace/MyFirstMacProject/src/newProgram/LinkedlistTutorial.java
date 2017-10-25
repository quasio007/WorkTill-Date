package newProgram;

import java.util.ArrayList;
import java.util.List;

public class LinkedlistTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
Student s2 =new Student();
Student s3 = new Student();
s1.setName("A");
s2.setName("B");
s3.setName("C");
List<Student> s = new ArrayList<Student>();
s.add(s1);
s.add(s2);
s.add(s3);

for(Student su : s){
	System.out.println( su.getName());
}

	}

}

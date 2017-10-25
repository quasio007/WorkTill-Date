package cell.phones;

import java.lang.annotation.Annotation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nokia nokia = new Nokia();
Class<? extends Nokia> c = nokia.getClass();
Annotation an =c.getAnnotation(SmartPhone.class);
SmartPhone smartPhone = (SmartPhone) an;
System.out.println(SmartPhone.os1);
System.out.println(smartPhone.os());
System.out.println(SmartPhone.version1);
System.out.println(smartPhone.version());

	}

}

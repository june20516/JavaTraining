package main;

import inheritance.SuperClass;
import sub.ChildSuperClass;

public class UseOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sc = new SuperClass();
		System.out.println(sc);
		
		ChildSuperClass csc = new ChildSuperClass();
		System.out.println(csc);
		System.out.println(csc.getClass());
		csc.output();
		
		SuperClass csc1 = new ChildSuperClass();
		System.out.println(csc1);
		System.out.println(csc1.getClass());
//		csc1.output();			// ¿Ö ¾ÈµÅ???
		
	}

}

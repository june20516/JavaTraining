package main;

import java.util.GregorianCalendar;

import staticdemo.Test;

public class SataticDemoUse {

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		
		test1.method();
		System.out.println(test1.toString());
		test1.method();
		System.out.println(test1.toString());
		test2.method();
		System.out.println(test2.toString());
		System.out.println(test2.nxx);
		System.out.println(test2.sx);
		
		GregorianCalendar td = new GregorianCalendar(2019, 4, 2);
		System.out.println(td.get(GregorianCalendar.JULY));
		System.out.println(td.get(GregorianCalendar.APRIL));
		System.out.println(td.get(GregorianCalendar.MONTH));
		System.out.println(GregorianCalendar.MONTH);
	}

}

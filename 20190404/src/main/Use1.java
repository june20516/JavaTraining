package main;

import inheritance.SubClass;
import inheritance.SuperClass;
import sub.ChildSuperClass;

public class Use1 {
	
	private int uuu;
	
	public static void main(String[] args) {
		/*
		 * ChildSuperClass c1 = new ChildSuperClass(); SuperClass s1 = new SuperClass();
		 * s1.x = 67; ScopeTest t1 = new ScopeTest();
		 */
		SuperClass.spx++;
		ChildSuperClass ref = new ChildSuperClass();
		ref.output();
		
		SubClass.spx = 100;
		ref.output();
		
		ref.spx = 8888;
		ref.output();
		
		Use1 r = new Use1();
		r.uuu = 7;
		
		
		SuperClass abab = new SubClass();
		System.out.println(abab);
		SubClass acac = new SubClass();
		System.out.println(acac);
		SuperClass baba = new SuperClass();
		System.out.println(baba);
		
		System.out.println(abab.toString());
		
	}
}

//
//
//class B extends A {
//	void m1(double ) {}
//	void m1() {}
//}
//
//B ref = new B();
//	ref.m1(); ==> B에서 만들어준 m1()이 호출된다, 정적 바인딩
//			
//class C extends A {
//		void m1() {}
//}
//
//C ref2 = newC();
//ref2.m1();
//
//A obj = new A();
//obj.m1();	//A의 m1;
//A obj = new B();
//obj.m1();	//B의 m1;
//A obj = new C();
//obj.m1();	//C의 m1;
//
//다형성
//
//println();
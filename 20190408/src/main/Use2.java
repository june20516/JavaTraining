package main;

import abst.NoInstanceClass;
import derovation.Sub;

/**
 * Sub Class 의 instance를 만들어서 기초클래스의 참조자가
 * 멤버에 접근
 * @author USER
 *
 */
public class Use2 {

	public static void main(String[] args) {
		new  Sub();	//NoInstanceClass 로부터 파생
		Sub ref1 = new Sub();
		NoInstanceClass ref2 = new Sub();
		//NoInstanceClass ref3 = new NoInstanceClass();
		Object obj = new Sub();
		ref1.m1();	//NoInstatnceClass 의 m1
		ref2.m1();	//NoInstatnceClass 의 m1
		//obj.m1();
		
	}
}

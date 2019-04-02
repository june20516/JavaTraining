package main;

import p1.x.Test2;  //default package 에 있는 Test2는 import할 수 없다, package가 없어서 지정해 줄수가 없기 때문 

public class PUse {
	
	p2.Test2 ref;
	public static void main(String[] args) {
		Test2 ref = new Test2();

	}

}

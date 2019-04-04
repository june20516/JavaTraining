package main;

import inheritance.SuperClass;

public class ScopeTest extends SuperClass {
	public void ss() {
		x = 1;
		y = 2;	//protected 라서 상속됐을 때 사용 가능
		// z는 default라서 package 바깥에서 상속됐을 때 접근할 수 없다
	}
}

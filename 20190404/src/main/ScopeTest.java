package main;

import inheritance.SuperClass;

public class ScopeTest extends SuperClass {
	public void ss() {
		x = 1;
		y = 2;	//protected �� ��ӵ��� �� ��� ����
		// z�� default�� package �ٱ����� ��ӵ��� �� ������ �� ����
	}
}

package main;

import abst.NoInstanceClass;
import derovation.Sub;

/**
 * Sub Class �� instance�� ���� ����Ŭ������ �����ڰ�
 * ����� ����
 * @author USER
 *
 */
public class Use2 {

	public static void main(String[] args) {
		new  Sub();	//NoInstanceClass �κ��� �Ļ�
		Sub ref1 = new Sub();
		NoInstanceClass ref2 = new Sub();
		//NoInstanceClass ref3 = new NoInstanceClass();
		Object obj = new Sub();
		ref1.m1();	//NoInstatnceClass �� m1
		ref2.m1();	//NoInstatnceClass �� m1
		//obj.m1();
		
	}
}

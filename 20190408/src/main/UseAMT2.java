package main;

import abstractmethod.AbstMethodTest;
import abstractmethod.SubAMT1;

public class UseAMT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstMethodTest ref = new SubAMT1();
		ref.callM1();
	}

}

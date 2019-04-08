package privateconst;

import java.util.Calendar;

public class PCTUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstTest2 ref = PrivateConstTest2.getInstance();
		PrivateConstTest2 ref2 = PrivateConstTest2.getInstance();
		PrivateConstTest2 ref3 = PrivateConstTest2.getInstance();
		System.out.println(ref);
		System.out.println(ref2);
		System.out.println(ref3);
		ref.m1();
		ref2.m1();
		
		
		Calendar today = Calendar.getInstance();
		
	}

}

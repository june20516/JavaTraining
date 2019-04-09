package superthis;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSuperA subSuperA = new SubSuperA(55);
//		subSuperA.m1();
		
//		subSuperA.subProccessMethod();
		
		SuperA ref = new Sub2SuperA();
//		ref.subProccessMehtod();
		
		String str = "wegdty4w";
		Object obj = str;
		System.out.println("````````");
		ref.subMethodCall();
		System.out.println("````````");
		ref = subSuperA;
		ref.subMethodCall();
	}

}

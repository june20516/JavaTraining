package abstractmethod;

public class UseAMT {
	public static void main(String[] args) {
		AbstMethodTest ref1 = new SubAMT1();
		ref1.callM1();
		ref1.x = 1;
		((SubAMT1) ref1).m2();
		AbstMethodTest ref2 = new SubAMT2();
		ref2.callM1();
		SubAMT1 ref3 = new SubAMT1();
		ref3.x = " ";
		ref3.m2();

	}
}
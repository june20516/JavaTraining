package abstractmethod;

public class UseAMT {
public static void main(String[] args) {
	AbstMethodTest ref1 = new SubAMT1();
	ref1.callM1();
	AbstMethodTest ref2 = new SubAMT2();
	ref2.callM1();
}
}

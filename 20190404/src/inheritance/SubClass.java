package inheritance;

public class SubClass extends SuperClass{
	public void mm() {
		int temp = x + y + z;	//같은 패키지에 있어서 default와 protected 둘다 쓸수있다
		String pw = getPw();
	}
}

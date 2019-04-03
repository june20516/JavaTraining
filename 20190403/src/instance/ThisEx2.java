package instance;

public class ThisEx2 {
	private int memberX;
	private static int memberY = 7;
	
	public ThisEx2() {
		System.out.println("인스턴스의 시작주소"+ this);
	}
//	public ThisEx2(int paramX) {
//		memberX = paramX;
//	}
	
	public ThisEx2(int memberX) {
		this.memberX = memberX;
		System.out.println("인스턴스의 시작주소"+ this+"    x = " + this.memberX);
	}
		
	public static void staticMeEx(int memberY) {
		ThisEx2.memberY = 9;
	}
	
}

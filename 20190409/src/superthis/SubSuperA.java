package superthis;

public class SubSuperA extends SuperA{
	public String x;
	public SubSuperA() {
		super.x=34;
		
		y = 34;
	}
	public SubSuperA(int x) {
		super(x);
		this.x = x+"문자됐다";
		super.y = x;
		rate = 40;
	}
	
	public void m1() {
		System.out.println("SubSuperA의 m1()"+x+","+y);
	}
	

	public void subProccessMehtod() {
		//각 sub클래스의 고유 처리부분
		System.out.println("1233");
	}
	
	public static void staticMethodCall() {
		
	}
}

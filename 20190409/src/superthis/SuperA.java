package superthis;

public abstract class SuperA {
	public int x;
	public int y;
	
	public SuperA() {
		
	}
	public SuperA(int x) {
		super();
		this.x = x;
	}
	public SuperA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void m1() {
		System.out.println("SuperA의 m1()"+x+","+y);
	}
	/**
	 * 이 메소드는 꼮꼭 overriding해서 쓰세요 ! 
	 */
	public void subProccessMehtod() { }
	
	public void subMethodCall() {
		subProccessMehtod();
	}
	
	public static double rate = 1.2;
	public static void rateProcess() {
		System.out.println(rate+"%");
		
	}
}

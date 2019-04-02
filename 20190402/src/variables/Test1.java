package variables;

public class Test1 {

	//지역변수
	public void method1() {
		int age;
		String name;
		double avg;
		
		int engs[] = new int[4];
		int maths[] = {43,32,83,11};
		
		System.out.println(kor);
		System.out.println(engs[2]);
	}
	
	//==> 맴버변수자리 초기화
	
	//인스턴스 변수 ( member field 중에 instance 가 만들어져야만 사용가능한 변수)
	public int kor;
	public String addr;
	
	//맴버 변수 중 클래스차원의 변수
	public static double rate;
	
	//매개변수 xx
	public static void methodParam(int xx) {
		System.out.println(xx);
	}
	
	
	/*
	 *두번 이상 메소드간 상의되는 변수는 맴버변수로 두는 것이 좋다
	 *
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1.rate = 89;
		Test1 ref = new Test1();
		ref.method1();
		methodParam(789);
		
	}

}

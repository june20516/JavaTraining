package inheritance;

public class SuperClass {

	// non-static
	public int x;
	protected int y;
	int z;
	private String pw = "!@#";

	// static
	static public int spx = 90;	// static은 class로 접근해야 하기 떄문에, 접근 범위가 넓게 public으로 대부분 만든다
	static protected int spry = 55;

	public String getPw() {
		return pw;
	}
	public static void anan() {
		//x++; //error 발생 ! 인스턴스가 무엇일지 모르니까 
	}

}

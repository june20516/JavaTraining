package inheritance;

public class SuperClass {

	// non-static
	public int x;
	protected int y;
	int z;
	private String pw = "!@#";

	// static
	static public int spx = 90;	// static�� class�� �����ؾ� �ϱ� ������, ���� ������ �а� public���� ��κ� �����
	static protected int spry = 55;

	public String getPw() {
		return pw;
	}
	public static void anan() {
		//x++; //error �߻� ! �ν��Ͻ��� �������� �𸣴ϱ� 
	}

}

package instance;

//static과 non-static, this의 관계
public class ThisEx1 {

	public void me1() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
//		System.out.println(this);    // error 발생
	}
}

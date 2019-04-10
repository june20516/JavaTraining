package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String y = "12 3";
		try {
			x = 4 / Integer.parseInt(y);

			System.out.println(x);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("0으로 나눌 수 없습니다");
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
			System.out.println("숫자 형식이 아닙니다");
		} catch (Exception ex) {
			System.out.println("예상치못한 예외 발생"); // 상속관계인 exception들은, sub일수록 먼저 나오게
		} finally {
			// 공통적으로 마지막에 무조건 처리되어야 하는 블럭
		}
		
	}

}
   

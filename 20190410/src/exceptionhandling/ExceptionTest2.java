package exceptionhandling;

import java.util.IllegalFormatException;

public class ExceptionTest2 {

	public boolean m1(int x, int y) {
		int c = 0;
		String str = null;
		int d = 0;
		try {
			c = x / y;
			str = String.format("%3d%2d", x);
			d = Integer.parseInt(str);
		} catch (ArithmeticException e) {
			System.out.println("0이 아닌 수를 입력하세요"); 
			return false;
		} catch (IllegalFormatException e) {
			System.out.println(e.getMessage() + "와 conversion이 일치하지 않음");
//			return;
		} catch (NumberFormatException e) {
			System.out.println("수치로 변환할 문자열이 수치타입이 아님");
//			return;
		} catch (Exception e) {
			System.out.println("예기치못한 예외 발생");
			return false;
		} finally {
			System.out.println("exception 발생과 상관 없이 마지막에 반드시 처리되는 부분");
		}
		System.out.println("exception이 발생하면 실행되지 못하는 부분");
		return true;
	}

}

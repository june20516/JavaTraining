import java.util.*;

public class PrimDataTypeTest {

	public static void main(String[] args) {
		
		char sexCh = 'f';		
		int age = 20;
		System.out.println(sexCh); //f
		System.out.println(age);  //20
		
		//암시적 형변환
		sexCh = 'a' + 2; 
		age = 'a' + 2;
		System.out.println(sexCh); // c
		System.out.println(age);  // 99
		
		// 논리 자료형
		boolean isMarried = false;
		
		age = (int)23.5; //강제형변환, 명시적 형변환
		
		
		//
		double height = 163.5;
		height = 163.5f;
		
		//인트와 인트간 계산은 인트이다.
		double averageScore = 4/5;
		System.out.println(averageScore); //0.0
		
		
		// 참조자료형 변수 String
		String myStr = new String("LeeJunHo"); //생성자를 사용한 변수선언
		//type  var  = instance
		int index = myStr.indexOf('H');
		System.out.println(index);
		
		//참조자료형의 논리연산 ==
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar calendar2 = new GregorianCalendar();
		System.out.print(calendar == calendar2);
		
	}

}


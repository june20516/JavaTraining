package page129;

import java.util.Scanner;

public class ObjectMethods {

	public int x = 9;
	public int y = 10;

	public void m() {

	}

	@Override
	public boolean equals(Object obj) {	// obj는 Object obj = new ObjectMethods();일까?
		// TODO Auto-generated method stub
		// a.equals(b)
		// a 인스턴스의 필드값과 b 인스턴스의 필드값만 동일해도 true 일지,
		// 필드값도 같고 주소도 같아야 true일지
		// == 대신에 -를 사용한다(연산속도 차이)
		// 각 field를 -연산하고 더해서 0이면 true, 0아니면 false
		// obj 를 다운캐스팅한다
		ObjectMethods temp = (ObjectMethods) obj;
		return (this.x - temp.x) + (this.y - temp.y) == 0;
//		return super.equals(obj);
	}

	public static void main(String[] args) {
	
		ObjectMethods ref1 = new ObjectMethods();
		System.out.println(ref1.x);
		ObjectMethods ref2 = new ObjectMethods();
		Object ref3 = new Object();
		System.out.println(ref2.x);
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1 == ref2); // false; ==연산자는 같은 주소인지를 비교한다
		String ex = "x";
		Object objx = (Object)ex;
		ObjectMethods ref4 = (ObjectMethods)objx;	//ClassCastException 발생
		System.out.println(ref4.x);
		//
//		System.out.println(ex == "x"); // true; 동일 주소를 부여
//		Scanner in = new Scanner(System.in);
//		System.out.println(ex == in.next()); // false; 입력값이 무엇일지 모르므로 같은 주소가 아니다
//		System.out.println(ex.equals(in.next())); // true;
//	
		
		
/**
 *String 의 equals
 *		 
 *		public boolean equals(Object anObject) {
 
		        if (this == anObject) {
		            return true;
		        }
		        if (anObject instanceof String) {
		            String anotherString = (String)anObject;
		            int n = value.length;
		            if (n == anotherString.value.length) {
		                char v1[] = value;
		                char v2[] = anotherString.value;
		                int i = 0;
		                while (n-- != 0) {
		                    if (v1[i] != v2[i])
		                        return false;
		                    i++;
		                }
		                return true;
		            }
		        }
		        return false;
		    }
		    
		    */
	}
}

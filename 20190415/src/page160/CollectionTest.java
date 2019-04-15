package page160;

import java.util.ArrayList;

import override.Dog;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[3];
		//Dog type 의 주소를 기억할 공간을 3개 만듬
		Dog [] dogs = new Dog[3];	// 배열을 만들면, 지역 변수여도 내부 자료형은 자동으로 초기화가 된다.
		Dog d;	// Dog type의 인스턴스를 참조할 참조변수d를 선언, 실제로 instance는 생성되지 않음

//		d.crySound();	//에러발생
//		String dogSound = dogs[0].crySound();	//NullPointerException 발생
//		System.out.println(dogSound);	// NullPointerException 에러 발생
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("789");
		String tempStr = "";
		for(int i = 0; i<list.size(); i++) {
			tempStr += list.get(i);
		}
		System.out.println(tempStr);

	}

}

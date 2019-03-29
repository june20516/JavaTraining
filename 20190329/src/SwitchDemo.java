

public class SwitchDemo {

	public static void main(String[] args) {
//		int localCode = Integer.parseInt(args[0]);
		int localCode = 2;
		String localStr;
		
		switch (localCode) {
		case 1 : localStr = "서울";break;
		case 2 : localStr = "부산"; 
		break;
		case 3 : 
			localStr = "제주도"; break;
		default : localStr = "그외지역"; break;
		}
		System.out.println("입력하신 코드의 지역은 " + localStr + " 입니다");
		
		
		
		int b = 5;
		int c = b += 3;
		System.out.println("b="+b+"   c="+c);
		
	}

}

package homework;

public class HomeWorkMain {
	public static void main(String[] args) {

		// 1 white space를 없애보자
		String hw1 = "        345       ";
		System.out.println(hw1.trim());

		String hw11 = "    3   4  5 ";
		
		
		// 2 기준 문자로 분리해보자
		
		// 2-1 split으로 배열을 사용한 방법
		String hw2 = "바나나:딸기:망고:두리안";
		String[] fruits = hw2.split(":");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 2-2 charAt과 if문을 이용한 방법
		for(int idx=0; idx< hw2.length() ; idx++) {
			if (hw2.charAt(idx) == ':') {
				System.out.println();
			}else
			System.out.print(hw2.charAt(idx));
		}

		System.out.println();
		
		
		// 3 "강남구" 를 찾고 그 이후 문자를 출력해보자
		String addr1 = "서울시 강남구 삼성동 66-8";
		String addr2 = "서울특별시 강남구 역삼동";
		String addr3 = "서울 강동구 성내동";
		
		String[] addrs = { addr1, addr2, addr3 };
		String keyword = "강남구";
		String target = "";

		for (String addr : addrs) {
			int keyIdx = addr.indexOf(keyword);
			if (keyIdx == -1) {
				System.out.printf("%s가 없습니다.", keyword);
			} else {
				target = addr.substring(keyIdx + keyword.length());
				System.out.println(target);
			}
			
		}
		
	}
}

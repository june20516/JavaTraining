package homework;

public class HomeWorkMain {
	public static void main(String[] args) {

		// 1 white space제거
		String hw1 = "        345       ";
		System.out.println(hw1.trim());

		String hw11 = "    3   4  5 ";
		
		
		// 2 string 나누기
		
		// 2-1 split을 사용
		String hw2 = "사과:바나나:망고:두리안";
		String[] fruits = hw2.split(":");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 2-2 charAt과 if사용하기
		for(int idx=0; idx< hw2.length() ; idx++) {
			if (hw2.charAt(idx) == ':') {
				System.out.println();
			}else
			System.out.print(hw2.charAt(idx));
		}

		System.out.println();
		
		
		// 3 "������" �� ã�� �� ���� ���ڸ� ����غ���
		String addr1 = "����� ������ �Ｚ�� 66-8";
		String addr2 = "����Ư���� ������ ���ﵿ";
		String addr3 = "���� ������ ������";
		
		String[] addrs = { addr1, addr2, addr3 };
		String keyword = "������";
		String target = "";

		for (String addr : addrs) {
			int keyIdx = addr.indexOf(keyword);
			if (keyIdx == -1) {
				System.out.printf("%s�� �����ϴ�.", keyword);
			} else {
				target = addr.substring(keyIdx + keyword.length());
				System.out.println(target);
			}
			
		}
		
	}
}

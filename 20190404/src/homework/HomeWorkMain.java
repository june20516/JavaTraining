package homework;

public class HomeWorkMain {
	public static void main(String[] args) {

		// 1 white space�� ���ֺ���
		String hw1 = "        345       ";
		System.out.println(hw1.trim());

		String hw11 = "    3   4  5 ";
		
		
		// 2 ���� ���ڷ� �и��غ���
		
		// 2-1 split���� �迭�� ����� ���
		String hw2 = "�ٳ���:����:����:�θ���";
		String[] fruits = hw2.split(":");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 2-2 charAt�� if���� �̿��� ���
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

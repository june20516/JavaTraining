

public class SwitchDemo {

	public static void main(String[] args) {
//		int localCode = Integer.parseInt(args[0]);
		int localCode = 2;
		String localStr;
		
		switch (localCode) {
		case 1 : localStr = "����";break;
		case 2 : localStr = "�λ�"; 
		break;
		case 3 : 
			localStr = "���ֵ�"; break;
		default : localStr = "�׿�����"; break;
		}
		System.out.println("�Է��Ͻ� �ڵ��� ������ " + localStr + " �Դϴ�");
		
		
		
		int b = 5;
		int c = b += 3;
		System.out.println("b="+b+"   c="+c);
		
	}

}

package string;

public class StringDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String a = "Lee";
//		String b = "Lee";
//		String c = new String("Lee");
//		
//		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a.equals(c));
//		
//		
//		a = a + "��";
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		b = a.replace('L', 'B');
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		System.out.println(b.indexOf('��'));
//		System.out.println(b.charAt(b.indexOf('��')));
//		System.out.println(b.startsWith("Be"));
//		System.out.println(b.endsWith("ee"));
//		
//		System.out.println(b.contains("ee"));
		
		StringBuffer sb1 = new StringBuffer("�ƽ�Ƽ����");
		System.out.println(sb1);
		System.out.println(sb1.capacity());	//�迭�� ���� (memory�Ҵ� ����)
		System.out.println(sb1.length());	//���� ����
		
		
		StringBuffer sb2 = new StringBuffer("��");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb1.length());	//���� ����
		
		sb1.append("��-");
		System.out.println(sb1);
		System.out.println(sb1.length());	//���� ����
		
		sb1.append(22);
		System.out.println(sb1);
		System.out.println(sb1.length());	//���� ����
		
		StringBuffer sb3 = new StringBuffer("capacity�� �ʰ��Ҹ�ŭ ���ϸ� ��� ���� �ñ����� �ʽ��ϱ�?");
		sb1.append(sb3);
		System.out.println(sb1);
		System.out.println(sb1.capacity());	//�迭�� ���� (memory�Ҵ� ����)
		System.out.println(sb1.length());	//���� ����
		
		
		sb1.replace(1, 1, "?");
		System.out.println(sb1);
		
		sb1.replace(0, 1, "?");
		System.out.println(sb1);
		
		
		int inputNum = 89;
		String str1 = String.valueOf(inputNum);
		String str2 = inputNum+"";
		System.out.println(str1);
		System.out.println(str2);
		
		String inputData = "89";
		int data = Integer.parseInt(inputData);
		int data2 = new Integer(inputData);
		
		System.out.println(data);
		System.out.println(data2);

		
		
	}

}

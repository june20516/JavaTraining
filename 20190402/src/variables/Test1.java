package variables;

public class Test1 {

	//��������
	public void method1() {
		int age;
		String name;
		double avg;
		
		int engs[] = new int[4];
		int maths[] = {43,32,83,11};
		
		System.out.println(kor);
		System.out.println(engs[2]);
	}
	
	//==> �ɹ������ڸ� �ʱ�ȭ
	
	//�ν��Ͻ� ���� ( member field �߿� instance �� ��������߸� ��밡���� ����)
	public int kor;
	public String addr;
	
	//�ɹ� ���� �� Ŭ���������� ����
	public static double rate;
	
	//�Ű����� xx
	public static void methodParam(int xx) {
		System.out.println(xx);
	}
	
	
	/*
	 *�ι� �̻� �޼ҵ尣 ���ǵǴ� ������ �ɹ������� �δ� ���� ����
	 *
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1.rate = 89;
		Test1 ref = new Test1();
		ref.method1();
		methodParam(789);
		
	}

}

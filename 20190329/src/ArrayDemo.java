
public class ArrayDemo {

	public static void main(String[] args) {
		int[] kors = new int[6];
		
		for (int i = 0; i < 6; i++) {
			System.out.print(kors[i]);
		}
		
		boolean[] kors2 = new boolean[6];
		for (int i = 0; i < 6; i++) {
			System.out.print(kors2[i]);    //falsefalsefalsefalsefalsefalse
		}
		
		System.out.print("\n");
		
		
		/*
		 * ���� 11�� - 2���� �迭�� ����
		 *  
		 * 1 
		 * 2  3 
		 * 4  5  6 
		 * 7  8  9  10 
		 * 11 12 13 14 15
		 */
		
		//5���� ������ ������ �迭 ����
		int size = 5;
		int twoDim[][] = new int[size][];
		
		//�� ���� ��ȣ�� ���� ������ ����
		for(int i=0; i<size; i++) {
			twoDim[i] = new int[i+1];
		}
		
		int count = 0;							//�迭 �ּҴ����� �� ���� count �ʱ�ȭ
		
		for(int[] r : twoDim) {								// ��ݺ�
			for (int c : r) {						 		// ���ݺ�
				r[c] = ++count;								// �����ϴ� count�� �迭�� �Է�
				System.out.print("[" + r[c] + "]" + " ");   // ��ĭ�� ���
			}
			System.out.print("\n");				// ���� ������ �ٹٲ�
		}
		
		

		/*
		 * ���� 12�� - 2���� �迭�� ����
		 *  
		 *              1 
		 *           2  3 
		 *        4  5  6 
		 *     7  8  9 10 
		 * 11 12 13 14 15
		 */
		
		//5*5 ũ�� �迭 ����
		int size2 = 5;
		int twoDim2[][] = new int[size2][size2];
		
		// ä���ֱ�
		int count2 = 0;								// �� ���� �ʱ�ȭ
		for(int r = 0; r < size2; r++) {				//�� �ݺ�
			for (int c = 0; c < size2; c++) {		//�� �ݺ�
				if (c >= size2 - 1 - r) {			//���ε����� �߽ɼ�(�ִ������ - ���ε��� -1)���� ũ�ų� ���� ��
					twoDim2[r][c] = ++count2;		//�����ϴ� ���ڸ� �ִ´�
				}
			}
		}
		
		// ����ϱ�
		for(int[] r : twoDim2) {								//�� �ݺ�
			for (int c : r) {									//�� �ݺ�
				String cStr = c==0 ? " " : String.valueOf(c); 	//���� �ȵ����� (0�̸�) �������� �ٲ۴�
				System.out.print("[" + cStr + "]" + " ");		//�� ��� (���ü��� ���� []ó��)
			}
			System.out.print("\n");								//�� ������ ���� �ٹٲ�
		}
	}

}
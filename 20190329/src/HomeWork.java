public class HomeWork {
	
	public static void main(String[] args) {
		
		//1. if  ==> if else
		
		
		//2. ��� ����� ���� �����ϱ�
		int a1 = 5;				// 6
		int b1 = 4;				// 5
		int c1 = ++a1 + ++b1;	// 11 (+���� �������� a1 = 6, b1 = 5)

		int a2 = 5;				// 6
		int b2 = 4;				// 5
		int c2 = ++a2 + b2++;	// 10 (+���� �������� a2 = 6, b2 = 4)

		int a3 = 5;				// 6
		int b3 = 4;				// 5
		int c3 = a3++ + ++b3;	// 10 (+���� �������� a2 = 5, b2 = 5)

		int a4 = 5;				// 6
		int b4 = 4;				// 5
		int c4 = a4++ + b4++;	// 9 (+���� �������� a2 = 5, b2 = 4)

		System.out.print(c1+", "+c2+", "+c3+", "+c4);
		System.out.print("\n\n"); 
		
		
		//3. a~z ����ϱ�
		for(int alph = 0; alph < 26; alph++) {	// ���ĺ� ������ 26������ �ݺ�
			System.out.print((char)(alph+97));	// �ҹ��� a�� 97���� char�������� ����ȯ�Ͽ� ���
		}
		System.out.print("\n\n");	
		
		
		//4. 5��¥�� 4ĭ ����Ʈ
		for(int r=5;r>=1;r--) {						//�� �ݺ�
			for(int c=1;c<=4;c++) {					//ĭ �ݺ�
				System.out.print("("+r+","+c+") ");	//���Ŀ� ���� ���
			}
			System.out.print("\n");					//������ĭ���� �ٹٲ�
		}
		System.out.print("\n\n");
		
		
		//5. 4��¥�� �̲���Ʋ
		for(int r=1;r<=4;r++) {						//�� �ݺ�
			for(int c=1;c<=r;c++) {					//ĭ �ݺ�
				System.out.print("("+r+","+c+")");	//���Ŀ� ���� ���
			}
			System.out.print("\n");					//������ĭ���� �ٹٲ�
		}
		System.out.print("\n\n");
		
		
		//6. A~z���� ����ϱ�
		for(int alph = 65; alph < 123; alph++) {	//�빮�� A�� 65���� �ҹ���z�� 122������ �ݺ�
			System.out.print((char)(alph));			//char�������� ����ȯ�Ͽ� ���
		}
		System.out.print("\n\n");

		
		//7. 6���� �������� Ư�����ڸ� �����ϱ�
		for(int alph = 65; alph < 123; alph++) {	//�빮�� A�� 65���� �ҹ���z�� 122������ �ݺ�
			if(alph > 90 && alph < 97) continue;	//Ư�������� 91������ 96������ �ǳʶ�
			System.out.print((char)(alph));			//char�������� ����ȯ�Ͽ� ���
		}
		System.out.print("\n\n");
		
		
		//8. 7���� �������� �� �࿡ 4���ھ� ����ϱ�
		for(int alph = 65; alph < 123; alph++) {		//�빮�� A�� 65���� �ҹ���z�� 122������ �ݺ�
			if(alph > 90 && alph < 97) continue;		//Ư�������� 91������ 96������ �ǳʶ�
			if (alph % 4 == 1) System.out.print("\n");	//65%4 = 1�̹Ƿ�, 1�� ���ƿ� ������(���4������) �ٹٲ�
				System.out.print((char)(alph));			//char�������� ����ȯ�Ͽ� ���
		}
		System.out.print("\n\n");
		
		
		//9.������
		int[][] multipleTable = new int[9][8];			//������ ������ ������ �迭����
		
		for(int row = 0; row < 9; row++) {
			for(int column = 0; column < 8; column++) {
				multipleTable[row][column] = (column+2) * (row+1);
			}
		}
		for(int column = 2; column <=9; column++) {
			System.out.print(column + " ��		");
		}
		System.out.print("\n");
		for(int row = 1; row <= 9; row++) {
			for(int column = 2; column <=9; column++) {
				System.out.print(column + " * " + row + " = " + multipleTable[row-1][column-2] + "	");
			}
			System.out.print("\n");
		}
	}
}


public class ForDemo {

	public static void main(String[] args) {
		
		//2���� ����
		for(int odd = 1; odd<10; odd+=2) {
			System.out.print(odd);
		}
		
		// ���ĺ� ���
		for(int alph = 0; alph < 26; alph++) {
			System.out.print((char)(alph+97));
		}
		
		//for each
		int[] nums = {2,3,4};
		for(int a : nums) {
		System.out.print(a);
		}
		System.out.print("\n");
		
		
		//��ø for
		for(int r=1;r<6;r++) {
			for(int c=1;c<5;c++) {
				System.out.print("("+r+","+c+")");
			}
			System.out.print("\n");
		}
		
		//����4
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=4;c++) {
				System.out.print("("+r+","+c+") ");
			}
			System.out.print("\n");
		}
		
		//����5
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("("+r+","+c+")");
			}
			System.out.print("\n");
		}
		
		//����6 A~z
		for(int alph = 65; alph < 123; alph++) {
			System.out.print((char)(alph));
		}
		
		System.out.print("\n");
		
		//����7 A~z Ư������
		for(int alph = 65; alph < 123; alph++) {
			if(alph > 90 && alph < 97)
				continue;
			System.out.print((char)(alph));
		}
		
		System.out.print("\n");

		//����8 ����7�� ���ٿ� 4����
		for(int alph = 65; alph < 123; alph++) {
			if (alph%4==1) System.out.print("\n");
			if(alph > 90 && alph < 97) continue;
				System.out.print((char)(alph));
		}
		
		//����9 ������
		//����10 ������
		
		
	}

}
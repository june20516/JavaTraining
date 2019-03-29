
public class ForDemo {

	public static void main(String[] args) {
		
		//2개씩 증가
		for(int odd = 1; odd<10; odd+=2) {
			System.out.print(odd);
		}
		
		// 알파벳 출력
		for(int alph = 0; alph < 26; alph++) {
			System.out.print((char)(alph+97));
		}
		
		//for each
		int[] nums = {2,3,4};
		for(int a : nums) {
		System.out.print(a);
		}
		System.out.print("\n");
		
		
		//중첩 for
		for(int r=1;r<6;r++) {
			for(int c=1;c<5;c++) {
				System.out.print("("+r+","+c+")");
			}
			System.out.print("\n");
		}
		
		//과제4
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=4;c++) {
				System.out.print("("+r+","+c+") ");
			}
			System.out.print("\n");
		}
		
		//과제5
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("("+r+","+c+")");
			}
			System.out.print("\n");
		}
		
		//과제6 A~z
		for(int alph = 65; alph < 123; alph++) {
			System.out.print((char)(alph));
		}
		
		System.out.print("\n");
		
		//과제7 A~z 특문제외
		for(int alph = 65; alph < 123; alph++) {
			if(alph > 90 && alph < 97)
				continue;
			System.out.print((char)(alph));
		}
		
		System.out.print("\n");

		//과제8 과제7을 한줄에 4개씩
		for(int alph = 65; alph < 123; alph++) {
			if (alph%4==1) System.out.print("\n");
			if(alph > 90 && alph < 97) continue;
				System.out.print((char)(alph));
		}
		
		//과제9 구구단
		//과제10 구구단
		
		
	}

}
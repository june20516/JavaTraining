public class HomeWork {
	
	public static void main(String[] args) {
		
		//1. if  ==> if else
		
		
		//2. 계산 결과와 이유 예측하기
		int a1 = 5;				// 6
		int b1 = 4;				// 5
		int c1 = ++a1 + ++b1;	// 11 (+연산 시점에서 a1 = 6, b1 = 5)

		int a2 = 5;				// 6
		int b2 = 4;				// 5
		int c2 = ++a2 + b2++;	// 10 (+연산 시점에서 a2 = 6, b2 = 4)

		int a3 = 5;				// 6
		int b3 = 4;				// 5
		int c3 = a3++ + ++b3;	// 10 (+연산 시점에서 a2 = 5, b2 = 5)

		int a4 = 5;				// 6
		int b4 = 4;				// 5
		int c4 = a4++ + b4++;	// 9 (+연산 시점에서 a2 = 5, b2 = 4)

		System.out.print(c1+", "+c2+", "+c3+", "+c4);
		System.out.print("\n\n"); 
		
		
		//3. a~z 출력하기
		for(int alph = 0; alph < 26; alph++) {	// 알파벳 개수인 26번까지 반복
			System.out.print((char)(alph+97));	// 소문자 a인 97부터 char형식으로 형변환하여 출력
		}
		System.out.print("\n\n");	
		
		
		//4. 5층짜리 4칸 아파트
		for(int r=5;r>=1;r--) {						//층 반복
			for(int c=1;c<=4;c++) {					//칸 반복
				System.out.print("("+r+","+c+") ");	//형식에 맞춰 출력
			}
			System.out.print("\n");					//마지막칸에서 줄바꿈
		}
		System.out.print("\n\n");
		
		
		//5. 4층짜리 미끄럼틀
		for(int r=1;r<=4;r++) {						//층 반복
			for(int c=1;c<=r;c++) {					//칸 반복
				System.out.print("("+r+","+c+")");	//형식에 맞춰 출력
			}
			System.out.print("\n");					//마지막칸에서 줄바꿈
		}
		System.out.print("\n\n");
		
		
		//6. A~z까지 출력하기
		for(int alph = 65; alph < 123; alph++) {	//대문자 A인 65부터 소문자z인 122번까지 반복
			System.out.print((char)(alph));			//char형식으로 형변환하여 출력
		}
		System.out.print("\n\n");

		
		//7. 6번의 예제에서 특수문자를 제외하기
		for(int alph = 65; alph < 123; alph++) {	//대문자 A인 65부터 소문자z인 122번까지 반복
			if(alph > 90 && alph < 97) continue;	//특수문자인 91번부터 96번까지 건너뜀
			System.out.print((char)(alph));			//char형식으로 형변환하여 출력
		}
		System.out.print("\n\n");
		
		
		//8. 7번의 예제에서 한 행에 4글자씩 출력하기
		for(int alph = 65; alph < 123; alph++) {		//대문자 A인 65부터 소문자z인 122번까지 반복
			if(alph > 90 && alph < 97) continue;		//특수문자인 91번부터 96번까지 건너뜀
			if (alph % 4 == 1) System.out.print("\n");	//65%4 = 1이므로, 1이 돌아올 때마다(출력4번마다) 줄바꿈
				System.out.print((char)(alph));			//char형식으로 형변환하여 출력
		}
		System.out.print("\n\n");
		
		
		//9.구구단
		int[][] multipleTable = new int[9][8];			//구구단 저장할 이차원 배열생성
		
		for(int row = 0; row < 9; row++) {
			for(int column = 0; column < 8; column++) {
				multipleTable[row][column] = (column+2) * (row+1);
			}
		}
		for(int column = 2; column <=9; column++) {
			System.out.print(column + " 단		");
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

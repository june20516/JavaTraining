
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
		 * 과제 11번 - 2차원 배열로 구현
		 *  
		 * 1 
		 * 2  3 
		 * 4  5  6 
		 * 7  8  9  10 
		 * 11 12 13 14 15
		 */
		
		//5행을 가지는 이차원 배열 생성
		int size = 5;
		int twoDim[][] = new int[size][];
		
		//각 행의 번호를 열의 개수로 생성
		for(int i=0; i<size; i++) {
			twoDim[i] = new int[i+1];
		}
		
		int count = 0;							//배열 최소단위에 들어갈 숫자 count 초기화
		
		for(int[] r : twoDim) {								// 행반복
			for (int c : r) {						 		// 열반복
				r[c] = ++count;								// 증가하는 count를 배열에 입력
				System.out.print("[" + r[c] + "]" + " ");   // 한칸씩 출력
			}
			System.out.print("\n");				// 행이 끝나면 줄바꿈
		}
		
		

		/*
		 * 과제 12번 - 2차원 배열로 구현
		 *  
		 *              1 
		 *           2  3 
		 *        4  5  6 
		 *     7  8  9 10 
		 * 11 12 13 14 15
		 */
		
		//5*5 크기 배열 생성
		int size2 = 5;
		int twoDim2[][] = new int[size2][size2];
		
		// 채워넣기
		int count2 = 0;								// 들어갈 숫자 초기화
		for(int r = 0; r < size2; r++) {				//행 반복
			for (int c = 0; c < size2; c++) {		//열 반복
				if (c >= size2 - 1 - r) {			//열인덱스가 중심선(최대사이즈 - 행인덱스 -1)보다 크거나 같을 때
					twoDim2[r][c] = ++count2;		//증가하는 숫자를 넣는다
				}
			}
		}
		
		// 출력하기
		for(int[] r : twoDim2) {								//행 반복
			for (int c : r) {									//열 반복
				String cStr = c==0 ? " " : String.valueOf(c); 	//값이 안들어갔으면 (0이면) 공백으로 바꾼다
				System.out.print("[" + cStr + "]" + " ");		//값 출력 (가시성을 위해 []처리)
			}
			System.out.print("\n");								//열 끝까지 가면 줄바꿈
		}
	}

}

public class HomeWork {

	public static void main(String[] args) {
		
		//printf 써보기
		int i = 1;
		char c = 'm';
		String s = "april";
		System.out.printf("%4d%10c%20s%n", i,c,s);
		
		// 1. 성적 학점 매겨보자
		int no = 1;	//번호
		String name = "Cpt.America";	//이름
		int krScore = 30, enScore = 75, mathScore = 50;	//국어, 영어, 수학 점수
		int scoreSum = (krScore + enScore + mathScore);	//총점수 = 155
		int scoreAverage = scoreSum / 3;	//평균점수 = 51
		char rating;
		//if문으로 학점 구하기
		if(scoreAverage <0 || scoreAverage >100) //큰 조건(0~100 바깥)부터 걸러내기
			rating = '?';
		else if (scoreAverage <=60)	//점수 분포가 균등하다고 가정했을 때, 그 다음 큰조건 
			rating = 'F';
		else if (scoreAverage <=70)
			rating = 'D';
		else if (scoreAverage <=80)
			rating = 'C';
		else if (scoreAverage <=90)
			rating = 'B';
		else
			rating = 'A';
		System.out.println("if 방법 : " + rating);
		
		//switch문으로 학점 구하기
		switch(scoreAverage/10){	//10의 자리수를 확인
		case(9) : rating = 'A';break;
		case(8) : rating = 'B';break;
		case(7) : rating = 'C';break;
		case(6) : rating = 'D';break;
		default : rating = 'F';break;	 
		}
		System.out.println("switch 방법1 : " + rating);
		
		/*
		 * F의 범위인 0~6까지를 디폴트로 하고 나면, 0~100이외의 점수에 '?'를 출력할 방법을 모르겠다.
		 */
		
		switch(scoreAverage/10){	//10의 자리수를 확인
		case(9) : rating = 'A';break;
		case(8) : rating = 'B';break;
		case(7) : rating = 'C';break;
		case(6) : rating = 'D';break;
		case(5) : 
		case(4) : 
		case(3) : 
		case(2) : 
		case(1) : 
		case(0) : 
			rating = 'F';break;	// default에 ?의 영역을 주기 위해, F 영역을 케이스로 넣음
		default : rating = '?';break;
		}
		System.out.println("switch 방법2 : " + rating);
		
		
		
		
		// 2. 여러명의 성적을 매겨보자
		int[] nums = {1,2,3,4,5};	//연번
		String[] names = {"Cpt.America","BlackWidow","PeterParker","Hulk","IronMan"};	//이름
		int[] krScores = {30, 95, 77, 12, 70};	//국어점수
		int[] enScores = {75, 100, 94, 35, 85};	//영어점수
		int[] mathScores = {50, 80, 70, 9, 100};	//수학점수
		//총점수
		int[] scoreSums = new int[5];	//배열 초기화
		for(int num : nums) {	//연번을 인덱스로 사용하여 각 스코어를 총합해 총점수 배열에 입력
			scoreSums[num-1] = krScores[num-1] + enScores[num-1] + mathScores[num-1];
		}
		//평균
		int[] scoreAverages = new int[5];	//배열 초기화
		for(int num : nums) {	//연번을 인덱스로 사용하여 총점수를 과목수로 나누어 입력
			scoreAverages[num-1] = scoreSums[num-1] / 3;
		}
		
		// 학점 구하기
		char[] ratings = new char[5];
		for(int num : nums) {
				if(scoreAverages[num-1] <0 || scoreAverages[num-1] >100) //큰 조건(0~100 바깥)부터 걸러내기
					ratings[num-1] = '?';
				else if (scoreAverages[num-1] <=60)	//점수 분포가 균등하다고 가정했을 때, 그 다음 큰조건 
					ratings[num-1] = 'F';
				else if (scoreAverages[num-1] <=70)
					ratings[num-1] = 'D';
				else if (scoreAverages[num-1] <=80)
					ratings[num-1] = 'C';
				else if (scoreAverages[num-1] <=90)
					ratings[num-1] = 'B';
				else
					ratings[num-1] = 'A';
		}
		
		// 학점 출력하기
		for(int num : nums) {
			System.out.printf("%s의 국어점수는 %d, 영어점수는 %d, 수학점수는 %d이고, 최종 학점은 %c입니다.%n",names[num-1],krScores[num-1],enScores[num-1],mathScores[num-1],ratings[num-1]);
		}
	}
}

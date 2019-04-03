package HomeWorkReview;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 17.232354;
		
		//소수점아래 2개 표시
		System.out.println((int)(a * 100) / 100.);
		
		
		//scanner 호출
		Scanner stdIn = new Scanner(System.in);
		int num; 
		num = stdIn.nextInt();
		stdIn.close();
				

	}

}
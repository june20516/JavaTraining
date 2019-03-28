import java.util.*;

public class profile {

	public static void main(String[] args) {
		
		//name 초기화
		String name = "LEE Jun ho"; 
		
		// age 초기화
		int age;
		
		// 오늘 날짜 생성
		Calendar today = new GregorianCalendar();
		// 생일 날짜 생성
		Calendar birthDay = new GregorianCalendar(1989, 4, 21);
		
		/* 
		 * 방법1 
		 * 밀리초단위로 계산 후 연단위로 환산
		 */
		long lifeTime = (today.getTimeInMillis() - birthDay.getTimeInMillis()) / (1000); // (오늘-생일)*1000
		age = (int)(lifeTime / (3600*24*365));
		
		/*
		 * 방법2 
		 * get 메소드로 년도만 가져오기
		 */
		int nowYear = today.get(Calendar.YEAR);
		int birthYear = birthDay.get(Calendar.YEAR);
		int age2 = nowYear - birthYear;
		
		// 출력
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Age2 : " + age2);
	}

}

package homework28;

import java.util.GregorianCalendar;
import java.util.Scanner;

//문제 : 이름,생년월일을 이용해 나이구하기
//GregorianCalendar이용
//클래스 이용
public class Problem01 {
	// 변수선언
	private String birthStr; // 생일str
	private GregorianCalendar birthDay = new GregorianCalendar(); // 생일 gc
	private int birthDayYear;
	private int birthDayMonth;
	private int birthDayDate;
	private GregorianCalendar toDay = new GregorianCalendar(); // 오늘
	private int toDayYear = toDay.get(GregorianCalendar.YEAR);
	private int toDayMonth = toDay.get(GregorianCalendar.MONTH)+1;
	private int toDayDate = toDay.get(GregorianCalendar.DATE);
	private int age;// 나이
	
	// 데이터 입력
	public void setData() {
		// 생년월일을 키보드로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일입력yyyy.MM.dd : ");
		birthStr = sc.next();
		sc.close();
	}

	// 나이 계산
	public void calcProc() {
		setBirthDayToCalendars(); // 입력값 텍스트를 gregorian calendar로 만들어줌
		age = toDayYear - birthDayYear;	// 오늘년도에서 생일년도 빼서 age
		this.checkAge(); // 생일이 지났으면 +1을 더해줌
	}

	private void setBirthDayToCalendars() {
		String[] birthYMD = birthStr.split("\\."); // .으로 구분해서 나눔
		birthDayYear = Integer.parseInt(birthYMD[0]);
		birthDayMonth = Integer.parseInt(birthYMD[1]);
		birthDayDate = Integer.parseInt(birthYMD[2]);
		birthDay.set(birthDayYear, birthDayMonth-1, birthDayDate);
	}

	private void checkAge() {
		// 각 날짜를 MMdd인 int형태로 만들어서 크기비교
		int birthDayKey = birthDayMonth * 100 + birthDayDate;
		int toDayKey = toDayMonth * 100 + toDayDate;
		if (birthDayKey >= toDayKey)
			age++;
	}

	public String toString() {
		return String.format("오늘 : %d년 %2d월 %2d일\n나이 : %d",toDayYear,toDayMonth,toDayDate,age);
	}
}

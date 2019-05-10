package datetest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class MyDate {
	public static void main(String[] args) {
		long l = System.currentTimeMillis();
		System.out.println(l);

		Date date = new Date(l);
		System.out.println(date);

		
		System.out.println(GregorianCalendar.DAY_OF_YEAR);
		GregorianCalendar gc1 = new GregorianCalendar();
		System.out.println(gc1.get(GregorianCalendar.YEAR));
		GregorianCalendar gc2 = new GregorianCalendar(1989,3,21);
		System.out.println(gc1.get(GregorianCalendar.YEAR));
		
		//locale 을 설정해보는 그레고리안
		Locale locale = new Locale("Japanese");
		GregorianCalendar gc3 = new GregorianCalendar(locale);
		System.out.println(gc3);
		
		//timezone을 체코로 설정해보는 그레고리안
		TimeZone cze = TimeZone.getTimeZone("Europe/Prague");
		String[] tzIDs = TimeZone.getAvailableIDs();
		for(String tzID : tzIDs) {			
			System.out.println(tzID);
		}
		GregorianCalendar gc4 = new GregorianCalendar(cze);
		System.out.println(gc4);
		System.out.println(gc4.getTimeZone().getID());
		
		//==================================================================
		//날짜를 예쁘게 표시해주는 기능
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(df.format(new Date()));
		
		//예쁘게 표시해주는 기능들을 모아놓은 것
		Formatter formatter = new Formatter();
		
		
//		int year = 2011;
//		for (int i = 0; i < 100; i++) {
//			year++;
//		System.out.println("handMade:	" + checkLeapYear(year) + " (Year : "+ year + ")");
//		System.out.println("greg method:	" + new GregorianCalendar().isLeapYear(year) + " (Year : "+ year + ")");
//		}
	}
	
	public static boolean checkLeapYear(int year) {
		if(year%4 ==0 && year%100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}

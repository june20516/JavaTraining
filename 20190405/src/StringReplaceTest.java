import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class StringReplaceTest {
	public static void main(String[] args) {
		

		GregorianCalendar oneDay = new GregorianCalendar(2019,GregorianCalendar.APRIL,21);

	    Date oneDate = oneDay.getTime();
	    System.out.println(oneDay.get(GregorianCalendar.MONTH));
	    System.out.println(oneDate);

	    TimeZone tz = TimeZone.getTimeZone("America/New_York");

	    SimpleDateFormat df = new SimpleDateFormat("yyyyMMMdd", new Locale("en", "us"));
	    df.setTimeZone(tz);
	    System.out.println(df.format(oneDate));

	    
	    
	    
		Calc spc = new SubCalc();
		SubCalc sbc = new SubCalc();
		
		if (spc instanceof Calc) {
			System.out.println("spc�� Calc");
		} else {
			System.out.println("spc�� Calc �ƴ�");
		}
		
		if (spc instanceof SubCalc) {
			System.out.println("spc�� SubCalc");
		} else {
			System.out.println("spc�� SubCalc �ƴ�");
		}
		
		
		if (sbc instanceof Calc) {
			System.out.println("sbc�� Calc");
		} else {
			System.out.println("sbc�� Calc �ƴ�");
		}
		
		if (sbc instanceof SubCalc) {
			System.out.println("sbc�� SubCalc");
		} else {
			System.out.println("sbc�� SubCalc �ƴ�");
		}
		
		System.out.println(spc.getClass().getName());
		System.out.println(sbc.getClass().getName());
	
	}

}
package param;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bar {
	private GregorianCalendar toDay = new GregorianCalendar();
	private SimpleDateFormat printForm = new SimpleDateFormat("YY.MM.dd");
	public void currentDate() {
		System.out.println(printForm.format(toDay.getTime()));
	}
}

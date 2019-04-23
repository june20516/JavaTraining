package enumtest;

class WeekDayConstants {
	static public final	 int SUNDAY = 1;
	static public final	 int MONDAY = 2;
	static public final	 int TUESDAY = 3;
	static public final	 int WEDNESDAY = 4;
	static public final	 int THURSDAY = 5;
	static public final	 int FRIDAY = 6;
	static public final	 int SATURDAY = 7;
}

enum WeekDay{
	 MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class Test1 {
	public static String getJob(WeekDay weekDay) {
		if (weekDay == WeekDay.SUNDAY || weekDay == WeekDay.SATURDAY) {
			return " 쉬는날";
		}
		return " 일해라";
	}

	public static String getJob(int weekDayNum) {
		if (weekDayNum == WeekDayConstants.SUNDAY || weekDayNum == WeekDayConstants.SATURDAY) {
			return " 쉬는날";
		}
		return " 일해라";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String classStr = getJob(WeekDayConstants.THURSDAY);
		String enumStr = getJob(WeekDay.SUNDAY);

		System.out.println(WeekDayConstants.THURSDAY + classStr);
		System.out.println(WeekDay.SUNDAY + enumStr);
		
		WeekDay enumSwitchKey = WeekDay.MONDAY;
		
		switch (enumSwitchKey) {
//		case MONDAY: System.out.println("일해");
//		case TUESDAY:
		case WEDNESDAY:
			System.out.println(enumSwitchKey + " 노야근데이");
			break;
//		case THURSDAY:
//		case FRIDAY:
		case SATURDAY:
			System.out.println(enumSwitchKey + " 노는날");
			break;
		case SUNDAY:
			System.out.println(enumSwitchKey + " 노는날");
			break;
		default:
			System.out.println(enumSwitchKey + " 일해라");
			break;
		}
		
		for(WeekDay day : WeekDay.values()) {
			System.out.println(day + " | name : " + day.name() + " | ordinal : "  + day.ordinal());
			
		}
	}
}

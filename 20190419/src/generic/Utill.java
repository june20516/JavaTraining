package generic;

public class Utill {
	
	public static <T extends Number> int compare1(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
	public static <T> int compare2(T t1, T t2) {
		return 0;
	}
}

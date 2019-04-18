package sortdebug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(10, 20));
		pointList.add(new Point(30, 10));
		pointList.add(new Point(30, 90));
		Collections.sort(pointList);
		System.out.println(pointList);
	}
}

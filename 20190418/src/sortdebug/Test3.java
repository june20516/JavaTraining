package sortdebug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Test3 {
	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(10, 20));
		pointList.add(new Point(30, 10));
		pointList.add(new Point(30, 90));
		Collections.sort(pointList);
		System.out.println(pointList);

		Comparator<Point> comparator = new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o2.y - o1.y;
			}
		};
		Collections.sort(pointList, comparator);
		System.out.println(pointList);

		Iterator<Point> it = pointList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
	}
}

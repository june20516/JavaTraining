import java.util.ArrayList;
import java.util.List;

public class ArrayT {
	//1
	static Integer a;
	static Integer b;
	static Integer c;
	static Integer d;
	static Integer[] arr = {a,b,c,d};
	
	
	
	static int e;
	static int f;
	static int g;
	static int h;
	static int[] arrr = {e,f,g,h};
	
	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(a);
//		list.add(b);
//		list.add(c);
//		list.add(d);
		
//2
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		
	//3	
		for (Integer ar : arr) {
			System.out.println(ar);
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println(a);
		
		e = 1;
		f = 1;
		g = 1;
		h = 1;
		
		for (int ar : arrr) {
			System.out.println(ar);
		}
		
	}

}

package annotationdemo;

import java.util.ArrayList;
import java.util.List;

public class Example {
	// We are not using @SafeVarargs annotation - Java 9
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SafeVarargs
	private final void print(List... names) {
		for(List<String> name : names) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Example obj = new Example();
		List<String> list = new ArrayList<String>();
		obj.print(list);
		list.add("D");
		list.add("K");  
		list.add("B");
		list.add("J");
		
		obj.print(list);
	}

}

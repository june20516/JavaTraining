package page160;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListSizeCapacityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> stringsVector = new Vector<String>();
		System.out.println(stringsVector.capacity());
		System.out.println(stringsVector.size());
		List<String> stringsList = new ArrayList<String>();
		System.out.println(stringsList.size());
		
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		stringsVector.add("1");
		System.out.println(stringsVector.capacity());
		System.out.println(stringsVector.size());
		System.out.println(stringsVector.isEmpty());
		
		stringsVector.clear();
		System.out.println(stringsVector.capacity());	//20 //capacity는 줄어들지 않음
		System.out.println(stringsVector.size());
		System.out.println(stringsVector.isEmpty());
		
		stringsVector.trimToSize();
		System.out.println(stringsVector.capacity());	//0 //trimmToSize가 빈 공간을 제거
		System.out.println(stringsVector.size());
		System.out.println(stringsVector.isEmpty());
		
	}

}

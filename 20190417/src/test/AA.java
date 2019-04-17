package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AA implements Comparable<AA> {
	int id;
	String name;
	
	public AA(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AA [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(AA o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
//		return this.name.compareTo(o.name);
	}
	
	public static void main(String[] args) {
		AA aa = new AA(1,"정동원");
		AA ab = new AA(2,"최창국");
		AA ac = new AA(3,"이준호");
		AA ad = new AA(4,"권재범");
		
		ArrayList<AA> aaList = new ArrayList<AA>();
		
		aaList.add(ac);
		aaList.add(aa);
		aaList.add(ab);
		aaList.add(ad);
		
		for(AA a : aaList) {
		System.out.println(a);
		}
		Collections.sort(aaList);
		
		for(AA a : aaList) {
			System.out.println(a);
		}
		
		
		//merge sort , insertion sort,quick sort 조사해오기
		//성적 석차 구하는부분에 compareTo 적용해보자 
		//generic : 제한된 타입 파라미터 
		
	}
}

package main;

import java.util.ArrayList;

import generic.GenericTypeClass;
import param.Bar;

public class Use1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		GenericTypeClass<Bar> gtc1 = new GenericTypeClass<Bar>(Bar.class);	//class 정보만 arg로 넘겨
		GenericTypeClass<Bar> gtc2 = new GenericTypeClass<Bar>(new Bar());
		
		gtc1.getT().currentDate();
		gtc2.getT().currentDate();
		Bar[] bars = gtc1.getTs();
		System.out.println(bars);
		
		ArrayList<? super String> arr = new ArrayList<Object>();

		
	}

}

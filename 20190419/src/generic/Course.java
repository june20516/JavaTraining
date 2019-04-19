package generic;

import java.util.ArrayList;

public class Course<T> {

//	private T[] students = new T[4]; //에러 발생
	private T[] students =(T[]) new Object[4]; //ClassCastException 발생 가능
	
	
//	Object[] arr = new String[3];	//정상 생성됨 
//	ArrayList<Object> list = new ArrayList<String>();	//에러 발생 
	
}


package generic;

import java.lang.reflect.Array;

public class GenericTypeClass<T> {
	private T t ;
	private T[] ts;
	private int capacity=10;
	
	public GenericTypeClass(Class<T> tclass) throws InstantiationException, IllegalAccessException {	//클래스의 정보만 넘겨줌 
		t = (T) tclass.newInstance();
		ts = (T[])Array.newInstance(tclass, capacity);
	}
	
	public GenericTypeClass(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	public T[] getTs() {
		return ts;
	}
	
	public void setT(T t) {
		this.t = t;
		
	}
}

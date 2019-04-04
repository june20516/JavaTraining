package sub;

import inheritance.SuperClass;

public class ChildSuperClass extends SuperClass {
	
	@Override
	public String toString() {
		return "ChildSuperClass [x=" + x + ", y=" + y+"]";
	}

	public void output() {
		System.out.println(x+"  "+y);
		System.out.println(getPw());
		System.out.println("spx " + spx);
	}
	
	
}

package enumtest;

import java.lang.reflect.Method;

public class ClassClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class class1 = Sex.class;
		String className = class1.getName();
		System.out.println(className);

		String path = class1.getCanonicalName();
		System.out.println(path);

		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		boolean anony = class1.isAnonymousClass();
		boolean enu = class1.isEnum();
		
		System.out.println("isAnonymousClass : "+anony + " isEnum : "+ enu);
		try {
			Class.forName("java.util.Date").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

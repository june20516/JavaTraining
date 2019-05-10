package anno.customanno;

import java.lang.reflect.Field;

public class InsertDataAnnotationHandler {
	public static <T> void process(T targetObj) {
		Field[] fields = targetObj.getClass().getDeclaredFields();
		if (fields != null && fields.length != 0) {
			InsertIntData annotation;
			for (Field field : fields) {
				System.out.println(field);
				annotation = field.getAnnotation(InsertIntData.class);
				if (annotation != null && field.getType() == int.class) {
					field.setAccessible(true);
					try {
						field.set(targetObj, annotation.data());
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}


/*
 * did u get my message one I left
 * while i was trying to convince everything that i meant
 * now the moment is passed, not much sand ind the glass
 * and im standing to lose my mind
 * 
 * do you ever wonder what happened to the words that we sent
 * do they bend, do they break from the flight that they take,
 * and come back together again with a whole new meaning to the matter of our loves defense, atLeast be sympathetic to the time i spent
 * 
 * did you get my message
 * 
 * did you get my message
 * 
 * did youget my message
 * 
 * 
 * 
 */
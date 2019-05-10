package anno;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

/*
 * value의 의미 : AnnoColor를 repeatable하게 사용하면, AnnoColors에서 받아줄 것이다.
 * repeatable에 들어가는 value에는 container형을 가진 value()라는 이름의 method를 가지고 있는 
 * Annotation의 클래스 정보가 와야한다. 
 */

@Repeatable(value = AnnoColors.class)
@Retention(RUNTIME)
public @interface AnnoColor {
	String value();
}

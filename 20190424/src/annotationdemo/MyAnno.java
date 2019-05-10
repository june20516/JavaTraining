package annotationdemo;

public @interface MyAnno {

	//Element 'name'
	public String name();
	
	//Element 'description',default value is "".
	public String description() default "";
	
}

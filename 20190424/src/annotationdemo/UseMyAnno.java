package annotationdemo;

@MyAnno(name = "Some name", description = "Some description")
public class UseMyAnno {
	//Annotation is annotated on a Constructor.
	//The value of the element 'name' is "Bran"
	//The value element 'description' is "Write by Bran"
	private String val1;
	private String val2;
	
	
	@MyAnno(name = "Bran",description = "Write by Bran")
	public UseMyAnno() {
		System.out.println(val1 + "  " + val2);
	}
	
	@MyAnno(name = "Bran")
	public void someMethod() {
		
	}
	
	public void todo(@MyAnno(name = "none") String job) {
		@MyAnno(name = "Some name")
		int localVar = 0;
	}
	public static void main(String[] args) {
		UseMyAnno aa = new UseMyAnno();
		aa.todo("coding");
	}
}

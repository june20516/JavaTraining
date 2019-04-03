package cons;

public class ConstructorDemo {

	//member field (instance property)
	private String name;
	private int speed;
	
	//class field
	private static int wheels;
	
	
	//member method
	public ConstructorDemo() {
		wheels = 4;
	}
	
	public ConstructorDemo(String name) {
		this();
		this.setName(name);
	}
	
	public ConstructorDemo(String name, int speed) {
		this(name);
		this.setSpeed(speed);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isFasterThan(ConstructorDemo someCar) {
		return this.speed >= someCar.getSpeed();
	}
	
	public void output() {
		System.out.printf("%s, %d",name,speed);
	}
	

}

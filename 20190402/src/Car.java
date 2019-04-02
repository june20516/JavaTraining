
public class Car {

	//member field (instance property)
	private String name;
	private int speed;
	
	//class field
	private static final int wheels = 4;
	
	
	//member method
	public Car() {};
	
	public Car(String name, int speed) {
		this.setName(name);
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
	
	public boolean isFasterThan(Car someCar) {
		return this.speed >= someCar.getSpeed();
	}
	
	public void output() {
		System.out.printf("%s, %d",name,speed);
	}
	
}

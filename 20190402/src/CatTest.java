import java.util.Date;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		Car hisCar = new Car("unicorn",888);
		
		myCar.output();
		
		myCar.setName("emma");
		myCar.setSpeed(280);
		
		yourCar.setName("donkey");
		yourCar.setSpeed(180);
		
		System.out.println(yourCar.getSpeed());
		
		System.out.println(yourCar.isFasterThan(myCar));
		
		hisCar.output();
		
		Date today = new Date();
	}

}
package override;

import java.io.IOException;

public class Use1 {

	public static void main(String[] args) {
		Animal animal = new Dog("charlie");
		try {
			animal.crySound(123);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Dog animal2 = new Dog("jerry");

		try {
			animal2.crySound(456);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package page160;

import java.util.ArrayList;
import java.util.List;

import override.Dog;

public class ArrayListTest1 {
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("Authmn"));
		dogList.add(new Dog("Timbo"));
		dogList.add(new Dog("Cupie"));
		dogList.add(new Dog("Bugler"));
		dogList.add(new Dog("Ben"));

		for(int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).crySound());
		}
		
		for(Dog dog : dogList) {
			System.out.println(dog.crySound());
		}
	}
}

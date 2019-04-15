package page160;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import override.Dog;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Hachi"));
		dogs.add(new Dog("Apple"));
		dogs.add(new Dog("Bongu"));
		dogs.add(new Dog("Chen"));
		dogs.get(0).crySound();
		
		
		Map<String, Dog> dogMap = new HashMap<String, Dog>();	
		dogMap.put("Cupie", new Dog("Cupie"));
		dogMap.put("Duran", new Dog("Duran"));
		dogMap.put("Ikea", new Dog("Ikea"));
		dogMap.put("Ekko", new Dog("Ekko"));
		dogMap.put("Foul", new Dog("Foul"));
		dogMap.put("George", new Dog("George"));
		dogMap.get("George").crySound();
//		dogMap.put("Ikea",null);	// null 사용 가능
		
		Map<String, Dog> dogMap2 = new Hashtable<String, Dog>();
		dogMap2.put("Cupie",new Dog("Cupie"));
		dogMap2.put("Duran",new Dog("Duran"));
		dogMap2.put("Ikea",new Dog("Ikea"));
		dogMap2.put("Ekko",new Dog("Ekko"));
		dogMap2.put("Foul",new Dog("Foul"));
		dogMap2.put("George",new Dog("George"));
		dogMap2.get("Cupie").crySound();
//		dogMap2.put(null,null);	// NullPointerException!
		
		System.out.println("values : \n");
		for(Dog dog:dogMap.values()) {
			System.out.println(dog.crySound());
		}
		
		System.out.println("\n\niterator : \n");
		Set<String> dogKey = dogMap2.keySet();
		Iterator<String> iterator = dogKey.iterator();
		while(iterator.hasNext()) {
			System.out.println(dogMap2.get(iterator.next()).crySound());
		}
		
		System.out.println("\n\nkeys : \n");
		for(String key:dogMap.keySet()) {
			System.out.println(dogMap.get(key).crySound());
		}
		
		
		
	}

}

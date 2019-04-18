package generics;

import java.awt.geom.Area;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList beverageList = new ArrayList();
		beverageList.add(new CaffeinatedMB("Americano", 2000));
		beverageList.add(new CaffeinatedMB("Cafe Latte", 2500));
		beverageList.add(new CaffeinatedMB("Einspänner", 3500));
		beverageList.add(new NonMadeBeverage("evian", 2300));
		beverageList.add(new NonMadeBeverage("Perrie", 2300));
		beverageList.add(new CaffeinlessMB("Lemonade", 3200));
		beverageList.add(new CaffeinlessMB("Kiwi Smoothie", 3500));
	
		int value;
		for(int i = 0; i<beverageList.size(); i++) {
			Object obj = beverageList.get(i);
			if(obj!=null) {
				if(obj instanceof CaffeinatedMB) {
					System.out.println(((CaffeinatedMB) obj).getName() + "Manufacturing Beverage including caffeine");
				}else {
					System.out.println("I don't like it");
				}
			}
		}
		
		ArrayList<ManufacturingBeverage> beverageList2 = new ArrayList<>();
		beverageList2.add(new CaffeinatedMB("Americano", 2000));
		beverageList2.add(new CaffeinatedMB("Cafe Latte", 2500));
		beverageList2.add(new CaffeinatedMB("Einspänner", 3500));
//		beverageList2.add(new NonMadeBeverage("evian", 2300));
//		beverageList2.add(new NonMadeBeverage("Perrie", 2300));
		beverageList2.add(new CaffeinlessMB("Lemonade", 3200));
		beverageList2.add(new CaffeinlessMB("Kiwi Smoothie", 3500));
		
		for(int i = 0; i<beverageList2.size(); i++) {
			ManufacturingBeverage beverage = beverageList2.get(i);
			
				if(beverage instanceof CaffeinatedMB) {
					System.out.println(beverage.getName() + " : Manufacturing Beverage including caffeine");
				}
				if(beverage instanceof CaffeinlessMB) {
					System.out.println(beverage.getName() + " : Manufacturing Beverage has no caffeine");
				}
			}
		}
	
	}
	



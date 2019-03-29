
public class WhileDemo {
	
	public static void main(String[] args) {
		
		int i = 0;
		while (++i < 11) {
			System.out.print(i);
		}
		
		System.out.print("\n");
		
		int j = 1;
		do {
			System.out.print(j++);
		} while (j < 11);
			
	}
}


public class FindRule {
	public static void main(String[] args) {
		int now = 0;
		int inputValue = 14;
		int idx = 0;
		for(int i = 0; now < inputValue; i++) {
			now += i;
			idx = i;
		}
		int head = 1 + (now-inputValue);
		int body = (idx) - ((now-inputValue));
		
		if (idx%2 == 0) {
		System.out.println( body+ "/" + head);
		}
		System.out.println(head + "/" + body);
	}
}

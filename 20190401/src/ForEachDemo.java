
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] kors = {34, 56, 78, 12, 30};
		
		int score;
		int temp;
		for(int i=0; i<kors.length;i++) {
			temp = kors[i];
			score = temp / 10;
			System.out.println(temp + " : " + score);
		}
		
		for(int temp2 : kors) {
			score = temp2 / 10;
			System.out.println(score);
		}
		
			
	}
}
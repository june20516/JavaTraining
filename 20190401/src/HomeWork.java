
public class HomeWork {

	public static void main(String[] args) {
		
		//printf �Ẹ��
		int i = 1;
		char c = 'm';
		String s = "april";
		System.out.printf("%4d%10c%20s%n", i,c,s);
		
		// 1. ���� ���� �Űܺ���
		int no = 1;	//��ȣ
		String name = "Cpt.America";	//�̸�
		int krScore = 30, enScore = 75, mathScore = 50;	//����, ����, ���� ����
		int scoreSum = (krScore + enScore + mathScore);	//������ = 155
		int scoreAverage = scoreSum / 3;	//������� = 51
		char rating;
		//if������ ���� ���ϱ�
		if(scoreAverage <0 || scoreAverage >100) //ū ����(0~100 �ٱ�)���� �ɷ�����
			rating = '?';
		else if (scoreAverage <=60)	//���� ������ �յ��ϴٰ� �������� ��, �� ���� ū���� 
			rating = 'F';
		else if (scoreAverage <=70)
			rating = 'D';
		else if (scoreAverage <=80)
			rating = 'C';
		else if (scoreAverage <=90)
			rating = 'B';
		else
			rating = 'A';
		System.out.println("if ��� : " + rating);
		
		//switch������ ���� ���ϱ�
		switch(scoreAverage/10){	//10�� �ڸ����� Ȯ��
		case(9) : rating = 'A';break;
		case(8) : rating = 'B';break;
		case(7) : rating = 'C';break;
		case(6) : rating = 'D';break;
		default : rating = 'F';break;	 
		}
		System.out.println("switch ���1 : " + rating);
		
		/*
		 * F�� ������ 0~6������ ����Ʈ�� �ϰ� ����, 0~100�̿��� ������ '?'�� ����� ����� �𸣰ڴ�.
		 */
		
		switch(scoreAverage/10){	//10�� �ڸ����� Ȯ��
		case(9) : rating = 'A';break;
		case(8) : rating = 'B';break;
		case(7) : rating = 'C';break;
		case(6) : rating = 'D';break;
		case(5) : 
		case(4) : 
		case(3) : 
		case(2) : 
		case(1) : 
		case(0) : 
			rating = 'F';break;	// default�� ?�� ������ �ֱ� ����, F ������ ���̽��� ����
		default : rating = '?';break;
		}
		System.out.println("switch ���2 : " + rating);
		
		
		
		
		// 2. �������� ������ �Űܺ���
		int[] nums = {1,2,3,4,5};	//����
		String[] names = {"Cpt.America","BlackWidow","PeterParker","Hulk","IronMan"};	//�̸�
		int[] krScores = {30, 95, 77, 12, 70};	//��������
		int[] enScores = {75, 100, 94, 35, 85};	//��������
		int[] mathScores = {50, 80, 70, 9, 100};	//��������
		//������
		int[] scoreSums = new int[5];	//�迭 �ʱ�ȭ
		for(int num : nums) {	//������ �ε����� ����Ͽ� �� ���ھ ������ ������ �迭�� �Է�
			scoreSums[num-1] = krScores[num-1] + enScores[num-1] + mathScores[num-1];
		}
		//���
		int[] scoreAverages = new int[5];	//�迭 �ʱ�ȭ
		for(int num : nums) {	//������ �ε����� ����Ͽ� �������� ������� ������ �Է�
			scoreAverages[num-1] = scoreSums[num-1] / 3;
		}
		
		// ���� ���ϱ�
		char[] ratings = new char[5];
		for(int num : nums) {
				if(scoreAverages[num-1] <0 || scoreAverages[num-1] >100) //ū ����(0~100 �ٱ�)���� �ɷ�����
					ratings[num-1] = '?';
				else if (scoreAverages[num-1] <=60)	//���� ������ �յ��ϴٰ� �������� ��, �� ���� ū���� 
					ratings[num-1] = 'F';
				else if (scoreAverages[num-1] <=70)
					ratings[num-1] = 'D';
				else if (scoreAverages[num-1] <=80)
					ratings[num-1] = 'C';
				else if (scoreAverages[num-1] <=90)
					ratings[num-1] = 'B';
				else
					ratings[num-1] = 'A';
		}
		
		// ���� ����ϱ�
		for(int num : nums) {
			System.out.printf("%s�� ���������� %d, ���������� %d, ���������� %d�̰�, ���� ������ %c�Դϴ�.%n",
					names[num-1],krScores[num-1],enScores[num-1],mathScores[num-1],ratings[num-1]);
		}
	}
}

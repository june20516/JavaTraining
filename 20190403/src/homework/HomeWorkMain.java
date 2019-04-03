package homework;

public class HomeWorkMain {

	public static void main(String[] args) {

		//1. 등급 - 점수가 0~100을 벗어났을 때 다시 입력받기
		Grade student = new Grade();
		student.setValues();
		student.calculateScores();
		student.outputGrade();
		
		
		
		//2. 적금 - 계좌번호 생성
		String[] clientNames = {"Amy", "Bran", "Chloe"};	//고객 이름 명단
		InstallmentSaving[] clientDatas = new InstallmentSaving[clientNames.length];	//고객 정보 저장할 배열
		
		for(int idx = 0; idx<clientNames.length; idx++) {
		InstallmentSaving client = new InstallmentSaving(clientNames[idx]);
		client.inputDatas();
		client.calculateRefundAmount();
		client.output();
		clientDatas[idx] = client; 
		
		}
		
	}

}

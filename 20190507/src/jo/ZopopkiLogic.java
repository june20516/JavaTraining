package jo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZopopkiLogic {
	Scanner input = new Scanner(System.in);

	// 전체 학생
	List<Student> allStudents = new ArrayList<Student>();
	List<Student> zoZzangs = new ArrayList<Student>();
	List<Student> zoOnes = new ArrayList<Student>();
	
	
	
	public List<Student> getAllStudents() {
		return allStudents;
	}

	public List<Student> getZoZzangs() {
		return zoZzangs;
	}

	public List<Student> getZoOnes() {
		return zoOnes;
	}

	public ZopopkiLogic() {
		inputStudents();
		selectZoZzang();
		setRandomZoNum();
		allStudents.addAll(zoZzangs);
		allStudents.addAll(zoOnes);
	}

	// 학생 이름을 입력하세요
	public void inputStudents() {
		String name = "";
		while (true) {
			System.out.println("학생 이름을 알려주세요. \n 입력이 끝나면 q를 써주세요.");
			name = input.next().trim();
			if (name.equals("q")) {
				break;
			} else {
				allStudents.add(new Student(name));
			}
		}
	}
	
	private void printStudents(List<Student> students) {
		int idx = 0;
		for (Student student : students) {
			System.out.println(idx++ + ". : " + student.getName());
		}
	}
	
	public void selectZoZzang() {
		int totalStudentCount = allStudents.size();
		int zoCount = -1;
		//조 개수 입력받기
		System.out.println("몇개의 조로 나누실건가요? (" + totalStudentCount + " 개 이하)");
		do {
			zoCount = input.nextInt();
		} while(zoCount>totalStudentCount || zoCount<=0);
		//조장 할사람 정하기
		List<Integer> selectedIDs = new ArrayList<Integer>();
		printStudents(allStudents);
		for(int i = 0; i<zoCount; i++) {
			System.out.println("조장이 될 학생의 번호를 알려주세요.	( "+ (zoCount-i) +" 명 남았어요.)");
			selectedIDs.add(input.nextInt());
		}
		int i = 0;
		//조장들 조를 랜덤 조로 결정
		while(selectedIDs.size()!=0) {
			int randomIdx = (int)(Math.random() * selectedIDs.size());
			Student zoZzang = allStudents.get((int)selectedIDs.remove(randomIdx));
			zoZzang.setZoZzang(true);
			zoZzang.setZoNum(++i);
			System.out.println("조장됨 : " + zoZzang);
			zoZzangs.add(zoZzang);
		}
		//조장 제거
		for(int studentIdx = 0; studentIdx<allStudents.size(); studentIdx++) {
			if (allStudents.get(studentIdx).isZoZzang()) {
				System.out.println("제거됨 : "+studentIdx);
				allStudents.remove(studentIdx);
				studentIdx =- 1;
			}
		}
	}
	
	private void setRandomZoNum() {
		int zoCount = zoZzangs.size();
		while (true) {
			for (int i = 0; i < zoCount; i++) {
				if (allStudents.isEmpty()) return;
				Student candet = allStudents.remove((int) (Math.random() * allStudents.size()));
				candet.setZoNum(i + 1);
				zoOnes.add(candet);
			}
		}
	}
}

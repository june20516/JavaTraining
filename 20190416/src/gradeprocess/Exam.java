package gradeprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam {
	Scanner keyIn = new Scanner(System.in);
	//시험이름
	String name;
	//응시자
	private ArrayList<Student> candidates = new ArrayList<Student>();
	//과목
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	//resultDB
	private Map<String,PersonalScore> examResultData = new HashMap<String, PersonalScore>();
	
	public Exam(String name) {
		this.name = name;
	}
	
	//setter
	public void setSubjects(String subject) {
			this.subjects.add(new Subject(subject));
	}	
	public void setCandidate(Student student) {
		candidates.add(student);
	}
	
	//getter
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public ArrayList<Student> getCandidates() {
		return candidates;
	}
	
	//시험데이터 구축
	public void buildExamResult(ArrayList<Student> candidates) {
		for(Student candidate : this.candidates) {
			examResultData.put(candidate.studentID, candidate.examResult);
		}
	}
	
	
	@Override
	public String toString() {
		return String.format("Exam : %s  \n [candidates=%s, subjects=%s]",name, candidates, subjects);
	}
	
	
	
	
}

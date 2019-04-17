package gradeprocess;

public class Subject {
	
	String name;
	private int score;
	
	public Subject(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

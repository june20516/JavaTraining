package enumtest;

public enum Enum1 {
	A('a',100),B('b',80),C('c',60);
	
	private char label;
	private int score;
	
	private Enum1(char label, int score) {
		this.label = label;
		this.score = score;
	}

	public char getLabel() {
		return label;
	}
	public int getScore() {
		return score;
	}
	
	public void setLabel(char label) {
		this.label = label;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

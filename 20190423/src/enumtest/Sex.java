package enumtest;

public enum Sex {
	남자('M',"Male","Man"),여자('F',"Female","Woman");
	
	private char code;
	private String stdWord;
	private String engWord;	//갯수제한이 없는듯?
	
	
	public char getCode() {
		return code;
	}

	public static Sex search(char code) {
		for (Sex gender : values()) {
			switch(code - gender.getCode()) {
			case 0 :
			case 32 : return gender;
			}
		}
		return null;
	}
	
	public static Sex search(String stdWord) {
		for (Sex gender : values()) {
			if (gender.getStdWord().equalsIgnoreCase(stdWord))
				return gender;
		}
		return null;
	}

	public void setCode(char code) {
		this.code = code;
	}


	public String getStdWord() {
		return stdWord;
	}


	public void setStdWord(String stdWord) {
		this.stdWord = stdWord;
	}


	public String getEngWord() {
		return engWord;
	}


	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}


	private Sex(char code, String name, String engWord) {
		this.code = code;
		this.stdWord = name;
		this.engWord = engWord;
	}
	
	
}

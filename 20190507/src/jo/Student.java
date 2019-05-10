package jo;

public class Student {
	
	private boolean isZoZzang = false;
	
	private String name;
	
	private int zoNum;
	
	
	public Student(String name) {
		this.name = name;
	}
	

	public Student(boolean isZoZzang, String name, int zoNum) {
		this.isZoZzang = isZoZzang;
		this.name = name;
		this.zoNum = zoNum;
	}

	public boolean isZoZzang() {
		return isZoZzang;
	}

	public void setZoZzang(boolean isZoZzang) {
		this.isZoZzang = isZoZzang;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZoNum() {
		return zoNum;
	}

	public void setZoNum(int zoNum) {
		this.zoNum = zoNum;
	}
	
	@Override
	public String toString() {
		return "Student [isZoZzang=" + isZoZzang + ", name=" + name + ", zoNum=" + zoNum + "]";
	}
		
}

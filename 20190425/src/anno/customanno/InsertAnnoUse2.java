package anno.customanno;

public class InsertAnnoUse2 {
	@InsertIntData(data = 40)
	private int x;
	
	@InsertIntData(data = 25)
	private int y;
	
	private int noUseAnno;
	
	public InsertAnnoUse2() {
		this.x = -1;
		this.y = -1;
		this.noUseAnno = -1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getNoUseAnno() {
		return noUseAnno;
	}

	@Override
	public String toString() {
		return "InsertAnnoUse2 [x=" + x + ", y=" + y + ", noUseAnno=" + noUseAnno + "]";
	}
}

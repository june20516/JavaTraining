
public class Calc {
	
	    int left, right;
	 
	    public void setOprands(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }
	 
	    public void sum() {
	        System.out.println(this.left + this.right);
	    }
	 
	    public int avg() {
	        return ((this.left + this.right) / 2);
	    }

	}
	 

	class SubCalc extends Calc {
	     
	    public void sum() {
	        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
	    }
	    
	    
	    public void substract() {
	        System.out.println(this.left - this.right);
	    }
	}
	 
	



package outerclassdemo;

public class OutA {
	public int getX() {
		return x;
	}	
	public void setX(int x) {
		this.x = x;
	}
	private int x;
	public void output() {
		System.out.println(x);
	}
	class ParasClass {
		public void paraMethed() {
			x = 99;
			int localVairable = x * 23;
		}
	}
}
class DefaultAccessModifierNoInnerSubofOutAclass extends OutA {
	public void mm() {
		//super.x = 99;
		super.setX(99); setX(99);
//		int localVariable = x * 23;
		int localVariable = getX() * 23;
	}
}
			class DefaultAccessModifierNoInnerClass{
				public void m() {
					//x = 90;
					OutA ref = new OutA();
					//ref.x = 90;
					ref.setX(90);
//					int localVariable = ref.x*23;
					int localVariable = ref.getX() * 23;
//					output();
					ref.output();
				}
			}
		
	


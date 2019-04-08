package gene;

public class Super {
	public void m1() {	}
	protected void m2() {	}
	private void m4() {	}
}


class SubSuper extends Super{
	protected void m2() {	}
	
}
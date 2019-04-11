package innerclassdemo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test {
	
	public class A {}
	protected class B{}
	class C {}
	private class D{
		private int a = 3;
		Test t = new Test();
		private int b = t.a + 1;
	}
	
	D d = new D();
	private int a = d.a + 2;
	static class S{}
	private MyWindowListnerImple wl2 = new MyWindowListnerImple();
	private class MyWindowListnerImple implements WindowListener{
		
		private Object ob1 = new Object() {
			
		};

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}	
}

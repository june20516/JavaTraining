package innerclassdemo;

public class Use1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test ref = new Test();
//		Test.A ref1 = new Test().new A();	//A가 static하지 않으므로 인스턴스를 통해 초기화 해야함
//		Test.B ref2;
//		Test.S ref3 = new Test.S();	//static 하므로 직접 초기화가능
		
		MyFrame3 myFrame3 = new MyFrame3("Pink");
		myFrame3.setVisible(true);
		
//		MyFrame myFrame = new MyFrame("Magenta");
//		myFrame.setVisible(true);
//		
//		MyFrame4 myFrame4 = new MyFrame4("Cyan");
//		myFrame4.setVisible(true);
	}

}

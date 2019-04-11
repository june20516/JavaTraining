package innerclassdemo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * frame 관련 기능, 이벤트 발생 처리 기초클래스 => Frame(class) 상속받아 사용 종료 버튼을 누르면 종료하겠냐 묻고, ok는
 * 종료, cancel버튼은 원래 화면 종료버튼을 누른다 => WindowListner(interface) 종료하겠냐 묻기 =>
 * Dialog(class) ok, cancel 버튼 => Button Class 인스턴스를 만들어 넣어줌 버튼 입력 이벤트 => OK 는
 * dialog 박스 종료 => appliciaton 종료 => Cancel 은 dialog 박스 종료 =>
 * 
 * data를 입력하고 enter입력하면 밑에 출력되도록 한다 텍스트 입력받는 것 => 입력 후 enter 이벤트 => 텍스트 출력하는 장소
 * =>
 * 
 * @author USER
 *
 */

public class MyFrame extends Frame implements WindowListener, ActionListener {
	public MyFrame(String title) {
		super(title);
		init();
	}
	
	
	public void init() {
		/*
		this.setSize(360, 240);
		this.setLocation(600,400);
		set bounds로 size + location 이 된다.*/
	setBounds(100, 200, 300, 300);
	this.setBackground(Color.magenta);
	this.addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

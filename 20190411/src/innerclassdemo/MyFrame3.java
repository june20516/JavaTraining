package innerclassdemo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * frame 관련 기능, 이벤트 발생 처리 기초클래스 => Frame(class) 상속받아 사용 \
 * 종료 버튼을 누르면 종료하겠냐 묻고, ok는 종료, cancel버튼은 원래 화면 종료
 * 		버튼을 누른다 => WindowListner(interface) 
 * 			종료하겠냐 묻기 =>Dialog(class) 
 * 			ok, cancel 버튼 => Button Class 인스턴스를 만들어 넣어줌 
 * 				버튼 입력 이벤트 => OK 는 dialog 박스 종료 => 
 * 				Cancel 은 dialog 박스 종료 =>application 종료
 * 
 * data를 입력하고 enter입력하면 밑에 출력되도록 한다 텍스트 입력받는 것 => 입력 후 enter 이벤트 => 텍스트 출력하는 장소
 * =>
 * 
 * @author USER
 *
 */

public class MyFrame3 extends Frame {
	
	private TextField textInputField;
	private TextArea resultArea;
	private Button enterButton;
	private ActionListener textInputFieldHandler = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			resultArea.append(textInputField.getText()+ "\n\r");
			textInputField.setText("");
		}
	};
	private MouseListener enterButtonHandler = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			resultArea.append(textInputField.getText()+ "\n\r");
			textInputField.setText("");
		}
	};
	
	
	public MyFrame3(String title) {
		super(title);

		init();
	}

	public void init() {
		/*
		 * this.setSize(360, 240); this.setLocation(600,400); set bounds로 size +
		 * location 이 된다.
		 */
		this.addWindowListener(new WindowAdapter() { // 지역 중첩 클래스
			// 필요한 메소드를 override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		this.setBounds(100, 200, 300, 300);
		this.setBackground(Color.PINK);
		textInputField = new TextField("오늘 뭐?");
		resultArea = new TextArea();
		enterButton = new Button("Enter");
		textInputField.addActionListener(textInputFieldHandler);
		enterButton.addMouseListener(enterButtonHandler);
		
		Panel northPane = new Panel();
		northPane.add(textInputField);
		northPane.add(enterButton);
		this.add("North",northPane);
		this.add(resultArea);
		}

	private class ExitYesNoDialog extends Dialog {
		private Button exitYes;
		private Button exitNo;
		public ExitYesNoDialog(Frame owner) {
			super(owner);
			// TODO Auto-generated constructor stub
			exitYes = new Button("Ok");
			exitNo = new Button("Cancel");
			Panel buttonPanel = new Panel(new GridLayout(1,2));
		}
		
	}
	
//	private class WindowClosingEventHandle extends WindowAdapter {
//		
//		@Override
//		public void windowClosing(WindowEvent e) {
//		System.exit(0);
//		}
//	}
}

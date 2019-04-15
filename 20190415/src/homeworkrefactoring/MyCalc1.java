package homeworkrefactoring;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MyCalc1 extends Frame {

	private TextField inputField1;
	private TextField inputField2;

	private Choice opsChoice;

	private Button computeButton;
	private Button clearButton;

	private TextArea resultArea;

	private int left;
	private int right;
	private int result;
	private String operator;

	public MyCalc1(String title) {
		super(title);
		init();
	}
	
	public void init() {

		inputField1 = new TextField("첫 번째 수");
		inputField1.setSize(100, 25);

		inputField2 = new TextField("두 번째 수");
		inputField2.setSize(100, 25);

		opsChoice = new Choice();
		opsChoice.setSize(50, 25);
		String[] operatorsStr = {"","+","-","*","/","%"};
		for (String operator:operatorsStr) {
			opsChoice.add(operator);
		}
		
		computeButton = new Button("=");
		computeButton.setSize(50, 25);

		clearButton = new Button("Clear");
		clearButton.setSize(50, 25);

		resultArea = new TextArea("");
		
		//전체 크기 및 색상
		setBounds(200, 200, 400, 150);
		setBackground(Color.lightGray);

		//north 패널 배치
		Panel northPane = new Panel(new GridLayout(1, 4));
		northPane.add(inputField1);
		northPane.add(opsChoice);
		northPane.add(inputField2);
		northPane.add(computeButton);
		
		//전체 배치
		add("North", northPane);
		add("Center", resultArea);
		add("South", clearButton);
		
		//Listener 등록
		inputField1.addMouseListener(inputFieldClickEventHandler);
		inputField2.addMouseListener(inputFieldClickEventHandler);
		opsChoice.addItemListener(opCatcher);
		computeButton.addActionListener(calcHandler);
		clearButton.addActionListener(textFieldEventHandler);

		addWindowListener(new WindowClosingEventHandle());
	}

	private ActionListener textFieldEventHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			inputField1.setText("");
			inputField2.setText("");
			resultArea.setText("");
		}
	};

	private ActionListener calcHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				left = Integer.parseInt(inputField1.getText().trim());
				right = Integer.parseInt(inputField2.getText().trim());
				} catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(resultArea, "숫자를 입력해 주세요"); return;
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(resultArea, "예상치 못한 오류"); return;
				}
				switch(operator) {
				case "+":result = left + right; break;
				case "-":result = left - right; break;
				case "*":result = left * right; break;
				case "/":result = left / right; break;
				case "%":result = left % right; break;
				}
			resultArea.append(result + "\n");
		}
	};

	private class WindowClosingEventHandle extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}

	private ItemListener opCatcher = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
			operator = (String) e.getItem();
		}
	};

	private MouseAdapter inputFieldClickEventHandler = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			((TextField)e.getSource()).setText("");
		}

	};
}

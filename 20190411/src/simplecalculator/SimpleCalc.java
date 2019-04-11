package simplecalculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * 프레임 텍스트 필드에 입력 드롭다운 연산자 버튼 누름 => 값, 연산자 입력 => 계산결과 출력
 * 
 * @author LEE
 *
 */
public class SimpleCalc extends JFrame implements ActionListener {
	
	String[] operators = {"+","-","*","/","%"};
	TextField leftOperandField;
	TextField rightOperandField;
	JComboBox operatorsBox;
	Button equalSign;
	Label calcResult;
	String operator;
	
	public SimpleCalc(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		init();
	}

	public void init() {
		this.setBounds(300, 300, 300, 70);
		this.setBackground(Color.LIGHT_GRAY);
		leftOperandField = new TextField();
		operatorsBox = new JComboBox (operators);
		rightOperandField = new TextField();
		equalSign = new Button("=");
		calcResult = new Label();
		
		operatorsBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox op = (JComboBox)e.getSource();
				int index = op.getSelectedIndex();
				operator = operators[index];
				System.out.println(operator);
			}
		});
		
		rightOperandField.addActionListener(this);
		equalSign.addActionListener(this);

		
		setLayout(new GridLayout(0,5));
		this.add(leftOperandField);
		this.add(operatorsBox);
		this.add(rightOperandField);
		this.add(equalSign);
		this.add(calcResult);
	}
	
	public int calcByOperator(int left, int right, String operator) {
		switch (operator) {
		case "+" : return left + right;
		case "-" : return left - right;
		case "*" : return left * right;
		case "/" : return left / right;
		case "%" : return left % right;
		default : return (Integer) null;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int leftOperand = Integer.parseInt(leftOperandField.getText());
		int rightOperand = Integer.parseInt(rightOperandField.getText());
		int result = calcByOperator(leftOperand, rightOperand, operator);
		calcResult.setText(""+result);
	}
}

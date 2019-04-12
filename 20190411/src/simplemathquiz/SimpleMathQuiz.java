package simplemathquiz;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleMathQuiz extends JFrame implements ActionListener {

	String[] operators = { "+", "-", "*", "/" };
	JLabel leftOperandLabel = new JLabel();
	JLabel rightOperandLabel = new JLabel();
	final JLabel equalLabel = new JLabel("=");
	JLabel operatorLabel = new JLabel();;
	Button submit = new Button("submit");
	TextField answer = new TextField("답을 입력하세요");
	JLabel resultLabel = new JLabel();
	Button retry = new Button("retry");
	int rightAnswer;

	public SimpleMathQuiz(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		init();
	}

	public int makeRandomOneToNine() {
		return (int) ((Math.random() + 0.1) * 9);
	}

	public void setQuiz() {
		int lNum = makeRandomOneToNine();
		int rNum = makeRandomOneToNine();
		String operator = operators[(int)(Math.random() * 4)];
		rightAnswer = calcByOperator(lNum, rNum, operator);
		leftOperandLabel.setText("" + lNum);
		operatorLabel.setText(operator);
		rightOperandLabel.setText("" + rNum);
		resultLabel.setText("");
	}

	public void init() {
		this.setBounds(300, 300, 700, 200);
		this.setBackground(Color.LIGHT_GRAY);
		this.setQuiz();

		retry.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setQuiz();
			}
		});
//		
		submit.addActionListener(this);
		answer.addActionListener(this);
		answer.addMouseListener(new MouseListener() {
			
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
				answer.setText("");
			}
		});

		
//		setLayout(new GridLayout(0, 8));
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel eastPanel = new JPanel();
		centerPanel.add(leftOperandLabel);
		centerPanel.add(operatorLabel);
		centerPanel.add(rightOperandLabel);
		centerPanel.add(equalLabel);
		centerPanel.add(resultLabel);
		southPanel.add(answer);
		southPanel.add(submit);
		eastPanel.add(retry);
		this.add("Center",centerPanel);
		this.add("South",southPanel);
		this.add("East",eastPanel);
	}

	public int calcByOperator(int left, int right, String operator) {
		switch (operator) {
		case "+":
			return left + right;
		case "-":
			return left - right;
		case "*":
			return left * right;
		case "/":
			return left / right;
		default:
			return (Integer) null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String inputedAnswer = answer.getText();
		if (inputedAnswer.equals(Integer.toString(rightAnswer))) {
			resultLabel.setText("Correct!");
		} else {
			resultLabel.setText("It's wrong.");
		}

	}
}

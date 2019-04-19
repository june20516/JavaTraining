package viewer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import quizsetter.QuizLogic;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizViewer extends JFrame {
	private QuizLogic quizLogic;
	private String[] quizSrc;
	private JTextField ansInputField;
	private JPanel contentPane;
	private JPanel quizPane;
	private	JLabel num1Label;
	private	JLabel operator;
	private	JLabel num2Label;
	private	JLabel quizClosingLabel;
	private	JPanel ansPane;
	private	JLabel answerLabel;
	private	JButton submitBtn;
	private	JPanel resultPane;
	private	JLabel resultLabel;
	private	JButton reset;

	
	public QuizViewer(QuizLogic quizLogic) {
		this.quizLogic = quizLogic;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		quizPane = new JPanel();
		contentPane.add(quizPane, BorderLayout.NORTH);
		quizPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		num1Label = new JLabel("숫");
		num1Label.setHorizontalAlignment(SwingConstants.CENTER);
		num1Label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		num1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
		quizPane.add(num1Label);
		
		operator = new JLabel("자");
		operator.setHorizontalAlignment(SwingConstants.CENTER);
		operator.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		operator.setAlignmentX(Component.CENTER_ALIGNMENT);
		quizPane.add(operator);
		
		num2Label = new JLabel("퀴");
		num2Label.setHorizontalAlignment(SwingConstants.CENTER);
		num2Label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		quizPane.add(num2Label);
		
		quizClosingLabel = new JLabel("즈");
		quizClosingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quizClosingLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		quizPane.add(quizClosingLabel);
		
		ansPane = new JPanel();
		contentPane.add(ansPane, BorderLayout.CENTER);
		ansPane.setLayout(new BorderLayout(0, 0));
		
		answerLabel = new JLabel("      정답은?      ");
		answerLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		ansPane.add(answerLabel, BorderLayout.WEST);
		
		ansInputField = new JTextField();
		ansPane.add(ansInputField, BorderLayout.CENTER);
		ansInputField.setFont(new Font("Lucida Grande", Font.PLAIN, 38));
		ansInputField.setForeground(Color.BLACK);
		ansInputField.setHorizontalAlignment(SwingConstants.CENTER);
		
		submitBtn = new JButton("제출");
		ansPane.add(submitBtn, BorderLayout.EAST);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userAns = ansInputField.getText();
					resultLabel.setForeground(Color.BLUE);
					resultLabel.setText(quizLogic.compareAns(userAns));
			}
		});
		
		
		submitBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		resultPane = new JPanel();
		contentPane.add(resultPane, BorderLayout.SOUTH);
		resultPane.setLayout(new BorderLayout(0, 0));
		
		resultLabel = new JLabel("결과는?");
		resultLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultPane.add(resultLabel);
		
		reset = new JButton("시작!");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quizSrc = quizLogic.getQuiz();
				num1Label.setText(quizSrc[0]);
				operator.setText(quizSrc[1]);
				num2Label.setText(quizSrc[2]);
				quizClosingLabel.setText("?");
				
				resultLabel.setText("정답은?");
				resultLabel.setForeground(Color.BLACK);
				reset.setText("다시하기");
			}
		});
		reset.setForeground(Color.RED);
		resultPane.add(reset, BorderLayout.EAST);
		
	}

}

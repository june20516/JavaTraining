package calculationframetest;

import java.awt.Button;

import java.awt.Color;

import java.awt.Frame;

import java.awt.GridLayout;

import java.awt.Panel;

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.util.Arrays;

import java.util.Random;

import javax.swing.JLabel;

public class RandomNumGuess extends Frame implements ActionListener {

	private TextField leftRandomNum;

	private TextField rightRandomNum;

	private TextField operations;

	private Button calButton;

	private TextField enterNumBox;

	private JLabel resultDisplay;

	private Button restartEverything;

	String[] operation = { "+", "-", "*", "/", "%" };

	Random rand = new Random();

	

	

	String operationRand = operation [rand.nextInt(operation.length)];

	int random1 = (int) (Math.random() * 10);

	int random2 = (int) (Math.random() * 10);

	String random1S = Integer.toString(random1);

	String random2S = Integer.toString(random2);

	int result = (int)calculation(random1, random2, operationRand);

	

	

	

	

	

	public RandomNumGuess(String title) {

		super(title);

		init();

	}

	

	

	public void init() {

		setBounds(100, 200, 350, 150);

		addWindowListener(new WindowClosingEventHandle());

		this.setBackground(Color.GREEN);

		leftRandomNum = new TextField();

		rightRandomNum = new TextField();

		operations = new TextField();

		calButton = new Button("Calculate?");

		enterNumBox = new TextField();

		restartEverything = new Button("Start/Reset");

		resultDisplay = new JLabel();

		

		

		

		

		// EventListeners

		enterNumBox.addActionListener(this);

		

		

		// MouseListeners

		restartEverything.addMouseListener(restartFunction);

		calButton.addMouseListener(calcButtonFunction);

		

		

		//Layout of the screen

		GridLayout layout = new GridLayout(1, 5);

		Panel northPane = new Panel(layout);

		northPane.add(leftRandomNum);

		northPane.add(operations);

		northPane.add(rightRandomNum);

		northPane.add(calButton);

		northPane.add(enterNumBox);

		add("North", northPane);

		add("Center", resultDisplay);

		add("South", restartEverything);

	}

	

	

	

	private MouseListener restartFunction = new MouseAdapter() {

		@Override

		public void mouseClicked(MouseEvent e) {

			// adjust later on

			

			leftRandomNum.setText(random1S);

			

			rightRandomNum.setText(random2S);

			

			operations.setText(operationRand);

			resultDisplay.setText("");

			enterNumBox.setText("");

		}

	};

	

	



	

	private MouseListener calcButtonFunction = new MouseAdapter() {

		public void mouseClicked(MouseEvent arg0) {

			

			if (enterNumBox.getText().equals(Integer.toString(result))) {

				resultDisplay.setText("Right answer");

			} else {

				resultDisplay.setText("Try again");

			}

		}

	};

	

	

	private class WindowClosingEventHandle extends WindowAdapter {

		public void windowClosing(WindowEvent e) {

			System.exit(0);

		}

	}

	

	

	

	@Override

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		

		resultDisplay.setText(""+result);

	}

	public int calculation(int left, int right, String operation) {

		switch(operationRand) {

		case "+" : return left + right;

		case "-" : return left - right;

		case "*" : return left * right;

		case "/" : return left / right;

		case "%" : return left % right;

		default : return (Integer)null;

		}

		

	}

}



////package calculationframetest;




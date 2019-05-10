package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculator.Logic1;
import calculator.CalculatorLogic;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Cursor;
import javax.swing.DropMode;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/*
 * 더 해야하는 것 : UI constrants 묶기
 * 
 */
public class UiViewer extends JFrame {
	private CalculatorLogic calcLogic = new CalculatorLogic();

	private StringBuffer tempStr = new StringBuffer("");
	private JPanel contentPane;
	private JTextField numberField = new JTextField();

	/*
	 *  숫자버튼 클릭 제어
	 *  숫자를 tempStr에 저장하고 field에 출력
	 */
	private DigitBtnHandler digitBtnHandler = new DigitBtnHandler();
	class DigitBtnHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				String clickedDigit = ((JButton) (e.getSource())).getText();
				tempStr.append(clickedDigit);
				setNumberField(tempStr);
			}
		};

	/*
	 *  이항연산자버튼 제어
	 *  연산자를 operator에 저장
	 *  이항연산 로직 호출
	 *  	이항연산 로직에서 : 연산자가 있고 숫자가 2개인 경우 계산
	 *  계산된 값을 출력(tempStr에는 저장하지 않음)
	 */
	private OptBtnHandler optBtnHandler = new OptBtnHandler();
	class OptBtnHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String clickedOpt = ((JButton) (e.getSource())).getText();
			if (tempStr.length() != 0) {
				Double calculedResult = calcLogic.excecuteBinalCalc(Deliver.passNum(tempStr), clickedOpt);
				tempStr.delete(0, tempStr.length());
				setNumberField(Deliver.getNum(calculedResult));
			}

		}
	}
	
	/**
	 * 단항연산자버튼 제어
	 * tempStr을 가져와서 입력된 단항 연산을 계산 후 바로 tempStr로 가져와 화면에 출력
	 */
	private UnaOptBtnHandler unaOptBtnHandler = new UnaOptBtnHandler();
	class UnaOptBtnHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String clickedOpt = ((JButton) (e.getSource())).getText();
			if (tempStr.length() != 0) {
				Double calculedResult = calcLogic.excecuteUnaryCalc(Deliver.passNum(tempStr), clickedOpt);
				tempStr.delete(0, tempStr.length());
				tempStr.append(Deliver.getNum(calculedResult));
				setNumberField(tempStr);
			}
		}
	}
	//표시숫자 가공 후 세팅
	private void setNumberField(StringBuffer tempStr) {
		if((tempStr+"").matches(".*[.]\\d{5}\\d*")) {
			numberField.setText(tempStr.substring(0,tempStr.indexOf(".")+10));
		} else if(tempStr.indexOf(".0") != -1) {
			numberField.setText(tempStr.substring(0, tempStr.indexOf(".0")));
		}else {
			numberField.setText(tempStr+"");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiViewer frame = new UiViewer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UiViewer() {
		init();
	}
	
	/**
	 * set components
	 */
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JFormattedTextField logTextField = new JFormattedTextField();
		logTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		logTextField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		logTextField.setBorder(null);
		logTextField.setBackground(SystemColor.window);
		logTextField.setForeground(SystemColor.inactiveCaptionText);
		logTextField.setEditable(false);
		panel.add(logTextField, BorderLayout.NORTH);


		numberField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		numberField.setBorder(new CompoundBorder());
		numberField.setEditable(false);
		numberField.setHorizontalAlignment(SwingConstants.RIGHT);
		numberField.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		panel.add(numberField, BorderLayout.CENTER);

		JPanel inputPane = new JPanel();
		inputPane.setBorder(new EmptyBorder(30, 20, 30, 20));
		contentPane.add(inputPane, BorderLayout.CENTER);
		inputPane.setLayout(new BorderLayout(0, 0));

		JPanel optPane = new JPanel();
		optPane.setBorder(new EmptyBorder(0, 10, 0, 0));
		inputPane.add(optPane, BorderLayout.EAST);
		GridBagLayout gbl_optPane = new GridBagLayout();
		gbl_optPane.columnWidths = new int[] { 75, 0 };
		gbl_optPane.rowHeights = new int[] { 61, 61, 61, 61, 61, 122 };
		optPane.setLayout(gbl_optPane);

		JButton plusBtn = new JButton("+");
		GridBagConstraints gbc_plusBtn = new GridBagConstraints();
		gbc_plusBtn.fill = GridBagConstraints.BOTH;
		gbc_plusBtn.insets = new Insets(0, 0, 5, 0);
		gbc_plusBtn.gridx = 0;
		gbc_plusBtn.gridy = 0;
		optPane.add(plusBtn, gbc_plusBtn);
		plusBtn.addActionListener(optBtnHandler);

		JButton minusBtn = new JButton("−");
		GridBagConstraints gbc_minusBtn = new GridBagConstraints();
		gbc_minusBtn.fill = GridBagConstraints.BOTH;
		gbc_minusBtn.insets = new Insets(0, 0, 5, 0);
		gbc_minusBtn.gridx = 0;
		gbc_minusBtn.gridy = 1;
		optPane.add(minusBtn, gbc_minusBtn);
		minusBtn.addActionListener(optBtnHandler);

		JButton multBtn = new JButton("×");
		GridBagConstraints gbc_multBtn = new GridBagConstraints();
		gbc_multBtn.fill = GridBagConstraints.BOTH;
		gbc_multBtn.insets = new Insets(0, 0, 5, 0);
		gbc_multBtn.gridx = 0;
		gbc_multBtn.gridy = 2;
		optPane.add(multBtn, gbc_multBtn);
		multBtn.addActionListener(optBtnHandler);

		JButton divBtn = new JButton("÷");
		GridBagConstraints gbc_divBtn = new GridBagConstraints();
		gbc_divBtn.fill = GridBagConstraints.BOTH;
		gbc_divBtn.insets = new Insets(0, 0, 5, 0);
		gbc_divBtn.gridx = 0;
		gbc_divBtn.gridy = 3;
		optPane.add(divBtn, gbc_divBtn);
		divBtn.addActionListener(optBtnHandler);

		JButton rootBtn = new JButton("√");
		GridBagConstraints gbc_rootBtn = new GridBagConstraints();
		gbc_rootBtn.fill = GridBagConstraints.BOTH;
		gbc_rootBtn.insets = new Insets(0, 0, 5, 0);
		gbc_rootBtn.gridx = 0;
		gbc_rootBtn.gridy = 4;
		optPane.add(rootBtn, gbc_rootBtn);
		rootBtn.addActionListener(unaOptBtnHandler);

		JButton excBtn = new JButton("=");
		excBtn.setBackground(new Color(255, 99, 71));
		GridBagConstraints gbc_excBtn = new GridBagConstraints();
		gbc_excBtn.fill = GridBagConstraints.BOTH;
		gbc_excBtn.gridx = 0;
		gbc_excBtn.gridy = 5;
		optPane.add(excBtn, gbc_excBtn);
		//계산 수행 후 출력
		excBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double finalResult  = calcLogic.finishCalculate(Deliver.passNum(tempStr));
				tempStr = Deliver.getNum(finalResult);
				setNumberField(tempStr);
			}
		});
		JPanel digitPane = new JPanel();
		digitPane.setBorder(new EmptyBorder(0, 0, 0, 10));
		inputPane.add(digitPane, BorderLayout.CENTER);
		digitPane.setLayout(new GridLayout(4, 3, 0, 0));

		JButton button_7 = new JButton("7");
		digitPane.add(button_7);
		button_7.addActionListener(digitBtnHandler);

		JButton button_8 = new JButton("8");
		digitPane.add(button_8);
		button_8.addActionListener(digitBtnHandler);

		JButton button_9 = new JButton("9");
		digitPane.add(button_9);
		button_9.addActionListener(digitBtnHandler);

		JButton button_4 = new JButton("4");
		digitPane.add(button_4);
		button_4.addActionListener(digitBtnHandler);

		JButton button_5 = new JButton("5");
		digitPane.add(button_5);
		button_5.addActionListener(digitBtnHandler);

		JButton button_6 = new JButton("6");
		digitPane.add(button_6);
		button_6.addActionListener(digitBtnHandler);

		JButton button_1 = new JButton("1");
		digitPane.add(button_1);
		button_1.addActionListener(digitBtnHandler);

		JButton button_2 = new JButton("2");
		digitPane.add(button_2);
		button_2.addActionListener(digitBtnHandler);

		JButton button_3 = new JButton("3");
		digitPane.add(button_3);
		button_3.addActionListener(digitBtnHandler);

		JButton button_0 = new JButton("0");
		digitPane.add(button_0);
		button_0.addActionListener(digitBtnHandler);

		JButton button_dot = new JButton(".");
		digitPane.add(button_dot);
		button_dot.addActionListener(digitBtnHandler);

		JButton button_AC = new JButton("AC");
		button_AC.setForeground(new Color(0, 0, 139));
		button_AC.setBackground(new Color(255, 215, 0));
		digitPane.add(button_AC);
		/*
		 * 로직 및 변수 초기화 수행
		 */
		button_AC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				tempStr.delete(0, tempStr.length());
				setNumberField(tempStr);
				calcLogic.init();
			}
		});
	}
}

//값을 주고받는 역할을 분리시킨 클래스
class Deliver {
	//UI부에서 받은 StringBuffer를 로직으로 Double형태로 전달해주는 메소드
	public static Double passNum(StringBuffer sbNum) {
		try {
			Double dNum = Double.parseDouble("" + sbNum);
			return dNum;
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	//로직에서 나오는 Double을 StringBuffer 형태로 받아오는 메소드
	public static StringBuffer getNum(Double dNum) {
		return new StringBuffer(dNum + "");
	}
}

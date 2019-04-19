package viewer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculator.CalculateLogic;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class Frame extends JFrame {

	private CalculateLogic calculateLogic;
	private JPanel outPane;
	private JPanel contentPane;
	private JTextField numField1;
	private JTextField numField2;
	private JComboBox operatorBox;
	private JButton calculateBtn;
	private JLabel calcResult = new JLabel(""); // 15칸

	
	private JLabel row1Blank;
	private JLabel row3Blank;

	public Frame(CalculateLogic calculateLogic) {
		this();
		setCalculateLogic(calculateLogic);
	}

	private void setCalculateLogic(CalculateLogic calculateLogic) {
		this.calculateLogic = calculateLogic;
	}

	private void setElements() {
		String text1 = numField1.getText();
		String text2 = numField2.getText();
		String operator = operatorBox.getSelectedItem().toString();
		try {
			calculateLogic.setInputedNum1(Integer.parseInt(text1));
			calculateLogic.setInputedNum2(Integer.parseInt(text2));
			calculateLogic.setOperator(operator);
		} catch (NumberFormatException e) {
			// 경고 팝업 띄우기
			JOptionPane.showMessageDialog(this,new String("숫자만 입력해주세요."),"경고",0);
		}
	}

	public Frame() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Frame.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setTitle("Arithmetic operator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 181);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		outPane = new JPanel();
		outPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(outPane);

		numField1 = new JTextField();
		numField1.setMaximumSize(new Dimension(10, 26));
		numField1.setHorizontalAlignment(SwingConstants.CENTER);
		numField1.setColumns(3);

		numField2 = new JTextField();
		numField2.setHorizontalAlignment(SwingConstants.CENTER);
		numField2.setPreferredSize(new Dimension(10, 5));
		numField2.setColumns(3);

		operatorBox = new JComboBox();
		operatorBox.setName("operatorBox");
		operatorBox.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/", "%" }));

		calculateBtn = new JButton("=");
		calculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setElements();
				int intResult = calculateLogic.calculate();
				calcResult.setText(String.format("% 15d", intResult));
			}
		});

		row1Blank = new JLabel("");
		row3Blank = new JLabel("");
		
		outPane.setLayout(new GridLayout(3,1,0,0));
		outPane.add(row1Blank);
		outPane.add(contentPane);
		outPane.add(row3Blank);
		contentPane.setLayout(new GridLayout(1, 5, 0, 0));
		contentPane.add(numField1);
		contentPane.add(operatorBox);
		contentPane.add(numField2);
		contentPane.add(calculateBtn);
		contentPane.add(calcResult);
	}
}

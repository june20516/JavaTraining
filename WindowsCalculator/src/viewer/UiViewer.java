package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class UiViewer extends JFrame {
	private CalculatorLogic logic = new CalculatorLogic();
	
	private StringBuffer tempStr = new StringBuffer("");
	private List<String> inputedSrcList = new ArrayList<String>();

	private JPanel contentPane;
	private JTextField consoleArea = new JTextField();
	
	private DigitBtnHandler digitBtnHandler = new DigitBtnHandler();
	class DigitBtnHandler implements ActionListener{
		MouseAdapter mouseClickListener = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				public void mouseClicked(MouseEvent e) {
				String clickedDigit = ((JButton) (e.getSource())).getText();
				tempStr.append(clickedDigit);
//				consoleArea.append(clickedDigit);	// wrong move at entering dot
				consoleArea.setText(new String(tempStr));
				System.out.println(new String(tempStr));
			}
		};
		@Override
		public void actionPerformed(ActionEvent e) {
			String clickedDigit = ((JButton) (e.getSource())).getText();
			tempStr.append(clickedDigit);
			System.out.println(tempStr);
//			consoleArea.append(clickedDigit);	// wrong move at entering dot
			consoleArea.setText(new String(tempStr));
		}
	}
	
	private OptBtnHandler optBtnHandler = new OptBtnHandler();
	class OptBtnHandler extends MouseAdapter{
		@Override
		public void mouseReleased(MouseEvent e) {
//			public void mouseClicked(MouseEvent e) {
			String clickedOpt = ((JButton) (e.getSource())).getText();
			inputedSrcList.add(""+tempStr);
			System.out.println(inputedSrcList.size());
			tempStr = new StringBuffer("");
			inputedSrcList.add(clickedOpt);
			System.out.println(inputedSrcList.size());
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

	/**
	 * Create the frame.
	 */
	//+−×÷√=
	public UiViewer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		consoleArea.setEditable(false);
		
		consoleArea.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		consoleArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		contentPane.add(consoleArea, BorderLayout.NORTH);

		
		JPanel inputPane = new JPanel();
		contentPane.add(inputPane, BorderLayout.CENTER);
		inputPane.setLayout(new BorderLayout(0, 0));
		
		JPanel optPane = new JPanel();
		inputPane.add(optPane, BorderLayout.EAST);
		optPane.setLayout(new GridLayout(7, 1, 0, 0));
		
		JButton plusBtn = new JButton("+");
		optPane.add(plusBtn);
		plusBtn.addMouseListener(optBtnHandler);
		
		JButton minusBtn = new JButton("−");
		optPane.add(minusBtn);
		minusBtn.addMouseListener(optBtnHandler);
		
		JButton multBtn = new JButton("×");
		optPane.add(multBtn);
		multBtn.addMouseListener(optBtnHandler);
		
		JButton divBtn = new JButton("÷");
		optPane.add(divBtn);
		divBtn.addMouseListener(optBtnHandler);

		
		JButton rootBtn = new JButton("√");
		optPane.add(rootBtn);
		rootBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				double calculatedDouble = logic.squarRoot(Double.parseDouble(""+tempStr));
//				tempStr = "" + calculatedDouble;
				consoleArea.setText(new String(tempStr));
				System.out.println(new String(tempStr));
			}
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				double calculatedDouble = logic.squarRoot(Double.parseDouble(""+tempStr));
////				tempStr = "" + calculatedDouble;
//				consoleArea.setText(new String(tempStr));
//				System.out.println(new String(tempStr));
//			}
		});
		
		JLabel opsLabel = new JLabel("  ");
		optPane.add(opsLabel);
		
		JButton excBtn = new JButton("=");
		optPane.add(excBtn);
		excBtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
//				logic.setSrc(inputedSrcList);
//				logic.calcBinaryOperation();
//				consoleArea.setText(logic.getResultStr());
//				tempStr = new StringBuffer(consoleArea.getText());
			}

//			@Override
//			public void mouseClicked(MouseEvent e) {
//				logic.setSrc(inputedSrcList);
//				logic.calcBinaryOperation();
//				consoleArea.setText(logic.getResultStr());
//				tempStr = new StringBuffer(consoleArea.getText());
//			}
		});
		JPanel digitPane = new JPanel();
		inputPane.add(digitPane, BorderLayout.CENTER);
		digitPane.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton button_7 = new JButton("7");
		digitPane.add(button_7);
		button_7.addMouseListener(digitBtnHandler.mouseClickListener);
		
		JButton button_8 = new JButton("8");
		digitPane.add(button_8);
		button_8.addMouseListener(digitBtnHandler.mouseClickListener);
		
		JButton button_9 = new JButton("9");
		digitPane.add(button_9);
		button_9.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_4 = new JButton("4");
		digitPane.add(button_4);
		button_4.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_5 = new JButton("5");
		digitPane.add(button_5);
		button_5.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_6 = new JButton("6");
		digitPane.add(button_6);
		button_6.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_1 = new JButton("1");
		digitPane.add(button_1);
		button_1.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_2 = new JButton("2");
		digitPane.add(button_2);
		button_2.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_3 = new JButton("3");
		digitPane.add(button_3);
		button_3.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_0 = new JButton("0");
		digitPane.add(button_0);
		button_0.addMouseListener(digitBtnHandler.mouseClickListener);

		JButton button_dot = new JButton(".");
		digitPane.add(button_dot);
		button_dot.addMouseListener(digitBtnHandler.mouseClickListener);
	}

}

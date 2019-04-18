package viewer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculator.CalculateLogic;

import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField numField1;
	private JTextField numField2;
	private CalculateLogic calculateLogic;
	
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
//		String operator = 
		try {
			calculateLogic.setInputedNum1(Integer.parseInt(text1));
			calculateLogic.setInputedNum2(Integer.parseInt(text2));
		}catch(NumberFormatException e) {
			//경고 팝업 띄우기 
		}
	}
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Frame() {
		
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setTitle("Arithmetic operator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		numField1 = new JTextField();
		numField1.setColumns(3);
		
		JComboBox operatorBox = new JComboBox();
		operatorBox.setName("operatorBox");
		operatorBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		
		numField2 = new JTextField();
		numField2.setColumns(3);
		
		JButton calculateBtn = new JButton("=");
		calculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		calculateBtn.setActionCommand("=");
		
		JLabel label = new JLabel("               ");	//15칸
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(numField2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
						.addComponent(numField1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(operatorBox, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(calculateBtn)
					.addGap(59)
					.addComponent(label)
					.addGap(29))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(numField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(numField2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(operatorBox, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(calculateBtn, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

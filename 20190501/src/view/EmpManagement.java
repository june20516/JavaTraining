package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import bean.EmpInfo;
import bean.JDBCControl;
import java.awt.Dimension;
import javax.swing.JComboBox;

public class EmpManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JTextField numField;
	private JTextField nameField;
	private JComboBox deptBox;
	private JTextField jobField;
	private JTextField salField;
	private JButton btnEnter;
	private JLabel lblEmpNo;
	private JLabel lblEmpName;
	private JLabel lblDept;
	private JLabel lblJob;
	private JLabel lblSal;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpManagement frame = new EmpManagement();
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
	public EmpManagement() {
		setTitle("사원 검색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("사원 정보 검색기");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("사원번호");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setPreferredSize(new Dimension(20, 29));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnSearch.gridx = 5;
		gbc_btnSearch.gridy = 1;
		contentPane.add(btnSearch, gbc_btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDBCControl control = new JDBCControl();
				String empNo = textField.getText().trim();
				if(empNo.isEmpty()) {
					List<EmpInfo> empInfos = control.getEmpInfo();
					for(EmpInfo emp : empInfos) {
					textArea.append(emp.toString()+"\n");
					}
				}else {
					String regex = "^[\\d]*";
					if(Pattern.matches(regex, empNo)) {
						EmpInfo empInfo = control.getEmpInfo(empNo);
						textArea.setText(empInfo.toString());
					}else {
						JOptionPane.showMessageDialog(null, "사원번호를 숫자로 입력해주세요");
						textField.setFocusable(true);
					}
				}
				
			}
		});
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridwidth = 5;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 2;
		contentPane.add(textArea, gbc_textArea);
		
		lblEmpNo = new JLabel("번호");
		GridBagConstraints gbc_lblEmpNo = new GridBagConstraints();
		gbc_lblEmpNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmpNo.gridx = 0;
		gbc_lblEmpNo.gridy = 4;
		contentPane.add(lblEmpNo, gbc_lblEmpNo);
		
		lblEmpName = new JLabel("이름");
		GridBagConstraints gbc_lblEmpName = new GridBagConstraints();
		gbc_lblEmpName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmpName.gridx = 1;
		gbc_lblEmpName.gridy = 4;
		contentPane.add(lblEmpName, gbc_lblEmpName);
		
		lblDept = new JLabel("부서");
		GridBagConstraints gbc_lblDept = new GridBagConstraints();
		gbc_lblDept.insets = new Insets(0, 0, 5, 5);
		gbc_lblDept.gridx = 2;
		gbc_lblDept.gridy = 4;
		contentPane.add(lblDept, gbc_lblDept);
		
		lblJob = new JLabel("직무");
		GridBagConstraints gbc_lblJob = new GridBagConstraints();
		gbc_lblJob.insets = new Insets(0, 0, 5, 5);
		gbc_lblJob.gridx = 3;
		gbc_lblJob.gridy = 4;
		contentPane.add(lblJob, gbc_lblJob);
		
		lblSal = new JLabel("연봉");
		GridBagConstraints gbc_lblSal = new GridBagConstraints();
		gbc_lblSal.insets = new Insets(0, 0, 5, 5);
		gbc_lblSal.gridx = 4;
		gbc_lblSal.gridy = 4;
		contentPane.add(lblSal, gbc_lblSal);
		
		numField = new JTextField();
		GridBagConstraints gbc_numField = new GridBagConstraints();
		gbc_numField.insets = new Insets(0, 0, 0, 5);
		gbc_numField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numField.gridx = 0;
		gbc_numField.gridy = 5;
		contentPane.add(numField, gbc_numField);
		numField.setColumns(10);
		
		nameField = new JTextField();
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.insets = new Insets(0, 0, 0, 5);
		gbc_nameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameField.gridx = 1;
		gbc_nameField.gridy = 5;
		contentPane.add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		deptBox = new JComboBox();
		GridBagConstraints gbc_deptBox = new GridBagConstraints();
		gbc_deptBox.insets = new Insets(0, 0, 0, 5);
		gbc_deptBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_deptBox.gridx = 2;
		gbc_deptBox.gridy = 5;
		contentPane.add(deptBox, gbc_deptBox);
		
		
		jobField = new JTextField();
		GridBagConstraints gbc_jobField = new GridBagConstraints();
		gbc_jobField.insets = new Insets(0, 0, 0, 5);
		gbc_jobField.fill = GridBagConstraints.HORIZONTAL;
		gbc_jobField.gridx = 3;
		gbc_jobField.gridy = 5;
		contentPane.add(jobField, gbc_jobField);
		jobField.setColumns(10);
		
		salField = new JTextField();
		GridBagConstraints gbc_salField = new GridBagConstraints();
		gbc_salField.insets = new Insets(0, 0, 0, 5);
		gbc_salField.fill = GridBagConstraints.HORIZONTAL;
		gbc_salField.gridx = 4;
		gbc_salField.gridy = 5;
		contentPane.add(salField, gbc_salField);
		salField.setColumns(10);
		
		btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.gridx = 5;
		gbc_btnEnter.gridy = 5;
		contentPane.add(btnEnter, gbc_btnEnter);
		btnEnter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//값을 가져옴
				//직원 번호는 꼭 입력해야함
				//부서도 꼭 선택해야 함
				
				
			}
		});
		
	}

}

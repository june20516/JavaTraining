import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SeongJuck extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private DefaultTableModel tableModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeongJuck frame = new SeongJuck();
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
	public SeongJuck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Object[] colname = {"a","b","c","d"};
		Object[][] row = {{1,2,3,4}};
		
		tableModel = new DefaultTableModel(row,colname);
		table = new JTable(tableModel);
		contentPane.add(table);
		table.setBounds(78, 439, 832, 278);
		
		textField = new JTextField("1");
		textField.setBounds(67, 113, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 113, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(358, 113, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(508, 113, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(650, 113, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(99, 88, 61, 16);
		contentPane.add(lblA);
		
		JLabel lblBbbbb = new JLabel("bbbbb");
		lblBbbbb.setBounds(234, 88, 61, 16);
		contentPane.add(lblBbbbb);
		
		JLabel lblCccc = new JLabel("cccc");
		lblCccc.setBounds(381, 88, 61, 16);
		contentPane.add(lblCccc);
		
		JLabel lblDdddd = new JLabel("ddddd");
		lblDdddd.setBounds(545, 85, 61, 16);
		contentPane.add(lblDdddd);
		
		JLabel lblEeeee = new JLabel("eeeee");
		lblEeeee.setBounds(693, 85, 61, 16);
		contentPane.add(lblEeeee);
		
		JButton button = new JButton("입      력");
		button.setBounds(371, 234, 117, 29);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//			tableModel.addRow(new String[]{textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText()});
				Object[] a = new Object[] {1,"rsr",3};
				tableModel.addRow(a);
			}
		});
		
		
		
		tableModel.addRow(new String[]{textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText()});

		
		
		
		
	
		
		
	}
}

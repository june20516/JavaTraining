package use;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import middle.Exam;
import middle.PersTestScoreInfo;
import middle.StudPersInfo;
import middle.TestScoreInfo;

public class ExamExam extends JFrame {

	private JPanel contentPane;
	
	
	JLabel lblName;
	JLabel lblKor;
	JLabel lblEng;
	JLabel lblMath;
	JLabel lblScience;
	JLabel lblTel;
	JLabel lblEmail;
	private JLabel[] labels = {lblName,lblKor,lblEng,lblMath,lblScience,lblEmail,lblTel};
	
	private JTextField textAddSubject1;
	private JTextField textAddSubject2;
	private JTextField textAddSubject3;
	private JTextField textName;
	private JTextField textTel;
	private JTextField textEmail;
	private JTextField textKor;
	private JTextField textEng;
	private JTextField textMath;
	private JTextField textScience;
	private JTextField textAdd1;
	private JTextField textAdd2;
	private JTextField textAdd3;
	
	
	private DefaultTableModel tableModel;
	private JTable table;
	
	private JTextField textTotalkor;
	private JTextField textTotalEng;
	private JTextField textAvgKor;
	private JTextField textAvgEng;
	private JTextField textTotalMath;
	private JTextField textTotalScience;
	private JTextField textTotalAdd1;
	private JTextField textTotalAdd2;
	private JTextField textTotalAdd3;
	private JTextField textAvgMath;
	private JTextField textAvgScience;
	private JTextField textAvgAdd1;
	private JTextField textAvgAdd2;
	private JTextField textAvgAdd3;
	private JButton btnSetter;
	private JLabel lblTotalSubject;
	private JLabel lblAvgSubject;
	private String name;
	private String addSubject1;
	private String addSubject2;
	private String addSubject3;
	private String tel;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int add1;
	private int add2;
	private int add3;
	private StudPersInfo student;
	private TestScoreInfo subject;
	private PersTestScoreInfo persScore;
	private Exam exam;
	private JButton btnSubjectFix;
	
	private Object[][] rows;
	
	public ExamExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("이름");
		lblName.setBounds(12, 47, 50, 20);
		contentPane.add(lblName);

		JLabel lblKor = new JLabel("국어");
		lblKor.setBounds(68, 47, 50, 20);
		contentPane.add(lblKor);

		JLabel lblEng = new JLabel("영어");
		lblEng.setBounds(130, 47, 50, 20);
		contentPane.add(lblEng);

		JLabel lblMath = new JLabel("수학");
		lblMath.setBounds(175, 47, 50, 20);
		contentPane.add(lblMath);

		JLabel lblScience = new JLabel("과학");
		lblScience.setBounds(224, 47, 50, 20);
		contentPane.add(lblScience);

		textAddSubject1 = new JTextField();
		textAddSubject1.setBounds(286, 47, 50, 20);
		contentPane.add(textAddSubject1);
		textAddSubject1.setColumns(10);

		textAddSubject2 = new JTextField();
		textAddSubject2.setBounds(348, 47, 50, 20);
		contentPane.add(textAddSubject2);
		textAddSubject2.setColumns(10);

		textAddSubject3 = new JTextField();
		textAddSubject3.setBounds(408, 47, 50, 20);
		contentPane.add(textAddSubject3);
		textAddSubject3.setColumns(10);

		JLabel lblTel = new JLabel("tel");
		lblTel.setBounds(470, 50, 57, 15);
		contentPane.add(lblTel);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(570, 50, 57, 15);
		contentPane.add(lblEmail);

		textName = new JTextField();
		textName.setBounds(12, 82, 50, 20);
		contentPane.add(textName);
		textName.setColumns(10);

		textKor = new JTextField();
		textKor.setBounds(68, 82, 50, 20);
		contentPane.add(textKor);
		textKor.setColumns(10);

		textEng = new JTextField();
		textEng.setBounds(119, 82, 50, 20);
		contentPane.add(textEng);
		textEng.setColumns(10);

		textMath = new JTextField();
		textMath.setBounds(175, 82, 50, 20);
		contentPane.add(textMath);
		textMath.setColumns(10);

		textScience = new JTextField();
		textScience.setBounds(234, 82, 50, 20);
		contentPane.add(textScience);
		textScience.setColumns(10);

		textAdd1 = new JTextField();
		textAdd1.setBounds(296, 82, 50, 20);
		contentPane.add(textAdd1);
		textAdd1.setColumns(10);

		textAdd2 = new JTextField();
		textAdd2.setBounds(348, 82, 50, 20);
		contentPane.add(textAdd2);
		textAdd2.setColumns(10);

		textAdd3 = new JTextField();
		textAdd3.setBounds(408, 77, 50, 20);
		contentPane.add(textAdd3);
		textAdd3.setColumns(10);

		textTel = new JTextField();
		textTel.setBounds(464, 75, 90, 20);
		contentPane.add(textTel);
		textTel.setColumns(10);

		textEmail = new JTextField();
		textEmail.setBounds(566, 75, 170, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);

		JLabel labeladdSubject = new JLabel("추가과목입력");
		labeladdSubject.setBounds(286, 22, 100, 20);
		contentPane.add(labeladdSubject);

		btnSetter = new JButton("입력");
		btnSetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textName.getText().trim();
				addSubject1 = textAddSubject1.getText().trim();
				addSubject2 = textAddSubject2.getText().trim();
				addSubject3 = textAddSubject3.getText().trim();
				tel = textTel.getText().trim();
				email = textEmail.getText().trim();
				kor = Integer.parseInt(textKor.getText().trim());
				scoreCheck(textKor, kor);
				eng = Integer.parseInt(textEng.getText().trim());
				scoreCheck(textEng, eng);
				math = Integer.parseInt(textMath.getText().trim());
				scoreCheck(textMath, math);
				science = Integer.parseInt(textScience.getText().trim());
				scoreCheck(textScience, science);
				add1 = Integer.parseInt(textAdd1.getText().trim());
				scoreCheck(textAdd1, add1);
				add2 = Integer.parseInt(textAdd2.getText().trim());
				scoreCheck(textAdd2, add2);
				add3 = Integer.parseInt(textAdd3.getText().trim());
				scoreCheck(textAdd3, add3);
				
				student = new StudPersInfo(name, tel, email);
				TestScoreInfo.setSubjectNames("국어", "영어", "수학", "과학", addSubject1, addSubject2, addSubject3);
				subject = new TestScoreInfo(kor,eng,math,science,add1,add2,add3);
				persScore = new PersTestScoreInfo(student, subject);
				
				exam = new Exam("중간고사");
				exam.setStudScore(persScore);
				exam.inputClose();
				exam.output();
				
				
				
				
				
				
				
			}
		});
		btnSetter.setBounds(746, 46, 144, 56);
		contentPane.add(btnSetter);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 150, 975, 2);
		contentPane.add(separator);

		JLabel lblResult = new JLabel("결과");
		lblResult.setBounds(408, 161, 57, 15);
		contentPane.add(lblResult);

		tableModel = new DefaultTableModel(rows,labels);
		table = new JTable(tableModel);
		table.setBounds(26, 215, 935, 234);
		contentPane.add(table);

		textTotalkor = new JTextField();
		textTotalkor.setBounds(272, 470, 50, 20);
		contentPane.add(textTotalkor);
		textTotalkor.setColumns(10);

		textTotalEng = new JTextField();
		textTotalEng.setBounds(348, 470, 50, 20);
		contentPane.add(textTotalEng);
		textTotalEng.setColumns(10);

		textTotalMath = new JTextField();
		textTotalMath.setBounds(408, 470, 50, 20);
		contentPane.add(textTotalMath);
		textTotalMath.setColumns(10);

		textTotalScience = new JTextField();
		textTotalScience.setBounds(531, 470, 50, 20);
		contentPane.add(textTotalScience);
		textTotalScience.setColumns(10);

		textTotalAdd1 = new JTextField();
		textTotalAdd1.setBounds(659, 470, 50, 20);
		contentPane.add(textTotalAdd1);
		textTotalAdd1.setColumns(10);

		textTotalAdd2 = new JTextField();
		textTotalAdd2.setBounds(776, 470, 50, 20);
		contentPane.add(textTotalAdd2);
		textTotalAdd2.setColumns(10);

		textTotalAdd3 = new JTextField();
		textTotalAdd3.setBounds(871, 470, 50, 20);
		contentPane.add(textTotalAdd3);
		textTotalAdd3.setColumns(10);

		textAvgKor = new JTextField();
		textAvgKor.setBounds(272, 501, 50, 20);
		contentPane.add(textAvgKor);
		textAvgKor.setColumns(10);

		textAvgEng = new JTextField();
		textAvgEng.setBounds(348, 501, 50, 20);
		contentPane.add(textAvgEng);
		textAvgEng.setColumns(10);

		textAvgMath = new JTextField();
		textAvgMath.setBounds(411, 501, 50, 20);
		contentPane.add(textAvgMath);
		textAvgMath.setColumns(10);

		textAvgScience = new JTextField();
		textAvgScience.setBounds(541, 501, 50, 20);
		contentPane.add(textAvgScience);
		textAvgScience.setColumns(10);

		textAvgAdd1 = new JTextField();
		textAvgAdd1.setBounds(659, 501, 50, 20);
		contentPane.add(textAvgAdd1);
		textAvgAdd1.setColumns(10);

		textAvgAdd2 = new JTextField();
		textAvgAdd2.setBounds(774, 501, 50, 20);
		contentPane.add(textAvgAdd2);
		textAvgAdd2.setColumns(10);

		textAvgAdd3 = new JTextField();
		textAvgAdd3.setBounds(881, 501, 50, 20);
		contentPane.add(textAvgAdd3);
		textAvgAdd3.setColumns(10);

		lblTotalSubject = new JLabel("과목별 총점");
		lblTotalSubject.setBounds(180, 473, 82, 15);
		contentPane.add(lblTotalSubject);

		lblAvgSubject = new JLabel("과목별 평균");
		lblAvgSubject.setBounds(168, 504, 92, 15);
		contentPane.add(lblAvgSubject);
		
		btnSubjectFix = new JButton("과목 등록");
		btnSubjectFix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAddSubject1.setEditable(false);
				textAddSubject2.setEditable(false);
				textAddSubject3.setEditable(false);
			}
		});
		btnSubjectFix.setBounds(384, 21, 97, 23);
		contentPane.add(btnSubjectFix);
	}
	
	public void scoreCheck(JTextField textSubject, int subjectScore) {
		if(subjectScore<0 ||subjectScore>100) {
			JOptionPane.showMessageDialog(this, textSubject.getName()+"0~100 사이의 수를 입력하세요");
			textSubject.setText("");
			
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamExam frame = new ExamExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

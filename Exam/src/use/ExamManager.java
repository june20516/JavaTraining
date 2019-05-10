package use;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

import middle.Exam;
import middle.PersTestScoreInfo;
import middle.StudPersInfo;
import middle.TestScoreInfo;
import bean.*;

public class ExamManager extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblKor;
	private JLabel lblEng;
	private JLabel lblMath;
	private JLabel lblScience;
	private JLabel lblTel;
	private JLabel lblEmail;

// 추가과목을 설정하기 위한 변수들
// 텍스트필드에서 과목명을 입력하면 라벨로 과목이 표시됨
	private JLabel lblAddSub1;
	private JLabel lblAddSub2;
	private JLabel lblAddSub3;
	private JTextField fieldAddSub1;
	private JTextField fieldAddSub2;
	private JTextField fieldAddSub3;
	private JButton btnSubjectFix;

// 사용자가 값을 입력하는 텍스트 필드들
	private JTextField fieldName;
	private JTextField fieldTel;
	private JTextField fieldEmail;
	private JTextField fieldKor;
	private JTextField fieldEng;
	private JTextField fieldMath;
	private JTextField fieldScience;
	private JTextField fieldAdd1;
	private JTextField fieldAdd2;
	private JTextField fieldAdd3;

	// 값 입력 버튼
	private JButton btnEnter;

	// 표를 표시하기 위한 컴포넌트 멤버들
	private JScrollPane tableScrollPane;
	private DefaultTableModel tableModel;
	private JTable table;

	// 입력된 데이터들에 따라 계산되는 시험 내 수치들
	private JTextField fieldTotalKor;
	private JTextField fieldTotalEng;
	private JTextField fieldAvgKor;
	private JTextField fieldAvgEng;
	private JTextField fieldTotalMath;
	private JTextField fieldTotalScience;
	private JTextField fieldTotalAdd1;
	private JTextField fieldTotalAdd2;
	private JTextField fieldTotalAdd3;
	private JTextField fieldAvgMath;
	private JTextField fieldAvgScience;
	private JTextField fieldAvgAdd1;
	private JTextField fieldAvgAdd2;
	private JTextField fieldAvgAdd3;
	private JLabel lblTotalSubject;
	private JLabel lblAvgSubject;
	private Exam exam = new Exam("중간고사");

// 입력받은 개인 데이터를 담을 변수들.
// 입력 버튼에 의해 덮어 쓰여지므로 초기화 불필요
	private String nameStr;
	private String telStr;
	private String emailStr;
	private StudPersInfo personalInfo;
	private TestScoreInfo scoreInfo;
	private PersTestScoreInfo persScoreInfo;

	private ExamDBController DBController = new ExamDBController();

	/*
	 * 과목 정보를 담을 컨테이너들 과목 결정 버튼에서 한번만 설정된다
	 */
	private String[] subNames = { "국어", "영어", "수학", "과학" };

	/*
	 * 개인의 점수 정보를 담을 컨테이너들 basicScore : 점수가 입력된 후 덮어 쓰여지므로 초기화 불필요 subScore : 한번
	 * 입력하고 초기화 되어야만 한다
	 */
	private Integer[] scores;

	/*
	 * 정보 입력 전에 과목을 정하게 유도하기 위한 변수
	 */
	private boolean isAdditionalSubInputed = false;

	// 라벨 생성 라인 줄이기 위해서 만든겁니다. 지역 변수인것을 멤버로 뺐습니다. 추후 수정될 수 있습니다.
	private JLabel lblAddSubject;
	private JLabel lblResult;
	private JLabel lblKorResult;
	private JLabel lblEngResult;
	private JLabel lblMathResult;
	private JLabel lblScienceResult;
	private JLabel lblAdd1Result;
	private JLabel lblAdd2Result;
	private JLabel lblAdd3Result;

	public ExamManager() {

		setResizable(false);
		this.setTitle(exam.getTitle());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1268, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblName = new JLabel("이름");
		lblBecoming(lblName, true, 28, 50, 80, 30);

		lblKor = new JLabel("국어");
		lblBecoming(lblKor, true, 111, 50, 80, 30);

		lblEng = new JLabel("영어");
		lblBecoming(lblEng, true, 196, 50, 80, 30);

		lblMath = new JLabel("수학");
		lblBecoming(lblMath, true, 281, 50, 80, 30);

		lblScience = new JLabel("과학");
		lblBecoming(lblScience, true, 365, 50, 80, 30);

		fieldAddSub1 = new JTextField();
		textFieldBecoming(fieldAddSub1, true, 451, 51, 80, 30);

		fieldAddSub2 = new JTextField();
		textFieldBecoming(fieldAddSub2, true, 536, 51, 80, 30);

		fieldAddSub3 = new JTextField();
		textFieldBecoming(fieldAddSub3, true, 621, 51, 80, 30);

		lblAddSub1 = new JLabel("");
		lblBecoming(lblAddSub1, false, 451, 50, 80, 30);

		lblAddSub2 = new JLabel("");
		lblBecoming(lblAddSub2, false, 536, 50, 80, 30);

		lblAddSub3 = new JLabel("");
		lblBecoming(lblAddSub3, false, 621, 50, 80, 30);

		lblTel = new JLabel("Tel");
		lblBecoming(lblTel, true, 706, 50, 150, 30);

		lblEmail = new JLabel("Email");
		lblBecoming(lblEmail, true, 861, 50, 250, 30);

		fieldName = new JTextField();
		textFieldBecoming(fieldName, true, 26, 90, 80, 30);

		fieldKor = new JTextField();
		textFieldBecoming(fieldKor, true, 111, 90, 80, 30);

		fieldEng = new JTextField();
		textFieldBecoming(fieldEng, true, 196, 90, 80, 30);

		fieldMath = new JTextField();
		textFieldBecoming(fieldMath, true, 281, 90, 80, 30);

		fieldScience = new JTextField();
		textFieldBecoming(fieldScience, true, 366, 90, 80, 30);

		fieldAdd1 = new JTextField();
		textFieldBecoming(fieldAdd1, true, 451, 90, 80, 30);

		fieldAdd2 = new JTextField();
		textFieldBecoming(fieldAdd2, true, 536, 90, 80, 30);

		fieldAdd3 = new JTextField();
		textFieldBecoming(fieldAdd3, true, 621, 90, 80, 30);

		fieldTel = new JTextField();
		textFieldBecoming(fieldTel, true, 706, 90, 150, 30);

		fieldEmail = new JTextField();
		textFieldBecoming(fieldEmail, true, 861, 90, 250, 30);

		lblAddSubject = new JLabel("추가과목입력");
		lblBecoming(lblAddSubject, true, 451, 10, 140, 30);

		btnEnter = new JButton("입력");
		btnEnter.setBackground(SystemColor.activeCaption);
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setFont(new Font("굴림", Font.PLAIN, 15));
		btnEnter.setBounds(1116, 50, 109, 70);
		contentPane.add(btnEnter);

		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 추가 과목이 입력 되었으면 정상 입력으로 넘어감 그렇지 않은 경우 추가과목 입력 안내 메세지 출력
				 */
				if (isAdditionalSubInputed) {
					inputProc(); // UI에서 입력받아 데이터로 저장
					calcProc();	//석차와 과목별 수치를 계산하기 위해 persScoreInfo 인스턴스 생성
					insertDataInDB();	//DB에 입력
					resultProc(); // DB를 기반으로 테이블을 출력하고, 과목별 결과값을 출력부에 표시
					updateRank(); // 랭크 재입력
					resizeColWidth();// 값에 맞춰 컬럼 크기 조절
					init(); // 초기화

				} else {
					JOptionPane.showMessageDialog(btnEnter, "추가 과목을 입력해주세요.\n(추가 항목이 없으면 빈칸으로 과목 입력)");
				}
			}
		});

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 150, 1238, 2);
		contentPane.add(separator);

		lblResult = new JLabel("결과");
		lblBecoming(lblResult, true, 555, 155, 100, 50);

		tableScrollPane = new JScrollPane();
		tableScrollPane.setBounds(26, 215, 1200, 234);
		contentPane.add(tableScrollPane);

		fieldTotalKor = new JTextField();
		textFieldBecoming(fieldTotalKor, false, 245, 484, 80, 30);

		fieldTotalEng = new JTextField();
		textFieldBecoming(fieldTotalEng, false, 326, 484, 80, 30);

		fieldTotalMath = new JTextField();
		textFieldBecoming(fieldTotalMath, false, 407, 484, 80, 30);

		fieldTotalScience = new JTextField();
		textFieldBecoming(fieldTotalScience, false, 488, 484, 80, 30);

		fieldTotalAdd1 = new JTextField();
		textFieldBecoming(fieldTotalAdd1, false, 569, 484, 80, 30);

		fieldTotalAdd2 = new JTextField();
		textFieldBecoming(fieldTotalAdd2, false, 650, 484, 80, 30);

		fieldTotalAdd3 = new JTextField();
		textFieldBecoming(fieldTotalAdd3, false, 732, 484, 80, 30);

		fieldAvgKor = new JTextField();
		textFieldBecoming(fieldAvgKor, false, 245, 524, 80, 30);

		fieldAvgEng = new JTextField();
		textFieldBecoming(fieldAvgEng, false, 326, 524, 80, 30);

		fieldAvgMath = new JTextField();
		textFieldBecoming(fieldAvgMath, false, 407, 524, 80, 30);

		fieldAvgScience = new JTextField();
		textFieldBecoming(fieldAvgScience, false, 488, 524, 80, 30);

		fieldAvgAdd1 = new JTextField();
		textFieldBecoming(fieldAvgAdd1, false, 569, 524, 80, 30);

		fieldAvgAdd2 = new JTextField();
		textFieldBecoming(fieldAvgAdd2, false, 650, 524, 80, 30);

		fieldAvgAdd3 = new JTextField();
		textFieldBecoming(fieldAvgAdd3, false, 732, 524, 80, 30);

		lblTotalSubject = new JLabel("과목별 총점");
		lblBecoming(lblTotalSubject, true, 153, 483, 80, 30);

		lblAvgSubject = new JLabel("과목별 평균");
		lblBecoming(lblAvgSubject, true, 153, 523, 80, 30);

		lblKorResult = new JLabel("국어");
		lblBecoming(lblKorResult, true, 245, 451, 80, 30);

		lblEngResult = new JLabel("영어");
		lblBecoming(lblEngResult, true, 326, 451, 80, 30);

		lblMathResult = new JLabel("수학");
		lblBecoming(lblMathResult, true, 407, 451, 80, 30);

		lblScienceResult = new JLabel("과학");
		lblBecoming(lblScienceResult, true, 488, 451, 80, 30);

		lblAdd1Result = new JLabel("");
		lblBecoming(lblAdd1Result, true, 569, 451, 80, 30);

		lblAdd2Result = new JLabel("");
		lblBecoming(lblAdd2Result, true, 650, 451, 80, 30);

		lblAdd3Result = new JLabel("");
		lblBecoming(lblAdd3Result, true, 732, 451, 80, 30);

		btnSubjectFix = new JButton("과목 등록");
		btnSubjectFix.setBackground(SystemColor.activeCaption);
		btnSubjectFix.setFont(new Font("굴림", Font.PLAIN, 15));
		btnSubjectFix.setBounds(601, 11, 100, 30);
		contentPane.add(btnSubjectFix);

		btnSubjectFix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 추가과목 이름을 담기 위해 리스트로 생성
				List<String> subNameList = new ArrayList<String>();
				/*
				 * 추가과목이 입력되었으면 점수입력필드를 남기고, 아니면 점수입력필드도 사라짐
				 */
				String strAddSub1 = fieldAddSub1.getText().trim();
				String strAddSub2 = fieldAddSub2.getText().trim();
				String strAddSub3 = fieldAddSub3.getText().trim();
				fieldAddSub1.setVisible(false);
				fieldAddSub2.setVisible(false);
				fieldAddSub3.setVisible(false);
				setAddSubField(strAddSub1, lblAddSub1, lblAdd1Result, fieldAdd1, fieldTotalAdd1, fieldAvgAdd1);
				setAddSubField(strAddSub2, lblAddSub2, lblAdd2Result, fieldAdd2, fieldTotalAdd2, fieldAvgAdd2);
				setAddSubField(strAddSub3, lblAddSub3, lblAdd3Result, fieldAdd3, fieldTotalAdd3, fieldAvgAdd3);
				btnSubjectFix.setEnabled(false);
				// 과목 추가버튼 강제를 위한 플래그
				isAdditionalSubInputed = true;
				// 기본 과목명을 과목명 리스트에 저장
				subNameList.addAll(Arrays.asList(subNames));
				// 상기 추가과목들을 과목명 리스트에 저장
				if (!strAddSub1.equals("")) {
					subNameList.add(strAddSub1);
				}
				if (!strAddSub2.equals("")) {
					subNameList.add(strAddSub2);
				}
				if (!strAddSub3.equals("")) {
					subNameList.add(strAddSub3);
				}
				// 맴버 필드에 최종본 반영
				subNames = subNameList.toArray(new String[subNameList.size()]);
				// 확정된 과목명 리스트를 점수정보 클래스의 static 과목명 배열로 저장
				TestScoreInfo.setSubjectNames(subNames);
				// 확정된 과목으로 테이블 생성
				setTable();
				// 테이블을 각종 정렬해주는 메서드
				alignTable();
			}
		});
	}

	private void textFieldBecoming(JTextField textField, boolean trueAndFalse, int x, int y, int width, int height) {
		textField.setFont(new Font("굴림", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(trueAndFalse);
		textField.setBounds(x, y, width, height);
		contentPane.add(textField);
		// fieldAvgAdd3.setColumns(10);
	}

	private void lblBecoming(JLabel label, boolean trueAndFalse, int x, int y, int width, int height) {
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(x, y, width, height);
		label.setVisible(trueAndFalse);
		contentPane.add(label);
	}

	private void updateRank() {
		// 변경될 랭크 초기화
		// int updatedRank = 0;
		// 해당 랭크를 담을 row 번호 초기화
		int rota = 0;
		for (int i = 0; i < tableModel.getRowCount(); i++) {
			// rank field가 존재하지만, row 를 랭크순으로 접근하게 되므로 해당 필드에 접근하는것 대신 인덱스 값을 직접 rank에 넣어주어도
			// 무방함
			// updatedRank = exam.studScoreList.get(i).getScoreInfo().getRank();
			// 순차 생성되는 id의 뒤쪽 숫자-1 은 순차 생성되는 table의 row과 같음을 이용해, 해당 rank가 입력되야 할 row를 지정
			rota = Integer.parseInt(exam.studScoreList.get(i).getStudPersInfo().getId().substring(5));
			tableModel.setValueAt(i + 1, rota - 1, 0);
		}
	}

	/*
	 * 테이블 출력을 위한 함수
	 */
	private void setTable() {
		int size = subNames.length;
		// 테이블 칼럼 초기화
		Object[] colName = new Object[size + 8];
		colName[ColumnHeadIdx.RANK] = "석차";
		colName[ColumnHeadIdx.ID] = "학번";
		colName[ColumnHeadIdx.NAME] = "이름";
		// 과목명(추가과목 포함)
		for (int i = 1; i <= size; i++) {
			colName[ColumnHeadIdx.NAME + i] = subNames[i - 1];
		}
		colName[ColumnHeadIdx.TOTAL + size] = "총점";
		colName[ColumnHeadIdx.AVR + size] = "평균";
		colName[ColumnHeadIdx.GRADE + size] = "등급";
		colName[ColumnHeadIdx.TEL + size] = "연락처";
		colName[ColumnHeadIdx.EMAIL + size] = "이메일";
		// 테이블 출력
		// 수정할 수 없도록 생성
		tableModel = new DefaultTableModel(colName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		// 컬럼의 폭 자동 조절
		table = new JTable(tableModel) {
			@Override
			public boolean getScrollableTracksViewportWidth() {
				return getPreferredSize().width < getParent().getWidth();
			}
		};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// 테이블에 sort 기능 추가
		table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel));
		tableScrollPane.setViewportView(table);
	}

	/*
	 * 테이블 요소 정렬
	 */
	private void alignTable() {
		// 가운데정렬
		DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
		cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		final TableColumnModel colModel = table.getColumnModel();
		for (int colIdx = 0; colIdx < table.getColumnCount(); colIdx++) {
			int width = 50;
			colModel.getColumn(colIdx).setCellRenderer(cellRenderer);
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer renderer = table.getCellRenderer(row, colIdx);
				Component comp = table.prepareRenderer(renderer, row, colIdx);
				width = Math.max(comp.getPreferredSize().width + 1, width);
			}
			colModel.getColumn(colIdx).setPreferredWidth(width);
		}
	}

	/*
	 * 내용물에 맞춰 테이블 컬럼 폭 조절
	 */
	private void resizeColWidth() {
		final TableColumnModel columnModel = table.getColumnModel();
		for (int column = 0; column < table.getColumnCount(); column++) {
			int width = 50; // min
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer renderer = table.getCellRenderer(row, column);
				Component comp = table.prepareRenderer(renderer, row, column);
				width = Math.max(comp.getPreferredSize().width + 1, width);
			}
			columnModel.getColumn(column).setPreferredWidth(width);
		}
	}

	/*
	 * 입력된 추가과목을 라벨로 세팅, 입력 안됐으면(""이면) 점수입력칸 지움
	 */
	private void setAddSubField(String subjectName, JLabel lblAddSub, JLabel lblAddResult, JTextField textAdd,
			JTextField textTotal, JTextField textAvg) {
		lblAddSub.setVisible(true);
		lblAddSub.setText(subjectName);
		lblAddResult.setText(subjectName);
		if (subjectName.trim().contentEquals("")) {
			textAdd.setVisible(false);
			textTotal.setVisible(false);
			textAvg.setVisible(false);
			lblAddResult.setVisible(false);
		}
	}

	/*
	 * 표에 들어갈 개인별 데이터를 만드는 함수
	 */
	private Object[] setPersonalRow(Object[] selectedDataArray) {
		/* DB에서 받아온 배열 구조
		 * {ID String, NAME String, TEL String, EMAIL String, ID String, KOR Number, ENG Number, MATH Number, SCIENCE Number, 
		 * ADD1 Number, ADD2 Number, ADD3 Number, TOTAL Number, AVG Number, GRADE String}
		 */
		//과목수
		int subCount = subNames.length;
		// 데이터를 담을 결과 배열
		Object[] row = new Object[subCount + 8];
		row[ColumnHeadIdx.RANK] = scoreInfo.getRank(); // 석차
		row[ColumnHeadIdx.ID] = selectedDataArray[0]; // 학번
		row[ColumnHeadIdx.NAME] = selectedDataArray[1]; // 이름
		for (int i = 1; i <= subCount; i++) {
			row[ColumnHeadIdx.NAME + i] = selectedDataArray[4+i]; // 과목별 점수
		}
		row[ColumnHeadIdx.TOTAL + subCount] = selectedDataArray[12]; // 총점
		row[ColumnHeadIdx.AVR + subCount] = String.format("%.1f", selectedDataArray[13]); // 평균
		row[ColumnHeadIdx.GRADE + subCount] = selectedDataArray[14]; // 등급
		row[ColumnHeadIdx.TEL + subCount] = selectedDataArray[2]; // 연락처
		row[ColumnHeadIdx.EMAIL + subCount] = selectedDataArray[3]; // 이메일
		return row;
	}
	
	private void insertDataInDB() {
		
		String[] personalData = {personalInfo.getId(),personalInfo.getName(),personalInfo.getTel(),personalInfo.getEmail()};
		DBController.insertStudentData(personalData);
		DBController.insertScoreData(personalData[0],scores, scoreInfo.getTotal(),scoreInfo.getAvg(),scoreInfo.getGrade()+"");
	}

	private void inputProc() {
		// 추가 과목의 점수를 담기 위해 리스트로 생성
		List<Integer> subScoreList = new ArrayList<Integer>();

		// 개인정보 형식 체크 후 값으로 저장
		getNameWithCheck(fieldName);
		getTelWithCheck(fieldTel);
		getEmailWithCheck(fieldEmail);

		int korScore = getScoreWithCheck(fieldKor, lblKor);
		subScoreList.add(korScore);
		int engScore = getScoreWithCheck(fieldEng, lblEng);
		subScoreList.add(engScore);
		int mathScore = getScoreWithCheck(fieldMath, lblMath);
		subScoreList.add(mathScore);
		int scienceScore = getScoreWithCheck(fieldScience, lblScience);
		subScoreList.add(scienceScore);

		/*
		 * 추가과목의 점수를 점수리스트에 추가 입력된 과목만 점수에 반영
		 */
		if (!lblAddSub1.getText().equals("")) {
			int add1Score = getScoreWithCheck(fieldAdd1, lblAddSub1);
			subScoreList.add(add1Score);
		}
		if (!lblAddSub2.getText().equals("")) {
			int add2Score = getScoreWithCheck(fieldAdd2, lblAddSub2);
			subScoreList.add(add2Score);
		}
		if (!fieldAddSub3.getText().equals("")) {
			int add3Score = getScoreWithCheck(fieldAdd3, lblAddSub3);
			subScoreList.add(add3Score);
		}
		// 추가작업 완료, 배열로 집어넣기
		scores = subScoreList.toArray(new Integer[subScoreList.size()]);

		// 입력됨 안내
		JOptionPane.showMessageDialog(this, "입력되었습니다.");
	}

	private void calcProc() {
		// 학생정보 생성, 개인성적 생성 후 시험(Exam)에 입력
				personalInfo = new StudPersInfo(nameStr, telStr, emailStr);
				scoreInfo = new TestScoreInfo(scores);
				persScoreInfo = new PersTestScoreInfo(personalInfo, scoreInfo);
				exam.setStudScore(persScoreInfo);
				exam.inputClose();
	}
	
	private void resultProc() {
		// 테이블에 들어갈 행 작성(rowForTable) 후 테이블에 입력
		Object[] oneSudentsData = setPersonalRow(DBController.selectStudentScoreData());
		tableModel.addRow(oneSudentsData);
		// 과목별 계산 결과 가져오기
		int[] subTotal = exam.getSubjectTotals();
		double[] subAvg = exam.getSubjectAvgs();
		// 출력할 필드들 배열로 정렬하기
		JTextField[] subTotalField = { fieldTotalKor, fieldTotalEng, fieldTotalMath, fieldTotalScience, fieldTotalAdd1,
				fieldTotalAdd2, fieldTotalAdd3 };
		JTextField[] subAvgField = { fieldAvgKor, fieldAvgEng, fieldAvgMath, fieldAvgScience, fieldAvgAdd1,
				fieldAvgAdd2, fieldAvgAdd3 };
		// 순회하며 출력
		for (int idx = 0; idx < subTotal.length; idx++) {
			setSubResult(subTotalField[idx], subAvgField[idx], subTotal[idx], subAvg[idx]);
		}
	}

	private void setSubResult(JTextField totalScoreField, JTextField avgScoreField, int totalScore, double avgScore) {
		totalScoreField.setText(Integer.toString(totalScore));
		avgScoreField.setText(String.format("%.1f", avgScore));
	}

	private void getNameWithCheck(JTextField textName) {
		nameStr = textName.getText().trim();
		String regex = "[가-힣]+";
		if (!Pattern.matches(regex, nameStr)) {
			String inputName = JOptionPane.showInputDialog("이름은 한글로 입력하세요");
			textName.setText(inputName);
			getNameWithCheck(textName);
		}
	}

	private int getScoreWithCheck(JTextField textScore, JLabel lblSub) {
		String input = textScore.getText().trim();
		String regex = "(100$|[1-9]{1}\\d$|\\d$)";
		if (!Pattern.matches(regex, input)) {
			String inputNum = JOptionPane.showInputDialog(lblSub.getText() + " 점수를 0 ~ 100 사이의 숫자로 입력하세요.");
			textScore.setText(inputNum);
			input = getScoreWithCheck(textScore, lblSub) + "";
		}
		return Integer.parseInt(input);
	}

	private void getTelWithCheck(JTextField textTel) {
		telStr = textTel.getText().trim();
		String regex = "(010|02|031|032)[-]?\\d{3,4}[-]?\\d{4}";
		if (!Pattern.matches(regex, telStr)) {
			String inputTel = JOptionPane.showInputDialog("올바른 전화번호를 입력하세요");
			textTel.setText(inputTel);
			getTelWithCheck(textTel);
		}
	}

	private void getEmailWithCheck(JTextField textEmail) {
		emailStr = textEmail.getText().trim();
		String regex = "(\\w+[@]\\w+[.]\\w+([.]\\w+)*)";
		if (!Pattern.matches(regex, emailStr)) {
			String inputEmail = JOptionPane.showInputDialog("올바른 이메일을 입력하세요");
			textEmail.setText(inputEmail);
			getEmailWithCheck(textEmail);
		}
	}

	private void init() {
		// 입력필드들 초기화
		fieldName.setText("");
		fieldTel.setText("");
		fieldEmail.setText("");
		fieldKor.setText("");
		fieldEng.setText("");
		fieldMath.setText("");
		fieldScience.setText("");
		fieldAdd1.setText("");
		fieldAdd2.setText("");
		fieldAdd3.setText("");
	}

	// 칼럼값별 인덱스 저장
	public final class ColumnHeadIdx {
		final static int RANK = 0;
		final static int ID = 1;
		final static int NAME = 2;
		final static int TOTAL = 3;
		final static int AVR = 4;
		final static int GRADE = 5;
		final static int TEL = 6;
		final static int EMAIL = 7;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamManager frame = new ExamManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

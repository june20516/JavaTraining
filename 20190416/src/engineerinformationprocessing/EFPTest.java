package engineerinformationprocessing;

import java.util.ArrayList;

/**
 * int 회차
 * str 장소
 * applicant[] 응시자
 * int[][] 과목
 * int[] 과목별 정답
 * int 합격점수
 * 과목별 채점()
 * 합격판별()
 * 
 * @author USER
 *
 */
public class EFPTest {
	int round;
	String place;
	ArrayList<Applicant> applicants = new ArrayList<Applicant>();
	private int[] DB_Rans = new int[20]; // 데이터베이스 답안
	private int[] ECS_Rans = new int[20]; // 전자계산기구조 답안
	private int[] OS_Rans = new int[20]; // 운영체제 답안
	private int[] SE_Rans = new int[20]; // 소프트웨어 공학 답안
	private int[] DC_Rans = new int[20]; // 데이터 통신 답안
	private int[][] RightAns = {DB_Rans,ECS_Rans,OS_Rans,SE_Rans,DC_Rans};
	int passalbeScore;
}

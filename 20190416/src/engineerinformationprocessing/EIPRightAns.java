package engineerinformationprocessing;

public interface EIPRightAns {
	int[] DB_Rans = new int[20]; // 데이터베이스 답안
	int[] ECS_Rans = new int[20]; // 전자계산기구조 답안
	int[] OS_Rans = new int[20]; // 운영체제 답안
	int[] SE_Rans = new int[20]; // 소프트웨어 공학 답안
	int[] DC_Rans = new int[20]; // 데이터 통신 답안
	int[][] RightAns = {DB_Rans,ECS_Rans,OS_Rans,SE_Rans,DC_Rans};
}

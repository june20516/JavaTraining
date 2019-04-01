
public class HomeWorkReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int x=2,inc=3; x<=9; x+=inc) {
			for(int count =1; count<=9; count++) {
				for(int dan=x; dan<x+inc; dan++) {
					if(dan>9) break;
					System.out.print(dan + "," + count + "\t");	
				}
				System.out.println();
			}
			System.out.println();
		}*/
		int r = 5;
		int c = 0;
		int[][] datas = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15}};
		
		for(int i = 0; i < r; i++) {
			for(int blank = 0; blank< r - datas[i].length; blank++)
				System.out.printf("%4S","");
			for(c = 0; c <= i; c++) {
				System.out.printf("%4d",datas[i][c]);
			}
			System.out.println();
		}
	}
}
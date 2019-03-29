
public class IfDemo {

	public static void main(String[] args) {
		char sexCh = 'M';
		String sexStr;
		
//		if(sexCh == 'f') {
//			sexStr = "여자";
//		}else {
//			sexStr = "남자";
//		}
//		
//		sexStr = sexCh=='f' ?  "여자" : "남자";
		
		
		if(sexCh == 'f' || sexCh == 'F') {
			sexStr = "여자";
		}else if(sexCh == 'm'||sexCh=='M'){
			sexStr = "남자";
		}else{
			sexStr = "둘다아님";
		}
		
		System.out.println(sexStr);
	}

}


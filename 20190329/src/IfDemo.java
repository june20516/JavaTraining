
public class IfDemo {

	public static void main(String[] args) {
		char sexCh = 'M';
		String sexStr;
		
//		if(sexCh == 'f') {
//			sexStr = "����";
//		}else {
//			sexStr = "����";
//		}
//		
//		sexStr = sexCh=='f' ?  "����" : "����";
		
		
		if(sexCh == 'f' || sexCh == 'F') {
			sexStr = "����";
		}else if(sexCh == 'm'||sexCh=='M'){
			sexStr = "����";
		}else{
			sexStr = "�Ѵپƴ�";
		}
		
		System.out.println(sexStr);
	}

}


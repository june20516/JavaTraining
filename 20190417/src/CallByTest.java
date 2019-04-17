import java.util.ArrayList;
import java.util.List;

public class CallByTest {
	
	public static void cBRef1(int[] arr1){
		arr1[0] = 100;
	}
	
	public static void cBRef2(int ... els) {
		els[1] = 100;
	}
	
	public static void cBVal1(Integer els) {
		els = 100;
	}
	
	public static void cBRef3(String[] arrStrings) {
		arrStrings[0] = "ㄱ";
	}
	
	public static void cBRef4(String ... els) {
		els[1] = "ㄴ";
	}
	public static void cBRef5(String els) {
		els = "ㄷ";
	}
	
	public static void CBRef5() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,new Integer(3),4,5,6,7};
		String[] arrStr = {"abc","def","ghi"};
		
		
		cBRef1(arr);
		cBRef2(arr);
		cBVal1(arr[2]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		cBRef3(arrStr);
		cBRef4(arrStr);
		cBRef5(arrStr[2]);
		System.out.println(arrStr[0]);
		System.out.println(arrStr[1]);
		System.out.println(arrStr[2]);
		
		List list = new ArrayList();
		
		list.add(3);
		
		int intType = 1;
		list.add(intType);
		
		boolean boolType = true;
		list.add(boolType);
	}

}

package string;

public class StringDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String a = "Lee";
//		String b = "Lee";
//		String c = new String("Lee");
//		
//		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a.equals(c));
//		
//		
//		a = a + "는";
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		b = a.replace('L', 'B');
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		System.out.println(b.indexOf('는'));
//		System.out.println(b.charAt(b.indexOf('는')));
//		System.out.println(b.startsWith("Be"));
//		System.out.println(b.endsWith("ee"));
//		
//		System.out.println(b.contains("ee"));
		
		StringBuffer sb1 = new StringBuffer("맥심티오피");
		System.out.println(sb1);
		System.out.println(sb1.capacity());	//배열의 길이 (memory할당 공간)
		System.out.println(sb1.length());	//실제 길이
		
		
		StringBuffer sb2 = new StringBuffer("라");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb1.length());	//실제 길이
		
		sb1.append("떼-");
		System.out.println(sb1);
		System.out.println(sb1.length());	//실제 길이
		
		sb1.append(22);
		System.out.println(sb1);
		System.out.println(sb1.length());	//실제 길이
		
		StringBuffer sb3 = new StringBuffer("capacity를 초과할만큼 더하면 어떻게 될지 궁금하지 않습니까?");
		sb1.append(sb3);
		System.out.println(sb1);
		System.out.println(sb1.capacity());	//배열의 길이 (memory할당 공간)
		System.out.println(sb1.length());	//실제 길이
		
		
		sb1.replace(1, 1, "?");
		System.out.println(sb1);
		
		sb1.replace(0, 1, "?");
		System.out.println(sb1);
		
		
		int inputNum = 89;
		String str1 = String.valueOf(inputNum);
		String str2 = inputNum+"";
		System.out.println(str1);
		System.out.println(str2);
		
		String inputData = "89";
		int data = Integer.parseInt(inputData);
		int data2 = new Integer(inputData);
		
		System.out.println(data);
		System.out.println(data2);

		
		
	}

}

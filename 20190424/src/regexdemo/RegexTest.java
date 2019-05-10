package regexdemo;

public class RegexTest {
	public static void main(String[] args) {
		//예시형식
		String str1 = "aaaaaA";
		//정규식표현과 일치하면 true, 틀리면 false를 반환
		System.out.println(str1.matches("\\w*"));
		System.out.println(str1.matches("[a-zA-Z_0-9]*"));
		System.out.println(str1.matches("\\w+"));
		System.out.println(str1.matches("[a-zA-Z_0-9]+"));
		
		String str2 = "k";
		System.out.println(str2.matches("\\w"));
		System.out.println(str2.matches("[a-zA-Z_0-9]"));
		
		String str3 = "_";
		System.out.println(str3.matches("\\w"));
		System.out.println(str3.matches("[a-zA-Z_0-9]"));
		
		String str4 = "3";
		System.out.println(str4.matches("\\d"));
		System.out.println(str4.matches("[0-9]"));		
		
		String str5 = "123-1234";	//ㅈ대겨ㅐㅑㄹㅎㅁㅇㄹ
		System.out.println(str5.matches("\\d+-\\d+"));
		System.out.println(str5.matches("[0-9]+-[0-9]+"));
		System.out.println(str5.matches("\\d{3}+-([^\\s]*)"));
		
		String str6 = "017-3//456-7890";
		System.out.println(str6.matches("0[17][0679]-\\d{3,4}-\\d{4}"));
		
		String str13 = "070-3450-3017";
		System.out.println(str13.matches("\\d{3}X{7}+-\\d{4}+-([^\\s]*)"));
		
		String str14 = "012-1234-1324";
		System.out.println(str14.matches("^01(0|1|[6-9])-(?:\\d{4})-\\d{4}$"));
	}
}


package datastruct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class StackNMap {
public static void main(String[] args) {
	Map<Character, String> mp = new HashMap<Character, String>();
	mp.put('1', "one");
	mp.put('2', "two");
	mp.put('3', "three");
	mp.put('4', "four");
	mp.put('4', "sa");	//중복된 키로 집어넣어보자 
	
	Collection<String> values = mp.values();
	Set<Character> keys = mp.keySet();
	
	for (String value : values) {
		System.out.println(value);	// 중복된 키로 입력받은 것은 덮어 씌워진다 
	}
	
	for (char key : keys) {
		System.out.println(mp.get(key));	//키로 접근해서 값을 사용할 수 있다 
	}

	Stack<String> st = new Stack<String>();
	st.add("a");
	st.push("bc");
	st.push("efg");
	st.push("hij");
	st.push("klm");
	System.out.println("st : " + st); // stack 생성
	String poped = st.pop();
	System.out.println("poped : " + poped);
	System.out.println("st : " + st); // pop 으로 마지막 elements 없어짐
	String peeked = st.peek();
	System.out.println("peeked : " + peeked);
	System.out.println("st : " + st); // peek은 원소 사라짐 없음
	boolean rm = st.remove("bc");
	System.out.println("rm : " + rm);
	System.out.println("st : " + st); // remove는 해당 원소를 검색 후 있으면 삭제 + true를 반환, 없으면 false를 반환
	
}
}

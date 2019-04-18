package datastruct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class StackNMap2 {
public static void main(String[] args) {
	
	Map<String, String> envs = System.getenv();
	System.out.println(envs);
	
	Set<String> stringKeyset = envs.keySet();
	String envValue;
	for(String key : stringKeyset) {
		envValue = envs.get(key);
		System.out.println(key + " : " + envValue);
	}
}
}

package enumtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		Enum1 sample = Enum1.A;
		sample.getLabel();
		
		Enum1[] samples = Enum1.values();
		
		for(Enum1 eachSample : samples) {
			System.out.println(eachSample.getScore());
		}
		
		Sex[] genders = Sex.values();
		for(Sex gender : genders) {
			System.out.println(gender);
		}
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("남자 : M | 여자 : F");
		char genderInput = (char) br.read();
		System.out.println(Sex.search(genderInput).getStdWord());
	}

}

package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BB2{
	public String name;
	public BB2(String name) {
		this.name = name;
	}
}

public class FillTest {
	

	public static void main(String[] args) {
		List<BB2> bbs = new ArrayList<BB2>();
		bbs.add(new BB2("wer"));
		System.out.println(bbs);
		Collections.fill(bbs, new BB2("sdf"));
		System.out.println(bbs);
	}

}

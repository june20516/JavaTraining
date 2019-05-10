package jo.main;

import java.util.List;

import jo.Student;
import jo.ZopopkiLogic;

public class ZopopkiStart {

	public static void main(String[] args) {
		ZopopkiLogic zopop = new ZopopkiLogic();
		List<Student> all = zopop.getAllStudents();
		List<Student> zoZangs = zopop.getZoZzangs();
		List<Student> zoOnes = zopop.getZoOnes();
		System.out.println("전체 학생 : ");
		for(Student al : all) {
			System.out.println(al);
		}
		System.out.println("조장인 학생 : ");
		for(Student zoZang : zoZangs) {
			System.out.println(zoZang);
		}
		System.out.println("조장아닌 학생 : ");
		for(Student zoOne : zoOnes) {
			System.out.println(zoOne);
		}
		String sql = "INSERT ";
	}

}

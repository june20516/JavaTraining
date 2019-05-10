package innerclasshw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexHW {
	public static void main(String[] args) throws IOException {
//1번
		String urlRegex = "^www[.][a-zA-Z가-힣_0-9.]+[.]\\w+\\S*[^.]$";
		String urlEx1 = "www.청와대.co.kr";
		System.out.println(urlEx1.matches(urlRegex));

		//2번
		String emailRegex = "^[a-zA-Z_0-9.]+@[a-zA-Z_0-9]+[.][a-zA-Z]+$";
		String emailEx1 = "abc@defg.hij";
		System.out.println(emailEx1.matches(emailRegex));

		// 3번
		fileExplorer("/Users/junholee/JavaWorks");
	}

	// 파일을 받아서 주석처리된 부분을 출력해주는 메소드
	public static void printComments(File file) {
		try {
			InputStreamReader ir;
			ir = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(ir);
			// 주석이(//) 있는지 확인하는 정규식
			String commentRegex = "^.*//.*$";
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.matches(commentRegex))
					System.out.println(line.substring(line.indexOf("//")));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 자바파일을 찾는 메소드
	public static void fileExplorer(String path) {
		String javaPathRegex = "^.*(?i)[.java]$";
		File upperDir = new File(path);
		File[] innerDirs = upperDir.listFiles();
		for (File dir : innerDirs) {
			if (dir == null)
				continue;
			if (dir.isDirectory()) {
				System.out.println("\n\n######  directory : " + dir.getName() + "  ######");
				fileExplorer(dir.getAbsolutePath());
			} else if (dir.getAbsolutePath().matches(javaPathRegex)) {
				System.out.println("\n@@@@@@  JavaFile : " + dir.getName() + "  @@@@@@");
				printComments(dir);
			}
		}
	}
}

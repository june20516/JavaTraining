package iodemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOHomeWork {

	public static void main(String[] args) {
//
//		// TODO Auto-generated method stub
//		 1번. 시스템 루트폴더 찾기
//		File[] rootFiles = File.listRoots();
//		for (File file : rootFiles) {
//			System.out.println(file);
//		}
//
//		// 2번 실행.
//		fileExplorer("/Users");
//
//		// 3번 실행.
//		// getName으로 찾는 방식
//		int javaCount = fileSearcher("/Users/junholee/JavaWorks/");
//		System.out.println(javaCount);
		// FileFilter를 쓰는 방식 ------- 실패
		File javaSrc = new File("/Users/junholee/JavaWorks/20190417");
		System.out.println(fileSearcher2(javaSrc.getAbsolutePath()));
		System.out.println(fileSearcher2(javaSrc.getAbsolutePath()).size());
	}

//	2번.
	public static void fileExplorer(String path) {
		File upperDir = new File(path);
		File[] innerDirs = upperDir.listFiles();
		for (File dir : innerDirs) {
			if (dir.isDirectory()) {
				System.out.println("path : " + dir.getAbsolutePath() + " / 형식 : 디렉터리");
				fileExplorer(dir.getAbsolutePath());
			} else {
				System.out.println("	path : " + dir.getAbsolutePath() + " / 형식 : "
						+ (dir.isDirectory() ? "디렉터리" : "파일") + " / size : " + dir.length() + "Byte");
			}
		}
	}

	// 3번.
	public static int fileSearcher(String path) {
		int javaCount = 0;
		File upperDir = new File(path);
		File[] innerDirs = upperDir.listFiles();
		for (File dir : innerDirs) {
			if (dir.isDirectory()) {
				javaCount += fileSearcher(dir.getAbsolutePath());
			} else if (dir.getName().contains(".java")) {
				javaCount++;
			}
		}
		return javaCount;
	}

	// 3번 파일네임필터 사용.
	static FilenameFilter javaFinder = new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(".java");
		}
	};
	//3번 재귀적 호출 --- 실패
	public static List<File> fileSearcher2(String path) {
		File thisDir = new File(path);
		List<File> javaFiles = new ArrayList<File>();
		File[] innerDirs = thisDir.listFiles();
		for (File dir : innerDirs) {
			if (dir.isDirectory()) {
				javaFiles.addAll(fileSearcher2(dir.getAbsolutePath()));
			} else {
			javaFiles = Arrays.asList(thisDir.getParentFile().listFiles(javaFinder));
			return javaFiles;
		}
	}
		return javaFiles;
	}
}

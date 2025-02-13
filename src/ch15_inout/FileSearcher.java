package ch15_inout;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * class Name : FileSearcher Author : SJ Created Date : 2025. 2. 13. Version :
 * 1.0 Purpose : java 기초 Description : 파일 목록조회 및 찾기
 */
public class FileSearcher {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path);
		// 해당 결로의 목록
		File[] files = file.listFiles(); // 해당 파일의 목록리턴
		for (File f : files) {
			System.out.println("======================");
			System.out.println("파일 정보 출력");
			System.out.println("파일 이름:" + f.getName());
			System.out.println("파일 크기:" + f.length()); // byte
			System.out.println("파일의 경로:" + f.getAbsolutePath());
			System.out.println("파일의 부모 디렉토리:" + f.getParent());
			System.out.println("디렉토리 여부:" + f.isDirectory());
			System.out.println("파일 여부:" + f.isFile());
			System.out.println("쓰기 기능 여부:" + f.canWrite());
			System.out.println("======================");
		}

		String searchPath = "C:\\dev";
		String searchFileNm = "delay";
		File result = findFile(searchPath, searchFileNm);
		if (result != null) {
			System.out.println("파일 찾음:" + result.getAbsolutePath());
		} else {
			System.out.println("파일을 찾을 수 없습니다.");
		}

		// 여러개 찾기
		List<File> results = findFiles(searchPath, searchFileNm);
		if (!results.isEmpty()) {
			System.out.println("발견된 파일들:");
			for (File f : results) {
				System.out.println(f.getAbsolutePath());
			}
		} else {
			System.out.println("파일이 없음.");
		}
		// 사용자의 입력을 받아서 파일의 경로를 출력하는 프로그램을 작성하시오
		
		// 1.파일만 입력(디폴트 c:\\ 부터 탐색)
		// 2.파일, 경로 입력
		// 3.종료(q)
	}

	// 단일 파일 찾기(가장 먼저 찾은 파일 반환, 정확하게 일치)
	// input : File(찾기를 시작하고자 하는 루트 폴더), String(찾고자하는 파일명)
	// output : File (찾은 파일 or null)
	private static File searchFile(File directiory, String fileName) {
		System.out.println("탐색중:" + directiory.getAbsolutePath());
		File[] files = directiory.listFiles();
		if (files != null) {
			for (File file : files) {
				// 폴더 있을 때
				if (file.isDirectory()) {
					File found = searchFile(file, fileName); // 재귀 탐색
					if (found != null) {
						return found;
					}
					// 찾았을 때!
				} else if (file.getName().equalsIgnoreCase(fileName)) {
					System.out.println("찾았다!!!!!======================");
					return file; //
				}
			}
		}
		return null;
	}

	public static File findFile(String dir, String fileName) {
		File dirFile = new File(dir);
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			System.out.println("경로가 존재하지 않거나 폴더가 아닙니다.:" + dir);
			return null;
		}
		return searchFile(dirFile, fileName);
	}

	// 여러 개의 파일
	public static List<File> findFiles(String dir, String fileName) {
		List<File> fileList = new ArrayList<>();
		File dirFile = new File(dir);
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			System.out.println("경로가 존재하지 않거나 폴더가 아닙니다.:" + dir);
			return fileList;
		}
		searchFiles(dirFile, fileName, fileList);
		return fileList;
	}

	// input (File 찾기 시작 위치, String 찾을 파일명, List<file> 저장공간)
	// output void
	private static void searchFiles(File directory, String fileName, List<File> fileList) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				// 폴더면 재귀 탐색
				if (file.isDirectory()) {
					searchFiles(file, fileName, fileList); // fileList 동일한 저장공간
				} else if (file.getName().contains(fileName)) { // 포함이 되어있으면 true
					fileList.add(file);
				}
			}
		}
	}

	public static void dleteFiles() {
	}
}
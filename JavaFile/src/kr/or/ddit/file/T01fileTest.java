package kr.or.ddit.file;

import java.io.File;

public class T01fileTest {
	public static void main(String[] args) {
		
		// File 객체 만들기 연습
		
		// 1. new File("String" 파일 또는 경로) 
		//         => 디렉토리와 디렉토리 사이 또는 디렉토리와 파일 사이의 구분자는
		//               '\'를 사용하거나 '/'를 사용할 수 있다.
		
		// 절대경로(아예 첨부터 경로), 상대경로(내 경로에서부터 지정)
		
		File file = new File("D:\\filetest");
		System.out.println("파일명 : " + file.getName());
		System.out.println("파일 여부 : " + file.isFile());
		System.out.println("폴더 여부 : " + file.isDirectory());
		
		
		File file2 = new File("D:\\filetest", "folder4");
		file2.mkdir();
		
		File file3 = new File(file, "text.txt");
		System.out.println(file3.getName()+", 파일크기 : " + file3.length());
		
		
		// 디렉토리 만들기
		
		// 1. mkdir() -> File 객체의 경로 중 마지막 위치의 디렉토리를 만든다.
		// 				 중간 경로가 모두 미리 만들어져 있어야한다.
		
		// 2. mkdirs() -> 중간의 경로가 없으면 중간의 경로도 새롭게 만든 후 마지막 
		//				  위치의 디렉토리를 만들어 준다.
			
		File dirl = new File(file, "folder1/folder2");
		if(dirl.mkdir()) {
			System.out.println(dirl + "이 생성되었습니다.");		
		}
		else {
			System.out.println(dirl+"생성 실패");
		}
						  
		if(dirl.mkdirs()) {
			System.out.println(dirl + "이 생성되었습니다.");		
		}
		else {
			System.out.println(dirl+"생성 실패");
		}
		
		
		
		
	}

}

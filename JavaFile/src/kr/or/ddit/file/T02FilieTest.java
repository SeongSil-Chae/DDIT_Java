package kr.or.ddit.file;

import java.io.File;
import java.io.IOException;

public class T02FilieTest {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:/filetest/folder1");
		
		if(f1.exists()) {
			System.out.println(f1 + "파일이 존재합니다.");
		}
		
		File f2 = new File(f1, "test.txt");
		if(f2.exists()) {
			System.out.println(f2+"파일이 존재합니다.");
		}
		else {
			if(f2.createNewFile()) {
				System.out.println(f2+"파일이 생성되었습니다.");
			}
		}
		
		//D 드라이브에 있는 파일 리스트 출력
		File dir = new File("D:/");
		for(File files : dir.listFiles()) {
			System.out.println(files);
		}
		
		// 해당 경로에 있는 파일 리스트 출력
		File folder = new File("//192.168.144.15/공유폴더");
		for(File f : folder.listFiles()) {
			System.out.println(f);
		}
		
		// 해당 경로에서 파일 들어가면서 html 파일만 다 출력하기
		File folder2 = new File("D:\\A_TeachingMaterial\\03_web\\webpro\\src\\main\\webapp");
		for(File dir1 : folder2.listFiles()) {
			if(dir1.isFile()) continue;
			System.out.println(dir1.getName());
			for(File dir2 : dir1.listFiles()) {
				String name = dir2.getName();
				if(!name.endsWith(".html")) continue;
				System.out.println("\t"+name);
			}
		}
		
		
		
		
		
	}
	
}

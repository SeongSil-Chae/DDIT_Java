package study06.sec04;

import java.io.File;

public class FileSearch {
	
	public static void main(String[] args) {
		FileSearch fs = new FileSearch();
		fs.fileSearch("\\\\192.168.144.41\\공유폴더\\JAVA\\숙제제출");
	}
	
	public void fileSearch(String path) {
		File f = new File(path);
		
		// 폴더 여부 검사 
		if(f.isDirectory()) {
			System.out.println(f+"폴더");
			for(File f2 : f.listFiles())
				fileSearch(f2.getPath());
			
		}
		else {
			if(f.getName().endsWith(".java"))
			System.out.println("\t"+f);
		}
			
	}
}

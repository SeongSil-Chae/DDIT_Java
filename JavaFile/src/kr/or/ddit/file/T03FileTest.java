package kr.or.ddit.file;

import java.io.File;

public class T03FileTest {
	public static void main(String[] args) {
		T03FileTest obj = new T03FileTest();
		obj.process();
	}
	
	private void process() {
		searchFile("D:\\A_TeachingMaterial\\03_web\\webpro\\src\\main\\webapp");
		
	}
	
	public void searchFile(String path) {
		File f = new File(path);
		if(f.isDirectory()) {
			for(File file : f.listFiles()) {
				searchFile(file.getPath());
			}
		}
		else {
			if(f.getName().endsWith(".html")) return;
			System.out.println(f);
		}
	}
}

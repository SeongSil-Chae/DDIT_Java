package kr.or.ddit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		String src = "//192.168.144.15/공유폴더";
		String dest = "D:\\";
		
		String copyFloder = "test";
		
		File srcDir = new File(src, copyFloder);
		File destDir = new File(dest, copyFloder);
		
//		destDir.renameTo(new File("D:/filetest2"));
		
		if(destDir.mkdir()) {
			System.out.println(destDir + "폴더가 생성되었습니다.");
		}
		else {
			System.out.println("이미 생성되었습니다.");
		}
		
		
		for(File f : srcDir.listFiles()) {
			FileInputStream fis = new FileInputStream(f);
			
			File copyFile = new File(destDir, f.getName());
			FileOutputStream fos = new FileOutputStream(copyFile);
			
			int data=0;
			while((data = fis.read())!=-1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
		}
		

	}
}

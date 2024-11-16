package kr.or.ddit.file;

import java.io.File;

public class T04FileTest {
	
	public static void main(String[] args) {
		displayFileList(new File("\\\\192.168.144.15\\공유폴더"));
	}
	public static void displayFileList(File dir) {
		System.out.println("[" + dir.getAbsolutePath()+"] 디렉토리 내용");
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			String attr ="";
			String size ="";
			if(files[i].isDirectory()) {
				attr = "<DIR>";
			}
			else {
				size = files[i].length()+ "";
				attr = files[i].canRead() ? "R" : " ";
				attr += files[i].canWrite() ? "W" : " ";
				attr += files[i].isHidden() ? "H" : " ";
			}
			System.out.println(files[i].getName() + attr + " "+size);
		}
	}
}

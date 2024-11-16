package kr.or.ddit.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class To7fileOutputStreeam {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");
		for(char ch='a'; ch<='z'; ch++) {
			fos.write(ch);
		}
		
		fos.close();
	}
}

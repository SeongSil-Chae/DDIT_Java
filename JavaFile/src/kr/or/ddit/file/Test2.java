package kr.or.ddit.file;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		// java.txt 파일 읽어오기
		
		FileInputStream fis = new FileInputStream("java.txt");
		byte[] result = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int data=0;
		while((data= fis.read())!=-1 ){
			baos.write(data);
		}
	
		result =baos.toByteArray();
		System.out.println(new String (result));
	}
	
}

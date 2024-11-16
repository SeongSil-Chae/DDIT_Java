package kr.or.ddit.file;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class T06FileinputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/test.txt");
		
		byte[] outSrc = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		
		int data = 0;
		while((data=fis.read())!=-1) {
			baos.write(data);
		}
		outSrc = baos.toByteArray();
		
//		System.out.println(Arrays.toString(outSrc));
		
		String str = new String(outSrc);
		System.out.println(str);
		
		byte[] bte = str.getBytes();
		System.out.println(Arrays.toString(bte));
		
		baos.close();
		fis.close();
	}
}
